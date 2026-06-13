public class Transaccion {
    private String codigo;
    private String hora;
    private String tipo;
    private double monto;

    public Transaccion(String codigo, String hora, String tipo, double monto ){
        this.codigo =codigo;
        this.hora = hora;
        this.tipo = tipo;
        this.monto = monto;
    }
    public String getCodigo(){
        return codigo;
    }
    public String getHora(){
        return hora;
    }
    public String getTipo(){
        return tipo;
    }
    public double getMonto(){
        return monto;
    }

}
