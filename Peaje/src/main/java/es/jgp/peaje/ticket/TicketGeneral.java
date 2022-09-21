package es.jgp.peaje.ticket;

import es.jgp.peaje.utils.Constantes;
import es.jgp.peaje.utils.PeajeException;

public class TicketGeneral extends Ticket
{
	public TicketGeneral(float kmEntrada) throws PeajeException 
	{
		super(kmEntrada);
	}
	
	public final float calcularDescuento(double kmRecorridos) 
	{
		float descuento = 0;
		
		while (kmRecorridos >= 500)
		{
			descuento += Constantes.DESCUENTO_GENERAL;
			kmRecorridos -= 500;
		}
		
		return descuento;
	}
	
	public final float calcularPrecio() 
	{
		float precio = (super.kmRecorridos * Constantes.PRECIO_POR_KM);
		
		float precioFinal = precio - (precio * calcularDescuento(super.kmRecorridos));
		
		return precioFinal;
	}
	
	@Override
	public String toString() 
	{
		return "El vehiculo general que entro en el km " + super.kmEntrada + " y salio en el km " + super.kmSalida + " debe pagar " + calcularPrecio();
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
        
        final TicketGeneral other = (TicketGeneral)obj;
        
        if (super.kmEntrada != other.kmEntrada)
        {
        	if (super.kmSalida != other.kmSalida)
        	{
        		return false;
        	}
        }
        return true;
	}
}
