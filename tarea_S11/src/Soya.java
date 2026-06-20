public class Soya extends DecoratorComplemento{
    Cafe bebida;
    public Soya(Cafe bebida){
        this.bebida=bebida;
    }
    public String getdescripcion(){
        return bebida.getDescripcion() + ", Soya";
    }
    public double costo(){
        return 0.15 + bebida.costo();
    }
}