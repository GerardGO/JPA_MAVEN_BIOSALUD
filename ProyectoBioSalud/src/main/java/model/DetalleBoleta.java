package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the detalle_boleta database table.
 * 
 */
@Entity
@Table(name="detalle_boleta")
@NamedQuery(name="DetalleBoleta.findAll", query="SELECT d FROM DetalleBoleta d")
public class DetalleBoleta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CANTIDAD_VENDIDA")
	private int cantidadVendida;

	@Id
	@Column(name="COD_BOLETA")
	private int codBoleta;

	@Column(name="COD_PROD")
	private int codProd;

	@Column(name="PRECIO_UNIT_VENTA")
	private BigDecimal precioUnitVenta;

	public DetalleBoleta() {
	}

	public int getCantidadVendida() {
		return this.cantidadVendida;
	}

	public void setCantidadVendida(int cantidadVendida) {
		this.cantidadVendida = cantidadVendida;
	}

	public int getCodBoleta() {
		return this.codBoleta;
	}

	public void setCodBoleta(int codBoleta) {
		this.codBoleta = codBoleta;
	}

	public int getCodProd() {
		return this.codProd;
	}

	public void setCodProd(int codProd) {
		this.codProd = codProd;
	}

	public BigDecimal getPrecioUnitVenta() {
		return this.precioUnitVenta;
	}

	public void setPrecioUnitVenta(BigDecimal precioUnitVenta) {
		this.precioUnitVenta = precioUnitVenta;
	}

}