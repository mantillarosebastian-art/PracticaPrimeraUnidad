public class LaptopGamer implements Laptop {
    private String marcaModelo;
    private int fechaFabricacion;
    private String procesador;
    private int TamPantalla;

    public LaptopGamer (String marcaModelo, int fechaFabricacion, String procesador, int tamPantalla){
        this.marcaModelo= marcaModelo;
        this.fechaFabricacion = fechaFabricacion;
        this.procesador = procesador;
        this.TamPantalla= tamPantalla;
    }
    @Override
    public void ejecutarPrueba(){
        System.out.println("Corriendo programas de LAPTOP GAMER");
    }
    @Override
    public void montrarDetalles(){
        System.out.println("Laptop para GAMER");
        System.out.println("Marca y Modelo : " +this.marcaModelo);
        System.out.println("Año de Facribacion:"+this.fechaFabricacion);
        System.out.println("Procesador:"+ this.procesador);
        System.out.println("Tamaño de Pantalla:"+ this.TamPantalla);
    }
}
