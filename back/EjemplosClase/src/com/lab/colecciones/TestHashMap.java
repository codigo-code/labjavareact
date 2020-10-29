package com.lab.colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestHashMap {

	public static void main(String[] args) {
		TestHashMap test = new TestHashMap();
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		Map<Integer, List<String>> map2 = new HashMap<Integer, List<String>>();
		
		map1.put(1, "Hola");
		map1.put(2, "como");
		map1.put(3, "les");
		map1.put(4, "va");
		map1.put(5, "hoy");
		
		System.out.println("Hash Map Original: " + map1);
		
		test.agregarElemento(1, "chau", map1);
		test.agregarElemento(10, "mundo", map1);
		System.out.println(map1);
		
		// Agregamos elementos al hashmap 2 cuyos valores se agregan a una lista
		test.agregarElementoLista(1, "Hola", map2);
		System.out.println(map2);
		test.agregarElementoLista(2, "Buenos", map2);
		System.out.println(map2);
		test.agregarElementoLista(1, "Mundo", map2);
		System.out.println(map2);
		test.agregarElementoLista(5, "Java", map2);
		System.out.println(map2);
		test.agregarElementoLista(2, "Dias", map2);
		System.out.println(map2);
		
	}
	
	private void agregarElemento(int clave, String valor, Map<Integer, String> map) {
		if (map.containsKey(clave)) {
			System.out.println("La clave que intenta ingresar ya existe...");
		} else {
			map.put(clave, valor);
		}
	}
	
	private void agregarElementoLista(int clave, String valor, Map<Integer, List<String>> map) {
		List<String> lista = new ArrayList<String>();
		if (map.containsKey(clave)) {
			System.out.println("La clave ya existe, se agrega el elemento a la lista");
			lista = map.get(clave);
			lista.add(valor);
		} else {
			lista.add(valor);
		}
		map.put(clave, lista);
	}
}
