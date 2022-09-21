package es.jgp.peaje.ticket;

import es.jgp.peaje.utils.PeajeException;

public abstract class Ticket implements ITicket
{
	protected float kmEntrada;
	
	protected float kmSalida;
	
	protected float kmRecorridos;
	
	public Ticket(float kmEntrada) throws PeajeException
	{
		if (kmEntrada < 0)
		{
			throw new PeajeException("No puedes entrar en un km negativo");
		}
		
		this.kmEntrada = kmEntrada;
	}
	
	public void calcularKmRecorridos(float kmSalida) throws PeajeException 
	{
		if (kmSalida < 0)
		{
			throw new PeajeException("No puedes salir en un km negativo");
		}
		
		this.kmSalida = kmSalida;
		
		this.kmRecorridos = Math.abs(this.kmSalida - this.kmEntrada);
	}
}
