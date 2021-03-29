package libreria;

import java.io.*;
import java.util.ArrayList;


public class LecturaFicheros {

	public static ArrayList<String> leerFichero(File fichero) throws Exception {
		ArrayList<String> datos=new ArrayList<String>(); 
		BufferedReader br=null;
		br= new BufferedReader(new FileReader(fichero));
						
		while (br.ready()) {
			datos.add(br.readLine().trim()); // el trim elimina espacios en blanco
		}
		System.out.println("Archivo leido correctamente");
		br.close();
		return datos;
	}
}