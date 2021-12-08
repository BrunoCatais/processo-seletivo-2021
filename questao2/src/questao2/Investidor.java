package questao2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Investidor {
	private String nome;
	private String cpf;
	private LocalDate data_nasc;
	private double valor_investimento;
	private String email;
	private static List<Compra> compras = new ArrayList<Compra>();
	
	//Construtor
	public Investidor(String nome, String cpf, LocalDate data_nasc, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.data_nasc = data_nasc;
		this.email = email;
	}

	//Metodos
	public void inserir(){
		
	}
	
	public void alterar() {
		
	}
	
	public void excluir() {
		
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public LocalDate getData_nasc() {
		return data_nasc;
	}
	
	public double getValor_investimento() {
		return valor_investimento;
	}

	public void setValor_investimento(double valor_investimento){
		if(valor_investimento>0) {
			this.valor_investimento = valor_investimento;
		}
		else{
			throw new IllegalArgumentException("O valor deve ser maior que zero");
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Compra> getCompras() {
		return compras;
	}

	public void inserirCompras(Compra compra) {
		compras.add(compra);
	}

}
