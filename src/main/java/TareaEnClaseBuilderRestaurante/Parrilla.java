package TareaEnClaseBuilderRestaurante;

public class Parrilla {
    private String tipoDeCarne;
    private String saborRefresco;
    private String guarniciones;
	public String getTipoDeCarne() {
		return tipoDeCarne;
	}
	public void setTipoDeCarne(String tipoDeCarne) {
		this.tipoDeCarne = tipoDeCarne;
	}
	public String getSaborRefresco() {
		return saborRefresco;
	}
	public void setSaborRefresco(String saborRefresco) {
		this.saborRefresco = saborRefresco;
	}
	public String getGuarniciones() {
		return guarniciones;
	}
	public void setGuarniciones(String guarniciones) {
		this.guarniciones = guarniciones;
	}
    public void showData() {
        System.out.println("Tipo de carne : "+tipoDeCarne);
        System.out.println("Sabor De Refresco : "+saborRefresco);
        System.out.println("Guarniciones : "+guarniciones);

    }
}
