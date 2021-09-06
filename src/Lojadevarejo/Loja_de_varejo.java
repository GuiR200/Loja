package Lojadevarejo;

public class Loja_de_varejo {

	public static void main(String[] args) {
		// Criando os obijeto
		Endereco end1 = new Endereco();
	    Cliente cli1 = new Cliente();
	    
	    // upular os dados
		end1.bairro = "Centro";
		end1.cep = "0000";
		end1.cidade = "Porto Alegre";
		end1.estado = "RS";
		end1.numero = "40-A";
		end1.rua = "Rua Noronha da silva";
		
		cli1.cpf = "0000";
	    cli1.nomeCompleto = "Elias Rodrigues";
	    cli1.rg = "00000";
		cli1.telefone = "999999";
	    cli1.endereco = end1;
	 // Imprimir dados
	 		System.out.printf("O senhor %s reside no endereço %s nº %s, no bairro %s - %s/%s", cli1.nomeCompleto,end1.rua,end1.numero,end1.bairro,end1.cidade,end1.estado);
	 		
	 	}
	}
	
