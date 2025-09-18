package ar.edu.unq.poo2.tp5;

public class Producto implements Pagable {
	private double precio;
	private int stock;
	
	public Producto(double precio, int stock) {
		this.precio = precio;
		this.stock = stock;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	public void notificarPago() {
		this.stock = getStock() - 1;
	}
	
}
