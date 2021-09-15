package Lojadevarejo;

public class Loja_de_varejo {

	public static void main(String[] args) {
		// Criando os obijeto
		Endereco end1 = new Endereco("Rua Noronha da silva","40-A","Centro","RS","Porto Alegre","0000");
	    Cliente cli1 = new Cliente("Elisandro Dos Santos","00000","999999","00000");
	    Vendedores vend1 = new Vendedores("Guilherme Machado","999999","atender");
	    
	    // Pupular os dados
		end1.setBairro ("Centro");
		end1.setCEP("0000");
    	end1.setCidade ("Porto Alegre");
		end1.setEstado  ("RS");
		end1.setNumero  ("40-A");
		end1.setRua  ("Rua Noronha da silva");
		
	//	cli1.cpf = "0000";
	//  cli1.nomeCompleto = "Elias Rodrigues";
   //   cli1.rg = "00000";
		cli1.setTelefone = ("999999");
		cli1.setEndereco = (end1);
	 // Imprimir dados
	 		System.out.printf("O senhor %s reside no endereço %s nº %s, no bairro %s - %s/%s", cli1.getNomeCompleto(),end1.getRua(),end1.getNumero(),end1.getBairro(),end1.getCidade(),end1.getEstado());
	 		
	 	}
	}
	
