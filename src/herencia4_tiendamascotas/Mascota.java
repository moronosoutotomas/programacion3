package herencia4_tiendamascotas;

public class Mascota {

//	chips todos:
//		gato 75 -
//		perro 100 -
//	vacunas perros:
//		perro grande 150 - 2
//		perro mediano 125 - 1
//		perro pequeño 100 - 3
//	desparasitacion gatos:
//		pelolargo 200 - 2
//		pelocorto 100 - 3
//		pelado 50 - 1

	protected int calculaImpuestos() {
		return impuesto;
	}

	protected int impuesto = 50;
	protected String nombre;
	protected int edad;

	public enum colores {
		NEGRO, BLANCO, ACERO, NARANJA, ATIGRADO, BEIGE, TRICOLOR, TUNNING
	}

	protected colores color;

	public Mascota(String nombre, int edad, colores color) {
		this.nombre = nombre;
		this.edad = edad;
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public colores getColor() {
		return color;
	}

	public void setColor(colores color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", edad=" + edad + ", color=" + color + "]";
	}

} // clase
