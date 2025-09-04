package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter{
	
	ArrayList<Integer> lista;
	
	public Counter() {
		this.lista = new ArrayList<>();
	}
	
	public int contarPares() {
		int contador = 0;
		for (int num : lista) {
			if (num % 2 == 0) {
				contador++;
			}
		}
		return contador;
	}
	
	public int contarImpares() {
		int contador = 0;
		for (int num : lista) {
			if (num % 2 == 1) {
				contador++;
			}
		}
		return contador;
	}
	
	public int contarMultiplos(int numero) {
		int contador = 0;
		for (int num : lista) {
			if (num % numero == 0) {
				contador++;
			}
		}
		return contador;
	}

	public void addNumber(int i) {
		
		this.lista.add(i);
		
	}
	
}