package com.lab.interfaces;

/**
 * Implementa sucesiones de la forma (n*multiplicador) + incremento
 * @author cristian.tirimacco
 *
 */
public class SucesionAritmetica implements Serie {
	
	private int n;
	private int multiplicador;
	private int incremento;
	
	public SucesionAritmetica(int multiplicador, int incremento) {
		super();
		this.multiplicador = multiplicador;
		this.incremento = incremento;
	}

	@Override
	public int getSiguiente() {
		int siguiente = (this.multiplicador * this.n) + this.incremento;
		this.n += 1;
		return siguiente;
	}

	@Override
	public void reiniciar() {
		this.n = 0;
	}

	@Override
	public void setComenzar(int x) {
		this.n = x;
	}
	
}
