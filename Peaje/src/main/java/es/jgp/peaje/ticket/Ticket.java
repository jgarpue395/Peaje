package es.jgp.peaje.ticket;

public abstract class Ticket implements ITicket
{
	protected float kmEntrada;
	
	protected float kmSalida;
	
	protected float kmRecorridos;
	
	public Ticket(float kmEntrada)
	{
		this.kmEntrada = kmEntrada;
	}
	
	public void calcularKmRecorridos(float kmSalida) 
	{
		this.kmSalida = kmSalida;
		this.kmRecorridos = Math.abs(this.kmSalida - this.kmEntrada);
	}
}
