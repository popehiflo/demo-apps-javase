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
		restauranteMargarita.setPais("Perú");
		System.out.println("ID: " + restauranteMargarita.getId());
		System.out.println("NOMBRE: " + restauranteMargarita.getNombre());
		System.out.println("IMAGEN: " + restauranteMargarita.getImagen());
		System.out.println("SLOGAN: " + restauranteMargarita.getSlogan());
		String estado = restauranteMargarita.isEstatus() ? "HABILITADO":"DESHABILITADO";
		System.out.println("ESTATUS: " + estado);
		System.out.println("TIPO MONEDA: " + restauranteMargarita.getTipoMoneda());
		System.out.println("PAIS: " + restauranteMargarita.getPais());
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		Restaurante restauranteJuanita = new Restaurante();
		restauranteJuanita.setId(2000L);
		restauranteJuanita.setNombre("Restaurante Juanita");
		restauranteJuanita.setImagen("restJuanita.png");
		restauranteJuanita.setSlogan("Extras y menu a la carta");
		restauranteJuanita.setEstatus(true);
		restauranteJuanita.setPais("Perú");
		System.out.println("ID: " + restauranteJuanita.getId());
		System.out.println("NOMBRE: " + restauranteJuanita.getNombre());
		System.out.println("IMAGEN: " + restauranteJuanita.getImagen());
		System.out.println("SLOGAN: " + restauranteJuanita.getSlogan());
		String estate = restauranteJuanita.isEstatus() ? "HABILITADO":"DESHABILITADO";
		System.out.println("ESTATUS: " + estate);
		System.out.println("TIPO MONEDA: " + restauranteJuanita.getTipoMoneda());
		System.out.println("PAIS: " + restauranteJuanita.getPais());
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		
		//::::::::::::::::::::::::::: SOBRECARGA :::::::::::::::::::::::::::
		Restaurante restauranteMickela = new Restaurante("Dolar (USD)", "EEUU");
		restauranteMickela.setId(3000L);
		restauranteMickela.setNombre("Restaurante Mickela");
		restauranteMickela.setImagen("restMickelaa.png");
		restauranteMickela.setSlogan("La mas rica comida es peruana obviamente ...");
		restauranteMickela.setEstatus(true);
		System.out.println("ID: " + restauranteMickela.getId());
		System.out.println("NOMBRE: " + restauranteMickela.getNombre());
		System.out.println("IMAGEN: " + restauranteMickela.getImagen());
		System.out.println("SLOGAN: " + restauranteMickela.getSlogan());
		String estadoMickela = restauranteMickela.isEstatus() ? "HABILITADO":"DESHABILITADO";
		System.out.println("ESTATUS: " + estadoMickela);
		System.out.println("TIPO MONEDA: " + restauranteMickela.getTipoMoneda());
		System.out.println("PAIS: " + restauranteMickela.getPais());
		
		System.out.println(restauranteMargarita);
		System.out.println(restauranteJuanita);
		System.out.println(restauranteMickela);
	}

}
