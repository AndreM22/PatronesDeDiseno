package EjercicioExtraServicioTecnico;

public class VicePresidente extends Duenos{
	String nombre;

	public VicePresidente(String nombre) {
		this.nombre=nombre;
	}


	@Override
	public void messageReceived(String mensaje) {
		System.out.println("El vicepresidente "+nombre+" ha recibido el mensaje "+mensaje);
		
	}
	

}
