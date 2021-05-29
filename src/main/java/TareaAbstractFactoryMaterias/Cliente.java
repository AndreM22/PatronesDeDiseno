package TareaAbstractFactoryMaterias;


public class Cliente {
	public static void main(String[] args) {
		Matematicas materiaEstudiante1 = (Matematicas) FactoryMateria.make(FactoryMateria.Materias.Matematicas);
		Lenguaje materiaEstudiante2 = (Lenguaje) FactoryMateria.make(FactoryMateria.Materias.Lenguaje);
		Historia materiaEstudiante3 = (Historia) FactoryMateria.make(FactoryMateria.Materias.Historia);
		Ingles materiaEstudiante4 = (Ingles) FactoryMateria.make(FactoryMateria.Materias.Ingles);
		Matematicas materiaEstudiante5 = (Matematicas) FactoryMateria.make(FactoryMateria.Materias.Matematicas);

		materiaEstudiante1.crear();
		materiaEstudiante2.crear();
		materiaEstudiante3.crear();
		materiaEstudiante4.crear();
		materiaEstudiante5.crear();

	}
}
