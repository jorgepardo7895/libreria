package libreria;

import java.util.ArrayList;

import utiles.Teclado;

public class BibliotecaSocios {
	
	private Teclado ent;
	
	public BibliotecaSocios() {
		ent=new Teclado();
	}
	
	public void meterSocio(ArrayList<Socio> socio) {
		Socio nuevoSocio=new Socio();
		if (socio.size()>0) {
			nuevoSocio.setId(socio.get(socio.size()-1).getId()+1);
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
		socio.add(nuevoSocio);
	}	
	
	public void mostrarSocio(ArrayList<Socio> socio) {
		for (Socio socios : socio) {
			System.out.println(socios.toString());
		}
	}
	
	//METODOS PARA BUSCAR SOCIO POR ATRIBUTO
	
	public ArrayList<Socio> buscarSocioNombre(ArrayList<Socio> socio,String nombre){
		ArrayList<Socio> buscado=new ArrayList<Socio>();
		for(Socio socios : socio) {
			if(socios.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
				buscado.add(socios);
			}
		}
		return buscado;
	}
	
	public ArrayList<Socio> buscarSocioTelefono(ArrayList<Socio> socio,int tlfn){
		ArrayList<Socio> buscado=new ArrayList<Socio>();
		for(Socio socios : socio) {
			if(socios.getTelefono()==tlfn) {
				buscado.add(socios);
			}
		}
		return buscado;
	}
	
	public ArrayList<Socio> buscarSocioEmail(ArrayList<Socio> socio,String email){
		ArrayList<Socio> buscado=new ArrayList<Socio>();
		for(Socio socios : socio) {
			if(socios.getEmail().toLowerCase().contains(email.toLowerCase())) {
				buscado.add(socios);
			}
		}
		return buscado;
	}
	
	public Socio buscarSocioID(ArrayList<Socio> socio,int id){
		Socio buscado=null;
		for(Socio socios : socio) {
			if(socios.getId()==id) {
				buscado=socios;
			}
		}
		return buscado;
	}
	
	
	//METODOS PARA MODIFICAR SOCIO 
	
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
	
	//METODO PARA ELIMINAR SOCIO
	
	public void eliminarSocio(ArrayList<Socio> socio,Socio soc) {
		socio.remove(soc);
	}
	
}
