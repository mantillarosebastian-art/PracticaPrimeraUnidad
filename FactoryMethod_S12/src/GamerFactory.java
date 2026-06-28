public class GamerFactory extends LaptopFactory {
    @Override
    public Laptop crearLaptop(String marca, int fecha, String procesador, int pantalla) {
        return new LaptopGamer(marca, fecha , procesador, pantalla);
    }
}