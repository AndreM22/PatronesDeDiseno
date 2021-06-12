package EjercicioMementoYObserverGit;

public class Cliente {
	public static void main(String[] args) {
		
		Commits commits = new Commits();
		Originator originator = new Originator();
		
		GitCodigo gc;
		
		gc = new GitCodigo(1, "aaaaaaaa");
		originator.setState(gc);
		commits.addMemento(originator.createVersion());
		
		gc = new GitCodigo(2, "bbbbbbbb");
		originator.setState(gc);
		commits.addMemento(originator.createVersion());
		
		gc = new GitCodigo(3, "ccccccccc");
		originator.setState(gc);
		commits.addMemento(originator.createVersion());
		
		gc = new GitCodigo(4, "dddddddddd");
		originator.setState(gc);
		commits.addMemento(originator.createVersion());
		
		gc = new GitCodigo(5, "eeeeeeeeee");
		originator.setState(gc);
		commits.addMemento(originator.createVersion());
		
		Desarrollador d1 = new Desarrollador("Juan");
		Desarrollador d2 = new Desarrollador("Jose");
		Desarrollador d3 = new Desarrollador("Jacinto");

		originator.attach(d1);
		originator.attach(d2);
		originator.attach(d3);
		
		originator.restoreFromMemento(commits.getVersion(0));
		
		originator.deattach(d1);
		originator.deattach(d2);
		originator.deattach(d3);
		
		Desarrollador d4 = new Desarrollador("Camila");
		Desarrollador d5 = new Desarrollador("Carola");
		Desarrollador d6 = new Desarrollador("Cecilia");
		
		originator.attach(d4);
		originator.attach(d5);
		originator.attach(d6);
		
		originator.restoreFromMemento(commits.getVersion(4));

	}
}
