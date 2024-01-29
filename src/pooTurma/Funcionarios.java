package pooTurma;

public class Funcionarios {

	public static void main(String[] args) {

 	Administrativo funcionario1 = new Administrativo();
 	funcionario1.nome = "Joelma";
 	funcionario1.telefone = "1198995657";
 	funcionario1.emailPessoal = "joelma@gmail.com";
 	funcionario1.emailCorporativo = "joelma";
 	funcionario1.redeDominio= "@sp.senac.br";
 	funcionario1.acessarSistema();
 	
 	Administrativo funcionario2 = new Administrativo();
 	funcionario2.nome = "Carlos";
 	funcionario2.telefone = "1198995657";
 	funcionario2.emailPessoal = "Carlos@gmail.com";
 	funcionario2.emailCorporativo = "Carlos";
 	funcionario2.redeDominio = "@sesi.com.br";
 	funcionario2.acessarSistema();
 	
	}
}
 