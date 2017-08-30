package com.ejercicio.modelos;

public class Persona {
	Integer Id;
	String Nombre;
	String Apellidos;
	String Documento;
	
	

	public Persona(String nombre, String apellidos, String documento) {
		Nombre = nombre;
		Apellidos = apellidos;
		Documento = documento;
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

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getDocumento() {
		return Documento;
	}

	public void setDocumento(String documento) {
		Documento = documento;
	}
}
