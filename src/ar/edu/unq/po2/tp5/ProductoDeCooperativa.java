package ar.edu.unq.poo2.tp5;

public class ProductoDeCooperativa extends Producto{
	
	public ProductoDeCooperativa(double precio, int stock) {
		super(precio, stock);
	}
	
	@Override
	public double getPrecio() {
		return super.getPrecio()*0.9;
	}
	
}
