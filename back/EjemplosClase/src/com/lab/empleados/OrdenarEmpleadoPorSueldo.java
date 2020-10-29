package com.lab.empleados;

import java.util.Comparator;

public class OrdenarEmpleadoPorSueldo implements Comparator<Empleado> {

	@Override
	public int compare(Empleado o1, Empleado o2) {
		return (int) (o1.getSueldo() - o2.getSueldo());
	}

}
