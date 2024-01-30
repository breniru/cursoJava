package pooTurma;

public class Alunos {

	public static void main(String[] args) {
		//objeto 1 
		Turma aluno1 = new Turma();
		
		aluno1.nome = "Nathan";
		aluno1.telefone = "11992682158";
		aluno1.emailPessoal = "natham.martins2004@gmail.com";
		aluno1.emailEducacional = "nathan.mraphael@senacsp.edu.br";
		aluno1.mencao = "ND";
		System.out.println("Nome: " + aluno1.nome);
		System.out.println("Telefone: " + aluno1.telefone);
		System.out.println("Email Pessoal: " + aluno1.emailPessoal);
		System.out.println("Email Educacional: " + aluno1.emailEducacional);
		aluno1.ligarPc();
		aluno1.logar();
		aluno1.unidadeCurricular();
		
		
		
		//Objeto 2
		Turma aluno2 = new Turma();
		aluno2.nome = "Victoria";
		aluno2.telefone = "11986080091";
		aluno2.emailPessoal = "victoriacardoso545@gmail.com";
		aluno2.emailEducacional = "victoriac@senacsp.edu.br";
		aluno2.mencao = "D";
		System.out.println("Nome: " + aluno2.nome);
		System.out.println("Telefone: " + aluno1.telefone);
		System.out.println("Email pessoal: " + aluno2.emailPessoal);
		System.out.println("Email Educacional: " + aluno2.emailEducacional);
		aluno2.ligarPc();
		aluno2.desligarPc();
		aluno2.unidadeCurricular();
		
		
	}
	
}
