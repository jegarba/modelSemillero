package com.clearminds.jg.dtos;

public class Estudiante {
	private String Nombre;
	private String Apellido;
	private int Id;

	public Estudiante(String nombre, String apellido, int id) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		Id = id;
	}

	public Estudiante(String nombre, String apellido) {
		super();
		Nombre = nombre;
		Apellido = apellido;
	}

	@Override
	public String toString() {
		return "Estudiante [Nombre=" + Nombre + ", Apellido=" + Apellido + ", Id=" + Id + "]";
	}

}
