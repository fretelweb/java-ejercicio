package com.ejercicio.negocio;

import com.ejercicio.interfaces.INegocio;
import com.ejercicio.listas.Lista;
import com.ejercicio.modelos.Persona;

public class PersonaNegocio implements INegocio {

	Lista personas = new Lista();

	public PersonaNegocio() {
		Persona p = new Persona("Ronny Fretel", "969373512", "ronny@fretelweb.com");
		personas.insertar(p);
	}

	@Override
	public void Registrar() {

	}

	@Override
	public void Mostrar() {
		System.out.println("[ Personas en la lista ]");
		personas.mostrar();

	}

	@Override
	public void Modificar() {

	}

	@Override
	public void Start() {
		System.out.println("Usted ingreso al modulo Personas");
	}

}
