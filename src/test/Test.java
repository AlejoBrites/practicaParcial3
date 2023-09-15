package test;

import java.time.LocalDate;

import model.SistemaRestaurante;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SistemaRestaurante s= new SistemaRestaurante();
		
		System.out.println("Test 1: Agregar cliente");
		try {
			s.agregarCliente("Rodrigo", "Sanchez", 32694053, "+541179456274");
			s.agregarCliente("Adriana", "Diaz", 31953256, "+541109462742");
			s.agregarCliente("Marcos", "Garcia", 34096528, "+541188345186");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println(s.getLstClientes());
		
		System.out.println("Test 3: Agregar mesa");
		
		try {
			s.agregarMesa(1, 2);
			s.agregarMesa(2, 2);
			s.agregarMesa(3, 4);
			s.agregarMesa(4, 6);
			s.agregarMesa(5, 4);
			s.agregarMesa(6, 2);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println(s.getLstMesas());
		
		System.out.println("Test 3: Agregar reserva");
		
		try {
			s.agregarReserva(s.traerCliente(32694053), LocalDate.of(2023, 8, 15), s.traerMesa(1), 2);
			s.agregarReserva(s.traerCliente(31953256), LocalDate.of(2023, 8, 15), s.traerMesa(4), 4);
			s.agregarReserva(s.traerCliente(34096528), LocalDate.of(2023, 8, 25), s.traerMesa(5), 4);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println(s.getLsrReservas());
		
		System.out.println("Test 4: Traer reservas entre fechas");
		
		System.out.println(s.traerReservasPorFechas(LocalDate.of(2023, 8, 15), LocalDate.of(2023, 8, 20)));
		
		System.out.println("Test 5: Traer mesas libres por fecha");
		
		System.out.println(s.traerMesasLibresPorFechas(LocalDate.of(2023, 8, 15)));
		
		System.out.println("Test 6");
		try {
			s.agregarCliente("Adriana", "Diaz", 31953256, "+541109462742");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("Test 7");
		try {
			s.agregarMesa(3, 4);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		System.out.println("Test 8");
		
		try {
			s.agregarReserva(s.traerCliente(32694053), LocalDate.of(2023, 8, 25), s.traerMesa(5), 4);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		
		System.out.println("Test 9");
		
		try {
			s.agregarReserva(s.traerCliente(31953256), LocalDate.of(2023, 8, 15), s.traerMesa(6), 4);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
