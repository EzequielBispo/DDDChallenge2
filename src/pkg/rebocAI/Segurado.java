package pkg.rebocAI;
import java.util.Scanner;

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
		Veiculo UmVeiculo = new Veiculo("Onix", 2015, 10.5, "609F-10", 1.23, "4983275983279587");
		Local UmLocal = new Local();
		
		System.out.println("Insira seu CPF:");
		UmSegurado.setCpf(Leitor.nextLine());
		
		System.out.println("Insira a placa do Veiculo:");
		UmVeiculo.setPlaca(Leitor.nextLine());

		if (Segurado.nomeSegurado == null) {
			System.out.println("Insira seu nome:");
			UmSegurado.setNomeSegurado(Leitor.nextLine());
		} else {
			System.out.println("deu else");
		}
		
		System.out.println("Qual é o seu endereço? Insira o nome da rua:");
		Local.setRua(Leitor.nextLine());
		
		System.out.println("Qual é o número?:");
		Local.setNumero(Leitor.nextLine());
		
		System.out.println("Qual é o bairro?:");
		Local.setBairro(Leitor.nextLine());
		
		System.out.println("Qual é o cep?:");
		Local.setCep(Leitor.nextLine());
		
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