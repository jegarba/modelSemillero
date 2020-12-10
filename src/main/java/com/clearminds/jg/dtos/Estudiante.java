package com.clearminds.jg.dtos;

public class Estudiante {
	private int Id;
	private String Nombre;
	private String Apellido;
	private int Cedula;

	public Estudiante(){
		
	}

	public Estudiante(String nombre, String apellido, int cedula) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		Cedula = cedula;
	}

	public Estudiante(int id, String nombre, String apellido, int cedula) {
		super();
		Id = id;
		Nombre = nombre;
		Apellido = apellido;
		Cedula = cedula;
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

	public int getCedula() {
		return Cedula;
	}

	public void setCedula(int cedula) {
		Cedula = cedula;
	}

	@Override
	public String toString() {
		return "Estudiante [Id=" + Id + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Cedula=" + Cedula + "]";
	}
	

}
