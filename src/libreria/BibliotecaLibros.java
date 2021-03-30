package libreria;

import java.util.ArrayList;

import utiles.Teclado;

public class BibliotecaLibros {
	private Teclado ent;
	
	public BibliotecaLibros() {
		ent=new Teclado();
	}
	
	public void meterLibro(ArrayList<Libro> libro) {
		Libro nuevoLibro=new Libro();
		System.out.println("Introduzca el Isbn: ");
		nuevoLibro.setIsbn(ent.enteros());
		System.out.println("Introduzca el titulo: ");
		nuevoLibro.setTitulo(ent.letras());
		System.out.println("Introduce autor: ");
		nuevoLibro.setAutor(ent.letras());
		System.out.println("Inserta el numero de ejemplares: ");
		nuevoLibro.setEjemplares(ent.enteros());
		System.out.println("Introduzca el precio: ");
		nuevoLibro.setPrecio(ent.decimales());
		System.out.println(nuevoLibro.toString());
		libro.add(nuevoLibro);
	}	
	
	public void mostrarLibro(ArrayList<Libro> libro) {
		for (Libro libros : libro) {
			System.out.println(libros.toString());
		}
	}
	
	//METODOS PARA BUSCAR SOCIO POR ATRIBUTO
	
	public ArrayList<Libro> buscarLibroTitulo(ArrayList<Libro> libro,String titulo){
		ArrayList<Libro> buscado=new ArrayList<Libro>();
		for(Libro libros : libro) {
			if(libros.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
				buscado.add(libros);
			}
		}
		return buscado;
	}
	
	public ArrayList<Libro> buscarLibroIsbn(ArrayList<Libro> libro,int isbn){
		ArrayList<Libro> buscado=new ArrayList<Libro>();
		for(Libro libros : libro) {
			if(libros.getIsbn()==isbn) {
				buscado.add(libros);
			}
		}
		return buscado;
	}
	
	public ArrayList<Libro> buscarLibroAutor(ArrayList<Libro> libro,String autor){
		ArrayList<Libro> buscado=new ArrayList<Libro>();
		for(Libro libros : libro) {
			if(libros.getAutor().toLowerCase().contains(autor.toLowerCase())) {
				buscado.add(libros);
			}
		}
		return buscado;
	}
	

	//METODOS PARA MODIFICAR SOCIO 
	
	public void modificarIsbn(Libro libro) {
		libro.setIsbn(ent.enteros());
		System.out.println("Modificado con exito, el nuevo ISBN es: "+libro.getIsbn());
	}
	
	public void modificarTitulo(Libro libro) {
		libro.setTitulo(ent.letras());
		System.out.println("Modificado con exito, el nuevo titulo es: "+libro.getTitulo());
	}
	
	public void modificarAutor(Libro libro) {
		libro.setAutor(ent.letras());
		System.out.println("Modificado con exito, el nuevo autor es: "+libro.getAutor());
	}
	
	public void modificarEjemplares(Libro libro) {
		libro.setEjemplares(ent.enteros());
		System.out.println("Modificado con exito, el numero de ejemplares es: "+libro.getEjemplares());
	}
	
	public void modificarPrecio(Libro libro) {
		libro.setPrecio(ent.decimales());
		System.out.println("Modificado con exito, el nuevo precio es: "+libro.getPrecio());
	}
	
	//METODO PARA ELIMINAR SOCIO
	
	public void eliminarLibro(ArrayList<Libro> libro,Libro lib) {
		libro.remove(lib);
	}
	
}
