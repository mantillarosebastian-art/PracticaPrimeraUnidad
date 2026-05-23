public class ObservadorInventario implements ObservadorOrden {
    @Override
    public void actualizar(String mensaje) {
        System.out.println("Actualizando Inventario...");
    }
}
