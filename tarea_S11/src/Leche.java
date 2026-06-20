public class Leche extends DecoratorComplemento{
    Cafe bebida;
    public Leche (Cafe bebida){
        this.bebida=bebida;
    }
    public String getDescripcion(){
        return bebida.getDescripcion() + ", Leche";
    }
    public double costo(){
        return 0.10 + bebida.costo();
    }
}

