public class SoyaG extends DecoratorComplemento {
    Cafe bebida;
    public SoyaG(Cafe bebida) { this.bebida = bebida; }
    public String getDescripcion() { return bebida.getDescripcion() + ", Soya Grande"; }
    public double costo() { return 0.25 + bebida.costo(); }
}