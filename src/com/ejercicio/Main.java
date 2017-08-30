package com.ejercicio;

import java.security.Permissions;
import java.util.Scanner;

import com.ejercicio.interfaces.INegocio;
import com.ejercicio.listas.Lista;
import com.ejercicio.negocio.PersonaNegocio;

public class Main {

	private static String MostrarMenuPrincipal() {
		System.out.println("--------------------------");
		System.out.println("[P] Gestor de Personas");
		System.out.println("[O] Gestor de Organizacion");
		System.out.println("[N] Gestor de Negocio");
		System.out.println("[A] Gestor de Actividades");
		System.out.println("[E] Salir de la aplicacion");

		System.out.print("Ingrese la opcion: ");
		Scanner sc = new Scanner(System.in);
		return sc.nextLine().toUpperCase();
	}

	public static void main(String[] args) {

		String opcion = "";

		while (!"E".equals(opcion)) {
			
			opcion = MostrarMenuPrincipal();
			
			if (!"E".equals(opcion.toLowerCase())) {
				INegocio negocio = null;
				switch (opcion) {
				case "P":
					negocio = new PersonaNegocio();
					break;
				case "A":
					break;
				case "O":
					break;
				case "N":
					break;
				default:
					continue;
					
				}
				
				negocio.Start();
				
			}
		}

		System.out.println("Gracias por usar nuestra aplicacion!");

		// Lista lista = new Lista();
		//
		// System.out.print("Lista: \n");
		// lista.insertar("20..");
		// lista.insertar(30);
		// lista.insertar(40);
		// lista.insertar(50);
		// lista.insertar(60);
		// lista.insertar(70);
		// lista.insertar(80);
		// lista.insertar(90);
		// lista.mostrar();
		//
		// System.out.println("-----------------------------------------");
		//
		// System.out.print("Lista sin el nodo 30, 50, 70, 90: \n");
		// lista.borrar(30);
		// lista.borrar(50);
		// lista.borrar(70);
		// lista.borrar(90);
		// lista.mostrar();

	}
}