package Lojadevarejo;

public class Vendedores {

	private String nomeCompleto;
	private String telefone;
	private Endereco endereco;
	private String  abilidade;
	private String telefoneContato;
	 
	public Vendedores(String nomeCompleto,String telefoneContato, String abilidade) {
		this.nomeCompleto = nomeCompleto;
		this.telefoneContato = telefoneContato;
		this.abilidade = abilidade;
		
	}
	public String getTelefoneContato() {
		return telefoneContato;
	    
	}
	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}
	@Override
	public String toString() {
		return String.format("CRM; %s\tNome: %s\tTelefone: %s\tEndereço: %s0", this.abilidade,this.nomeCompleto,this.telefoneContato,this.endereco.toString()); 
}
}
	
