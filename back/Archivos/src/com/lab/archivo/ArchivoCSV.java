package com.lab.archivo;

import java.io.FileWriter;
import java.io.IOException;

public class ArchivoCSV {

	public static void main(String[] args) {
		final String nombreDeArchivo = "./archivos/archivo.csv";
		crearArchivoCSV(nombreDeArchivo);
	}
	
	private static void crearArchivoCSV(String nombreDeArchivo) {
		crearArchivoCSV(nombreDeArchivo, ",");
	}

	private static void crearArchivoCSV(String file, String delim) {
		final String NEXT_LINE = "\n";
		try {
			FileWriter fw = new FileWriter(file);

			fw.append("valor1").append(delim);
			fw.append("123").append(NEXT_LINE);

			fw.append("valor2");
			fw.append(delim);
			fw.append("312");
			fw.append(NEXT_LINE);

			fw.append("valor3,888\n");

			fw.flush();
			fw.close();
		} catch (IOException e) {
			// Error al crear el archivo, por ejemplo, el archivo 
			// está actualmente abierto.
			e.printStackTrace();
		}
	}

}
