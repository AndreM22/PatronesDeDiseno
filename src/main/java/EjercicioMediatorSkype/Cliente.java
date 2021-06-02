package EjercicioMediatorSkype;

public class Cliente {

	public static void main(String[] args) {
		Skype skype = new Skype();
		
		DEV dev1 = new DEV(skype, "Juan", 10001, "Java");
		DEV dev2 = new DEV(skype, "Jose", 10002, "Python");
		DEV dev3 = new DEV(skype, "Julian", 10003, "Lisp");
		
		QA qa1 = new QA(skype, "Katrina", 20001, "Doctor");
		QA qa2 = new QA(skype, "Karen", 20002, "Licenciado");
		QA qa3 = new QA(skype, "Katherine", 20003, "Master");
		
		SM sm1 = new SM(skype, "Simon", 30001, 3);
		SM sm2 = new SM(skype, "Sergio", 30002, 5);
		SM sm3 = new SM(skype, "Salvador", 30003, 2);

		skype.addCollegue(dev1);
		skype.addCollegue(dev2);
		skype.addCollegue(dev3);

		skype.addCollegue(qa1);
		skype.addCollegue(qa2);
		skype.addCollegue(qa3);

		skype.addCollegue(sm1);
		skype.addCollegue(sm2);
		skype.addCollegue(sm3);

		dev1.send("Prueba de dev 1");
		qa2.send("Prueba de qa 2");
		sm3.send("Prueba de sm 3");
	}

}
