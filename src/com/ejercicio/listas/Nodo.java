package com.ejercicio.listas;

public class Nodo {
	Object dato;
	Nodo siguiente;
	Nodo anterior;

	Nodo(Object valor) {

		this.dato = valor;
		this.siguiente = null;
		this.anterior = null;
	}
}
