package com.woodworking.model;

public class User {
	private String idempleado;
	private int idpuesto;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String nombre;
	private String nombreCompleto;
	private String fechaNacimiento;
	private String fechaAlta;
	private String empleadoSuperior;
	private String estatus;
	private String usuario;
	private String contrasenia;
	private String email;

	public User() {
	}

	public User(String idempleado, int idpuesto, String apellidoPaterno,
			String apellidoMaterno, String nombre, String nombreCompleto,
			String fechaNacimiento, String fechaAlta, String empleadoSuperior,
			String estatus, String usuario, String contrasenia, String email) {
		this.idempleado = idempleado;
		this.idpuesto = idpuesto;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.nombre = nombre;
		this.nombreCompleto = nombreCompleto;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaAlta = fechaAlta;
		this.empleadoSuperior = empleadoSuperior;
		this.estatus = estatus;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.email = email;
	}

	public String getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(String idempleado) {
		this.idempleado = idempleado;
	}

	public int getIdpuesto() {
		return idpuesto;
	}

	public void setIdpuesto(int idpuesto) {
		this.idpuesto = idpuesto;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getEmpleadoSuperior() {
		return empleadoSuperior;
	}

	public void setEmpleadoSuperior(String empleadoSuperior) {
		this.empleadoSuperior = empleadoSuperior;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [idempleado=" + idempleado + ", idpuesto=" + idpuesto
				+ ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno="
				+ apellidoMaterno + ", nombre=" + nombre + ", nombreCompleto="
				+ nombreCompleto + ", fechaNacimiento=" + fechaNacimiento
				+ ", fechaAlta=" + fechaAlta + ", empleadoSuperior="
				+ empleadoSuperior + ", estatus=" + estatus + ", usuario="
				+ usuario + ", contrasenia=" + contrasenia + ", email=" + email
				+ "]";
	}

}
