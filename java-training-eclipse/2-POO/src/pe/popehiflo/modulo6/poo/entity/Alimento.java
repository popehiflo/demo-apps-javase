/**
 * 
 */
package pe.popehiflo.modulo6.poo.entity;

/**
 * @author popehiflo
 * Clase que representa entidades u objetos de alimentos
 */
public class Alimento {

	/**
	 * Identificador del alimento
	 */
	private long id;
	/**
	 * Nombre del alimento
	 */
	private String nombre;
	/**
	 * Descripcion del alimento
	 */
	private String descripcion;
	/**
	 * Precio unitario del alimento
	 */
	private String precioUnitario;
	
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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the precioUnitario
	 */
	public String getPrecioUnitario() {
		return precioUnitario;
	}
	/**
	 * @param precioUnitario the precioUnitario to set
	 */
	public void setPrecioUnitario(String precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
}
