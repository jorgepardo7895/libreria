package libreria;

import java.io.*;
import java.util.ArrayList;

public class ComparaFicheros {

	public static void main(String[] args) {
		
		String file1="",file2="";
		
		try {
			LecturaFicheros lee=new LecturaFicheros();
			ArrayList<String> fich1=new ArrayList<>(lee.leerFichero(new File(".\\datos\\prueba1.txt")));
			ArrayList<String> fich2=new ArrayList<>(lee.leerFichero(new File(".\\datos\\prueba2.txt")));
			
			for (String a : fich1) {
				file1+=a.toString();
			}
			for (String b : fich2) {
				file2+=b.toString();
			}

			if (file1.length()>file2.length()) {
				System.out.println("El archivo 1 es mayor");
			}else if(file1.length()<file2.length()) {
				System.out.println("Archivo 2 mayor");
			}else {
				System.out.println("Son iguales");
			}
			
		} catch (Exception e) {
			e.getMessage();
		}
	}
}