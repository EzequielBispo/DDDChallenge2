package beans;

public class IA {
	
	static String modalSelecionado;
	
	static void selecionarModal() {
		
		switch (Sinistro.getDigitoSinistro()) {
		case "1":	
			IA.setModalSelecionado("Guincho Plataforma");
			break;
		
		case "2":	
			IA.setModalSelecionado("Guincho Especializado");
			break;
		
		case "3":	 
			IA.setModalSelecionado("Guincho Rotativo");
			break;
		}
	}

	public static String getModalSelecionado() {
		return modalSelecionado;
	}

	public static void setModalSelecionado(String modalSelecionado) {
		IA.modalSelecionado = modalSelecionado;
	}

}