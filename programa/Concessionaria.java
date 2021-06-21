package programa;

import java.util.Scanner;

import entidades.Veiculo;

public class Concessionaria{

	public static void main(String[] args) {
		
		Veiculo v = new Veiculo();
		Scanner sc = new Scanner (System.in);
		int opcao;
		do {
			menu();
			do {
				System.out.print("Digite uma opcao: ");
				opcao = sc.nextInt();
				sc.nextLine();
				if(!validaMenu(opcao))
					System.out.println("Opcao invalida, tente novamente...");
			}while (!validaMenu(opcao));
			
			switch (opcao) {
			case 1:
				System.out.println("\n------------------ CADASTRA VEICULO ------------------\n");
				v.cadastraVeiculo();
				break;
			case 2:
				System.out.println("\n------------------ VENDER VEICULO ------------------\n");
				v.vendeVeiculo();
				break;
			case 3:
				System.out.println("\n------------------ LISTA DE VEICULOS ------------------\n");
				v.stringVeiculo();
				break;
			case 4: 
				System.out.println("\n------------------ LISTA DE VEICULOS VENDIDOS ------------------\n");
				v.stringVendido();
				break;
			}
		}while (opcao != 0);	
		sc.close();
}

	public static void menu() {
		System.out.println("CONCESSIONARIA R & L");
		System.out.println("\t\tMENU");
		System.out.println("1. Cadastra Veiculo");
		System.out.println("2. Vender Veiculo");
		System.out.println("3. Lista Veiculos");
		System.out.println("4. Lista de Veiculos Vendidos");
		System.out.println("0. Sair");
	}
	
	public static boolean validaMenu(int opcao) {
		if (opcao > 4 || opcao < 0)
			return false;
		else return true;
	}
}
