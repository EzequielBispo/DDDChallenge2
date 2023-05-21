package pkg.rebocAI;

public class Carga extends Veiculo {
	static float pesoCarga;
	static String tipoCarga;
	
	public Carga(String nomeVeiculo, int ano, double peso, String placa, double altura, String chassi, float pesoCarga, String tipoCarga) {
		super(nomeVeiculo, ano, altura, tipoCarga, altura, tipoCarga);
		Carga.pesoCarga = pesoCarga;
		Carga.tipoCarga = tipoCarga;
	}

	public static float getPesoCarga() {
		return pesoCarga;
	}

	public void setPesoCarga(float pesoCarga) {
		this.pesoCarga = pesoCarga;
	}

	public static String getTipoCarga() {
		return tipoCarga;
	}

	public void setTipoCarga(String tipoCarga) {
		this.tipoCarga = tipoCarga;
	}
	
	
}
