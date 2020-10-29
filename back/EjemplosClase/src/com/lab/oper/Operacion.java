package com.lab.oper;

public class Operacion {
	private int oper1;
	private int oper2;
	private TipoOperacion tipo;
	
	public int getOper1() {
		return oper1;
	}
	
	public void setOper1(int oper1) {
		this.oper1 = oper1;
	}
	
	public int getOper2() {
		return oper2;
	}
	
	public void setOper2(int oper2) {
		this.oper2 = oper2;
	}
	
	public TipoOperacion getTipo() {
		return tipo;
	}
	
	public void setTipo(TipoOperacion tipo) {
		this.tipo = tipo;
	}
	
	public int operar() throws Exception {
		int resultado = 0;
		switch(this.getTipo()) {
			case SUMA:
				resultado = sumar(this.getOper1(), this.getOper2());
				break;
			case RESTA:
				resultado = restar(this.getOper1(), this.getOper2());
				break;
			case MULTIPLICACION:
				resultado = multiplicar(this.getOper1(), this.getOper2());
				break;
			case DIVISION:
				resultado = dividir(this.getOper1(), this.getOper2());
				break;
		}
		return resultado;
	}
	
	private int sumar(int a, int b) {
		System.out.println("Ejecucion de la suma: ");
		return a + b;
	}
	
	private int restar(int a, int b) {
		System.out.println("Ejecucion de la resta: ");
		return a - b;
	}
	
	private int multiplicar(int a, int b) {
		System.out.println("Ejecucion de la multiplicacion: ");
		return a * b;
	}
	
	private int dividir(int a, int b) throws Exception {
		System.out.println("Ejecucion de la division: ");
		return a / b;
	}
}
