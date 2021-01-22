/**
 * 
 */
package org.cajero;
/**
 * @author juanjoRamos
 *
 */
public class Cuenta {

	private String nombreTitular = null;
	private int numeroSecreto = Integer.MIN_VALUE;
	private float salario;
	
	/**
	 * Cuenta
	 * @param nombre
	 * @param salario
	 * {@summary Constructor que nos ayuda a crear una cuenta }
	 */
	public Cuenta(String nombre, Float salario) {
		this.nombreTitular = nombre;
		this.numeroSecreto = crearNumeroSecreto();
		this.salario = salario;
	}
	/**
	 * Cuenta
	 * @param nombre
	 * {@summary Constructor que nos ayuda a crear una cuenta }
	 */
	public Cuenta(String nombre) {
		this.nombreTitular = nombre;
		this.numeroSecreto =crearNumeroSecreto();
		this.salario = 0.0f;
	}
	
	/**
	 * Cuenta
	 * {@summary Constructor que nos ayuda a crear una cuenta }
	 */
	public Cuenta() {}
	
	/**
	 * ingresar
	 * {@summary suma lo que tiene la cuenta mas lo que ingresamos. }
	 * @param dinero
	 * @return float
	 */
	public float ingresar(float dinero) {
		return this.salario += dinero;
	}
	
	/**
	 * retirar
	 * {@summary resta lo que tiene la cuenta mas lo que ingresamos. }
	 * @param dinero
	 * @return float
	 */
	public float retirar(float dinero) {
		return this.salario -= dinero;
	}
	/**
	 * crearNumeroSecreto
	 * {@summary Creará un número secreto con el que podremos acceder a la cuenta }
	 * @return int
	 */
	private int crearNumeroSecreto() {
		return (int) Math.floor((Math.random() * 9999 + 1000) - 1000);
	}

	/**
	 * @return the nombreTitular
	 */
	public String getNombreTitular() {
		return nombreTitular;
	}

	/**
	 * @param nombreTitular the nombreTitular to set
	 */
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	/**
	 * @return the numeroSecreto
	 */
	public int getNumeroSecreto() {
		return numeroSecreto;
	}

	/**
	 * @param numeroSecreto the numeroSecreto to set
	 */
	public void setNumeroSecreto(int numeroSecreto) {
		this.numeroSecreto = numeroSecreto;
	}

	/**
	 * @return the salario
	 */
	public float getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Cuenta [nombreTitular=" + nombreTitular + ", numeroSecreto=" + numeroSecreto + ", salario=" + salario
				+ "]";
	}
	
	
}
