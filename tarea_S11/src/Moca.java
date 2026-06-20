public class Moca extends DecoratorComplemento {
    Cafe bebida;
    public Moca(Cafe bebida){
        this.bebida=bebida;
    }
    public String getDescripcion(){
        return bebida.getDescripcion() + ", Moca";
    }
    public double costo(){
        return 0.20 + bebida.costo();
    }
}
