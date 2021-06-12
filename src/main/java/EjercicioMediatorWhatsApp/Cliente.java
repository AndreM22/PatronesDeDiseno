package EjercicioMediatorWhatsApp;

import java.util.LinkedList;
import java.util.List;

public class Cliente {
	public static void main(String[] args) {
		WhatsApp wp = new WhatsApp();
		
		Usuario u1 = new UsuarioDeWhatsApp(wp, "Ale");
		Usuario u2 = new UsuarioDeWhatsApp(wp, "Armando");
		Usuario u3 = new UsuarioDeWhatsApp(wp, "Alicia");
		Usuario u4 = new UsuarioDeWhatsApp(wp, "Abel");
		Usuario u5 = new UsuarioDeWhatsApp(wp, "Antonio");
		Usuario u6 = new UsuarioDeWhatsApp(wp, "Alex");
		Usuario u7 = new UsuarioDeWhatsApp(wp, "Aldo");
		Usuario u8 = new UsuarioDeWhatsApp(wp, "Andres");
		Usuario u9 = new UsuarioDeWhatsApp(wp, "Andrea");
		Usuario u10 = new UsuarioDeWhatsApp(wp, "Andy");
		
		List<Usuario> l1 = new LinkedList<Usuario>();
		
		l1.add(u1);
		l1.add(u2);
		l1.add(u3);
		l1.add(u4);
		l1.add(u5);
		l1.add(u6);
		l1.add(u7);
		l1.add(u8);
		l1.add(u9);
		l1.add(u10);

		GrupoUsuarios g1 = new GrupoUsuarios("Friends");
		
		g1.setGrupo(l1);
		
		wp.addGrupo(g1);
		
		u1.sendPerson("hola!", u2);

		u10.sendGroup("Probando", g1.getNombre());

	}
}
