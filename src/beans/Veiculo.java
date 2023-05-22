package beans;

public class Veiculo {
	static String nomeVeiculo;
	static int ano;
	static double peso;
	static String placa;
	static double altura;
	static String chassi;
	
	public Veiculo(String nomeVeiculo, int ano, double peso, String placa, double altura, String chassi) {
		Veiculo.nomeVeiculo = nomeVeiculo;
		Veiculo.ano = ano;
		Veiculo.peso = peso;
		Veiculo.placa = placa;
		Veiculo.altura = altura;
		Veiculo.chassi = chassi;
	}
	
	public String getPlaca(String placa) {
		return placa;
	}
	public static void setPlaca(String placa) {
		Veiculo.placa = placa;
	}
	public static String getNomeVeiculo() {
		return nomeVeiculo;
	}
	public static void setNomeVeiculo(String nomeVeiculo) {
		Veiculo.nomeVeiculo = nomeVeiculo;
	}
	public static int getAno() {
		return ano;
	}
	public static void setAno(int ano) {
		Veiculo.ano = ano;
	}
	public static double getPeso() {
		return peso;
	}
	public static void setPeso(double peso) {
		Veiculo.peso = peso;
	}
	public static double getAltura() {
		return altura;
	}
	public static void setAltura(double altura) {
		Veiculo.altura = altura;
	}
	public static String getChassi() {
		return chassi;
	}
	public static void setChassi(String chassi) {
		Veiculo.chassi = chassi;
	}
	public static String getPlaca() {
		return placa;
	}
}
