package com.lab.oper;

public enum TipoOperacion {
	SUMA("Suma"),
	RESTA("Resta"),
	MULTIPLICACION("Multiplicacion"),
	DIVISION("Division");
	
	private String descripcion;

	private TipoOperacion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

}
