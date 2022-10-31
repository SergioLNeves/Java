package uninter;

import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Moeda> listarMoedas = new ArrayList<Moeda>();

	
	public void adicionar(Moeda moeda) {
		this.listarMoedas.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		this.listarMoedas.remove(moeda);
	}
	
	public void contagemMoedas() {
		
		if (this.listarMoedas.isEmpty()) {
			System.out.println("O Cofre esta vazio");
			return;
		}
		
		for (Moeda moeda : this.listarMoedas) {
			moeda.info();
		}
	}

	public double totalConvertido() {
		if (this.listarMoedas.isEmpty()) {
			return 0;
		}
		
		double valorTotal = 0;
		for (Moeda moeda : this.listarMoedas) {
			valorTotal = valorTotal + moeda.converterMoedas();
		}
		return valorTotal;
	}

	

}