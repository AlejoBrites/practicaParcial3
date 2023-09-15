package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaRestaurante {
	private List<Cliente> lstClientes;
	private List<Mesa> lstMesas;
	private List<Reserva> lsrReservas;

	public SistemaRestaurante() {
		super();
		this.lstClientes = new ArrayList<Cliente>();
		this.lstMesas = new ArrayList<Mesa>();
		this.lsrReservas = new ArrayList<Reserva>();
	}

	public List<Reserva> traerReservasPorFechas(LocalDate fechadesde, LocalDate fechaHasta) {

		List<Reserva> auxRes = new ArrayList<Reserva>();

		for (int i = 0; i < lsrReservas.size(); i++) {

			if ((lsrReservas.get(i).getFechaReserva().isAfter(fechadesde)
					|| lsrReservas.get(i).getFechaReserva().equals(fechadesde))
					&& (lsrReservas.get(i).getFechaReserva().isBefore(fechaHasta)
							|| lsrReservas.get(i).getFechaReserva().equals(fechaHasta))) {
				auxRes.add(lsrReservas.get(i));
			}

		}
		return auxRes;
	}

	public List<Mesa> traerMesasLibresPorFechas(LocalDate fecha) {
		List<Mesa> auxMesas = new ArrayList<Mesa>();

		for (int i = 0; i < lstMesas.size(); i++) {

			if (traerReserva(lstMesas.get(i).getNumeroMesa(), fecha) == null) {
				auxMesas.add(lstMesas.get(i));
			}

		}

		return auxMesas;
	}

	public Reserva traerReserva(int numMesa, LocalDate fechaReserva) {
		boolean reservaEncon = false;
		Reserva reservaBus = null;
		int i = 0;
		while (i < lsrReservas.size() && !reservaEncon) {

			if ((lsrReservas.get(i).getMesa().getNumeroMesa() == numMesa)
					&& (lsrReservas.get(i).getFechaReserva().equals(fechaReserva))) {
				reservaEncon = true;
				reservaBus = lsrReservas.get(i);
			}

			i++;
		}
		return reservaBus;
	}

	public boolean agregarReserva(Cliente clinete, LocalDate fechaReserva, Mesa mesa, int cantComensales)
			throws Exception {

		if (traerReserva(mesa.getNumeroMesa(), fechaReserva) != null) {
			throw new Exception("Error: La mesa ya esta reservada");
		}

		int id = 1;
		if (lsrReservas.size() > 0) {
			int tam = lsrReservas.size();
			id = lsrReservas.get(tam - 1).getIdReserva() + 1;
		}

		return lsrReservas.add(new Reserva(id, clinete, fechaReserva, mesa, cantComensales));
	}

	public Mesa traerMesa(int numMesa) {
		boolean mesaEncon = false;
		Mesa mesaBus = null;
		int i = 0;
		while (i < lstMesas.size() && !mesaEncon) {

			if (lstMesas.get(i).getNumeroMesa() == numMesa) {
				mesaEncon = true;
				mesaBus = lstMesas.get(i);
			}

			i++;
		}
		return mesaBus;
	}

	public boolean agregarMesa(int numeroMesa, int capacidad) throws Exception {

		if (traerMesa(numeroMesa) != null) {
			throw new Exception("Error: el numero de mesa ya existe");
		}

		int id = 1;
		if (lstMesas.size() > 0) {
			int tam = lstMesas.size();
			id = lstMesas.get(tam - 1).getIdMesa() + 1;
		}

		return lstMesas.add(new Mesa(id, numeroMesa, capacidad));
	}

	public Cliente traerCliente(long dni) {
		boolean clienteEcon = false;
		Cliente clienteBus = null;
		int i = 0;
		while (i < lstClientes.size() && !clienteEcon) {

			if (lstClientes.get(i).getDni() == dni) {
				clienteEcon = true;
				clienteBus = lstClientes.get(i);
			}

			i++;
		}
		return clienteBus;
	}

	public boolean agregarCliente(String nombre, String apellido, long dni, String telefono) throws Exception {

		if (traerCliente(dni) != null) {
			throw new Exception("Error: el cliente ya existe");
		}

		int id = 1;
		if (lstClientes.size() > 0) {
			int tam = lstClientes.size();
			id = lstClientes.get(tam - 1).getIdCliente() + 1;
		}

		return lstClientes.add(new Cliente(id, nombre, apellido, dni, telefono));
	}

	public List<Cliente> getLstClientes() {
		return lstClientes;
	}

	public void setLstClientes(List<Cliente> lstClientes) {
		this.lstClientes = lstClientes;
	}

	public List<Mesa> getLstMesas() {
		return lstMesas;
	}

	public void setLstMesas(List<Mesa> lstMesas) {
		this.lstMesas = lstMesas;
	}

	public List<Reserva> getLsrReservas() {
		return lsrReservas;
	}

	public void setLsrReservas(List<Reserva> lsrReservas) {
		this.lsrReservas = lsrReservas;
	}

}
