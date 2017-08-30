package com.ejercicio.modelos;

public class Negocio {

	private String Titulo;
	private String Descripcion;
	private String NombreOrganizacion;
	private String NombrePersona;
	private Double Valor;
	private String FechaEstimada;
	private String Estado;

	public Negocio(String titulo, String descripcion, String nombreOrganizacion, String nombrePersona,
			String fechaEstimada, String estado) {
		super();
		Titulo = titulo;
		Descripcion = descripcion;
		NombreOrganizacion = nombreOrganizacion;
		NombrePersona = nombrePersona;
		FechaEstimada = fechaEstimada;
		Estado = estado;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getNombreOrganizacion() {
		return NombreOrganizacion;
	}

	public void setNombreOrganizacion(String nombreOrganizacion) {
		NombreOrganizacion = nombreOrganizacion;
	}

	public String getNombrePersona() {
		return NombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		NombrePersona = nombrePersona;
	}

	public Double getValor() {
		return Valor;
	}

	public void setValor(Double valor) {
		Valor = valor;
	}

	public String getFechaEstimada() {
		return FechaEstimada;
	}

	public void setFechaEstimada(String fechaEstimada) {
		FechaEstimada = fechaEstimada;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

}
