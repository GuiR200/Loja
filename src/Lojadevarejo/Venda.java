package Lojadevarejo;

public class Venda {

	private String numero;
	private String quantidade;
	private String itens;
	
public Venda(String numero, String quantidade, String itrns) {
	this.numero = numero;
	this.quantidade = quantidade;
	this.itens = itens;
}

public String getNumero() {
	return numero;
}

public String getQuantidade() {
	return quantidade;
}

public String getItens() {
	return itens;
}

public void setNumero(String numero) {
	this.numero = numero;
}
public void setItens(String itens) {
	this.itens = itens;
}
}
