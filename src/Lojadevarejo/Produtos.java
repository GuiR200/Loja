package Lojadevarejo;

public class Produtos {
	
	private String numero;
	private String pre�o;
	private String quantidade;
	
public Produtos(String numero, String pre�o, String quantidade) {
	this.numero = numero;
	this.pre�o = pre�o;
	this.quantidade = quantidade;
}

public String getPre�o() {
	return pre�o;
}

public String getQuantidade() {
	return quantidade;
}

public void setPre�o(String pre�o) {
	this.pre�o = pre�o;
}

public void setQuantidade(String quantidade) {
	this.quantidade = quantidade;
}

}
