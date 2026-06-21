public class MocaM extends DecoratorComplemento {
    Cafe bebida;
    public MocaM(Cafe bebida) { this.bebida = bebida; }
    public String getDescripcion() { return bebida.getDescripcion() + ", Moca Mediana"; }
    public double costo() { return 0.25 + bebida.costo(); }
}