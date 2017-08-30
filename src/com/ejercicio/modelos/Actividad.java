package com.ejercicio.modelos;

public class Actividad {

	private String Descripcion;
	private String Tipo;
	private String Hora;
	private String Duracion;
	private String NombrePersona;
	private String NombreOrganizacion;
	private String NombreNegocio;

	public Actividad(String descripcion, String tipo, String hora, String duracion, String nombrePersona,
			String nombreOrganizacion, String nombreNegocio) {
		super();
		Descripcion = descripcion;
		Tipo = tipo;
		Hora = hora;
		Duracion = duracion;
		NombrePersona = nombrePersona;
		NombreOrganizacion = nombreOrganizacion;
		NombreNegocio = nombreNegocio;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getHora() {
		return Hora;
	}

	public void setHora(String hora) {
		Hora = hora;
	}

	public String getDuracion() {
		return Duracion;
	}

	public void setDuracion(String duracion) {
		Duracion = duracion;
	}

	public String getNombrePersona() {
		return NombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		NombrePersona = nombrePersona;
	}

	public String getNombreOrganizacion() {
		return NombreOrganizacion;
	}

	public void setNombreOrganizacion(String nombreOrganizacion) {
		NombreOrganizacion = nombreOrganizacion;
	}

	public String getNombreNegocio() {
		return NombreNegocio;
	}

	public void setNombreNegocio(String nombreNegocio) {
		NombreNegocio = nombreNegocio;
	}

}
