package EjercicioVisitorMantenimiento;

public class Cliente {

	public static void main(String[] args) {
		Celular celular = new Celular("Huawei P20", "32Gb", "30 Mpx", "4Gb", "Android");
		Computadora computadora = new Computadora("Hp 3000", "512Gb", "10Gb");
		Televisor televisor = new Televisor("Sony 232", "High Quality", "3 años", true);
		
		AppMantenimiento app = new AppMantenimiento();
		
		celular.recibirMantenimiento(app);
		computadora.recibirMantenimiento(app);
		televisor.recibirMantenimiento(app);


	}

}
