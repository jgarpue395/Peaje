package es.jgp.peaje.ticket;

public interface ITicket 
{
	public abstract float calcularDescuento(double kmSalida);
	
	public abstract float calcularPrecio();
}
