package questao2;

import java.time.LocalDateTime;

public class Compra {
	private LocalDateTime data_hora;
	private double preco_u;
	private int qtd;
	private double preco_t;
	private Investidor investidor;
	private Corretora corretora;
	private Produto produto;
	
	//Construtor
	public Compra(LocalDateTime data_hora, Investidor investidor, Corretora corretora, Produto produto) {
		this.data_hora = data_hora;
		this.investidor = investidor;
		this.corretora = corretora;
		this.produto = produto;
	}

	//Getters
	public LocalDateTime getData_hora() {
		return data_hora;
	}

	public double getPreco_u() {
		return preco_u;
	}

	public int getQtd() {
		return qtd;
	}

	public double getPreco_t() {
		return preco_t;
	}

	public Investidor getInvestidor() {
		return investidor;
	}

	public Corretora getCorretora() {
		return corretora;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setPreco_u(double preco_u) {
		if(preco_u>0) {
			this.preco_u = preco_u;
			this.preco_t = preco_u*this.qtd;
		}
		else {
			throw new IllegalArgumentException("O valor deve ser maior do zero");
		}
	}

	public void setQtd(int qtd) {
		if(qtd>0) {
			this.qtd = qtd;
			this.preco_t = qtd*this.preco_u;
		}
		else {
			throw new IllegalArgumentException("O valor deve ser maior que zero");
		}
		
	}
	
}
