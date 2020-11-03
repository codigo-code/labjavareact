package com.lab.objetos;

import java.io.Serializable;

public class Persona implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7409596903667586359L;
	
	private String nombre;
	private String direccion;
	private int edad;
	private int dni;
	
	public Persona(String nombre, String direccion, int edad, int dni) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getEdad() {
		return edad;
	}

	public int getDni() {
		return dni;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", direccion=" 
				+ direccion + ", edad=" + edad + ", dni=" + dni + "]";
	}
	
}
