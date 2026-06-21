public class MocaG extends DecoratorComplemento {
    Cafe bebida;
    public MocaG(Cafe bebida) { this.bebida = bebida; }
    public String getDescripcion() { return bebida.getDescripcion() + ", Moca Grande"; }
    public double costo() { return 0.30 + bebida.costo(); }
}