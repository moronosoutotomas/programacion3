package Human;

public class testCuerpo {

	public static void main(String[] args) {

		Cuerpo miCuerpo = new Cuerpo();

//		Cabeza
		miCuerpo.cabeza.setNombre("cabeza de Tomás");
		miCuerpo.cabeza.setNum_ojos(2);
		miCuerpo.cabeza.setPeludo(true);
		miCuerpo.cabeza.setLongitudSombrero(0);

//		Tronco
		miCuerpo.tronco.setNombre("tronco de Tomás");
		miCuerpo.tronco.setAncho(40);
		miCuerpo.tronco.setLargo(180);
		miCuerpo.tronco.setOmbligo(true);

//		Brazo izquierdo
		miCuerpo.brazoIzq.setNombre("brazo izquierdo de Tomás");
		miCuerpo.brazoIzq.setLongitud(75);
		miCuerpo.brazoIzq.setNum_dedos(5);

//		Brazo derecho
		miCuerpo.brazoDer.setNombre("brazo derecho de Tomás");
		miCuerpo.brazoDer.setLongitud(75);
		miCuerpo.brazoDer.setNum_dedos(5);

//		Pierna izquierda
		miCuerpo.piernaIzq.setNombre("pierna izquierda de Tomás");
		miCuerpo.piernaIzq.setLongitud(90);
		miCuerpo.piernaIzq.setNum_dedos(5);

//		Pierna derecha
		miCuerpo.piernaDer.setNombre("pierna derecha de Tomás");
		miCuerpo.piernaDer.setLongitud(90);
		miCuerpo.piernaDer.setNum_dedos(5);

//		Mostramos el cuerpo
		System.out.println(miCuerpo.toString());

	} // main
} // clase
