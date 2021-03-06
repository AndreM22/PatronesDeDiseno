package EjercicioCommandVideojuego;

import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Personaje personaje = new Personaje();

		Atacar atacar = new Atacar(personaje);
		Defender defender = new Defender(personaje);
		Disparar disparar = new Disparar(personaje);

		Invoker combo1 = new Invoker();
		combo1.addCommand(atacar);
		combo1.addCommand(defender);
		combo1.addCommand(disparar);

		Invoker combo2 = new Invoker();
		combo2.addCommand(disparar);
		combo2.addCommand(atacar);
		combo2.addCommand(defender);

		Invoker combo3 = new Invoker();
		combo3.addCommand(defender);
		combo3.addCommand(atacar);
		combo3.addCommand(disparar);

		int n = sc.nextInt();
		switch (n) {
		case 1:
			combo1.executeCommands();
			break;
		case 2:
			combo2.executeCommands();
			break;
		case 3:
			combo3.executeCommands();
			break;
		}
	}

}
