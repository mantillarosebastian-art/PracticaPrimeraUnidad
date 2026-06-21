public class CremaG extends DecoratorComplemento {
    Cafe bebida;
    public CremaG(Cafe bebida) { this.bebida = bebida; }
    public String getDescripcion() { return bebida.getDescripcion() + ", Crema Grande"; }
    public double costo() { return 0.20 + bebida.costo(); }
}