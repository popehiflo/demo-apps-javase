/**
 * 
 */
package pe.popehiflo.modulo6.poo.entity;

/**
 * @author popehiflo
 * Clase que representa entidades u objetos de clientes
 */
public class Cliente {

	/**
	 * Identificador del cliente
	 */
	private long id;
	/**
	 * Nombre completo del cliente
	 */
	private String nombre;
	/**
	 * Pago del alimento del cliente
	 */
	private double pagoPrecio;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the pagoPrecio
	 */
	public double getPagoPrecio() {
		return pagoPrecio;
	}
	/**
	 * @param pagoPrecio the pagoPrecio to set
	 */
	public void setPagoPrecio(double pagoPrecio) {
		this.pagoPrecio = pagoPrecio;
	}
}
