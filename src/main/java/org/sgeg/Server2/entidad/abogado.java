package org.sgeg.Server2.entidad;
import javax.persistence.*;
@Entity
@Table(name="Abogado")
public class abogado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_user;
	
	@Column(name = "cedula_abogado")
	private String cedula_abogado;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "estado")
	private String estado;
	@Column(name = "direccion")
	private String direccion;
	@Column(name = "email")
	private String email;
	@Column(name = "celular")
	private String celular;
	@Column(name = "profesion")
	private String profesion;
	public abogado() {
		super();
	}


	public abogado(String cedula_abogado, String nombre, String direccion, String email, String celular, String profesion, String estado) {
		super();
		this.cedula_abogado = cedula_abogado;
		this.nombre = nombre;
		this.estado = estado;
		this.direccion = direccion;
		this.email = email;
		this.celular = celular;
		this.profesion = profesion;
	}
	
	
	public Long getId_user() {
		return id_user;
	}
	public void setId_user(long id_user) {
		this.id_user = id_user;
	}
	public String getCedula() {
		return cedula_abogado;
	}
	public void setCedula(String cedula_abogado) {
		this.cedula_abogado = cedula_abogado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	
	
}
