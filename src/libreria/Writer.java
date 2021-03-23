package libreria;

import java.io.*;

public class Writer {

	public static void main(String[] args) {
		FileWriter fw;
		BufferedWriter bw;
		
		try {
			fw = new FileWriter(".\\datos\\copiaseglibros.csv");
			bw = new BufferedWriter(fw);
			
			bw.write("Hola mundo; maravilloso");
			bw.newLine();
			bw.write("Hola;adios");
			
			bw.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
