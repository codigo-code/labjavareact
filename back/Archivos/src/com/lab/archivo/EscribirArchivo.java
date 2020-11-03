package com.lab.archivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirArchivo {

	public static void main(String[] args) {
		System.out.println("Escribiendo archivo de texto...");
		 
		try (BufferedWriter archivoSalida = new BufferedWriter(
				new FileWriter(new File("./lab2020/archivos/pruebaTexto.txt"), true))) {
			archivoSalida.write("Hola");
			archivoSalida.newLine();
			archivoSalida.write("Este es");
			archivoSalida.write(" un archivo de texto");
			archivoSalida.newLine();
			archivoSalida.write("FIN DEL ARCHIVO");
		} catch (IOException e) {
			 System.out.println("Error al escribir el archivo " + e.getMessage());
		}
		
		crearOtroArchivo();
		
		//System.out.println("Archivo de texto escrito");
	}
	
	public static void crearOtroArchivo() {
		try (PrintWriter printWriter = new PrintWriter(
	    		new FileWriter("./lab2020/archivos/pruebaTexto2.txt"))) {
			printWriter.print("Nuevo Archivo");
		    printWriter.printf("El nombre del producto es %s y el precio es %d $", "Motorola", 15000);
		} catch (IOException e) {
			System.out.println("Error al escribir el archivo " + e.getMessage());
		}
	}

}
