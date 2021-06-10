package TareaEnClaseObserverMensajes;


public interface IMensaje {
    void attach(IUsuario observer);
    void deattach(IUsuario observer);
    void notifyObserver(Notificacion notificacion);
}
