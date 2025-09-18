package ar.edu.unq.poo2.tp5;

import java.util.List;

public class Caja {
	
	public double calcularPrecioFinal(List<Pagable> pagables) {
		double precioAPagar = 0;
		
		// return productos.stream().mapToDouble(p -> p.getPrecio()).sum();
		
		for (Pagable pagable : pagables) {
			precioAPagar += pagable.getPrecio();
			pagable.notificarPago();
		}
		return precioAPagar;
	}
	
}
