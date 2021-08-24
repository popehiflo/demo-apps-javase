/**
 * 
 */
package pe.popehiflo.modulo6.poo.principal;

import java.util.Scanner;

import pe.popehiflo.modulo6.poo.entity.Alimento;
import pe.popehiflo.modulo6.poo.entity.Cliente;
import pe.popehiflo.modulo6.poo.entity.Restaurante;
import pe.popehiflo.modulo6.poo.entity.Sucursal;
import pe.popehiflo.modulo6.poo.services.impl.RestauranteServiceImpl;

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
		restauranteMargarita.setPais("Per�");
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
		restauranteJuanita.setPais("Per�");
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
		
		Sucursal sucursalMickelaEEUU = new Sucursal();
		sucursalMickelaEEUU.setId(1000L);
		sucursalMickelaEEUU.setNombre("Restaurante Mickela - Los Angeles");
		sucursalMickelaEEUU.setGerente("Ariadna Hijuela");
		
		restauranteMickela.setSucursal(sucursalMickelaEEUU);
		System.out.println("-SUCURSALES-: " + restauranteMickela.getSucursal().getNombre());
		
		//:::::::::::::::::::::: FUNCIONALIDAD DE VENTA DE ALIMENTO ::::::::::::::::::::::
		Alimento alimentoItaliano = new Alimento();
		alimentoItaliano.setId(1010L);
		alimentoItaliano.setNombre("Pizza de Pepperoni");
		alimentoItaliano.setPrecioUnitario(200);
		
		restauranteMickela.setAlimento(alimentoItaliano);
		
		Scanner leerValorTeclado = new Scanner(System.in);
		System.out.println("El total a pagar de " + restauranteMickela.getAlimento().getNombre() + " es: $" + restauranteMickela.getAlimento().getPrecioUnitario());
		double cantidadPagadaCliente = leerValorTeclado.nextDouble();
		Cliente cliente = new Cliente();
		cliente.setId(100L);
		cliente.setNombre("Michael Jordan");
		cliente.setPagoPrecio(cantidadPagadaCliente);
		System.out.println("La cantidad pagada por el cliente es: " + cliente.getPagoPrecio());
		
		//Aniadiendo la invocacion al metodo vender
		RestauranteServiceImpl restauranteServiceImpl = new RestauranteServiceImpl();
		restauranteServiceImpl.vender(restauranteMickela.getAlimento(), cliente);
		
		System.out.println(restauranteMargarita);
		System.out.println(restauranteJuanita);
		System.out.println(restauranteMickela);
	}

}
