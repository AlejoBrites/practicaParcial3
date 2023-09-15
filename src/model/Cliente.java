package model;

public class Cliente {
	private int idCliente;
	private String nombre;
	private String apellido;
	private long dni;
	private String telefono;
	
	public Cliente(int idCliente, String nombre, String apellido, long dni, String telefono) {
		super();
		this.setIdCliente(idCliente);
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDni(dni);
		this.setTelefono(telefono);
	}
	public Cliente(String nombre, String apellido, long dni, String telefono) {
		super();
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDni(dni);
		this.setTelefono(telefono);
	}
	
	
	
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", telefono=" + telefono + "]\n";
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
