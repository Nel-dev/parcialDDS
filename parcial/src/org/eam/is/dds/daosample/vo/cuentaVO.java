package org.eam.is.dds.daosample.vo;

/**
 * VO que encapsula Persona.
 * 
 * @author Heider
 *
 */
public class cuentaVO {

	private Integer id;
	private Integer numcuenta;
	private Integer saldo;


	/**
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            id a asignar
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return numero
	 */
	public Integer getnumcuenta() {
		return numcuenta;
	}

	/**
	 * @param nombre
	 *            numero a asignar
	 */
	public void setnumcuenta(int numcuenta) {
		this.numcuenta =numcuenta;
	}
	
	public Integer getsaldo() {
		return saldo;
	}

	/**
	 * @param nombre
	 *            numero a asignar
	 */
	public void setsaldo(int saldo) {
		this.saldo =saldo;
	}
}
	