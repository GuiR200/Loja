package Lojadevarejo;

public class Transportadora {

	private String carros;
    private String numero;
    private String cidade;
    private String estado;
    private Endereco endereco;
    
	public Transportadora(String carros, String numero, String cidade,String estado, Endereco endereco) {
		this.carros = carros;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.endereco = endereco;
		
	}

	public String getCarros() {
		return carros;
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
