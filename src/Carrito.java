import java.util.ArrayList;
import java.util.List;
public class Carrito {
    private List<Producto>
    productos=new ArrayList<>();

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    public List<Producto> getProductos() {
        return productos;
    }
    public double calcularTotal(){
        double total = 0;
        for (Producto producto: productos ){
            total+= producto.getPrecio();
        }
        return total;
    }
}
