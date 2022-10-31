package uninter;

import java.util.Scanner;

public class Menu {
	
	private Scanner sc;
	private Cofrinho cofrinho;
	
	
	public Menu() {
		cofrinho = new Cofrinho();
		sc = new Scanner(System.in);	
	}
	
	public void mostrarMenu() {
		System.out.println("Sergio-Cofre");
		System.out.println("1-Adicionar Moedas");
		System.out.println("2-Remover Moedas");
		System.out.println("3-Contagem de Moedas");
		System.out.println("4-Calcular todo o valor em real");
		System.out.println("0-Sair");
		String selecionarMenu = sc.next();
		
		
		switch (selecionarMenu) {
		//Chamamos o metodo adicionarMoedas e após concluir a adição, mostra o menu novamente
		case "1": 
			adicionarMoedas();
			mostrarMenu();
			break;
			
		//Chamamos o metodo removerMoedas e após concluir a remoção, mostra o menu novamente
		case "2":
			removerMoedas();
			mostrarMenu();
			break;
			
		//Lista todas as moedas dentro da array
		case "3":
			cofrinho.contagemMoedas();
			mostrarMenu();
			break;
			
		//Soma de todas as moedas que estão presente no metodo conversão e a apresentação delas
		case "4":
			double totalConvertido = cofrinho.totalConvertido();
			System.out.printf("Total de Moedas em Real: %.2f \n", totalConvertido);
			mostrarMenu();
			break;
			
		//sair
		case "0":
			break;
		default:
			System.out.println("Voce selecionou uma opcao inexistente");
			mostrarMenu();
			break;
		}
		
	}
	
	private void adicionarMoedas() {
		System.out.println("Escolha a Moeda");
		System.out.println("1 - Real");
		System.out.println("2 - Dolar");
		System.out.println("3 - Euro");
		int selecionarMoeda = sc.nextInt();
		System.out.println("Digite o valor" );
		double valorMoeda = sc.nextDouble();
		

		Moeda moeda = null;
		
		if (selecionarMoeda == 1) {
			moeda = new Real (valorMoeda);
	
		} else if (selecionarMoeda == 2) {
			moeda = new Dolar (valorMoeda);
			
		}else if (selecionarMoeda == 3) {
			moeda = new Euro (valorMoeda);
			
		}else {
			System.out.println("Moeda Invalida");
			mostrarMenu();
		}
		//adicionar moedas na array
		cofrinho.adicionar(moeda);
		System.out.println("Adicao feita com Sucesso!");
		
	}

	private void removerMoedas() {
		System.out.println("Escolha a Moeda");
		System.out.println("1 - Real");
		System.out.println("2 - Dolar");
		System.out.println("3 - Euro");
		int selecionarMoeda = sc.nextInt();
		System.out.println("Digite o valor" );
		double valorMoeda = sc.nextDouble();
		

		Moeda moeda = null;
		
		if (selecionarMoeda == 1) {
			moeda = new Real (valorMoeda);
	
		} else if (selecionarMoeda == 2) {
			moeda = new Dolar (valorMoeda);
			
		}else if (selecionarMoeda == 3) {
			moeda = new Euro (valorMoeda);
			
		}else {
			System.out.println("Moeda Invalida");
			mostrarMenu();
		}
		//remover moedas na array
		cofrinho.remover(moeda);
		System.out.println("Moeda retirada com Sucesso!");
		}
	
}