package com.ejercicio.modelos;

public class Organizacion {

	private String Nombre;
	private String Direccion;
	private String Telefono;

	public Organizacion(String nombre, String direccion, String telefono) {
		super();
		Nombre = nombre;
		Direccion = direccion;
		Telefono = telefono;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

}
