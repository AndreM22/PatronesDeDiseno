package TareaEnClaseDecoratorCuenta;

public class Cuenta implements ICuenta{
	String nombrePropietario;
	int monto;
	
	public Cuenta(String nombrePropietario, int monto) {
		this.nombrePropietario = nombrePropietario;
		this.monto = monto;
	}
	@Override
	public int monto() {
		return monto;
	}
	@Override
	public String nombrePropietario() {
		return nombrePropietario;
	}
	@Override
	public void agregarFondos(int cantidad) {
		monto+=cantidad;
		
	}
	@Override
	public void quitarFondos(int cantidad) {
		monto-=cantidad;
		
	}
	@Override
	public void informacionCuenta() {
		System.out.println("**************************");
		System.out.println("Información de la cuenta");
		System.out.println("Nombre del propietario: "+nombrePropietario);
		System.out.println("Monot de la cuenta: "+ monto);
		
	}
	
	

}
