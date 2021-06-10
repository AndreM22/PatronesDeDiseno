package TareaEnClaseObserverMensajes;

import java.util.LinkedList;
import java.util.List;

public class Cliente {

	public static void main(String[] args) {
		Mensajeria m = new Mensajeria();
		
		UsuarioDeCompania user1= new UsuarioDeCompania(new Persona("123","Juan"));
		UsuarioDeCompania user2= new UsuarioDeCompania(new Persona("124","Juan1"));
		UsuarioDeCompania user3= new UsuarioDeCompania(new Persona("125","Juan2"));
		UsuarioDeCompania user4= new UsuarioDeCompania(new Persona("126","Juan3"));
		
		
		user1.add("Precio");
		user2.add("Precio");

		
		
		m.attach(user1);
		m.attach(user2);
		m.attach(user3);
		m.attach(user4);

		m.uploadNewNotification(new Notificacion("Precio", "Mejores precios siempre"));
	
	}

}
