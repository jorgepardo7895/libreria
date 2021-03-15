package libreria;

import java.util.ArrayList;
import utiles.Teclado;

public class Biblioteca2 {
	ArrayList<Libro> libros;
	ArrayList<Socio> socios;
	Teclado ent;
	BibliotecaSocios users;

	public Biblioteca2() {
		ent=new Teclado();
		libros=new ArrayList<Libro>();
		socios=new ArrayList<Socio>();	
		users=new BibliotecaSocios();
	}

	public void meterLibro() {
		Libro libroNuevo= new Libro();
		if (libros.size()>0) {
			libroNuevo.setIsbn(libros.get(libros.size()-1).getIsbn()+1);
		} else {
			libroNuevo.setIsbn(100);
		}
		System.out.println("Introduzca el nombre del libro: ");
		libroNuevo.setTitulo(ent.letras());
		System.out.println("Introduce autor: ");
		libroNuevo.setAutor(ent.letras());
		System.out.println("Inserta el numero de ejemplares: ");
		libroNuevo.setEjemplares(ent.enteros());
		System.out.println("Inserta el precio: ");
		libroNuevo.setPrecio(ent.decimales());
		System.out.println(libroNuevo.toString());
		libros.add(libroNuevo);
	}
	
	public void mostrarLibros() {
		for (Libro libro : libros) {
			System.out.println(libro.toString());
		}
	}
	
	public void buscarLibro(){
		System.out.println("Introduce el libro que quieres buscar");
		String nombre=ent.letras();
		int seleccion, indice;
		for(Libro libro : libros) {
			if(libro.getTitulo().equalsIgnoreCase(nombre)) {
				do {
					System.out.println("Libro encontrado, ¿que desea hacer?"+"\n"+"·1- Modificar datos"+"\n"+"·2- Borrar Libro"+"\n"+"·3- Consultar informacion"+"\n"+"·4- Salir");
					seleccion=ent.enteros();
					switch (seleccion) {
					case 1:
						indice= libros.indexOf(libro);
						modificarLibro(indice);
						break;
					case 2:
						System.out.println("Borrando...");
						libros.remove(libros.indexOf(libro));
						break;
					case 3:
						System.out.println("Los datos del libro son:"+"\n"+ libro.toString());
						break;
					case 4:
						System.out.println("Saliendo...");
						break;
					default:
						break;
					}
				}while(seleccion!=4);
			}
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
