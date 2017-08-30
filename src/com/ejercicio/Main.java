package com.ejercicio;

public class Main {

	public static void main(String[] args) {

		Lista lista = new Lista();

		System.out.print("Lista: \n");
		lista.insertar(20);
		lista.insertar(30);
		lista.insertar(40);
		lista.insertar(50);
		lista.insertar(60);
		lista.insertar(70);
		lista.insertar(80);
		lista.insertar(90);
		lista.mostrar_lista();

		System.out.println("-----------------------------------------");

		System.out.print("Lista sin el nodo 30, 50, 70, 90: \n");
		lista.delete(30);
		lista.delete(50);
		lista.delete(70);
		lista.delete(90);
		lista.mostrar_lista();

	}
}