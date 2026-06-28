public class BasicaFactory extends LaptopFactory {
    @Override
    public Laptop crearLaptop(String marca, int fecha, String procesador, int pantalla) {
        return new LaptopBasica(marca , fecha , procesador, pantalla) ;
    }
}