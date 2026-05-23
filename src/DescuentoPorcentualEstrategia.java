public class DescuentoPorcentualEstrategia implements EstrategiaDescuento {
    private double porcentaje;
    public DescuentoPorcentualEstrategia(double porcentaje){
        this.porcentaje = porcentaje;
    }
    @Override
    public double aplicarDescuento(double total) {
        return total - (total * porcentaje);
    }
}
