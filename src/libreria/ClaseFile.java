package libreria;

import java.io.*;

public class ClaseFile {

	public static void main(String[] args) {
		File dir = new File("C:\\Users\\CEINMARK\\Desktop\\Jorge-DAM\\Programacion\\datos");
		
		
		try {
			dir.createNewFile();
			for (File fichero : dir.listFiles()) {
				
				if (!fichero.isDirectory()) {
					leerFichero(fichero);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch(NullPointerException e) {
			System.out.println("Carpeta vacia o inexistente");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void leerFichero(File fichero) throws Exception {
		BufferedReader br=null;
		String linea="";
		System.out.println(fichero.getName());
		br= new BufferedReader(new FileReader(fichero));
		
		linea= br.readLine();					
		while (linea !=null) {
			System.out.println(linea);
			linea=br.readLine();
		}
		br.close();
	}

}
