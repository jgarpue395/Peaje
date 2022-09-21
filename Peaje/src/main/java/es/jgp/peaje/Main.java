package es.jgp.peaje;

import es.jgp.peaje.ticket.Ticket;
import es.jgp.peaje.ticket.TicketEspecial;
import es.jgp.peaje.ticket.TicketGeneral;
import es.jgp.peaje.utils.PeajeException;

public class Main 
{
	public static void main(String[] args) 
	{
		try
		{
			Ticket ticketGeneral = new TicketGeneral(500);
			ticketGeneral.calcularKmRecorridos(05);
			System.out.println(ticketGeneral.toString());
			
			Ticket ticketGeneral2 = new TicketGeneral(200);
			ticketGeneral2.calcularKmRecorridos(400);
			System.out.println(ticketGeneral2.toString());
			
			Ticket ticketEspecial = new TicketEspecial(0, 5);
			ticketEspecial.calcularKmRecorridos(500);
			System.out.println(ticketEspecial.toString());
			
			Ticket ticketEspecial2 = new TicketEspecial(36, 7);
			ticketEspecial2.calcularKmRecorridos(55);
			System.out.println(ticketEspecial2.toString());
			
			if (ticketGeneral.equals(ticketGeneral2))
			{
				System.out.println("Los tickets son iguales");
			}
			else
			{
				System.out.println("Los tickets son diferentes");
			}
			
			if (ticketEspecial.equals(ticketEspecial2))
			{
				System.out.println("Los tickets son iguales");
			}
			else
			{
				System.out.println("Los tickets son diferentes");
			}
		}
		catch (PeajeException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
