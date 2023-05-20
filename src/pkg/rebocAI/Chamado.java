package pkg.rebocAI;
import java.util.*;

public class Chamado {
	static Date HoraAtual = new Date();
	
	static void retornarInformacoes() {
		System.out.println("Essas são as informações do seu chamado:");
		System.out.println(HoraAtual);
		System.out.println("Nome: " + Segurado.nomeSegurado);
		System.out.println("CPF: " + Segurado.cpf);
		System.out.println("Endereço: " + Local.rua + ", " + Local.numero + " - " + Local.bairro);
		
	}
}
