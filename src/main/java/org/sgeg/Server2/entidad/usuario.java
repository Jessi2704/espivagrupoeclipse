package org.sgeg.Server2.entidad;
import javax.persistence.*;
@Entity
@Table(name="usuario")
public class usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_usuario;
	
	@Column(name = "cedula_usuario")
	private String cedula_usuario;
	
	@Column(name = "nombre_usuario")
	private String nombre_usuario;
	
	@Column(name = "apodo" , unique = true)
	private String apodo;
	
	



	@Column(name = "contrasenia")
	private String contrasenia;
	
	
	public usuario() {
		super();
	}

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getCedula_usuario() {
		return cedula_usuario;
	}

	public void setCedula_usuario(String cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}
	
	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	
	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}



	public usuario(String cedula_usuario,  String apodo, String contrasenia, String nombre_usuario) {
		super();
		this.cedula_usuario = cedula_usuario;
		this.apodo = apodo;
		this.contrasenia = contrasenia;
		this.nombre_usuario = nombre_usuario;
		
	}

	
	
}