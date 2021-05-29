package TareaAbstractFactoryMaterias;

public class FactoryMateria {
	static IMateria lenguaje = new Lenguaje();
	static IMateria matematicas = new Matematicas();
	static IMateria ingles = new Ingles();
	static IMateria historia = new Historia();

	enum Materias {
		Lenguaje, Matematicas, Ingles, Historia
	}

	public static IMateria make(Materias p) {
		switch (p) {
		case Lenguaje:
			((Lenguaje)(lenguaje)).setCreditos(4);
			((Lenguaje)(lenguaje)).setHorasRequeridas(50);
			((Lenguaje)(lenguaje)).setProfesor("Olga");
			return lenguaje;
		case Matematicas:
			((Matematicas)(matematicas)).setCreditos(5);
			((Matematicas)(matematicas)).setHorasRequeridas(70);
			((Matematicas)(matematicas)).setProfesor("Martin");
			return matematicas;
		case Ingles:
			((Ingles)(ingles)).setCreditos(3);
			((Ingles)(ingles)).setHorasRequeridas(40);
			((Ingles)(ingles)).setProfesor("Angie");
			return ingles;
		case Historia:
			((Historia)(historia)).setCreditos(4);
			((Historia)(historia)).setHorasRequeridas(50);
			((Historia)(historia)).setProfesor("Noemi");
			return historia;
		}
		return null;
	}

}
