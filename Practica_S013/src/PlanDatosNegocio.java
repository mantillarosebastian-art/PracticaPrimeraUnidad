public class PlanDatosNegocio implements PlanDatos{
    private String nombre = "Plan Datos Negocio";
    private float tasa;
    private String proveedor;
    public void preparar (){
        System.out.println("Configurando plan:"+nombre);
        System.out.println("Asignando proveedor:" + proveedor);
        System.out.println("Aplicando tasa por mega:S/"+ tasa);
    }
    public float calculoPago(int datos){
        return datos * this.tasa;
    }
    public String getNombre (){
        return nombre ;
    }
    public void setTasa (float tasa){
        this.tasa =tasa;
    }
    public void setProveedor (String proveedor){
        this.proveedor =proveedor;
    }
}
