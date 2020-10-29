package com.lab.empleados;

public class Empleado implements Comparable<Empleado> {
	private int id;
	private String nombre;
	private double sueldo;
	
	public Empleado(int id, String nombre, double sueldo) {
		this.id = id;
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public int compareTo(Empleado o) {
		return Integer.compare(this.getId(), o.getId());
	}
	
}
