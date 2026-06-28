public class ProfesionalFactory extends LaptopFactory{
    @Override
    public Laptop crearLaptop (String marca, int fecha, String procesador, int pantalla) {
        return new LaptopProfesional(marca, fecha , procesador, pantalla) ;
    }
}