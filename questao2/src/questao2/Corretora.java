package questao2;

public class Corretora {
	private String razao_s;
	private String cnpj;
	
	public Corretora(String razao_s, String cnpj) {
		this.razao_s = razao_s;
		this.cnpj = cnpj;
	}

	//Getters and Setters
	public String getRazao_s() {
		return razao_s;
	}

	public void setRazao_s(String razao_s) {
		this.razao_s = razao_s;
	}

	public String getCnpj() {
		return cnpj;
	}

}
