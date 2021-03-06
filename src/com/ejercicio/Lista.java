package com.ejercicio;

public class Lista {
	Nodo primero;
	Nodo ultimo;

	Lista() {
		primero = null;
		ultimo = null;
	}

	public boolean listavacia() {
		if (primero == null) {
			return true;
		} else {
			return false;
		}
	}

	public Lista insertar(int dato) {

		if (listavacia()) {
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

	public boolean delete(int valor) {

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

	public void mostrar_lista() {
		Nodo actual;
		actual = ultimo;
		while (actual != primero) {
			System.out.println(actual.dato);
			actual = actual.anterior;
		}
		System.out.println(actual.dato);

	}

}