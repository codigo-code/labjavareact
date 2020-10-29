package com.lab.interfaces;

/**
 * Implementa una sucesion triangular x(n) = n(n+1)/2
 * @author cristian.tirimacco
 *
 */
public class SucesionTriangular implements Serie {
	
	private int n;

	@Override
	public int getSiguiente() {
		int siguiente = (n * (n+1)) / 2 ;
		n += 1;
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
