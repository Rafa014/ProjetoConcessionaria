package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import interfac.InterVeiculo;

public class Veiculo extends Cliente implements InterVeiculo{
	
	private int id;
	private String modelo;
	private String placa;
	private int ano;
	private double motor;
	private double preco;
	private boolean status;
	List<Veiculo> list = new ArrayList<>();
	List<Veiculo> listVendido = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	
	public Veiculo() {

	}
	
	public Veiculo(int id, String modelo, String placa, int ano, double motor, double preco, boolean status) {
		this.id = id;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		this.motor = motor;
		this.preco = preco;
		this.status = status;
	}
	
	public Veiculo(int id, String nome, String cpf, String modelo, String placa, int ano, double motor, double preco,
			boolean status) {
		super(nome, cpf);
		this.id = id;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		this.motor = motor;
		this.preco = preco;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}
	private void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	private void setPlaca(String placa) {
		this.placa = placa;
	}
	private int getAno() {
		return ano;
	}
	private void setAno(int ano) {
		this.ano = ano;
	}
	private double getMotor() {
		return motor;
	}
	private void setMotor(double motor) {
		this.motor = motor;
	}
	private double getPreco() {
		return preco;
	}
	private void setPreco(double preco) {
		this.preco = preco;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public List<Veiculo> getList() {
		return list;
	}
	public void setList(List<Veiculo> list) {
		this.list = list;
	}

	@Override
	public void cadastraVeiculo() {
		System.out.print("Id: ");
		setId(sc.nextInt());
		sc.nextLine();
		System.out.print("Modelo: ");
		setModelo(sc.nextLine());
		System.out.print("Placa: ");
		setPlaca(sc.nextLine());
		System.out.print("Ano: ");
		setAno(sc.nextInt());
		System.out.print("Motor: ");
		setMotor(sc.nextDouble());
		System.out.print("R$: ");
		setPreco(sc.nextDouble());
		list.add(new Veiculo(getId(),getModelo(),getPlaca(),getAno(),getMotor(),getPreco(),false));
	}

	@Override
	public void stringVeiculo() {
		for (Veiculo v : list) {
			if (!v.getStatus()) {
				System.out.println("ID: "+v.getId());
				System.out.println("MODELO: "+v.getModelo());
	    		System.out.println("PLACA: "+v.getPlaca());
	    		System.out.println("ANO: "+v.getAno());
	    		System.out.println("MOTOR: "+v.getMotor());
	    		System.out.println("R$: "+v.getPreco());
	    		System.out.println("Disponivel!");
	    		System.out.println("-------------------------------");
			}
		}
	}

	@Override
	public void vendeVeiculo() {
		stringVeiculo();
		System.out.println("Digite o id do veiculo: ");
		int escolha = sc.nextInt();
		boolean se = false;
		for (Veiculo v: list) {
			if(v.getId() == escolha) {
				v.setStatus(true);
				cadastraCliente();
				listVendido.add(new Veiculo(v.getId(),getNome(),getCpf(),v.getModelo(),v.getPlaca(),v.getAno(),v.getMotor(),v.getPreco(), true));
				System.out.println("COMPRA REALIZADA COM SUCESSO!");
				//list.remove(v);
				se = true;
			}
		}
		if (!se) {
			System.out.println("ERRO AO REALIZAR A COMPRA!");
		}
	}

	@Override
	public void stringVendido() {
		for (Veiculo v : listVendido) {
			System.out.println("COMPRADOR: "+v.getNome());
			System.out.println("CPF: "+v.getCpf());
			System.out.println("DADOS DO CARRO: ");
			System.out.println("Id: "+v.getId());
			System.out.println("Modelo: "+v.getModelo());
	    	System.out.println("Placa: "+v.getPlaca());
	    	System.out.println("Ano: "+v.getAno());
	    	System.out.println("Motor: "+v.getMotor());
	    	System.out.println("R$: "+v.getPreco());
	    	System.out.println("-------------------------------");
		}
		
	}
	
	
}
