package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the producto database table.
 * 
 */
@Entity
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	//COD_PROD	NUM_CATEGORIA	NOMBRE_PRODUCTO	PRECIO_UNIT_COMPRA	PRECIO_UNIT_VENTA	STOCK_MIN	STOCK_MAX	STOCK	PRESENTACION
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_PROD")
	private int codProd;

	@Column(name="NOMBRE_PRODUCTO")
	private String nombreProducto;

	@Column(name="NUM_CATEGORIA")
	private int numCategoria;

	@Column(name="PRECIO_UNIT_COMPRA")
	private BigDecimal precioUnitCompra;

	@Column(name="PRECIO_UNIT_VENTA")
	private BigDecimal precioUnitVenta;

	@Column(name="PRESENTACION")
	private String presentacion_;

	@Column(name="STOCK")
	private int stock_;

	@Column(name="STOCK_MAX")
	private int stockMax;

	@Column(name="STOCK_MIN")
	private int stockMin;

	public Producto() {
	}

	public int getCodProd() {
		return this.codProd;
	}

	public void setCodProd(int codProd) {
		this.codProd = codProd;
	}

	public String getNombreProducto() {
		return this.nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public int getNumCategoria() {
		return this.numCategoria;
	}

	public void setNumCategoria(int numCategoria) {
		this.numCategoria = numCategoria;
	}

	public BigDecimal getPrecioUnitCompra() {
		return this.precioUnitCompra;
	}

	public void setPrecioUnitCompra(BigDecimal precioUnitCompra) {
		this.precioUnitCompra = precioUnitCompra;
	}

	public BigDecimal getPrecioUnitVenta() {
		return this.precioUnitVenta;
	}

	public void setPrecioUnitVenta(BigDecimal precioUnitVenta) {
		this.precioUnitVenta = precioUnitVenta;
	}

	public String getPresentacion() {
		return this.presentacion_;
	}

	public void setPresentacion(String presentacion_) {
		this.presentacion_ = presentacion_;
	}

	public int getStock() {
		return this.stock_;
	}

	public void setStock(int stock_) {
		this.stock_ = stock_;
	}

	public int getStockMax() {
		return this.stockMax;
	}

	public void setStockMax(int stockMax) {
		this.stockMax = stockMax;
	}

	public int getStockMin() {
		return this.stockMin;
	}

	public void setStockMin(int stockMin) {
		this.stockMin = stockMin;
	}

}