package model;

import java.time.LocalDate;

public class Reserva {
	private int idReserva;
	private Cliente clinete;
	private LocalDate fechaReserva;
	private Mesa mesa;
	private int cantComensales;
	
	public Reserva(Cliente clinete, LocalDate fechaReserva, Mesa mesa, int cantComensales) throws Exception {
		super();
		this.setClinete(clinete);
		this.setFechaReserva(fechaReserva);
		this.setMesa(mesa);
		this.setCantComensales(cantComensales);
	}
	
	public Reserva(int idReserva, Cliente clinete, LocalDate fechaReserva, Mesa mesa, int cantComensales) throws Exception {
		super();
		this.setIdReserva(idReserva);
		this.setClinete(clinete);
		this.setFechaReserva(fechaReserva);
		this.setMesa(mesa);
		this.setCantComensales(cantComensales);

	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Reserva [idReserva=" + idReserva + ", clinete=" + clinete + ", fechaReserva=" + fechaReserva + ", mesa="
				+ mesa + ", cantComensales=" + cantComensales + "]\n";
		
		
	}

	public int getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}
	public Cliente getClinete() {
		return clinete;
	}
	public void setClinete(Cliente clinete) {
		this.clinete = clinete;
	}
	public LocalDate getFechaReserva() {
		return fechaReserva;
	}
	public void setFechaReserva(LocalDate fechaReserva) {
		this.fechaReserva = fechaReserva;
	}
	public Mesa getMesa() {
		return mesa;
	}
	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
	public int getCantComensales() {
		return cantComensales;
	}
	public void setCantComensales(int cantComensales) throws Exception {
		
		if(validarComensales(cantComensales)==false) {
			throw new Exception("Error: la cantidad de comensales no puede ser mayor a las capacidad de la mesa");
		}
		
		this.cantComensales = cantComensales;
	}
	
	private boolean validarComensales(int cantComensales) {
		if (cantComensales>mesa.getCapacidad()) {
			return false;
		}
		
		return true;
	}
	
	
}
