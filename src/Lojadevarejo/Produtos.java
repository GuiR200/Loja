package Lojadevarejo;

public class Produtos {
	
	private String numero;
	private String preço;
	private String quantidade;
	
public Produtos(String numero, String preço, String quantidade) {
	this.numero = numero;
	this.preço = preço;
	this.quantidade = quantidade;
}

public String getPreço() {
	return preço;
}

public String getQuantidade() {
	return quantidade;
}

public void setPreço(String preço) {
	this.preço = preço;
}

public void setQuantidade(String quantidade) {
	this.quantidade = quantidade;
}

}
