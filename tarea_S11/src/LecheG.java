public class LecheG extends DecoratorComplemento {
    Cafe bebida;
    public LecheG(Cafe bebida) { this.bebida = bebida; }
    public String getDescripcion() { return bebida.getDescripcion() + ", Leche Grande"; }
    public double costo() { return 0.20 + bebida.costo(); }
}