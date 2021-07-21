/**
 * 
 */
package pe.popehiflo.modulo6.poo.entity;

/**
 * @author popehiflo
 * Clase que representa una entidad u objeto de Sucursales
 */
public class Sucursal {
	/**
	 * Identificador de la sucursal
	 */
	private long id;
	/**
	 * Nombre de la sucursal
	 */
	private String nombre;
	/**
	 * Gerente de la sucursal
	 */
	private String gerente;
	
	
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
	 * @return the gerente
	 */
	public String getGerente() {
		return gerente;
	}
	/**
	 * @param gerente the gerente to set
	 */
	public void setGerente(String gerente) {
		this.gerente = gerente;
	}
}
