package com.lojacar.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "clientes")
public class Clientes implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	public String nombres;
	public String apellidos;
	public String telefono_casa;
	public String telefono_movil;
	public String correo_electronico;
	public String profesion;
	public String detalle;

	@OneToOne
	@JoinColumn(name = "empleado_id", unique = false)
	private Empleados empleados;

	@JoinTable(name = "clientes_vehiculos",
			uniqueConstraints= @UniqueConstraint(columnNames={"vehiculo","cliente"}), joinColumns = {
			@JoinColumn(name = "vehiculo", referencedColumnName = "id", nullable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "cliente", referencedColumnName = "id", nullable = false) })
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Vehiculos> vehiculos;

	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createAt;

	@PrePersist
	public void prePersist() {
		createAt = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono_casa() {
		return telefono_casa;
	}

	public void setTelefono_casa(String telefono_casa) {
		this.telefono_casa = telefono_casa;
	}

	public String getTelefono_movil() {
		return telefono_movil;
	}

	public void setTelefono_movil(String telefono_movil) {
		this.telefono_movil = telefono_movil;
	}

	public String getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Empleados getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Empleados empleados) {
		this.empleados = empleados;
	}

	public List<Vehiculos> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(List<Vehiculos> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -3718529806554960849L;

}
