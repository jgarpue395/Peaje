package es.jgp.peaje;

import es.jgp.peaje.ticket.Ticket;
import es.jgp.peaje.ticket.TicketEspecial;
import es.jgp.peaje.ticket.TicketGeneral;

public class Main 
{
	public static void main(String[] args) 
	{
		Ticket ticketGeneral = new TicketGeneral(500);
		ticketGeneral.calcularKmRecorridos(0);
		System.out.println(ticketGeneral.toString());
		
		Ticket ticketEspecial = new TicketEspecial(0, 5);
		ticketEspecial.calcularKmRecorridos(500);
		System.out.println(ticketEspecial.toString());
		
		if (ticketGeneral.equals(ticketEspecial))
		{
			System.out.println("Los tickets son iguales");
		}
		else
		{
			System.out.println("Los tickets son diferentes");
		}
	}
}
