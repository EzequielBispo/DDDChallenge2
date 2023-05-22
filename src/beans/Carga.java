package beans;

public class Carga extends Veiculo {
	static String pesoCarga;
	static String tipoCarga;
	
	public Carga(String nomeVeiculo, int ano, double peso, String placa, double altura, String chassi, String pesoCarga, String tipoCarga) {
		super(nomeVeiculo, ano, altura, tipoCarga, altura, tipoCarga);
		Carga.pesoCarga = pesoCarga;
		Carga.tipoCarga = tipoCarga;
	}

	public static String getPesoCarga() {
		return pesoCarga;
	}

	public void setPesoCarga(String pesoCarga) {
		this.pesoCarga = pesoCarga;
	}

	public static String getTipoCarga() {
		return tipoCarga;
	}

	public void setTipoCarga(String tipoCarga) {
		this.tipoCarga = tipoCarga;
	}
	
	
}
