package libreria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args) {
		Scanner ent;
		
		try {
			ent=new Scanner(System.in);
			int num=ent.nextInt();
			System.out.println(5/num);
		}
		catch (ArithmeticException exc) {
			System.out.println("Error en la division por cero");
		}catch (InputMismatchException input) {
			System.out.println("Error ");
		}
	}
}
