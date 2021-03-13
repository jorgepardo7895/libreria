package libreria;

public class Libro {
	private int isbn;
	private String titulo;
	private String autor;
	private int ejemplares;
	private float precio;
	
	public Libro() {
		isbn=0;
		titulo="";
		autor="";
		ejemplares=0;
		precio=0.0f;
		
	}
	
	public Libro(int isbn, String titulo,String autor,int ejemplares, float precio) {
		this.isbn=isbn;
		this.titulo=titulo;
		this.autor=autor;
		this.ejemplares=ejemplares;
		this.precio=precio;
	}
	
	public String toString(){
		return "ISBN: "+ isbn+" Titulo: "+titulo+" Autor: "+autor+" Ejemplares: "+ejemplares+" Precio: "+ precio+" €";
	}
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getEjemplares() {
		return ejemplares;
	}
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
}
