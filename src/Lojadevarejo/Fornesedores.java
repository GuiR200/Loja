package Lojadevarejo;

public class Fornesedores {
	
	private String mercadoria;
	private String servi�osaoconsumidor;
	private String cidade;
	private String estado;
    private Endereco endereco;
    
    public Fornesedores(String mercadoria, String servi�osaoconsumidor, String cidade, String estado, Endereco endereco) {
    	this.mercadoria = mercadoria;
    	this.servi�osaoconsumidor = servi�osaoconsumidor;
    	this.cidade = cidade;
    	this.estado = estado;
    	this.endereco = endereco;
    }

	public String getMercadoria() {
		return mercadoria;
	}

	public String getServi�osaoconsumidor() {
		return servi�osaoconsumidor;
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
