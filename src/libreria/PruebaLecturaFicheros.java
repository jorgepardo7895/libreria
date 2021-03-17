package libreria;

import java.io.*;

public class PruebaLecturaFicheros {

	public static void main(String[] args) {
		FileReader fr=null;
		BufferedReader bf=null;
		FileWriter fw=null;
		String linea="";
		int cont=0;
		try {
			fr=new FileReader("C:\\Users\\CEINMARK\\Desktop\\Jorge-DAM\\hola.txt");
			bf=new BufferedReader(fr);
			
			do {
				linea=bf.readLine();
				if (linea!=null) {
					cont+=linea.split(" ").length; // contar las palabras de la linea
					System.out.println(linea);
				}
			}while(linea!=null);
			System.out.println(cont);
			
			
			fw=new FileWriter("C:\\Users\\CEINMARK\\Desktop\\Jorge-DAM\\holacopia.txt");
			
			fr.close();
			bf.close();
			fw.close();
		}catch(FileNotFoundException ex){
			System.out.println("Archivo no encontrado");
		}catch(IOException ex){
			System.out.println("Error de salida");
		}catch(NullPointerException ex) {
			System.out.println("Estas trabajando con un archivo nulo");
		}
	}

}
