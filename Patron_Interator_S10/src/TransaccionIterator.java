 public class TransaccionIterator implements Interator {
    private Transaccion[] transacciones;
    private int posicion = 0;

    public TransaccionIterator(Transaccion[] transacciones){
        this.transacciones = transacciones;
    }
     @Override
     public boolean hasNext() {
         return posicion < transacciones.length && transacciones [posicion] != null;
     }
     @Override
     public Object next() {
         Transaccion transaccion= transacciones [posicion];
         posicion ++;
         return transaccion ;
     }
 }
