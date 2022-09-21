package es.jgp.peaje.utils;

public class PeajeException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public PeajeException()
	{
		super();
	}
	
	public PeajeException(String mensaje)
	{
		super(mensaje);
	}
}
