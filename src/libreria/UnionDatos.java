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
	
//	public static void buscarYleer() {
//		File arch = new File("./datos");
//		
//		for(File fich : arch.listFiles()) {
//			if(fich.getName().toLowerCase().equals("libros.csv")) {
//				leerLibro(fich);
//			}if(fich.getName().toLowerCase().equals("socios.csv")) {
//				leerSocio(fich);
//			}
//		}
//	}
//	
//	public static void leerLibro(File libro) throws Exception{
//		BufferedReader br=new BufferedReader(new FileReader(libro));
//	}
//	
//	public static void leerSocio(File socio) {
//		
//	}
}