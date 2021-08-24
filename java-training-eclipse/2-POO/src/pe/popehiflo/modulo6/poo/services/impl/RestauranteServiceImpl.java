/**
 * 
 */
package pe.popehiflo.modulo6.poo.services.impl;

import pe.popehiflo.modulo6.poo.entity.Alimento;
import pe.popehiflo.modulo6.poo.entity.Cliente;
import pe.popehiflo.modulo6.poo.services.RestauranteService;

/**
 * @author popehiflo
 * Clase que implementa los metodos de una interface para darles funcionalidad
 */
public class RestauranteServiceImpl implements RestauranteService {

	@Override
	public void vender(Alimento alimento, Cliente cliente) {
		
		double precioAlimento = alimento.getPrecioUnitario();
		double pagoCliente = cliente.getPagoPrecio();
		
		if (pagoCliente < precioAlimento) {
			System.err.println("El pago es insuficiente");
		} else if (pagoCliente > precioAlimento) {
			System.err.println("Cuidado! El pago es mayor");
			double cambio = pagoCliente - precioAlimento;
			System.out.println("Cambio a regresar al cliente: " + cambio);
		} else {
			System.out.println("El cliente ha pagado el alimento");
		}
		
	}

}
