public class Conta 
{
		double saldo;
		int agencia;
		int numero;
		Cliente titular;
		
public void deposita(double valor) {

		if (valor <= 300)
			saldo += valor;
		else 
			System.out.println("Limite diário excedido");		
}

public boolean saca(double valor) 
{
	if (this.saldo >= valor) 
{
		this.saldo -= valor;
		return true;
}
	
		return false;
}
		
		
		
		public boolean transfere(double valor,Conta destino)
		{		
		if (saldo >= valor)
		{
			saldo -= valor;
			destino.saldo += valor;
			return true;
}

			return false;

}
		
}		