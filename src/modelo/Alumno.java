package modelo;

import java.time.LocalDate;

public class Alumno {
	//------------------------atributos----------------------------------
	private String nombre;
	private String apellidos;
	private char sexo;//---male = M -----female = F
	private LocalDate fechaNacimiento;
	private boolean repetidor;
	private String nombreCurso;// DAW----DAM------ASIR---
	private int nivelCurso;
	
	//---------------------constructores---------------------------------
	 public Alumno(){
		nombre = "anonimo";
		apellidos = "cualquiera";
		sexo = 'F';
		fechaNacimiento = LocalDate.now();
		repetidor = false;
		nombreCurso = "DAW";
		nivelCurso = 1;
	}
	
	public Alumno(String nombre, String apellidos, char sexo, LocalDate fechaNacimiento, boolean repetidor,
			String nombreCurso, int nivelCurso) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.repetidor = repetidor;
		this.nombreCurso = nombreCurso;
		this.nivelCurso = nivelCurso;
	}
	//-----------------------------------metodos--------------------------------------------------
	
		public void cambiarDeCurso() {
		
			if (nivelCurso<2) { 
				nivelCurso++;
			}else {
				System.out.println("no puedes pasar de curso");
			}
		}
	
	//-----------------------------------getters y setters----------------------------------------
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public boolean isRepetidor() {
		return repetidor;
	}

	public void setRepetidor(boolean repetidor) {
		this.repetidor = repetidor;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public int getNivelCurso() {
		return nivelCurso;
	}

	public void setNivelCurso(int nivelCurso) {
		this.nivelCurso = nivelCurso;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", sexo=" + sexo + ", fechaNacimiento="
				+ fechaNacimiento + ", repetidor=" + repetidor + ", nombreCurso=" + nombreCurso + ", nivelCurso="
				+ nivelCurso + "]";
	}
	
	
	
	

}
