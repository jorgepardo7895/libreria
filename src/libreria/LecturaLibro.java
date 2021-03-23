package libreria;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class LecturaLibro extends LecturaFicheros{
	
	public static void main(String args[]) {
		try {
			leerLibro();
		} catch (Exception e) {
			e.getStackTrace();
		}		
	}
	
	public static ArrayList<Libro> leerLibro() throws Exception{
		ArrayList<Libro>listaLibro=new ArrayList<Libro>();
		File dir = new File(".\\datos\\libros.csv");
		Libro libroLeido;
		ArrayList<String> dato = leerFichero(dir);
		String array[];

	
		for (String a : dato) {

			array=a.split(";");
			libroLeido=new Libro();
			libroLeido.setIsbn(Integer.parseInt(array[0]));
			libroLeido.setTitulo(array[1]);
			libroLeido.setAutor(array[2]);;
			libroLeido.setEjemplares(Integer.parseInt(array[3]));
			libroLeido.setPrecio(Float.parseFloat(array[4]));
			listaLibro.add(libroLeido);
		}
		
		for (Libro a : listaLibro) {
			System.out.println(a.toString());
		}
		return listaLibro;
	}
}
