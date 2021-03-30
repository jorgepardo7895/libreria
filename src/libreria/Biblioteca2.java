package libreria;

import java.util.ArrayList;
import utiles.Teclado;

public class Biblioteca2 {
	ArrayList<Libro> libros;
	ArrayList<Socio> socios;
	Teclado ent;
	BibliotecaSocios users;
	BibliotecaLibros libs;

	public Biblioteca2() {
		ent=new Teclado();
		libros=new ArrayList<Libro>();
		socios=new ArrayList<Socio>();	
		users=new BibliotecaSocios();
		libs=new BibliotecaLibros();
	}

	public void meterLibro() {
		libs.meterLibro(libros);
	}
	
	public void mostrarLibro() {
		libs.mostrarLibro(libros);
	}
	
	public void buscarLibro(){
		Teclado sc = new Teclado();
		System.out.println("Como quieres buscar: "+"\n"+"·1- ISBN"+"\n"+"·2- Titulo"+"\n"+"·3- Autor"+"\n"+"·6- Salir");
		switch (sc.enteros()) {
		case 1:
			libs.buscarLibroIsbn(libros,sc.enteros());
			break;

		default:
			break;
		}
	}
	
	public void modificarLibro(int index) {
		int seleccion;
		do {
			System.out.println("¿Que registro quieres modificar?");
			System.out.println("·1- ISBN"+"\n"+"·2- Titulo"+"\n"+"·3- Autor"+"\n"+"·4- Ejemplares"+"\n"+"·5- Precio"+"\n"+"·6- Salir");
			seleccion=ent.enteros();
			switch (seleccion) {
			case 1:
				libros.get(index).setIsbn(ent.enteros());
				System.out.println("Modificado con exito, el nuevo ISBN es: "+libros.get(index).getIsbn());
				break;
			case 2:
				libros.get(index).setTitulo(ent.letras());
				System.out.println("Modificado con exito, el nuevo titulo es: "+libros.get(index).getTitulo());
				break;
			case 3:
				libros.get(index).setAutor(ent.letras());
				System.out.println("Modificado con exito, el nuevo autor es: "+libros.get(index).getAutor());
				break;
			case 4:
				libros.get(index).setEjemplares(ent.enteros());
				System.out.println("Modificado con exito, el numero de ejemplares es: "+libros.get(index).getEjemplares());
				break;
			case 5:
				libros.get(index).setPrecio(ent.decimales());
				System.out.println("Modificado con exito, el nuevo precio es: "+libros.get(index).getPrecio());
				break;
			case 6:
				System.out.println("Saliendo...");
				break;
			default:
				break;
			}
		} while (seleccion!=6);
	}
	
	public void buscarSocio(ArrayList<Socio>socios) {
		int seleccion;
		System.out.println("Selecciona el filtro: "+"\n"+"·1- ID"+"\n"+"·2- Nombre"+"\n"+"·3- Telefono"+"\n"+"·4- E-mail");
		do {
			seleccion=ent.enteros();
			switch(seleccion) {
			case 1:
				//socios=buscarSocioID(socios, ent.enteros());
				break;
			}
		}while(seleccion!=5);
	}
	
}
