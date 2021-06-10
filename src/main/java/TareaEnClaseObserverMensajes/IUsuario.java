package TareaEnClaseObserverMensajes;

import java.util.List;

public interface IUsuario {
    void update(String message, Notificacion notificacion);
    List<String> getCategorias();
}
