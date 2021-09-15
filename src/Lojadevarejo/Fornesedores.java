package Lojadevarejo;

public class Fornesedores {
	
	private String mercadoria;
	private String serviçosaoconsumidor;
	private String cidade;
	private String estado;
    private Endereco endereco;
    
    public Fornesedores(String mercadoria, String serviçosaoconsumidor, String cidade, String estado, Endereco endereco) {
    	this.mercadoria = mercadoria;
    	this.serviçosaoconsumidor = serviçosaoconsumidor;
    	this.cidade = cidade;
    	this.estado = estado;
    	this.endereco = endereco;
    }

	public String getMercadoria() {
		return mercadoria;
	}

	public String getServiçosaoconsumidor() {
		return serviçosaoconsumidor;
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
