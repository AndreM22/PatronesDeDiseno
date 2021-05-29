package TareaPrototypeDocente;

public class Cliente {
	public static void main(String[] args) {
		Docente docente1 = new Docente();

		docente1.setAccesoPlataforma(true);
		docente1.setApellido("Mamani");
		docente1.setCarga_Horaria(80);
		docente1.setCurso_Educacion_Superior(true);
		docente1.setMarcado_Biometrico(false);
		docente1.setMarcado_hora_de_Entrada("08:00");
		docente1.setMarcado_hora_de_Salida("18:00");
		docente1.setNombre("Alberto");
		docente1.setSueldo(5000);

		Docente docente2 = (Docente) docente1.clone();
		docente2.setNombre("Yair");
		docente2.setApellido("Machaca");

		Docente docente3 = (Docente) docente1.clone();
		docente3.setNombre("Tres");
		docente3.setApellido("Three");
		
		Docente docente4 = (Docente) docente1.clone();
		docente4.setNombre("Cuatro");
		docente4.setApellido("Four");
		
		Docente docente5 = (Docente) docente1.clone();
		docente5.setNombre("ewqr");
		docente5.setApellido("feqw");
		
		Docente docente6 = (Docente) docente1.clone();
		docente6.setNombre("sfdgr");
		docente6.setApellido("awers");
		
		Docente docente7 = (Docente) docente1.clone();
		docente7.setNombre("ewfhh");
		docente7.setApellido("res");
		
		Docente docente8 = (Docente) docente1.clone();
		docente8.setNombre("asdg");
		docente8.setApellido("fgsr");
		
		Docente docente9 = (Docente) docente1.clone();
		docente9.setNombre("vfdswrtw");
		docente9.setApellido("wraef");
		
		Docente docente10 = (Docente) docente1.clone();
		docente10.setNombre("hyjd");
		docente10.setApellido("Maweefchaca");
		
		Docente docente11 = (Docente) docente1.clone();
		docente11.setNombre("ergsd");
		docente11.setApellido("jhgfdsw");
		
		Docente docente12 = (Docente) docente1.clone();
		docente12.setNombre("sdfvnn");
		docente12.setApellido("liol");
		
		Docente docente13 = (Docente) docente1.clone();
		docente13.setNombre("dsfeaw");
		docente13.setApellido("qazssd");
		
		Docente docente14 = (Docente) docente1.clone();
		docente14.setNombre("fghjjte");
		docente14.setApellido("qqwe");
		
		Docente docente15 = (Docente) docente1.clone();
		docente15.setNombre("ssaa");
		docente15.setApellido("fsdfe");
		
		docente1.mostrarInfo();
		docente2.mostrarInfo();
		docente3.mostrarInfo();
		docente4.mostrarInfo();
		docente5.mostrarInfo();
		docente6.mostrarInfo();
		docente7.mostrarInfo();
		docente8.mostrarInfo();
		docente9.mostrarInfo();
		docente10.mostrarInfo();
		docente11.mostrarInfo();
		docente12.mostrarInfo();
		docente13.mostrarInfo();
		docente14.mostrarInfo();
		docente15.mostrarInfo();

	}

}
