package uninter;

public class Real extends Moeda{
	
	protected Real(double valor) {
		super(valor);
	}
	
	@Override
	public void info() {
		System.out.println("Real - "+ valor);
		
	}

	@Override
	public double converterMoedas() {
		return this.valor;	
	}

	
}
