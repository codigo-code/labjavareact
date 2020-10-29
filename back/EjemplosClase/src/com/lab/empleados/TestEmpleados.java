package com.lab.empleados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TestEmpleados {
	
	public static void main(String[] args) {
		TestEmpleados test = new TestEmpleados();
		
		Empleado emp1 = new Empleado(1, "Juan", 2000);
		Empleado emp2 = new Empleado(12, "Maria", 5000);
		Empleado emp3 = new Empleado(3, "Luis", 6000);
		Empleado emp4 = new Empleado(5, "Hernan", 2000);
		Empleado emp5 = new Empleado(9, "Andrea", 5000);
		Empleado emp6 = new Empleado(5, "Alejandro", 6000);
		
		List<Empleado> listaEmp = new ArrayList<Empleado>();
		Set<Empleado> setEmp = new TreeSet<Empleado>();
		
		listaEmp.add(emp1);
		listaEmp.add(emp2);
		listaEmp.add(emp3);
		listaEmp.add(emp4);
		listaEmp.add(emp5);
		listaEmp.add(emp6);
		
		setEmp.add(emp1);
		setEmp.add(emp2);
		setEmp.add(emp3);
		setEmp.add(emp4);
		setEmp.add(emp5);
		setEmp.add(emp6);
		
		System.out.println(listaEmp);
		System.out.println(setEmp);
		
		Collections.sort(listaEmp, new OrdenarEmpleadoPorNombre());
		System.out.println(listaEmp);
		
		Iterator<Empleado> iter = listaEmp.iterator();
		
		while (iter.hasNext()) {
			Empleado e = iter.next();
			if (e.getSueldo() < 5000) {
				e.setSueldo(e.getSueldo() + 1000);
			} else {
				iter.remove();
			}
		}
		
		System.out.println(listaEmp);
		
		Collections.sort(listaEmp, new OrdenarEmpleadoPorSueldo());
		System.out.println("Lista ordenada por sueldo del empleado: " + listaEmp);
		
		System.out.println("Total Sueldos empleados: " 
				+ test.calcularTotalSueldos(listaEmp));
		
		System.out.println("Nombres empleados: " + test.obtenerNombres(listaEmp));
	}
	
	private double calcularTotalSueldos(List<Empleado> empleados) {
		double totalSueldo = 
				empleados.stream().mapToDouble(emp -> emp.getSueldo()).sum();
		return totalSueldo;
	}
	
	private List<String> obtenerNombres(List<Empleado> empleados) {
		List<String> nombres = 
				empleados.stream()
				.map(emp -> emp.getNombre())
				.collect(Collectors.toList());
		return nombres;
	}
}
