package TareaEnClaseDecoratorCuenta;

public class Cliente {

	public static void main(String[] args) {
		ICuenta c = new Cuenta("Ramon", 100);
		c.informacionCuenta();
		
		c = new BancaPorInternet(c, true);
		c.informacionCuenta();
		
		c = new Seguro(10, c);
		c.informacionCuenta();
		
		c = new Promocion(c);
		c.informacionCuenta();

	}

}
