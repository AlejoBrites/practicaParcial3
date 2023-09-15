package model;

public class Mesa {
	private int idMesa;
	private int numeroMesa;
	private int capacidad;
	
	public Mesa(int numeroMesa, int capacidad) {
		super();
		this.numeroMesa = numeroMesa;
		this.capacidad = capacidad;
	}
	public Mesa(int idMesa, int numeroMesa, int capacidad) {
		super();
		this.setIdMesa(idMesa);
		this.setNumeroMesa(numeroMesa);
		this.setCapacidad(capacidad);
	}
	
	
	
	
	@Override
	public String toString() {
		return "Mesa [idMesa=" + idMesa + ", numeroMesa=" + numeroMesa + ", capacidad=" + capacidad + "]\n";
	}
	public int getIdMesa() {
		return idMesa;
	}
	public void setIdMesa(int idMesa) {
		this.idMesa = idMesa;
	}
	public int getNumeroMesa() {
		return numeroMesa;
	}
	public void setNumeroMesa(int numeroMesa) {
		this.numeroMesa = numeroMesa;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	
}
