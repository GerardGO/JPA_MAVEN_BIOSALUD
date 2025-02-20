package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the proveedor database table.
 * 
 */
@Entity
@NamedQuery(name="Proveedor.findAll", query="SELECT p FROM Proveedor p")
public class Proveedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_PROVEEDOR")
	private int codProveedor;

	@Column(name="CORREO_PROVEEDOR")
	private String correoProveedor;

	@Column(name="DIRE_PROVEEDOR")
	private String direProveedor;

	@Column(name="NOMBRE_PROVEEDOR")
	private String nombreProveedor;

	@Column(name="RUC_PROVEEDOR")
	private String rucProveedor;

	@Column(name="TELF_PROVEEDOR")
	private String telfProveedor;

	@Column(name="WEB_PROVEEDOR")
	private String webProveedor;

	public Proveedor() {
	}

	public int getCodProveedor() {
		return this.codProveedor;
	}

	public void setCodProveedor(int codProveedor) {
		this.codProveedor = codProveedor;
	}

	public String getCorreoProveedor() {
		return this.correoProveedor;
	}

	public void setCorreoProveedor(String correoProveedor) {
		this.correoProveedor = correoProveedor;
	}

	public String getDireProveedor() {
		return this.direProveedor;
	}

	public void setDireProveedor(String direProveedor) {
		this.direProveedor = direProveedor;
	}

	public String getNombreProveedor() {
		return this.nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}

	public String getRucProveedor() {
		return this.rucProveedor;
	}

	public void setRucProveedor(String rucProveedor) {
		this.rucProveedor = rucProveedor;
	}

	public String getTelfProveedor() {
		return this.telfProveedor;
	}

	public void setTelfProveedor(String telfProveedor) {
		this.telfProveedor = telfProveedor;
	}

	public String getWebProveedor() {
		return this.webProveedor;
	}

	public void setWebProveedor(String webProveedor) {
		this.webProveedor = webProveedor;
	}

}