package uninter;

public class Dolar extends Moeda{

	protected Dolar(double valor) {
		super(valor);
	}
	
	
	@Override
	public void info() {
		System.out.println("Dolar - " + valor);
		
	}

	@Override
	public double converterMoedas() {
		return this.valor * 5.5;
		
	}




}