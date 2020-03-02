package uml;

public class Colegio {
	//atributos
	String direccion;
	int añosFundado;
	
	//constructor
	public Colegio(String direccion, int añosFundado) {
		super();
		this.direccion = direccion;
		this.añosFundado = añosFundado;
	}

//metodos getters and setters
	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getAñosFundado() {
		return añosFundado;
	}


	public void setAñosFundado(int añosFundado) {
		this.añosFundado = añosFundado;
	}


	@Override
	public String toString() {
		return "Colegio [direccion=" + direccion + ", añosFundado=" + añosFundado + "]";
	}
	
	

}
