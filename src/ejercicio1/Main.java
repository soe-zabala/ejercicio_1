package ejercicio1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int cantidad1, cantidad2;
		String producto1, producto2, razonSocial, domicilio;
		double precioSinIva1, precioSinIva2;

		Date fecha = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.format(fecha);
		String printFecha = sdf.format(fecha);

		Scanner ingresoPorTeclado = new Scanner(System.in);
		System.out.println("Ingrese Razon Social");
		razonSocial = ingresoPorTeclado.nextLine();

		System.out.println("Ingrese Domicilio");
		domicilio = ingresoPorTeclado.nextLine();

		System.out.println("Ingrese producto");
		producto1 = ingresoPorTeclado.nextLine();

		System.out.println("Ingrese cantidad");
		cantidad1 = ingresoPorTeclado.nextInt();

		System.out.println("precio");
		precioSinIva1 = ingresoPorTeclado.nextDouble();
		ingresoPorTeclado.nextLine();

		System.out.println("Ingrese producto");
		producto2 = ingresoPorTeclado.nextLine();

		System.out.println("Ingrese cantidad");
		cantidad2 = ingresoPorTeclado.nextInt();

		System.out.println("precio");
		precioSinIva2 = ingresoPorTeclado.nextDouble();

		System.out.println("*************************************************************************************");
		System.out.println("Fecha: " + printFecha);
		System.out.println("*************************************************************************************");
		System.out.println("Nombre: " + razonSocial);
		System.out.println("Domicilio: " + domicilio);
		System.out.println("*************************************************************************************");
		System.out.println("Cant. | Descripcion | P. unit | P. total");
		System.out.println(
				"----------------------------------------------------------------------------------------------------");
		System.out.println(
				cantidad1 + "    | " + producto1 + "       | " + precioSinIva1 + "     | " + precioSinIva1 * 1.21);
		System.out.println(
				"----------------------------------------------------------------------------------------------------");
		System.out.println(
				cantidad2 + "    | " + producto2 + "       | " + precioSinIva2 + "     | " + precioSinIva2 * 1.21);
		System.out.println(
				"----------------------------------------------------------------------------------------------------");
		System.out.println("IVA: $" + ((precioSinIva1 + precioSinIva2) * 0.21));
		System.out.println("Subtotal (sin IVA): $" + (precioSinIva1 + precioSinIva2));
		System.out.println("Total: $" + ((precioSinIva1 * 1.21) + (precioSinIva2 * 1.21)));
		System.out.println("**************************************************************************************");

	}

}
