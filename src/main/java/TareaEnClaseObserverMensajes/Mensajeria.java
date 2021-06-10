package TareaEnClaseObserverMensajes;

import java.util.ArrayList;
import java.util.List;


public class Mensajeria implements IMensaje {
	private List<IUsuario> observerList = new ArrayList<>();

	private List<Notificacion> notificacionList = new ArrayList<>();

	public void uploadNewNotification(Notificacion notificacion) {
		notificacionList.add(notificacion);
		this.notifyObserver(notificacion);
	}

	@Override
	public void attach(IUsuario observer) {
		observerList.add(observer);
	}

	@Override
	public void deattach(IUsuario observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObserver(Notificacion notificacion) {
		for (IUsuario user : observerList) {
			for(String s: user.getCategorias()) {
				if(s.equals(notificacion.getTipo())) {
					user.update(notificacion.getMensaje(), notificacion);
				}
			}


		}
	}
}
