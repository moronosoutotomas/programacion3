package repaso;

import java.util.Scanner;

public class testCuenta {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// primero creamos una de ahorro
		System.out.println("dime saldo: ");
		float saldo = sc.nextFloat();
		System.out.println("dime tasa anual: ");
		float tasa = sc.nextFloat();
		CuentaAhorros save = new CuentaAhorros(saldo, tasa);
		System.out.println(save);

		// movimientos en la cuenta
		System.out.println("consigna ");
		float con = sc.nextFloat();
		save.consignar(con);

		System.out.println(save);

		System.out.println("retira ");
		float ret = sc.nextFloat();
		save.retirar(ret);

		System.out.println(save);

		save.extractoMensual();
		System.out.println("despues de extracto mensual ");
		System.out.println(save);

		// segundo creamos una corriente
		System.out.println("dime saldo: ");
		float saldo2 = sc.nextFloat();
		System.out.println("dime tasa anual: ");
		float tasa2 = sc.nextFloat();
		CuentaCorriente save2 = new CuentaCorriente(saldo2, tasa2);
		System.out.println(save);

		// movimientos en la cuenta
		System.out.println("consigna ");
		float con2 = sc.nextFloat();
		save2.consignar(con2);

		System.out.println(save2);

		System.out.println("retira ");
		float ret2 = sc.nextFloat();
		save2.retirar(ret2);

		System.out.println(save2);

		save2.extractoMensual();
		System.out.println("despues de extracto mensual ");
		System.out.println(save2);

		sc.close();
	} // main
} // clase
