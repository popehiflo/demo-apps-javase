/**
 * 
 */
package pe.popehiflo.modulo6.poo.entity;

/**
 * @author popehiflo
 * Clase que representa entidades u objetos de restaurantes
 */
public class Restaurante {

	/**
	 * Identificador del restaurante
	 */
	private long id;
	/**
	 * Nombre del restaurante
	 */
	private String nombre;
	/**
	 * Slogan del restaurante
	 */
	private String slogan;
	/**
	 * Imagen del restaurante (.png)
	 */
	private String imagen;
	/**
	 * Estado Habilitado o Deshabilitado del restaurante
	 */
	private boolean estatus;
	
	
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
	 * @return the slogan
	 */
	public String getSlogan() {
		return slogan;
	}
	/**
	 * @param slogan the slogan to set
	 */
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	/**
	 * @return the imagen
	 */
	public String getImagen() {
		return imagen;
	}
	/**
	 * @param imagen the imagen to set
	 */
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	/**
	 * @return the estatus
	 */
	public boolean isEstatus() {
		return estatus;
	}
	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	
	
}
