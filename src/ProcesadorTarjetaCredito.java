public class ProcesadorTarjetaCredito implements ProcesadorPago{
    @Override
    public void pagar (double monto){
        System.out.println("Pago de $"+monto+ "procesado con TARJETA CREDITO de forma directa.");
    }
}
