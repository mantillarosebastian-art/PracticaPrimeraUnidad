public interface PlanDatos {
    void preparar ();
    float calculoPago(int datos);
    String getNombre();
    void setTasa(float tasa);
    void setProveedor(String provedor);
}
