package questao2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		String razao_s = "Razao";
		String cnpj = "Cnpj";
		
		Corretora corretora = new Corretora(razao_s, cnpj);
		
		System.out.println(corretora.getRazao_s());
		System.out.println(corretora.getCnpj()); 
		
		String nome_p = "Produto1";
		
		Produto produto = new Produto(nome_p);
		System.out.println(produto.getNome()); 
		
		String nome_i = "Investidor1";
		String cpf = "1234";
		LocalDate data_n = LocalDate.now();
		//double valor_i = 1200.00;
		String email = "email@email.com";
		
		Investidor investidor = new Investidor(nome_i, cpf, data_n, email);
		investidor.setValor_investimento(1200);
		
		System.out.println(investidor.getNome());
		System.out.println(investidor.getCpf());
		System.out.println(investidor.getData_nasc());
		System.out.println(investidor.getValor_investimento());
		System.out.println(investidor.getEmail());
		
		LocalDateTime data_h = LocalDateTime.now();
		//double preco_u = 600;
		//int qtd = 2;
		
		Compra compra = new Compra(data_h, investidor, corretora, produto);
		compra.setPreco_u(600);
		compra.setQtd(2);
		
		System.out.println(compra.getData_hora());
		System.out.println(compra.getPreco_u());
		System.out.println(compra.getQtd());
		System.out.println(compra.getPreco_t());
		System.out.println(compra.getInvestidor());
		System.out.println(compra.getCorretora());
		System.out.println(compra.getProduto());
		
		investidor.inserirCompras(compra);
		System.out.println(investidor.getCompras());
	}

}
