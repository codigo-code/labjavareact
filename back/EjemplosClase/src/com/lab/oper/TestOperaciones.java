package com.lab.oper;

public class TestOperaciones {

	public static void main(String[] args) {
		Operacion oper = new Operacion();
		try {
			oper.setOper1(Integer.valueOf(args[0]));
			oper.setOper2(Integer.valueOf(args[1]));
			oper.setTipo(TipoOperacion.SUMA);
			System.out.println("Resultado operación: " + oper.operar());
			oper.setTipo(TipoOperacion.MULTIPLICACION);
			System.out.println("Resultado operación: " + oper.operar());
			oper.setTipo(TipoOperacion.DIVISION);
			System.out.println("Resultado operación: " + oper.operar());
			oper.setTipo(TipoOperacion.RESTA);
			System.out.println("Resultado operación: " + oper.operar());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error en parametros de entrada");
		} catch (NumberFormatException e) {
			System.out.println("Parametros de entrada no validos");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
