import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int palpites;
		int tentativa=0; 
		System.out.println("Quantos soldados Leonidas vai enfrentar?");
		Scanner soldados = new Scanner (System.in);
		palpites = soldados.nextInt();
		
			while(palpites != 10000) {
				if (palpites < 10000) {
					System.out.println("Um pouco mais");
					tentativa += 1;
					if (tentativa == 6){
						break;
					}
				}else if (palpites > 10000) {
					System.out.println("Um pouco menos");
					tentativa += 1;
					if (tentativa == 6){
						break;
					}
				}
				System.out.println("Tente mais uma vez até acertar");
				palpites = soldados.nextInt();
			}
			System.out.println("vamos lutar contra 10.000 soldados");
		}
}