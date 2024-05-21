package Geografia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Departamento {

	private String nombre;
	public ArrayList<Municipio> municipios;

	public Departamento(String nombre, ArrayList<Municipio> municipios) {
		super();
		this.nombre = nombre;
		this.municipios = municipios;
		Collections.sort(this.municipios);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Municipio> getMunicipios() {
		return municipios;
	}

	public void setMunicipios(ArrayList<Municipio> municipios) {
		this.municipios = municipios;
	}

	/**
	 * Método para añadir un Municipio al ArrayList de municipios.
	 * 
	 * @param municipio
	 */
	public void agregarMunicipio(Municipio municipio) {
		this.municipios.add(municipio);
		Collections.sort(this.municipios);
	}

	/**
	 * Método que busca un Municipio por su nombre en municipios.
	 * 
	 * @param nombre
	 */
	public Municipio buscarMunicipio(String nombre) {
		Municipio mun = null;
		for (Municipio m : municipios) {
			if (m.getNombre().equals(nombre)) {
				mun = m;
				System.out.println(m.toString());
			}
		}
		return mun;
	}

	/**
	 * Método para eliminar un Municipio del ArrayList de municipios.
	 * 
	 * @param nombre
	 */
	public void eliminarMunicipio(String nombre) {
		municipios.remove(buscarMunicipio(nombre));
	}

	public void ordenarDepartamento() {
		Collections.sort(municipios);
	}

	/**
	 * Método que busca un Municipio con mayor población por su población en
	 * municipios.
	 * 
	 * @param poblacion
	 */
	public void buscarMunicipioConPoblacionMayor(int poblacion) {
		for (Municipio m : municipios) {
			if (m.getPoblacion() >= poblacion) {
				System.out.println(m.toString());
			}
		}
	}

	/**
	 * Método para calcular el censo de un Municipio concreto en un Departamento.
	 * 
	 * @return
	 */
	public int calcularCensoPoblacionDepartamento() {
		int censo = 0;
		for (Municipio m : municipios) {
			censo += m.getPoblacion();
		}
		return censo;
	}

	// Este método no lo tiene Pepe
	@Override
	public String toString() {
		return "Departamento [getNombre()=" + getNombre() + ", getMunicipios()=" + getMunicipios()
				+ ", calcularCensoPoblacionDepartamento()=" + calcularCensoPoblacionDepartamento() + "]";
	}

	public void listarMunicipios() {
		System.out.println("\nMunicipios del Departamento de " + this.getNombre());
		System.out.println("-------------------------------------");
		for (int i = 0; i < municipios.size(); i++) {
			System.out.println(municipios.get(i));
		}
	}

} // clase
