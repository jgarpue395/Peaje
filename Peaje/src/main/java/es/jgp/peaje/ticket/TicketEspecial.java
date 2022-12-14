package es.jgp.peaje.ticket;

import es.jgp.peaje.utils.Constantes;
import es.jgp.peaje.utils.PeajeException;

public class TicketEspecial extends Ticket
{
	private int pasajeros;
	
	public TicketEspecial(float kmEntrada, int pasajeros) throws PeajeException 
	{
		super(kmEntrada);
		this.pasajeros = pasajeros;
	}

	@Override
	protected final float calcularDescuento(double kmRecorridos) 
	{
		float descuento = 0;
		
		if (kmRecorridos >= 100)
		{
			descuento += Constantes.DESCUENTO_ESPECIAL;
		}
		
		return descuento;
	}
	
	@Override
	protected final float calcularPrecio() 
	{
		float precio = (super.kmRecorridos * Constantes.PRECIO_POR_KM * this.pasajeros);
		
		float precioFinal = precio - (precio * calcularDescuento(super.kmRecorridos));
		
		return precioFinal;
	}
	
	@Override
	public String toString() 
	{
		return "El vehiculo especial que entro en el km " + super.kmEntrada + " y salio en el km " + super.kmSalida + " debe pagar " + calcularPrecio();
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj) 
		{
			return true;
		}
		
        if (obj == null) 
        {
        	return false;
        }
        
        final TicketEspecial other = (TicketEspecial)obj;
        
        if (super.kmEntrada != other.kmEntrada)
        {
        	if (super.kmSalida != other.kmSalida)
        	{
        		if (this.pasajeros != other.pasajeros)
            	{
            		return false;
            	}
        	}
        }
        return true;
	}
}
