package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the empleado database table.
 * 
 */
@Entity
@NamedQuery(name="Empleado.findAll", query="SELECT e FROM Empleado e")
public class Empleado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="APELLIDO_EMPLEADO")
	private String apellidoEmpleado;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_EMPLEADO")
	private int codEmpleado;

	@Column(name="CORREO_EMPLEADO")
	private String correoEmpleado;

	@Column(name="DIRE_EMPLEADO")
	private String direEmpleado;

	@Column(name="DNI_EMPLEADO")
	private String dniEmpleado;

	@Column(name="NOMBRE_EMPLEADO")
	private String nombreEmpleado;

	@Column(name="NOMBRE_USUARIO")
	private String nombreUsuario;

	@Column(name="PAS_USUARIO")
	private String pasUsuario;

	@Column(name="TELF_EMPLEADO")
	private String telfEmpleado;

	@Column(name="TIPO_USUARIO")
	private String tipoUsuario;

	public Empleado() {
	}

	public String getApellidoEmpleado() {
		return this.apellidoEmpleado;
	}

	public void setApellidoEmpleado(String apellidoEmpleado) {
		this.apellidoEmpleado = apellidoEmpleado;
	}

	public int getCodEmpleado() {
		return this.codEmpleado;
	}

	public void setCodEmpleado(int codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public String getCorreoEmpleado() {
		return this.correoEmpleado;
	}

	public void setCorreoEmpleado(String correoEmpleado) {
		this.correoEmpleado = correoEmpleado;
	}

	public String getDireEmpleado() {
		return this.direEmpleado;
	}

	public void setDireEmpleado(String direEmpleado) {
		this.direEmpleado = direEmpleado;
	}

	public String getDniEmpleado() {
		return this.dniEmpleado;
	}

	public void setDniEmpleado(String dniEmpleado) {
		this.dniEmpleado = dniEmpleado;
	}

	public String getNombreEmpleado() {
		return this.nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getNombreUsuario() {
		return this.nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPasUsuario() {
		return this.pasUsuario;
	}

	public void setPasUsuario(String pasUsuario) {
		this.pasUsuario = pasUsuario;
	}

	public String getTelfEmpleado() {
		return this.telfEmpleado;
	}

	public void setTelfEmpleado(String telfEmpleado) {
		this.telfEmpleado = telfEmpleado;
	}

	public String getTipoUsuario() {
		return this.tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

}