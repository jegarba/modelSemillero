package com.clearminds.jg.dtos;

public class Estudiante {
	private int Id;
	private String Nombre;
	private String Apellido;
	private int Edad;

	public Estudiante() {

	}

	public Estudiante(String nombre, String apellido, int edad) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		Edad = edad;
	}

	public Estudiante(int id, String nombre, String apellido, int edad) {
		super();
		Id = id;
		Nombre = nombre;
		Apellido = apellido;
		Edad = edad;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	@Override
	public String toString() {
		return "Estudiante [Id=" + Id + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Edad=" + Edad + "]";
	}

}
