package com.lab.archivo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopiaArchivos {
	
	public static void main(String[] args) {
		copiaArchivo ("./lab2020/archivos/pruebaTexto.txt", "./archivos/pruebaTextoCopia.txt");
	}
	
	public static void copiaArchivo (String archivoOriginal, String archivoCopia) {
		try {
            // Se abre el archivo original para lectura
			FileInputStream fileInput = new FileInputStream(archivoOriginal);
			BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);
			
			// Se abre el archivo donde se hará la copia
			FileOutputStream fileOutput = new FileOutputStream(archivoCopia);
			BufferedOutputStream bufferedOutput = new BufferedOutputStream(fileOutput);
			
			// Bucle para leer de un archivo y escribir en el otro.
			// Defino tamaño del "buffer"
			byte [] array = new byte[1000];
			int leidos = bufferedInput.read(array);
			while (leidos > 0) {
				bufferedOutput.write(array);
				leidos = bufferedInput.read(array);
			}
			
			System.out.println("Se ha creado una copia de " + archivoOriginal);
			
			// Cierre de los archivos
			bufferedInput.close();
			bufferedOutput.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}

}
