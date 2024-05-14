package Carro;

import java.util.ArrayList;

public class Carro {

	protected Motor motor;
	protected Chasis chasis;
	protected Llanta llantaDelIzd;
	protected Llanta llantaDelDer;
	protected Llanta llantaTrasIzd;
	protected Llanta llantaTrasDer;
	protected ArrayList<Llanta> llantas;
	protected Carroceria carroceria;

	public Carro(int volumen, Chasis.tipoChasis claseChasis, String color, Carroceria.tipoCarroceria claseCarroceria,
			String marca, int diametro, int altura, int anchura) {
		motor = new Motor(volumen);
		chasis = new Chasis(claseChasis);
		carroceria = new Carroceria(color, claseCarroceria);
		llantas = new ArrayList<Llanta>();

//		TODO revisar esto:
		llantaDelIzd = new Llanta(marca, diametro, altura, anchura);
		llantaDelDer = new Llanta(marca, diametro, altura, anchura);
		llantaTrasIzd = new Llanta(marca, diametro, altura, anchura);
		llantaTrasDer = new Llanta(marca, diametro, altura, anchura);
		llantas.add(llantaDelIzd);
		llantas.add(llantaDelDer);
		llantas.add(llantaTrasIzd);
		llantas.add(llantaTrasDer);
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Chasis getChasis() {
		return chasis;
	}

	public void setChasis(Chasis chasis) {
		this.chasis = chasis;
	}

	public ArrayList<Llanta> getLlantas() {
		return llantas;
	}

	public void setLlantas(ArrayList<Llanta> llantas) {
		this.llantas = llantas;
	}

	public Carroceria getCarroceria() {
		return carroceria;
	}

	public void setCarroceria(Carroceria carroceria) {
		this.carroceria = carroceria;
	}

	@Override
	public String toString() {
		return "Carro [motor=" + motor + ", chasis=" + chasis + ", llantas=" + llantas + ", carroceria=" + carroceria
				+ "]";
	}

} // clase
