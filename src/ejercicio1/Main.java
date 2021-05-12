package ejercicio1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int cantidad, cantidadTipoProductos;
		String razonSocial, domicilio, producto;
		double precioBruto;

		Date fecha = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.format(fecha);
		String printFecha = sdf.format(fecha);

		razonSocial = ingresoRazonSocial();
		domicilio = ingresoDomicilio();
		cantidadTipoProductos = ingresoCantidadTiposProductos();

		for (int i = 0; i < cantidadTipoProductos; i++) {

			producto = ingresoNombreProducto();
			cantidad = ingresoCantidadProducto();
			precioBruto = ingresoPrecioBruto();
			System.out.println("*************************************************************************************");
			System.out.println("Fecha: " + printFecha);
			System.out.println("*************************************************************************************");
			System.out.println("Nombre: " + razonSocial);
			System.out.println("Domicilio: " + domicilio);
			System.out.println("*************************************************************************************");
			System.out.println("Cant. \t| Descripcion \t| P. unit \t| P. total");
			System.out.println("*************************************************************************************");
			System.out.println(
					cantidad + "\t| " + producto + "\t\t| " + precioBruto + "\t\t| " + (precioBruto * cantidad));
			System.out.println("*************************************************************************************");
			System.out.println("IVA: $\t" + (precioBruto * cantidad) * 0.21);
			System.out.println("Subtotal (sin IVA): $" + (precioBruto * cantidad));
			System.out.println("Total: $" + (precioBruto * cantidad) * 1.21);
			System.out.println("*************************************************************************************");

		}

	}

	public static String ingresoRazonSocial() {
		Scanner ingresoPorTeclado = new Scanner(System.in);
		System.out.println("Ingrese Razon Social");
		String nombre = ingresoPorTeclado.nextLine();
		return nombre;
	}

	public static String ingresoDomicilio() {
		Scanner ingresoPorTeclado = new Scanner(System.in);
		System.out.println("Ingrese Domicilio");
		String domicilio = ingresoPorTeclado.nextLine();
		return domicilio;

	}

	public static int ingresoCantidadProducto() {
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ingrese cantidad Producto");
		int cantidad = ingreso.nextInt();
		return cantidad;

	}

	public static String ingresoNombreProducto() {
		Scanner ingresoPorTeclado = new Scanner(System.in);
		System.out.println("Ingrese el nombre del producto");
		String producto = ingresoPorTeclado.next();
		return producto;

	}

	public static double ingresoPrecioBruto() {
		Scanner ingresoPorTeclado = new Scanner(System.in);
		System.out.println("Ingrese Precio");
		double precioBruto = ingresoPorTeclado.nextDouble();
		return precioBruto;
	}

	public static int ingresoCantidadTiposProductos() {
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de variedad de productos");
		int cantidadTipos = ingreso.nextInt();
		return cantidadTipos;
	}
}