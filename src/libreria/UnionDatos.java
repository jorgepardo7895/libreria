package libreria;

import java.io.*;

public class UnionDatos {

	public static void main(String[] args) {
		try {
			File dir=new File(".\\datos");
			
			for (File a : dir.listFiles()) {
				if (!a.isDirectory()) {
					leerFichero(a);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void leerFichero(File a) throws Exception{
		BufferedReader br=new BufferedReader(new FileReader(a));
		BufferedWriter bw=new BufferedWriter(new FileWriter(".\\datos\\salida.txt", true));
		
		while (br.ready()) {
			bw.write(br.readLine());
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}