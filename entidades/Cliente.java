package entidades;

import java.util.Scanner;

import interfac.interCliente;

public class Cliente implements interCliente{

	private String nome;
	private String cpf;
	private Scanner sc = new Scanner(System.in);
	
	public Cliente() {

	}
	
	
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public Cliente cadastraCliente() {
		System.out.print("Nome: ");
		setNome(sc.nextLine());
		System.out.print("CPF: ");
		setCpf(sc.nextLine());
		return new Cliente(getNome(),getCpf());
	}
	
}
