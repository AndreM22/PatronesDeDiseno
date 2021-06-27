package EjercicioExtraServicioTecnico;

public class Cliente {
	public static void main(String[] args) {
		Duenos presidente = new Presidente("Andre");
		Duenos vicePresidente = new VicePresidente("Alex");
		Duenos contador = new Contabilidad("ALbert");

		CuentaBancaria cuenta = CuentaBancaria.getInstance();

		cuenta.addDueno(presidente);
		cuenta.addDueno(vicePresidente);
		cuenta.addDueno(contador);

		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				cuenta.pagar(cuenta.repararComputador(new PC(40, "Axis 2020")));
			}
		});

		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				cuenta.pagar(cuenta.repararComputador(new Tablet(15, "Master G 2")));

			}
		});
		
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				cuenta.pagar(cuenta.repararComputador(new Laptop(30, "HP 22")));

			}
		});
		
		thread1.run();
		thread2.run();
		thread3.run();

	}
}
