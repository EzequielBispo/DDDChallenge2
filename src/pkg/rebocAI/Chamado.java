package pkg.rebocAI;
import java.util.*;

public class Chamado {
	static Date HoraAtual = new Date();
	
	static void retornarInformacoes() {
		System.out.println("----------------------------------------------");
		
		System.out.println("Essas são as informações do seu chamado:");
		System.out.println("Horário: " + HoraAtual);
		System.out.println("Nome: " + Segurado.nomeSegurado);
		System.out.println("CPF: " + Segurado.cpf);
		System.out.println("Endereço: " + Local.rua + ", " + Local.numero + " - " + Local.bairro);
		
		System.out.println("----------------------------------------------");
		
		System.out.println("Essas são as informações do seu veículo:");
		System.out.println("Nome: " + Veiculo.nomeVeiculo);
		System.out.println("Ano: " + Veiculo.ano);
		System.out.println("Placa: " + Veiculo.placa);
		System.out.println("Chassi: " + Veiculo.chassi);
		System.out.println("Peso: " + Veiculo.peso);
	}

}
