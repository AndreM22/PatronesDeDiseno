package EjercicioProxyServidores;

public class Cliente {

	public static void main(String[] args) {
		Proxy proxy = new Proxy(new Servidor(), new Servidor());
		
		proxy.registrar("abc", "123");
		proxy.registrar("def", "245");
		proxy.registrar("ghi", "678");
		proxy.registrar("jkl", "111");
		proxy.registrar("mno", "222");
		proxy.registrar("pqr", "333");

		proxy.ingresar("abc", "222");
		
		proxy.ingresar("abc", "123");
		proxy.ingresar("def", "245");
		proxy.ingresar("ghi", "678");
		proxy.ingresar("jkl", "111");
		proxy.ingresar("mno", "222");
		proxy.ingresar("pqr", "333");

	}

}
