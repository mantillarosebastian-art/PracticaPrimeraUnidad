import java.util.ArrayList;
public class ServicioOrden implements Sujeto{
    private ArrayList<ObservadorOrden> observadores;
    private EstrategiaDescuento estrategiaDescuento;
    private String mensajeEstado;
    public ServicioOrden() {
        observadores =new ArrayList<ObservadorOrden>();
        this.estrategiaDescuento=new SinDescuentoEstrategia();
    }
    public void setEstrategiaDescuento (EstrategiaDescuento estrategiaDescuento){
        this.estrategiaDescuento= estrategiaDescuento;
    }
    @Override
    public void registrarObservador(ObservadorOrden o){
        observadores.add(o);
    }
    @Override
    public void removerObservador (ObservadorOrden o){
        int i = observadores.indexOf(o);
          if (i>= 0){
              observadores.remove(i);
          }
      }
    @Override
    public void notificarObservadores() {
        // Bucle clásico de recorrido secuencial con cast explícito (Fidelidad a la diapositiva)
        for (int i = 0; i < observadores.size(); i++) {
            ObservadorOrden observador = (ObservadorOrden) observadores.get(i);
            observador.actualizar(mensajeEstado);
        }
    }
    public void confirmarOrden (Carrito carrito, ProcesadorPago procesadorPago){
        double subtotal = carrito.calcularTotal();
        double totalConDescuento = estrategiaDescuento.aplicarDescuento(subtotal);

        procesadorPago.pagar(totalConDescuento);

        this.mensajeEstado="Orden Procesada Exitosamente";
        notificarObservadores();
    }

}
