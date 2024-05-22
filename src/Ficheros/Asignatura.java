package Ficheros;

import java.io.Serializable;

public class Asignatura implements Serializable {

	int codigo;
	String nombre;
	int creditos;

	public Asignatura(int codigo, String nombre, int creditos) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.creditos = creditos;
	}

	void imprimir() {
		System.out.println("Codigo de la asignatura = " + codigo);
		System.out.println("Nombre de la asignatura = " + nombre);
		System.out.println("Cantidad de creditos = " + creditos);
	}
	
	void guardar() {
		
	}
	
	void leer() {
		
	}

} // clase
