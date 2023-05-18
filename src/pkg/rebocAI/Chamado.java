package pkg.rebocAI;
import java.util.*;

public class Chamado {
	static Date HoraAtual = new Date();
	
	static void retornarInformacoes() {
		System.out.println("Essas são as informações do seu chamado:");
		System.out.println(HoraAtual);
		System.out.println(Veiculo.nomeVeiculo);
		System.out.println(Veiculo.placa);
		System.out.println(Local.endereco + ", " + Local.numero + " - " + Local.bairro);
		
	}
}
