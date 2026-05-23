public class ObservadorNotificacionAdmin implements ObservadorOrden{
    @Override
    public void actualizar (String nombre){
        System.out.println("Notificando al administrador del sistema...");
    }
}