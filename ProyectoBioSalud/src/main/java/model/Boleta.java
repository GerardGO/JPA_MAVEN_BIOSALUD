package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the boleta database table.
 * 
 */
@Entity
@NamedQuery(name="Boleta.findAll", query="SELECT b FROM Boleta b")
public class Boleta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COD_BOLETA")
	private int codBoleta;

	@Column(name="COD_CLIENTE")
	private int codCliente;

	@Column(name="COD_EMPLEADO")
	private int codEmpleado;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_EMISION")
	private Date fechaEmision;

	@Column(name="METODO_PAGO")
	private String metodoPago;

	public Boleta() {
	}

	public int getCodBoleta() {
		return this.codBoleta;
	}

	public void setCodBoleta(int codBoleta) {
		this.codBoleta = codBoleta;
	}

	public int getCodCliente() {
		return this.codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public int getCodEmpleado() {
		return this.codEmpleado;
	}

	public void setCodEmpleado(int codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public Date getFechaEmision() {
		return this.fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public String getMetodoPago() {
		return this.metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

}