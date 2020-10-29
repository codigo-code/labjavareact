package com.lab.interfaces;

public class TestSeries {

	public static void main(String[] args) {
		// Creo una sucesion 2n+1
		SucesionAritmetica suc = new SucesionAritmetica(2, 1);
		suc.setComenzar(1);
		for (int i = 0; i < 10 ; i++) {
			System.out.println(suc.getSiguiente());
		}
		
		SucesionTriangular suc2 = new SucesionTriangular();
		suc2.setComenzar(1);
		for (int i = 0; i < 10 ; i++) {
			System.out.println(suc2.getSiguiente());
		}
	}

}
