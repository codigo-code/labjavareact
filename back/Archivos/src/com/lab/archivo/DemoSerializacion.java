package com.lab.archivo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.lab.objetos.Persona;

public class DemoSerializacion {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Juan", "San Martin 111", 25, 123400);
		Persona p2 = new Persona("Cristian", "Sarmiento 999", 30, 450400);
		Persona p3 = new Persona("Alejandra", "Jujuy 33", 30, 459000);
		
		try (ObjectOutputStream salida = 
				new ObjectOutputStream(new FileOutputStream("personas.ser"))) {
			salida.writeObject(p1);
			salida.writeObject(p2);
			salida.writeObject(p3);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
