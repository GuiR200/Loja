package Lojadevarejo;

public class Estoque {

	private String armazenamento;
	private String numero;
	private String cidade;
	private String estado;
	private Endereco endereco;
	
	public Estoque(String armazenamento, String numero, String cidade, String estado, Endereco endereco) {
		this.armazenamento = armazenamento;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.endereco = endereco;
	}

	public String getArmazenamento() {
		return armazenamento;
	}

	public String getNumero() {
		return numero;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
