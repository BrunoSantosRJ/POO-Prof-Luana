package school;

public class CalculaMediaDoAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno1 = new Aluno();
		aluno1.nome = "Baguvix";
		aluno1.nota1 = 10.5;
		aluno1.nota2 = 10.5;
		
		double media = 0;
				
		media = (aluno1.nota1 + aluno1.nota2) / 2;
		
		System.out.println("A média do aluno(a) " + aluno1.nome  + " é " + media );
		
	}

}
