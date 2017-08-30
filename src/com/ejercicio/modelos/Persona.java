package com.ejercicio.modelos;

public class Persona {

	private String Nombre;
	private String Telefono;
	private String Correo;

	public Persona(String nombre, String telefono, String correo) {
		Nombre = nombre;
		Telefono = telefono;
		Correo = correo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	@Override
	public String toString() {
		return "Nombre: " + this.Nombre + "\nTelefono: " + this.Telefono + "\nCorreo: " + this.Correo;
	}

	
	
}
