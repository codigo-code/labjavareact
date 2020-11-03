package com.lab.archivo;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.lab.objetos.Persona;

public class DemoDeserializacion {

	public static void main(String[] args) {
		
		try (ObjectInputStream entrada = 
				new ObjectInputStream(new FileInputStream("personas.ser"))) {
			while (true) {
				Persona p = (Persona) entrada.readObject();
				System.out.println(p.toString());
			}
		} catch (EOFException eof) {
			System.out.println("Se alcanzo el final del archivo");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
