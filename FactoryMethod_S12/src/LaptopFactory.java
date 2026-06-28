public abstract class LaptopFactory {
    public abstract Laptop crearLaptop (String marca, int fecha, String procesador, int pantalla) ;

    public void procesarLaptop (String marca, int fecha, String procesador, int pantalla) {
        Laptop laptop =crearLaptop(marca, fecha , procesador , pantalla) ;
        laptop.ejecutarPrueba() ;
        laptop.montrarDetalles() ;
    }
}