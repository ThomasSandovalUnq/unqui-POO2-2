package ar.edu.unq.poo2.tp5;

public class FacturaImpuesto extends Factura {
	private double tasaDeServicio;
	
	
	public FacturaImpuesto(Agencia agencia, double tasaDeServicio) {
		super(agencia);
		this.tasaDeServicio = tasaDeServicio;
	}


	@Override
	public double getPrecio() {
		return tasaDeServicio;
	}

}
