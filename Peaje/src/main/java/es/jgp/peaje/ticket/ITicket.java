package es.jgp.peaje.ticket;

import es.jgp.peaje.utils.PeajeException;

public interface ITicket 
{
	public void calcularKmRecorridos(float kmSalida) throws PeajeException;
}
