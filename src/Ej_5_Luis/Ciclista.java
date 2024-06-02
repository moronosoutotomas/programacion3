package Ej_5_Luis;

public abstract class Ciclista implements Comparable<Ciclista>{
	

	private int identificador; /* Atributo que define el identificador de un ciclista */
	private String nombre; // Atributo que define el nombre del ciclista
	private double tiempoAcumulado = 0; /* Atributo que define el tiempo acumulado de un ciclista */
	
	private int posicionGeneral;

	public Ciclista(int identificador, String nombre) {
		this.identificador = identificador;
		this.nombre = nombre;
	}

	abstract String imprimirTipo();
	
	protected double calculaTiempoParcial(){
		this.tiempoAcumulado=((Math.random()*15)+5);	
		return this.tiempoAcumulado;
	}
	
	
	
	public void reseteaTiempoAcumulado(){
		setTiempoAcumulado(0);
	}

	protected int getIdentificador() {
		return identificador;
	}

	protected void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método que devuelve el puesto que ocupa un ciclista en la posición general de
	 * la competencia
	 * 
	 * @return El puesto del ciclista en la posición general
	 */

	protected int getPosicionGeneral() {
		return this.posicionGeneral;
	}

	/**
	 * Método que establece el puesto que ocupa un ciclista en la posición general
	 * 
	 * @param Parámetro que especifica el puesto que ocupa un ciclista en la
	 *                  posición general
	 */
	protected void setPosicionGeneral(int posicionGeneral) {
		this.posicionGeneral = posicionGeneral;
	}

	/**
	 * Método que devuelve el tiempo acumulado de un ciclista en una competencia
	 * 
	 * @return El tiempo acumulado de un ciclista en una competencia
	 */
	protected double getTiempoAcumulado() {
		return tiempoAcumulado;
	}

	/**
	 * Método que establece el tiempo acumulado por un ciclista
	 * 
	 * @param Parámetro que especifica el tiempo acumulado por un ciclista
	 */
	protected void setTiempoAcumulado(double tiempoAcumulado) {
		this.tiempoAcumulado = tiempoAcumulado;
	}
	
	

	
	/**
	 * Método muestra en pantalla los datos de un ciclista
	 */
	protected void imprimir() {
		System.out.println("Identificador = " + identificador);
		System.out.println("Nombre = " + nombre);

		System.out.println("Tiempo Acumulado = " + tiempoAcumulado);
		System.out.println("Posicion General="+posicionGeneral);
	}
	
	

	@Override
	public int compareTo(Ciclista o) {
		// TODO Auto-generated method stub
		
		double dif=this.tiempoAcumulado-o.tiempoAcumulado;
		int res;
		if(dif>0) {
			res=1;
			
		}else if(dif==0) {
			res=0;
		}else {
			res=-1;
		}
		return res;
	}
	
	/*
	
	public int generalCompareTo(Ciclista o) {
		
		double dif=this.tiempoAcumulado-o.tiempoAcumulado;
		int res;
		if(dif>0) {
			res=1;
			
		}else if(dif==0) {
			res=0;
		}else {
			res=-1;
		}
		return res;
		
	}*/

	@Override
	public String toString() {
		return "Ciclista \n[identificador=" + identificador + ", nombre=" + nombre + ", tiempoAcumulado="
				+ tiempoAcumulado + "\n, posicionGeneral=" + posicionGeneral + "]";
	}

	
	
	


}
