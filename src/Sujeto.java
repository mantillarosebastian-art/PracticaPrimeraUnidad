public interface Sujeto {
    public void registrarObservador (ObservadorOrden o);
    public void removerObservador (ObservadorOrden o);
    public void notificarObservadores ();
}
