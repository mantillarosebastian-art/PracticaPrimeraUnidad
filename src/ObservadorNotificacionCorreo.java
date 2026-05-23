public class ObservadorNotificacionCorreo implements ObservadorOrden {
    public void actualizar(String mensaje) {
        System.out.println("Enciando correo al cliente-------Estado:" + mensaje + "-------");
    }
}


