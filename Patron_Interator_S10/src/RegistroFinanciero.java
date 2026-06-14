public class RegistroFinanciero implements Agregado {
    private Transaccion []transacciones;
    private int indice=0;
    private void addTransaccion(Transaccion transaccion) {
    }
    public RegistroFinanciero(){
        transacciones =new Transaccion [4];
        addTransaccion(new Transaccion("TX-001","8:43", "Deposito", 2000 ));
        addTransaccion(new Transaccion("TX-002", "10:47", "Retiro", 500));
        addTransaccion(new Transaccion("TX-003", "14:13", "Tranferencia", 60));
        addTransaccion(new Transaccion("TX-004", "16:32", "Deposito", 250));
    }
    @Override
    public Interator createiterator(){
        return new TransaccionIterator(transacciones);
    }
}
