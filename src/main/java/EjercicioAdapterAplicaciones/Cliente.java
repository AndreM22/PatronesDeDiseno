package EjercicioAdapterAplicaciones;

public class Cliente {

	public static void main(String[] args) {
		Android facebook = new Android();
		IOS newMi = new IOS();
		WindowsPhone waze = new WindowsPhone();
		
		AppComputadorAdaptado youtube = new AppComputadorAdaptado(new Web());
		AppComputadorAdaptado sudoku = new AppComputadorAdaptado(new Escritorio());

		facebook.login();
		facebook.logout();
		facebook.reportes();
		
		newMi.login();
		newMi.logout();
		newMi.reportes();
		
		waze.login();
		waze.logout();
		waze.reportes();
		
		youtube.login();
		youtube.logout();
		youtube.reportes();
		
		sudoku.login();
		sudoku.logout();
		sudoku.reportes();
	}

}
