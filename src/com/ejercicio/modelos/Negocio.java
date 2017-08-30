package com.ejercicio.modelos;

public class Negocio {

	Integer Id;
	String Nombre;

	public Negocio(String nombre) {
		super();
		Nombre = nombre;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

}
