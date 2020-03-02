package uml;

import java.sql.Date;

/**
 * 
 * @author Victor balladares
 *
 */

public class ProyectoDiagramaUmlVictorBalladares extends Colegio{
	//atributos
	String Alumno;
	int IdAlumno;
	Date fechaRegistro;
	String Profesor;
	int IdProfesor;
	//constructor
	public ProyectoDiagramaUmlVictorBalladares(String alumno, int idAlumno, Date fechaRegistro, String profesor,int idProfesor) {
		super(profesor, idProfesor);
		Alumno = alumno;
		IdAlumno = idAlumno;
		this.fechaRegistro = fechaRegistro;
		Profesor = profesor;
		IdProfesor = idProfesor;
	}
//metodos getters and setters
	public String getAlumno() {
		return Alumno;
	}

	public void setAlumno(String alumno) {
		Alumno = alumno;
	}

	public int getIdAlumno() {
		return IdAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		IdAlumno = idAlumno;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getProfesor() {
		return Profesor;
	}

	public void setProfesor(String profesor) {
		Profesor = profesor;
	}

	public int getIdProfesor() {
		return IdProfesor;
	}

	public void setIdProfesor(int idProfesor) {
		IdProfesor = idProfesor;
	}

	@Override
	public String toString() {
		return "ProyectoDiagramaUmlVictorBalladares [Alumno=" + Alumno + ", IdAlumno=" + IdAlumno + ", fechaRegistro="
				+ fechaRegistro + ", Profesor=" + Profesor + ", IdProfesor=" + IdProfesor + "]";
	}

	
	
	

}
