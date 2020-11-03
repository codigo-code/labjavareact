package com.lab.archivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {

	public static void main(String[] args) {
		// Chequeo que el archivo existe
		if (!(new File("./lab2020/archivos/pruebaTexto.txt")).exists()) {
			System.out.println("No se ha encontrado el archivo");
		    return;
		}
		 
		System.out.println("Leyendo archivo de texto...");
		        
		// Lectura del archivo
		try (BufferedReader archivoEntrada = new BufferedReader(
					new FileReader(new File("./lab2020/archivos/pruebaTexto.txt")))){
			
			String linea = null; 
			int contadorLineas = 1;
			while ((linea = archivoEntrada.readLine()) != null) {
				System.out.println("Linea " + contadorLineas + ": " + linea);
				contadorLineas += 1;
		    }
		            
		} catch (IOException err) {
		    System.out.println("Error al leer el archivo: " + err.getMessage() );
		}	

	}

}
