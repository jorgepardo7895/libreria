package libreria;

import java.io.*;

public class Writer {

	public static void main(String[] args) {
		BufferedWriter bw;
		
		try {
			
			bw = new BufferedWriter(new FileWriter(".\\datos\\copiaseglibros.csv"));
			
			bw.write("Hola mundo; maravilloso");
			bw.newLine();
			bw.write("Hola;adios");
			
			bw.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}