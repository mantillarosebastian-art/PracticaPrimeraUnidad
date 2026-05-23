public class AdaptadorPayPal implements ProcesadorPago {
    private ServicioPayPalExterno servicioPayPal;
    public AdaptadorPayPal(ServicioPayPalExterno servicioPayPal){
        this.servicioPayPal = servicioPayPal;
    }
    @Override
    public void pagar (double monto){
        servicioPayPal.realizarPago("PEN", monto);
    }
}
