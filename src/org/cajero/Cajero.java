/**
 * 
 */
package org.cajero;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author juanjoRamos
 *
 */
public class Cajero {

	/**
	 * @param args
	 * @throws InterruptedException
	 */

	public static void main(String[] args) throws InterruptedException {

		/*
		 * Crearemos un array de Cuentas, los números secretos son aleatorios. Por tanto
		 * los veremos antes de acceder
		 */
		Scanner sc = new Scanner(System.in);
		int numeroIntroducido = -1;
		float dinero = -1;
		String nombre = null;
		Cuenta persona = null;

		ArrayList<Cuenta> listaCuenta = new ArrayList<Cuenta>();
		listaCuenta.add(new Cuenta("juanjoRamos", 0f));
		System.out.println(listaCuenta.toString());
		System.out.print("Introduzca su nombre: ");
		nombre = sc.nextLine();
		System.out.print("Introduzca su número secreto: ");
		numeroIntroducido = sc.nextInt();

		for (int i = 0; i < listaCuenta.size(); i++) {
			if (listaCuenta.get(i).getNombreTitular().equals(nombre)
					&& (listaCuenta.get(i).getNumeroSecreto() == numeroIntroducido)) {
				numeroIntroducido = -1;
				persona = new Cuenta(listaCuenta.get(i).getNombreTitular(), listaCuenta.get(i).getSalario());
			}
		}

		if (persona != null) {
			do {
				System.out.println(
						"---------- Operaciones ---------- \n0. Cerrar consulta. \n1. Consultar saldo. \n2. Ingresar dinero. \n3. Retirar dinero. \n---------------------------------\nIntroduzca el valor: ");
				try {
					numeroIntroducido = sc.nextInt();
					switch (numeroIntroducido) {
					case 0:
						break;
					case 1:
						System.out.println("Tienes un total de " + persona.getSalario() + "€");
						Thread.sleep(2 * 500);
						break;
					case 2:
						System.out.print("Cantidad a ingresar: ");
						dinero = sc.nextFloat();
						System.out.println(
								"Dinero en la cuenta: " + persona.getSalario() + " €. Ingresados: " + dinero + "€");
						persona.ingresar(dinero);
						Thread.sleep(2 * 500);
						break;
					case 3:
						System.out.print("Cantidad a retirar: ");
						dinero = sc.nextFloat();
						System.out.println(
								"Dinero en la cuenta: " + persona.getSalario() + " €. Retirados: " + dinero + "€");
						persona.retirar(dinero);
						Thread.sleep(2 * 500);
						break;
					default:
						System.out.println("Debe introducir un valor entre el 0 al 3.");
						Thread.sleep(2 * 500);
						break;
					}
				} catch (InputMismatchException e) {
					System.out.println("El valor introducido no es correcto.");
					Thread.sleep(2 * 500);
					/*
					 * Cuando el usuario introduzca un valor no entero mandara el mensaje y el
					 * escaner no lo "tomara en cuenta" comenzará de nuevo.
					 */
					sc.nextLine();
				}
			} while (numeroIntroducido != 0);
			sc.close();
			System.out.println("Gracias por usar mi cajero.");
		} else {
			System.out.println("Alguno de los datos introducidos no es correcto. Intentelo mas tarde.");
		}
		
		
	}

}
