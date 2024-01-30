package pooTurma;

public class Funcionarios {

	public static void main(String[] args) {
		Administrativo funcionario1 = new Administrativo();
		funcionario1.nome = "Joelma";
		funcionario1.emailCorporativo = "joelma";
		funcionario1.redeDominio = "@sesi.com.br";
		System.out.println("Nome: " + funcionario1.nome);
		System.out.println("Usuário: " + funcionario1.emailCorporativo);
		System.out.println("Rede Domínio: " + funcionario1.redeDominio);
		System.out.println("Email Corporativo: " + funcionario1.emailCorporativo + funcionario1.redeDominio);
		funcionario1.acessarSistema();
		
		Administrativo funcionario2 = new Administrativo();
		funcionario2.nome = "Pamella";
		funcionario2.emailCorporativo = "pamella";
		funcionario2.redeDominio = "@sp.senac.br";
		System.out.println("Nome: " + funcionario2.nome);
		System.out.println("Usuário: " + funcionario2.emailCorporativo);
		System.out.println("Rede Domínio: " + funcionario2.redeDominio);
		System.out.println("Email Corporativo: " + funcionario2.emailCorporativo + funcionario2.redeDominio);
		funcionario2.acessarSistema();
	}

}
