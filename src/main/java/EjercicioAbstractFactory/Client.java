package EjercicioAbstractFactory;


public class Client {
    /**
     * @param args
     */
    public  static void main (String[]args){
    	Fruta fruta = new Fruta();
    	fruta.setCosto("15bs");
    	fruta.setNombre("Pomelo");
    	fruta.setTipoFruta("Dulce");
    	fruta.setTamano("Grande");
    	
    	Base base = new Base();
    	base.setCosto("5bs");
    	base.setTipo("Galleta De Chocolate");
    	base.setTamano("Chico");
    	base.setNombre("Base De Chocolate");
    	
    	Crema crema = new Crema();
    	crema.setCosto("3bs");
    	crema.setMarca("Delicia");
    	crema.setSabor("frutilla");
    	
    	Fruta fruta2 = new Fruta();
    	fruta2.setCosto("5bs");
    	fruta2.setNombre("Frambuesa");
    	fruta2.setTipoFruta("Dulce");
    	fruta2.setTamano("Muy pequeño");
    	
    	Base base2 = new Base();
    	base2.setCosto("10bs");
    	base2.setTipo("Galleta Con trozos de frutas");
    	base2.setTamano("Mediano");
    	base2.setNombre("Galleta Frutal");
    	
    	Crema crema2 = new Crema();
    	crema2.setCosto("5bs");
    	crema2.setMarca("Nestle");
    	crema2.setSabor("Chocolate Suizo");
    	
		HeladoAgua helado1 = (HeladoAgua) FactoryHelado.make(FactoryHelado.Helados.HeladoAgua);
		
		HeladoAgua helado2 = (HeladoAgua) FactoryHelado.make(FactoryHelado.Helados.HeladoAgua);
		helado2.setForma("Baso");
		helado2.setBase(base);
		helado2.setFruta(fruta);
		helado2.setTamano("Muy grande");
		
		HeladoAgua helado3 = (HeladoAgua) FactoryHelado.make(FactoryHelado.Helados.HeladoAgua);
		helado2.setForma("Cono");
		helado2.setBase(base2);
		helado2.setFruta(fruta2);
		helado2.setTamano("Muy pequeño");
		
		HeladoCrema helado4 =(HeladoCrema) FactoryHelado.make(FactoryHelado.Helados.HeladoCrema);
		
		HeladoCrema helado5 =(HeladoCrema) FactoryHelado.make(FactoryHelado.Helados.HeladoCrema);
		helado4.setForma("Cono");
		helado4.setBase(base);
		helado4.setFruta(fruta);
		helado4.setCrema(crema);
		helado4.setTamano("Grande");
		
		HeladoCrema helado6 =(HeladoCrema) FactoryHelado.make(FactoryHelado.Helados.HeladoCrema);
		helado4.setForma("Baso");
		helado4.setBase(base2);
		helado4.setFruta(fruta2);
		helado4.setCrema(crema2);
		helado4.setTamano("Mega");
		
		HeladoMixto helado7 =(HeladoMixto) FactoryHelado.make(FactoryHelado.Helados.HeladoMixto);
		
		HeladoMixto helado8 =(HeladoMixto) FactoryHelado.make(FactoryHelado.Helados.HeladoMixto);
		helado4.setForma("Baso");
		helado4.setBase(base);
		helado4.setFruta(fruta);
		helado4.setCrema(crema);
		helado4.setTamano("Gigante");
		
		HeladoMixto helado9 =(HeladoMixto) FactoryHelado.make(FactoryHelado.Helados.HeladoMixto);
		helado4.setForma("Cono");
		helado4.setBase(base2);
		helado4.setFruta(fruta2);
		helado4.setCrema(crema2);
		helado4.setTamano("Mediano");
		
		helado1.crear();
		helado2.crear();
		helado3.crear();
		helado4.crear();
		helado5.crear();
		helado6.crear();
		helado7.crear();
		helado8.crear();
		helado9.crear();



    }
}