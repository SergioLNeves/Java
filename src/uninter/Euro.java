package uninter;

public class Euro extends Moeda{
	

	protected Euro(double valor) {
		super(valor);
	}
	
	
	@Override
	public void info() {
		System.out.println("Euro - " + valor);
		
	}

	@Override
	public double converterMoedas() {
		return this.valor * 5.0;
		
	}

}
