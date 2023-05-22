package main;
import java.util.Scanner;

import beans.Carga;
import beans.Chamado;
import beans.Local;
import beans.Sinistro;
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
		
		Segurado UmSegurado = new Segurado("", "");
		Veiculo UmVeiculo = new Veiculo("", 0, 0, "", 0, "");
		Sinistro UmSinistro = new Sinistro("", "");
		Carga UmaCarga = new Carga("", 0, 0, "", 0, "", "", "");
		Local UmLocal = new Local();
		
		UmVeiculo.setNomeVeiculo("Onix");
		UmVeiculo.setAno(2015);
		UmVeiculo.setPeso(2.7);
		UmVeiculo.setAltura(1.43);
		UmVeiculo.setChassi("948728759873");
		
		UmaCarga.setPesoCarga("68.3");
		UmaCarga.setTipoCarga("Arroz");
		
		
		
		if (UmSegurado.getCpf() == "") {
			System.out.println("Insira seu CPF:");
			UmSegurado.setCpf(Leitor.nextLine());
		}
		
		if (UmSinistro.getSinistroEscolhido() == "") {
			System.out.println("Digite o número de acordo com a sua situação:\n[1]Batida [2]Pane Elétrica [3]Desastres Naturais");
			UmSinistro.setDigitoSinistro(Leitor.nextLine());
			UmSinistro.escolhaSinistro();
		}
		
		if (UmVeiculo.getPlaca() == "") {
			System.out.println("Insira a placa do Veiculo:");
			UmVeiculo.setPlaca(Leitor.nextLine());
		}
		
		if (UmaCarga.getPesoCarga() == "") {
			System.out.println("Insira o peso da carga:");
			UmaCarga.setPesoCarga(Leitor.nextLine());
		}
		
		if (UmLocal.getRua() == null) {
			System.out.println("Qual é o seu endereço? Insira o nome da rua:");
			UmLocal.setRua(Leitor.nextLine());
		}
		
		if (UmLocal.getNumero() == null) {
			System.out.println("Qual é o número?:");
			UmLocal.setNumero(Leitor.nextLine());
		}
		
		if (UmLocal.getBairro() == null) {
			System.out.println("Qual é o bairro?:");
			UmLocal.setBairro(Leitor.nextLine());
		}
		
		if (UmLocal.getCep() == null) {
			System.out.println("Qual é o cep?:");
			UmLocal.setCep(Leitor.nextLine());
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