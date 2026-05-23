public class DescuentoMontoFijoEstrategia implements EstrategiaDescuento {
    private double monto;
    public DescuentoMontoFijoEstrategia (double monto){
        this.monto = monto;
    }
    @Override
    public double aplicarDescuento(double total) {
        if (total>=monto){
            return total - monto;
        }
        return 0;
    }
}
