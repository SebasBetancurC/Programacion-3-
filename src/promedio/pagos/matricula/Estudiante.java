package promedio.pagos.matricula;

public class Estudiante {

	public String nombre;
	public Float vlrMatricula;
	
	
	public Estudiante(String nombre, Float vlrMatricula) {
		
		this.nombre = nombre;
		this.vlrMatricula = vlrMatricula;
	}


	public Float getVlrMatricula() {
		return vlrMatricula;
	}


	public void setDifPromedioPag(Float vlrMatricula) {
		this.vlrMatricula = vlrMatricula;
	}
	
	public String mostrarDatos() {
		return "nombre: " +nombre+ "\nValor de la Matricula: "  +vlrMatricula+  "\n";
	}
	

}
