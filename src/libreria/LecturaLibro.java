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
			libroLeido.setTitulo(array[0]);
			libroLeido.setAutor(array[1]);;
			libroLeido.setEjemplares(Integer.parseInt(array[2]));
			libroLeido.setPrecio(Float.parseFloat(array[3]));
			listaLibro.add(libroLeido);
		}
		
		for (Libro a : listaLibro) {
			System.out.println(a.toString());
		}
		return listaLibro;
	}
}
