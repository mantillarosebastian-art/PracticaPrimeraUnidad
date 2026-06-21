public class SoyaM extends DecoratorComplemento {
    Cafe bebida;
    public SoyaM(Cafe bebida) { this.bebida = bebida; }
    public String getDescripcion() { return bebida.getDescripcion() + ", Soya Mediana"; }
    public double costo() { return 0.20 + bebida.costo(); }
}