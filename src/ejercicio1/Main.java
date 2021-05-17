package ejercicio1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	static Scanner ingresoPorTeclado = new Scanner(System.in);

	public static void main(String[] args) {

		int cantidad, cantidadTipoProductos, i = 0;
		String razonSocial, domicilio, producto;
		double precioBruto, precioBrTotal = 0.0, ivaTotal = 0.0, precioSinIvaTotal = 0.0;
		Date fecha = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.format(fecha);
		String printFecha = sdf.format(fecha);

		razonSocial = ingresoDatosEmpresa("Ingrese Razon social ");
		domicilio = ingresoDatosEmpresa("Ingrese Domicilio");
		cantidadTipoProductos = ingresoCantidadProducto("Ingrese la cantidad de variedad de productos");

		System.out.println("*************************************************************************************");
		System.out.println("Fecha: " + printFecha);
		System.out.println("*************************************************************************************");
		System.out.println("Nombre: " + razonSocial); //
		System.out.println("Domicilio: " + domicilio);
		System.out.println("*************************************************************************************");

		while (i < cantidadTipoProductos) {
			producto = ingresoNombreProducto();
			cantidad = ingresoCantidadProducto("Ingrese cantidad");
			precioBruto = ingresoPrecioBruto();
			System.out.println("Cant. \t| Descripcion \t| P. unit \t| P. total");
			System.out.println("*************************************************************************************");
			System.out.println(
					cantidad + "\t| " + producto + "\t\t| " + precioBruto + "\t\t| " + (precioBruto * cantidad));
			System.out.println("*************************************************************************************");

			ivaTotal = ivaTotal + (precioBruto * cantidad * 0.21);
			precioSinIvaTotal = precioSinIvaTotal + (precioBruto * cantidad);
			precioBrTotal = precioBrTotal + (precioBruto * cantidad);
			i++;

		}

		System.out.println("IVA: $" + ivaTotal);
		System.out.println("Subtotal (sin IVA): $" + precioSinIvaTotal);
		System.out.println("Total: $" + precioBrTotal * 1.21);
	}

	public static String ingresoDatosEmpresa(String datos) {
		System.out.println(datos);
		String empresa = ingresoPorTeclado.nextLine();
		return empresa;
	}

	public static int ingresoCantidadProducto(String datos) {
		System.out.println(datos);
		int cantidad = ingresoPorTeclado.nextInt();
		return cantidad;

	}

	public static String ingresoNombreProducto() {
		System.out.println("Ingrese el nombre del producto");
		String producto = ingresoPorTeclado.next();
		return producto;

	}

	public static double ingresoPrecioBruto() {
		Scanner ingresoPorTeclado = new Scanner(System.in);
		System.out.println("Ingrese Precio del producto");
		double precioBruto = ingresoPorTeclado.nextDouble();
		return precioBruto;
	}

}