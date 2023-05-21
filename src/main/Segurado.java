package main;
import java.util.Scanner;

import beans.Carga;
import beans.Chamado;
import beans.Local;
import beans.Veiculo;

public class Segurado {
	
	static String nomeSegurado;
	static String cpf;
	
	public Segurado(String nomeSegurado, String cpf) {
		Segurado.nomeSegurado = nomeSegurado;
		Segurado.cpf = cpf;
	}
	
	public static void main(String[] args) {
	Segurado.abrirChamado();
	}
	
	static void abrirChamado() {
		Scanner Leitor = new Scanner(System.in);
		
		Segurado UmSegurado = new Segurado("Ezequiel Bispo", "");
		Veiculo UmVeiculo = new Veiculo("Onix", 2015, 10.5, "", 1.23, "4983275983279587");
		Carga UmaCarga = new Carga("", 0, 2.5, "Arroz", 0, "", 0, "");
		Local UmLocal = new Local();
		
		if (Segurado.getCpf() == "") {
			System.out.println("Insira seu CPF:");
			Segurado.setCpf(Leitor.nextLine());
		}
		
		if (Veiculo.getPlaca() == "") {
			System.out.println("Insira a placa do Veiculo:");
			Veiculo.setPlaca(Leitor.nextLine());
		}
	
		if (Local.getRua() == null) {
			System.out.println("Qual é o seu endereço? Insira o nome da rua:");
			Local.setRua(Leitor.nextLine());
		}
		
		if (Local.getNumero() == null) {
			System.out.println("Qual é o número?:");
			Local.setNumero(Leitor.nextLine());
		}
		
		if (Local.getBairro() == null) {
			System.out.println("Qual é o bairro?:");
			Local.setBairro(Leitor.nextLine());
		}
		
		if (Local.getCep() == null) {
			System.out.println("Qual é o cep?:");
			Local.setCep(Leitor.nextLine());
		}
		
		Chamado.retornarInformacoes();

	}
	public static void setCpf(String cpf) {
		Segurado.cpf = cpf;
	}
	public static String getCpf() {
		return cpf;
	}
	public static String getNomeSegurado() {
		return nomeSegurado;
	}
	public static void setNomeSegurado(String nomeSegurado) {
		Segurado.nomeSegurado = nomeSegurado;
	}
}