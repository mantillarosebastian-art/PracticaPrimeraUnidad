public class CremaM extends DecoratorComplemento {
    Cafe bebida;
    public CremaM(Cafe bebida) { this.bebida = bebida; }
    public String getDescripcion() { return bebida.getDescripcion() + ", Crema Mediana"; }
    public double costo() { return 0.15 + bebida.costo(); }
}