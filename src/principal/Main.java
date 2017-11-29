package principal;

import java.time.LocalDate;

import modelo.Alumno;

public class Main {

	public static void main(String[] args) {
	
		//-------crear objetos de tipo alumno--------------------
		Alumno alumno1 = new Alumno();
		Alumno alumno2 = new Alumno();
		Alumno alumno3 = new Alumno("Abel", "Davila", 'M',LocalDate.of(1970, 5, 15), false, "1 DAW", 1);
		
		System.out.println("el alumno es: "+ alumno1.toString());
		System.out.println("el alumno es: "+ alumno2.toString());
		System.out.println("el alumno es: "+ alumno3.toString());
				
		alumno3.cambiarDeCurso();
		System.out.println("el alumno es: "+ alumno3.toString());
		
		alumno3.cambiarDeCurso();
		System.out.println("el alumno es: "+ alumno3.toString());
	}
}
