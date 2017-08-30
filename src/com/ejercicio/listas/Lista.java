package com.ejercicio.listas;

public class Lista {

	Nodo primero;
	Nodo ultimo;

	public Lista() {
		primero = null;
		ultimo = null;
	}

	/**
	 * compruebo si la lista esta vacia
	 * 
	 * @return
	 */
	private boolean esVacio() {
		if (primero == null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Inserto un nodo en la lista
	 * 
	 * @param dato
	 * @return
	 */
	public Lista insertar(Object dato) {

		if (esVacio()) {
			Nodo nuevo_nodo = new Nodo(dato);
			primero = nuevo_nodo;
			ultimo = nuevo_nodo;
		} else {
			Nodo nuevo_nodo = new Nodo(dato);
			ultimo.siguiente = nuevo_nodo;
			nuevo_nodo.anterior = ultimo;
			ultimo = nuevo_nodo;
		}
		return this;
	}

	/**
	 * Borro un nodo de la lista
	 * 
	 * @param valor
	 * @return
	 */
	public boolean borrar(Object valor) {

		Nodo anterior = null;
		Nodo actual = primero;

		while (actual != ultimo) {
			if (actual.dato == valor) {
				if (anterior == null) {
					primero = actual.siguiente;
					primero.anterior = null;
				} else {
					anterior.siguiente = actual.siguiente;
					Nodo temporal;
					temporal = actual.siguiente;
					temporal.anterior = anterior;
				}
				return true;
			}

			anterior = actual;
			actual = actual.siguiente;
		}
		if (valor == ultimo.dato) {
			ultimo = actual.anterior;
			return true;
		}
		return false;
	}

	/**
	 * Obtengo un nodo de la lista por la posicion
	 * 
	 * @param posicion
	 * @return
	 */
	public Object obtener(int posicion) {
		Nodo actual = null;
		return actual;
	}

	/**
	 * Muestro en pantalla los datos almacenados en la lista
	 */
	public void mostrar() {
		int contador = 1;
		Nodo actual = ultimo;
		while (actual != primero) {
			System.out.println("Posicion: " + contador);
			System.out.println(actual.dato.toString());
			System.out.println("=================================");
			actual = actual.anterior;
			contador++;
		}
		System.out.println("Posicion: " + contador);
		System.out.println(actual.dato.toString());
	}

}