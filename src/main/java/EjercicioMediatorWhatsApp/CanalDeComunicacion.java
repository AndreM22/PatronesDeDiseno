package EjercicioMediatorWhatsApp;

import java.util.List;

public interface CanalDeComunicacion {
    void send( String message, Usuario usuario);
    void sendGroup(String message, String nombreGrupo, Usuario Origen);

}
