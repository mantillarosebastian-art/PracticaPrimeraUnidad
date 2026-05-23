//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        ServicioOrden servicioOrden = new ServicioOrden();

        servicioOrden.registrarObservador(new ObservadorNotificacionCorreo());
        servicioOrden.registrarObservador(new ObservadorInventario());
        servicioOrden.registrarObservador(new ObservadorNotificacionAdmin());

        Producto producto1 = new Producto("Laptop Gamer", 4500.00);
        Producto producto2 = new Producto("Mouse Óptico", 150.00);

        Carrito carrito = new Carrito();

        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);

        System.out.println("=== ESCENARIO DE COMPRA ===");

        servicioOrden.setEstrategiaDescuento(
                new DescuentoPorcentualEstrategia(0.10)
        );

        ServicioPayPalExterno paypalExterno = new ServicioPayPalExterno();

        ProcesadorPago paypalAdaptado =
                new AdaptadorPayPal(paypalExterno);

        servicioOrden.confirmarOrden(carrito, paypalAdaptado);
    }
}