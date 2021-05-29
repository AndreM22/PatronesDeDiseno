package TareaPrototypeDocente;

public class Docente implements IDocente{
	int Sueldo;
	int Carga_Horaria;
	boolean Curso_Educacion_Superior;
	boolean AccesoPlataforma;
	boolean Marcado_Biometrico;
	String Marcado_hora_de_Entrada;
	String Marcado_hora_de_Salida;
	String Nombre;
	String Apellido;
	public int getSueldo() {
		return Sueldo;
	}
	public void setSueldo(int sueldo) {
		Sueldo = sueldo;
	}
	public int getCarga_Horaria() {
		return Carga_Horaria;
	}
	public void setCarga_Horaria(int carga_Horaria) {
		Carga_Horaria = carga_Horaria;
	}
	public boolean isCurso_Educacion_Superior() {
		return Curso_Educacion_Superior;
	}
	public void setCurso_Educacion_Superior(boolean curso_Educacion_Superior) {
		Curso_Educacion_Superior = curso_Educacion_Superior;
	}
	public boolean isAccesoPlataforma() {
		return AccesoPlataforma;
	}
	public void setAccesoPlataforma(boolean accesoPlataforma) {
		AccesoPlataforma = accesoPlataforma;
	}
	public boolean isMarcado_Biometrico() {
		return Marcado_Biometrico;
	}
	public void setMarcado_Biometrico(boolean marcado_Biometrico) {
		Marcado_Biometrico = marcado_Biometrico;
	}
	public String getMarcado_hora_de_Entrada() {
		return Marcado_hora_de_Entrada;
	}
	public void setMarcado_hora_de_Entrada(String marcado_hora_de_Entrada) {
		Marcado_hora_de_Entrada = marcado_hora_de_Entrada;
	}
	public String getMarcado_hora_de_Salida() {
		return Marcado_hora_de_Salida;
	}
	public void setMarcado_hora_de_Salida(String marcado_hora_de_Salida) {
		Marcado_hora_de_Salida = marcado_hora_de_Salida;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	
    @Override
    public Object clone() {
    	Docente docente = new Docente();
    	docente.setAccesoPlataforma(this.AccesoPlataforma);
    	docente.setApellido(Apellido);
    	docente.setCarga_Horaria(Carga_Horaria);
    	docente.setCurso_Educacion_Superior(Curso_Educacion_Superior);
    	docente.setMarcado_Biometrico(Marcado_Biometrico);
    	docente.setMarcado_hora_de_Entrada(Marcado_hora_de_Entrada);
    	docente.setMarcado_hora_de_Salida(Marcado_hora_de_Salida);
    	docente.setNombre(Nombre);
    	docente.setSueldo(Sueldo);
    	return docente;
    }
    
    public void mostrarInfo() {
    	System.out.println("Nombre: "+this.Nombre);
    	System.out.println("Apellido: "+this.Apellido);
    	System.out.println("Sueldo: "+this.Sueldo);
    	System.out.println("Carga horaria: "+this.Carga_Horaria);
    	System.out.println("Curso de educación Superior: "+this.Curso_Educacion_Superior);
    	System.out.println("Marcado de horario de entrada: "+this.Marcado_hora_de_Entrada);
    	System.out.println("Marcado de horario de salida: "+this.Marcado_hora_de_Salida);
    	System.out.println("Acceso a plataforma: "+this.AccesoPlataforma);
    	System.out.println("Marcado Biométrico: "+this.Marcado_Biometrico);
    	
    }
}
