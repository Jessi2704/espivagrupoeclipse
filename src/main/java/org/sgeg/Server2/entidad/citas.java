package org.sgeg.Server2.entidad;
import javax.persistence.*;
@Entity
@Table(name="Citas")
public class citas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cita;
	
	@Column(name = "cedula_abogado")
	private String cedula_abogado;
	@Column(name = "nombre_abogado")
	private String nombre_abogado;
	
	@Column(name = "cedula_cliente")
	private String cedula_cliente;
	@Column(name = "nombre_cliente")
	private String nombre_cliente;

	@Column(name = "lugar_Cita")
	private String lugar_cita;
	
	@Column(name = "fecha_inicio_cita")
	private String fecha_inicio_cita;
	
	@Column(name = "hora_inicio_cita")
	private String hora_inicio_cita;
	@Column(name = "hora_fin_cita")
	private String hora_fin_cita;

	@Column(name = "motivo_cita")
	private String motivo_cita;
	
	@Column(name = "estado_cita")
	private String estado_cita;
	
	
	public  citas() {
		super();
	}

	public String getNombre_abogado() {
		return nombre_abogado;
	}

	public void setNombre_abogado(String nombre_abogado) {
		this.nombre_abogado = nombre_abogado;
	}

	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public String getMotivo_cita() {
		return motivo_cita;
	}

	public void setMotivo_cita(String motivo_cita) {
		this.motivo_cita = motivo_cita;
	}

	public String getEstado_cita() {
		return estado_cita;
	}

	public void setEstado_cita(String estado_cita) {
		this.estado_cita = estado_cita;
	}

	public Long getId_cita() {
		return id_cita;
	}

	public void setId_cita(Long id_cita) {
		this.id_cita = id_cita;
	}

	public String getCedula_abogado() {
		return cedula_abogado;
	}

	public void setCedula_abogado(String cedula_abogado) {
		this.cedula_abogado = cedula_abogado;
	}

	public String getCedula_cliente() {
		return cedula_cliente;
	}

	public void setCedula_cliente(String cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}

	public String getLugar_cita() {
		return lugar_cita;
	}

	public void setLugar_cita(String lugar_cita) {
		this.lugar_cita = lugar_cita;
	}

	public String getFecha_inicio_cita() {
		return fecha_inicio_cita;
	}

	public void setFecha_inicio_cita(String fecha_inicio_cita) {
		this.fecha_inicio_cita = fecha_inicio_cita;
	}

	public String getHora_inicio_cita() {
		return hora_inicio_cita;
	}

	public void setHora_inicio_cita(String hora_inicio_cita) {
		this.hora_inicio_cita = hora_inicio_cita;
	}

	public String getHora_fin_cita() {
		return hora_fin_cita;
	}

	public void setHora_fin_cita(String hora_fin_cita) {
		this.hora_fin_cita = hora_fin_cita;
	}

	
	
	

	public citas(String cedula_abogado, String cedula_cliente, String lugar_cita, String fecha_inicio_cita,
			 String hora_inicio_cita, String nombre_abogado, String nombre_cliente,  String hora_fin_cita,  String motivo_cita , String estado_cita) {
		super();
		this.cedula_abogado = cedula_abogado;
		this.nombre_abogado = nombre_abogado;
		this.cedula_cliente = cedula_cliente;
		this.lugar_cita = lugar_cita;
		this.fecha_inicio_cita = fecha_inicio_cita;
		this.motivo_cita = motivo_cita;
		this.hora_inicio_cita = hora_inicio_cita;
		this.hora_fin_cita = hora_fin_cita;
		this.estado_cita= estado_cita;
		this.nombre_cliente = nombre_cliente;
	}
}
	
	
	
	
