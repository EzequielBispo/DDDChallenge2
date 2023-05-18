package pkg.rebocAI;
import java.util.Scanner;

public class Segurado {
	
	public static void main(String[] args) {
	String nomeSegurado;
	String documento;
	Segurado.abrirChamado();
	}
	static void abrirChamado() {
		Scanner Leitor = new Scanner(System.in);
		
		System.out.println("Insira a placa do Veiculo:");
		Veiculo.placa = Leitor.next();
		
		System.out.println("Insira o chassi do Veiculo:");
		Veiculo.chassi = Leitor.next();
		
		Chamado.retornarInformacoes();

	}
	static void editarChamado() {
		//alguem me explica como isso aqui vai funcionar plmd ass: ezequi
	}
}