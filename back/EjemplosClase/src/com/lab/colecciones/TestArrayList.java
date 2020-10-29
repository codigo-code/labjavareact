package com.lab.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestArrayList {

	public static void main(String[] args) {
		TestArrayList test = new TestArrayList();
		
		int tamanio = test.generaNumeroAleatorio(50);
		List<Integer> lista = new ArrayList<Integer>();
		Set<Integer> conjunto = new TreeSet<Integer>();
		
		// Completo la lista de acuerdo al tamaño definido
		for (int i = 0; i < tamanio ; i++) {
			Integer valor = test.generaNumeroAleatorio(100);
			lista.add(valor);
			conjunto.add(valor);
		}
		
		System.out.println("Se genero una lista de tamaño " + lista.size());
		System.out.println("Lista: " + lista.toString());
		System.out.println("Se genero un conjunto de tamaño " + conjunto.size());
		System.out.println("Conjunto: " + conjunto.toString());
		
		for (int i = 0; i < lista.size(); i++) {
			Integer nuevoValor = lista.get(i) * 2;
			lista.set(i, nuevoValor);
		}
		
		System.out.println("Lista Modificada (cada elemento * 2): " + lista.toString());
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) > 50) {
				lista.remove(i);
				i--;
			}
		}
		
		System.out.println("Lista Modificada (elimina elementos > 50): " + lista.toString());
		
		Collections.max(lista);
		Collections.sort(lista);
		Collections.fill(lista, Integer.valueOf("1"));
		
	}
	
	public Integer generaNumeroAleatorio(int max) {
		return (int) (Math.random()*max);
	}
	
}
 