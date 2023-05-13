package pkg.rebocAI;

public class Veiculo {
	String nomeVeiculo;
	int ano;
	double peso;
	String placa;
	double altura;
	int chassi;
	float cargaVeiculo;
	String tipoCarga;
	
	Veiculo(String nomeVeiculo, int ano, double peso, String placa, double altura, int chassi, float cargaVeiculo, String tipoCarga){
		this.nomeVeiculo = nomeVeiculo;
		this.ano = ano;
		this.peso = peso;
		this.placa = placa;
		this.altura = altura;
		this.chassi = chassi;
		this.cargaVeiculo = cargaVeiculo;
		this.tipoCarga = tipoCarga;
		
		//meter um get e setter aqui, nao esquecer
	}
}
