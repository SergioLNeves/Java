import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int peso;
		double altura;
		double imc;
		
		
		System.out.println("Digite o peso e depois sua altura: ");
		Scanner teclado = new Scanner (System.in);
		peso = teclado.nextInt();
		altura = teclado.nextDouble();
		imc = peso/(altura*altura);
		
		
		if (imc > 0) {
			if (imc <= 18.5) {
				System.out.println("Abaixo do Peso");
			}else if(imc >= 18.6 && imc <= 24.9) {
				System.out.println("Peso na Media");
			}else if (imc >= 25 && imc <= 29.9) {
				System.out.println("Sobrepeso");
			}else if (imc >= 30 && imc <= 34.9) {
				System.out.println("Obesidade I");
			}else if (imc >= 35 && imc <= 39.9) {
				System.out.println("Obesidade II");
			}else if (imc >= 40){
				System.out.println("Obesidade III");
			}
		}else {
			System.out.println("Valor de Peso ou Altura inválido para calcular o IMC");
		}
		
	}

}
