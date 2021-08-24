/**
 * 
 */
package pe.popehiflo.modulo6.poo.services;

import pe.popehiflo.modulo6.poo.entity.Alimento;
import pe.popehiflo.modulo6.poo.entity.Cliente;

/**
 * @author popehiflo
 * Interface que define los metodos que seran proporcionados como
 * funciones minimas a cumplir (es como un contrato)
 */
public interface RestauranteService {

	// Los metodos de una interface pueden ser public y abstract
	//public abstract void vender();
	
	public abstract void vender(Alimento alimento, Cliente cliente);
}
