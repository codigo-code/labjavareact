package com.lab.archivo;

import java.io.File;
import java.io.IOException;

public class Archivo {

	public static void main(String[] args) {
		
		boolean newFile = false;
		File directorio = new File("./lab2020/archivos/");
		String nombreArchivo = "lab2020.txt";
		
		if (!directorio.exists()) {
			directorio.mkdirs();
		}
		
		File archivo = new File(directorio.getPath() + "/" + nombreArchivo); 

		if (!archivo.exists()) {
			try {
				newFile = archivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Error al crear el archivo " + archivo.getName());
			} 
		} else {
			System.out.println("El archivo que intenta crear ya existe.");
		}
			
		if (newFile) {
			System.out.println("El archivo se ha creado correctamente.");
		} 

	}
}
