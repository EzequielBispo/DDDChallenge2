package pkg.rebocAI;
import java.util.Scanner;

public class Segurado {
	
	static String nomeSegurado;
	static String cpf;
	
	public Segurado(String nomeSegurado, String cpf) {
		this.nomeSegurado = nomeSegurado;
		this.cpf = cpf;
	}
	
	
	public static void main(String[] args) {
	Segurado.abrirChamado();
	}
	static void abrirChamado() {
		Scanner Leitor = new Scanner(System.in);
		
		System.out.println("Insira a placa do Veiculo:");
		Veiculo.placa = Leitor.nextLine();
		
		System.out.println("Insira seu CPF:");
		Segurado.cpf = Leitor.nextLine();
		
		System.out.println("Qual é o seu endereço? Insira o nome da rua:");
		Local.rua = Leitor.nextLine();
		
		System.out.println("Qual é o número?:");
		Local.numero = Leitor.nextLine();
		
		System.out.println("Qual é o bairro?:");
		Local.bairro = Leitor.nextLine();
		
		System.out.println("Qual é o cep?:");
		Local.cep = Leitor.nextLine();
		
		Chamado.retornarInformacoes();

	}
	static void editarChamado() {
		//alguem me explica como isso aqui vai funcionar plmd ass: ezequi
	}
}