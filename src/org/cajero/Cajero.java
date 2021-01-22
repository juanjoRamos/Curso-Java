/**
 * 
 */
package org.cajero;

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
		Cuenta c1 = new Cuenta("juanjoRamos", 0f);

		do {
			System.out.println(
					"---------- Operaciones ---------- \n0. Cerrar consulta. \n1. Consultar saldo. \n2. Ingresar dinero. \n3. Retirar dinero. \n---------------------------------\nIntroduzca el valor: ");
			try {
				numeroIntroducido = sc.nextInt();
				switch (numeroIntroducido) {
				case 0:
					break;
				case 1:
					System.out.println("Tienes un total de " + c1.getSalario() + "€");
					Thread.sleep(2 * 1000);
					break;
				case 2:
					System.out.print("Cantidad a ingresar: ");
					dinero = sc.nextFloat();
					System.out.println("Dinero en la cuenta: " + c1.getSalario() + " €. Ingresados: " + dinero + "€");
					c1.ingresar(dinero);
					Thread.sleep(2 * 1000);
					break;
				case 3:
					System.out.print("Cantidad a retirar: ");
					dinero = sc.nextFloat();
					System.out.println("Dinero en la cuenta: " + c1.getSalario() + " €. Retirados: " + dinero + "€");
					c1.retirar(dinero);
					Thread.sleep(2 * 1000);
					break;
				default:
					System.out.println("Debe introducir un valor entre el 0 al 3.");
					Thread.sleep(2 * 1000);
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("El valor introducido no es correcto.");
				Thread.sleep(2 * 1000);
				/* Cuando el usuario introduzca un valor no entero mandara el mensaje y el
				 escaner no lo "tomara en cuenta" comenzará de nuevo.*/
				sc.nextLine();
			}
		} while (numeroIntroducido != 0);
		sc.close();
		System.out.println("Gracias.");

	}

}
