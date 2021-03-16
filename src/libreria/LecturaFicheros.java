package libreria;

import java.io.*;


public class LecturaFicheros {

	public static void main( String args[] ) {
		FileReader fr =null;
		BufferedReader reader =null;
		FileWriter fw=null;
		String linea="";
		try {
			fr = new FileReader("C:\\Users\\CEINMARK\\Desktop\\Jorge-DAM\\hola.txt");
			fw = new FileWriter("C:\\Users\\CEINMARK\\Desktop\\Jorge-DAM\\holacopia.txt");
			reader = new BufferedReader(fr);
			linea=reader.readLine();
			while(linea!=null) {
				System.out.println(linea);
				fw.write(linea);
				linea=reader.readLine();
			}
			reader.close();
			fw.close();
			fr.close();
		}catch(FileNotFoundException e) {
			// no se encontró el fichero
			System.out.println("Fichero no encontrado");
		}catch(IOException e) {
			// algo fue mal al leer o cerrar el fichero
			System.out.println("Error al leer el fichero");
		}catch(NullPointerException e) {
			System.out.println("Salida null");
		}
	}
}
