/**
 * 
 */
package pe.popehiflo.modulo6.poo.entity;

/**
 * @author popehiflo
 * Clase que representa entidades u objetos de restaurantes
 */
public class Restaurante extends Edificio {
	
	/**
	 * Tipo de moneda del restaurante
	 */
	private String tipoMoneda;
	/**
	 * Pais del restaurante
	 */
	private String pais;
	/**
	 * Sucursal del restaurante
	 */
	private Sucursal sucursal;
	/**
	 * Alimento del restaurante
	 */
	private Alimento alimento;
	
	/**
	 * Constructor default, con tipo de moneda por defecto (PEN)
	 */
	public Restaurante() {
		System.out.println("Creando objeto desde constructor default");
		this.tipoMoneda = "Sol (PEN)";
	}
	/**
	 * Sobrecarga de Constructor
	 * @param tipoMoneda parametro con el tipo de moneda asignado por el usuario
	 */
	public Restaurante(String tipoMoneda) {
		System.out.println("Creando objeto desde constructor sobrecargado con moneda");
		this.tipoMoneda = tipoMoneda;
	}
	/**
	 * Sobrecarga de Constructor
	 * @param tipoMoneda parametro con el tipo de moneda asignado por el usuario
	 * @param pais parametro con el pais asigando por el usuario
	 */
	public Restaurante(String tipoMoneda, String pais) {
		System.out.println("Creando objeto desde constructor sobrecargado con moneda y pais");
		this.tipoMoneda = tipoMoneda;
		this.pais = pais;
	}
	
	/**
	 * @return the tipoMoneda
	 */
	public String getTipoMoneda() {
		return tipoMoneda;
	}
	/**
	 * @param tipoMoneda the tipoMoneda to set
	 */
	public void setTipoMoneda(String tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}
	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}
	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}
	/**
	 * @return the sucursal
	 */
	public Sucursal getSucursal() {
		return sucursal;
	}
	/**
	 * @param sucursal the sucursal to set
	 */
	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	/**
	 * @return the alimento
	 */
	public Alimento getAlimento() {
		return alimento;
	}
	/**
	 * @param alimento the alimento to set
	 */
	public void setAlimento(Alimento alimento) {
		this.alimento = alimento;
	}
	
	
}
