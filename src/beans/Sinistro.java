package beans;

public class Sinistro {
	public static String digitoSinistro;
	public static String sinistroEscolhido = "";
	
	public void escolhaSinistro() {
		
		switch (Sinistro.digitoSinistro) {
		case "1":
			Sinistro.sinistroEscolhido = "Batida";
			break;
			
		case "2":
			Sinistro.sinistroEscolhido = "Pane Elétrica";
			break;
			
		case "3":
			Sinistro.sinistroEscolhido = "Desastres Naturais";
			break;
		}
		
	}
	
	public Sinistro(String digitoSinistro, String sinistroEscolhido) {
		this.digitoSinistro = digitoSinistro;
		this.sinistroEscolhido = sinistroEscolhido;
	}
	
	public String getDigitoSinistro() {
		return digitoSinistro;
	}

	public void setDigitoSinistro(String digitoSinistro) {
		this.digitoSinistro = digitoSinistro;
	}

	public static String getSinistroEscolhido() {
		return sinistroEscolhido;
	}

	public void setSinistroEscolhido(String sinistroEscolhido) {
		this.sinistroEscolhido = sinistroEscolhido;
	}
	

}