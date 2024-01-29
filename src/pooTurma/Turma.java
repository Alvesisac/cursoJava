package pooTurma;

public class Turma extends Senac {
	//Atributos da classe
	
	String mencao;
	String emailEducacional;
	
	//Construtor
	public Turma() {
		System.out.println(" ");
		System.out.println("Unidade curricular 10 | Banco de Dados");
	}
	
	public void unidadeCurricular() {
		if (mencao == "D") {
			aprovadoAluno();	
			
		}
		
		else {
			reprovarAluno();	
		}
		
	}
		
	
	
	private void aprovadoAluno() {
		System.out.println("Aluno(a) aprovado (a)!");
	}
	
	
	private void reprovarAluno() {
		System.out.println("Aluno(a) REPROVADO (a)!");
	}
	
}
