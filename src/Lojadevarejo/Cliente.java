package Lojadevarejo;

public class Cliente {
	
	private String nomeCompleto;
	private String rg;
	private String cpf;
	private String telefone;
	private Endereco end1;
	public String setTelefone;
	public Endereco setEndereco;
	 
	
	public Cliente(String nomeCompleto, String rg, String cpf, String telefone) {
		this.nomeCompleto = nomeCompleto;
		this.rg = rg;
		this.cpf = cpf;
		this.telefone = telefone;
	}

// Getters
public String getNomeCompleto() {
	return nomeCompleto;	
}
public String getRg() {
	return rg;
}
public String getCpf() {
	return cpf;
}
public String getTelefone() {
	return telefone;
}
// Setters
public void setTelefone(String telefone) {
	this.telefone = telefone;
}
public void setEndereco(Endereco endereco) {
	this.end1 = end1;
}
@Override
public String toString() {
	return String.format("Nome completo: %s\tTelefone: %s\tEndereço:%s", this.nomeCompleto, this.telefone,
			this.end1.toString());
}
}