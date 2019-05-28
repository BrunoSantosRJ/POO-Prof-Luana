 
public class CriarConta {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		
		conta1.saldo = 300;
		System.out.println("Saldo1: " + conta1.saldo);
		
		conta1.saldo += 50;

		System.out.println("Novo saldo1: " + conta1.saldo);
		
		Conta conta2 = new Conta();
		
		conta2.saldo = 50;
				
		System.out.println("Saldo conta1: " + conta1.saldo);
		System.out.println("Saldo conta2: " + conta2.saldo);
		System.out.println("Saldo conta1: " + conta1.agencia); //se nao esta criada exibe valor 0 
		
		conta1.agencia = 123;
		conta1.numero = 123456;
		conta1.deposita (200);
		conta1.titular.nome =  "Pedro";
		conta1.titular.CPF = "121.546.545-22";
		conta1.titular.email = "pedrobaguvix@gmail.com";
		
		conta2.agencia = 123;
		conta2.numero = 123456;
		conta2.deposita(200);
		conta2.titular.nome =  "Maria";
		conta2.titular.CPF = "454.214.564-58";
		conta2.titular.email = "mariabaguvix@gmail.com";
		
		
	if (conta1.titular == conta2.titular) {
		System.out.println("São iguais");
	}
	else
	{
		System.out.println("São diferentes");
	}
	if (conta1.saca(700)) 
	{
	System.out.println("Valor sacado com sucesso");			
	}
	else
	{
		System.out.println("Saldo insuficiente");
	}
	System.out.println("Saldo :" + conta1.saldo);
	System.out.println("Titular conta2:" + conta2.titular.nome);
	}
	
}
