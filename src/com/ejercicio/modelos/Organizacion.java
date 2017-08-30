package com.ejercicio.modelos;

public class Organizacion {
	Integer Id;
	String Razon;
	String Direccion;
	String Ruc;

	public Organizacion(String razon, String direccion, String ruc) {
		super();
		Razon = razon;
		Direccion = direccion;
		Ruc = ruc;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getRazon() {
		return Razon;
	}

	public void setRazon(String razon) {
		Razon = razon;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getRuc() {
		return Ruc;
	}

	public void setRuc(String ruc) {
		Ruc = ruc;
	}

}
