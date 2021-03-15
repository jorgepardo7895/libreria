package libreria;

import utiles.Teclado;

public class ControlBiblioteca {

	public static void main(String[] args) {
		Teclado ent=new Teclado();
		Biblioteca2 nuevaBiblioteca= new Biblioteca2();
		int seleccion=0;
		do {
			System.out.println("Introduce la opcion deseada"+"\n"+"·1- Nuevo libro"+"\n"+"·2- Nuevo socio"+"\n"+"·3- Mostrar libros"+"\n"+"·4- Mostrar socios"+"\n"+"·5- Buscar socio"+"\n"+"·6- Buscar Libro"+"\n"+"·7- Salir");
			seleccion=ent.enteros();
			switch (seleccion) {
			case 1:
				nuevaBiblioteca.meterLibro();
				break;
			case 2:
				nuevaBiblioteca.users.meterSocio(nuevaBiblioteca.socios);
				break;
			case 3:
				nuevaBiblioteca.mostrarLibros();
				break;
			case 4:
				nuevaBiblioteca.users.mostrarSocio(nuevaBiblioteca.socios);
				break;
			case 5:
				//nuevaBiblioteca.users.mostrarSocio(nuevaBiblioteca.socios);
				break;
			case 6:
				nuevaBiblioteca.buscarLibro();
				break;
			case 7:
				System.out.println("Saliendo del programa");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}		
		}while(seleccion!=7);
	}

}
