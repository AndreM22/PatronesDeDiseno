package EjercicioMementoBackUp;

import java.util.LinkedList;
import java.util.List;

public class Cliente {

	public static void main(String[] args) {
		CareTaker careTaker = new CareTaker();
		Originator originator = new Originator();
		
		Persona persona1 = new Persona("p1", 1, 20);
		Persona persona2 = new Persona("p2", 2, 20);
		Persona persona3 = new Persona("p3", 3, 20);
		Persona persona4 = new Persona("p4", 4, 20);
		Persona persona5 = new Persona("p5", 5, 20);
		List<Persona> list1 = new LinkedList<Persona>();
		list1.add(persona1);
		list1.add(persona2);
		list1.add(persona3);
		list1.add(persona4);
		list1.add(persona5);

		Persona persona6 = new Persona("p6", 6, 20);
		Persona persona7 = new Persona("p7", 7, 20);
		Persona persona8 = new Persona("p8", 8, 20);
		Persona persona9 = new Persona("p9", 9, 20);
		Persona persona10 = new Persona("p10", 10, 20);
		List<Persona> list2 = new LinkedList<Persona>();
		list2.add(persona6);
		list2.add(persona7);
		list2.add(persona8);
		list2.add(persona9);
		list2.add(persona10);

		Persona persona11 = new Persona("p11", 11, 20);
		Persona persona12 = new Persona("p12", 12, 20);
		Persona persona13 = new Persona("p13", 13, 20);
		Persona persona14 = new Persona("p14", 14, 20);
		Persona persona15 = new Persona("p15", 15, 20);
		List<Persona> list3 = new LinkedList<Persona>();
		list3.add(persona11);
		list3.add(persona12);
		list3.add(persona13);
		list3.add(persona14);
		list3.add(persona15);

		Persona persona16 = new Persona("p16", 16, 20);
		Persona persona17 = new Persona("p17", 17, 20);
		Persona persona18 = new Persona("p18", 18, 20);
		Persona persona19 = new Persona("p19", 19, 20);
		Persona persona20 = new Persona("p20", 20, 20);
		List<Persona> list4 = new LinkedList<Persona>();
		list4.add(persona16);
		list4.add(persona17);
		list4.add(persona18);
		list4.add(persona19);
		list4.add(persona20);

		Persona persona21 = new Persona("p21", 21, 20);
		Persona persona22 = new Persona("p22", 22, 20);
		Persona persona23 = new Persona("p23", 23, 20);
		Persona persona24 = new Persona("p24", 24, 20);
		Persona persona25 = new Persona("p25", 25, 20);
		List<Persona> list5 = new LinkedList<Persona>();
		list5.add(persona21);
		list5.add(persona22);
		list5.add(persona23);
		list5.add(persona24);
		list5.add(persona25);

		BackUp backUp;
		backUp= new BackUp("BackupMarzo", list1);
		originator.setState(backUp);
		
		backUp= new BackUp("BackupAbril", list2);
		originator.setState(backUp);
		careTaker.addMemento(originator.createMemento());
		
		backUp= new BackUp("BackupMayo", list3);
		originator.setState(backUp);
		
		backUp= new BackUp("BackupJunio", list4);
		originator.setState(backUp);
		
		backUp= new BackUp("BackupJulio", list5);
		originator.setState(backUp);
		careTaker.addMemento(originator.createMemento());
		
        originator.restoreFromMemento(careTaker.getMemento(0));
        originator.restoreFromMemento(careTaker.getMemento(1));

	}

}
