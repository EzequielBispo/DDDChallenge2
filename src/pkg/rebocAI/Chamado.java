package pkg.rebocAI;
import java.util.*;

public class Chamado {
	static Date HoraAtual = new Date();
	
	static void retornarInformacoes() {
		System.out.println("----------------------------------------------");
		
		System.out.println("Essas são as informações do seu chamado:");
		System.out.println("Horário: " + HoraAtual);
		System.out.println("Nome: " + Segurado.getNomeSegurado());
		System.out.println("CPF: " + Segurado.getCpf());
		System.out.println("Endereço: " + Local.getRua() + ", " + Local.getNumero() + " - " + Local.getBairro());
		
		System.out.println("----------------------------------------------");
		
		System.out.println("Essas são as informações do seu veículo:");
		System.out.println("Nome: " + Veiculo.getNomeVeiculo());
		System.out.println("Ano: " + Veiculo.getAno());
		System.out.println("Placa: " + Veiculo.getPlaca());
		System.out.println("Chassi: " + Veiculo.getChassi());
		System.out.println("Peso: " + Veiculo.getPeso());
	}

}
