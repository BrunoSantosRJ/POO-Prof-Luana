package school;

public class CriarAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno a1 = new Aluno ();
		a1.matricula = 123456;
		a1.nome = "Lucas";
		a1.idade = 21;
		
		Aluno a2 = new Aluno ();
		a2.matricula = 654321;
		a2.nome = "Juliana";
		a2.idade = 29;
		
		System.out.println("Primeiro aluno");
		System.out.println("Matricula: " + a1.matricula);
		System.out.println("nome: " +a1.nome);
		System.out.println("idade: " + a1.idade);
		
		System.out.println("Segundo aluno");
		System.out.println("Matricula: " + a2.matricula);
		System.out.println("nome: " +a2.nome);
		System.out.println("idade: " + a2.idade);
		
	}

}
