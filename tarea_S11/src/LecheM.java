public class LecheM extends DecoratorComplemento {
    Cafe bebida;
    public LecheM(Cafe bebida) { this.bebida = bebida; }
    public String getDescripcion() { return bebida.getDescripcion() + ", Leche Mediana"; }
    public double costo() { return 0.15 + bebida.costo(); }
}