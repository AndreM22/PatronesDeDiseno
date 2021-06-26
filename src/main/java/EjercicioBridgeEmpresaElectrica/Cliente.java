package EjercicioBridgeEmpresaElectrica;

public class Cliente {

	public static void main(String[] args) {
		IInstalacion iag1 = new InstalacionAgua("Aqua", 100, new Efectivo());
		IInstalacion iag2 = new InstalacionAgua("Aqua", 100, new Transferencia());
		IInstalacion iag3 = new InstalacionAgua("Aqua", 100, new TigoMoney());
		IInstalacion iag4 = new InstalacionAgua("Aqua", 100, new Aplicacion());
		
		iag1.pagar();
		iag2.pagar();
		iag3.pagar();
		iag4.pagar();

		
		IInstalacion ial1 = new InstalacionAlcantarillado("Monster", 150, new Efectivo());
		IInstalacion ial2 = new InstalacionAlcantarillado("Monster", 150, new Transferencia());
		IInstalacion ial3 = new InstalacionAlcantarillado("Monster", 150, new TigoMoney());
		IInstalacion ial4 = new InstalacionAlcantarillado("Monster", 150, new Aplicacion());
		
		ial1.pagar();
		ial2.pagar();
		ial3.pagar();
		ial4.pagar();
		
		IInstalacion ie1 = new InstalacionElectrica("Flash", 1000, new Efectivo());
		IInstalacion ie2 = new InstalacionElectrica("Flash", 1000, new Transferencia());
		IInstalacion ie3 = new InstalacionElectrica("Flash", 1000, new TigoMoney());
		IInstalacion ie4 = new InstalacionElectrica("Flash", 1000, new Aplicacion());
		
		ie1.pagar();
		ie2.pagar();
		ie3.pagar();
		ie4.pagar();
		
	}

}
