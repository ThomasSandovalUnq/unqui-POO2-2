package ar.edu.unq.poo2.tp5;

public class FacturaServicio extends Factura {
	private int cantidad;
	private double costo;
	
	public FacturaServicio(Agencia agencia, int cantidad, double costo) {
		super(agencia);
		this.cantidad = cantidad;
		this.costo = costo;
	}

	@Override
	public double getPrecio() {
		return cantidad * costo;
	}

}
