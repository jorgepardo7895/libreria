package libreria;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CopiaSeg {
	public static void escribirFichero(ArrayList<String> a) throws Exception {
		Scanner sc= new Scanner(System.in);
		File directorio=null;
		System.out.println("Escribe el directorio donde deseas guardar los datos");
		
		directorio = new File(sc.next().replace('/','\\'));
		BufferedWriter bw=new BufferedWriter(new FileWriter(directorio, true));
		// almacenamos en una variable de string llamada z cada posicion del arrayList que le pasamos al metodo		
		for (String z : a) {
			bw.write(z);
			bw.newLine();
		}
		System.out.println("Copia de seguridad realizada con exito en: "+directorio.getAbsolutePath());
		bw.close();
		sc.close();
	}
}
