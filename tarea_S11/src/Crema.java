public class Crema extends DecoratorComplemento{
    Cafe bebida;
    public Crema (Cafe bebida){
        this.bebida=bebida;
    }
    public String getDescripcion(){
        return bebida.getDescripcion() + ", Crema";
    }
    public double costo(){
        return 0.10 + bebida.costo();
    }
}