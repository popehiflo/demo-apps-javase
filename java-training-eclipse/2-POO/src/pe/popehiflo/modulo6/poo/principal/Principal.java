/**
 * 
 */
package pe.popehiflo.modulo6.poo.principal;

import pe.popehiflo.modulo6.poo.entity.Restaurante;

/**
 * @author popehiflo
 * Clase que se encarga de ejecutar todo lo que se vea de POO
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurante restauranteMargarita = new Restaurante();
		// Asignando valores con metodos set
		restauranteMargarita.setId(1000L);
		restauranteMargarita.setNombre("Restaurante Margarita");
		restauranteMargarita.setImagen("restMargarita.png");
		restauranteMargarita.setSlogan("Platos Criollos y mas");
		restauranteMargarita.setEstatus(true);
		
		System.out.println("ID: " + restauranteMargarita.getId());
		System.out.println("NOMBRE: " + restauranteMargarita.getNombre());
		System.out.println("IMAGEN: " + restauranteMargarita.getImagen());
		System.out.println("SLOGAN: " + restauranteMargarita.getSlogan());
		String estado = restauranteMargarita.isEstatus() ? "HABILITADO":"DESHABILITADO";
		System.out.println("ESTATUS: " + estado);
		
		Restaurante restauranteJuanita = new Restaurante();
		restauranteJuanita.setId(2000L);
		restauranteJuanita.setNombre("Restaurante Juanita");
		restauranteJuanita.setImagen("restJuanita.png");
		restauranteJuanita.setSlogan("Extras y menu a la carta");
		restauranteJuanita.setEstatus(false);
		System.out.println("ID: " + restauranteJuanita.getId());
		System.out.println("NOMBRE: " + restauranteJuanita.getNombre());
		System.out.println("IMAGEN: " + restauranteJuanita.getImagen());
		System.out.println("SLOGAN: " + restauranteJuanita.getSlogan());
		String estate = restauranteJuanita.isEstatus() ? "HABILITADO":"DESHABILITADO";
		System.out.println("ESTATUS: " + estate);
		
		System.out.println(restauranteMargarita);
		System.out.println(restauranteJuanita);
	}

}
