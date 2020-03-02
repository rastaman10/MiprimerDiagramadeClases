package uml;

import java.sql.Date;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Datos del Colegio");	
		Colegio col1= new Colegio("Av. Covibar",23);
		System.out.println(col1);
		
		System.out.println("Datos del Alumnado y profesor");
		ProyectoDiagramaUmlVictorBalladares per1 = new ProyectoDiagramaUmlVictorBalladares("Victor Balladares",505,new Date(0),"Carlos",1);
		System.out.println(per1);
	}

}
