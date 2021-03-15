package libreria;

import java.util.ArrayList;

import utiles.Teclado;

public class BibliotecaSocios {
	ArrayList<Socio> socios;
	Teclado ent;
	
	public BibliotecaSocios() {
		ent=new Teclado();
		socios=new ArrayList<Socio>();	
	}
	
	public void meterSocio() {
		Socio nuevoSocio=new Socio();
		if (socios.size()>0) {
			nuevoSocio.setId(socios.get(socios.size()-1).getId()+1);
		} else {
			nuevoSocio.setId(100);
		}
		System.out.println("Introduzca el nombre del cliente: ");
		nuevoSocio.setNombre(ent.letras());
		System.out.println("Introduce telefono: ");
		nuevoSocio.setTelefono(ent.enteros());
		System.out.println("Inserta el e-mail: ");
		nuevoSocio.setEmail(ent.deTodo());			
		System.out.println(nuevoSocio.toString());
		socios.add(nuevoSocio);
	}	
	
	public void mostrarSocio() {
		for (Socio socio : socios) {
			System.out.println(socio.toString());
		}
	}
	
	//METODOS PARA BUSCAR SOCIOS POR ATRIBUTOS
	
	public ArrayList<Socio> buscarSocioNombre(String nombre){
		ArrayList<Socio> buscado=new ArrayList<Socio>();
		for(Socio socio : socios) {
			if(socio.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
				buscado.add(socio);
			}
		}
		return buscado;
	}
	
	public ArrayList<Socio> buscarSocioTelefono(int tlfn){
		ArrayList<Socio> buscado=new ArrayList<Socio>();
		for(Socio socio : socios) {
			if(socio.getTelefono()==tlfn) {
				buscado.add(socio);
			}
		}
		return buscado;
	}
	
	public ArrayList<Socio> buscarSocioEmail(String email){
		ArrayList<Socio> buscado=new ArrayList<Socio>();
		for(Socio socio : socios) {
			if(socio.getEmail().toLowerCase().contains(email.toLowerCase())) {
				buscado.add(socio);
			}
		}
		return buscado;
	}
	
	public Socio buscarSocioID(int id){
		Socio buscado=null;
		for(Socio socio : socios) {
			if(socio.getId()==id) {
				buscado=socio;
			}
		}
		return buscado;
	}
	
	
	//METODOS PARA MODIFICAR SOCIOS 
	
	public void modificarId(Socio socio) {
		socio.setId(ent.enteros());
		System.out.println("Modificado con exito, el nuevo ID es: "+socio.getId());
	}
	
	public void modificarNombre(Socio socio) {
		socio.setNombre(ent.letras());
		System.out.println("Modificado con exito, el nuevo nombre es: "+socio.getNombre());
	}
	
	public void modificarTelefono(Socio socio) {
		socio.setTelefono(ent.enteros());
		System.out.println("Modificado con exito, el nuevo telefono es: "+socio.getTelefono());
	}
	
	public void modificarEmail(Socio socio) {
		socio.setEmail(ent.deTodo());
		System.out.println("Modificado con exito, el nuevo E-mail es: "+socio.getEmail());
	}
	
}
