package contas;

public class Banco {
	
	public static void main(String[] args) {
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		c1.saldo = 200;
		c2.saldo = 50;
		System.out.println("Saldo da conta 1: "+c1.saldo);
		System.out.println("Saldo da conta 2: "+c2.saldo);
		c1.sacar(30);
		System.out.println("Após saque ...");
		System.out.println("Saldo da conta 1: "+c1.saldo);
		System.out.println("Saldo da conta 2: "+c2.saldo);
		c1.transferir(100, c2);
		System.out.println("Após transferência ...");
		System.out.println("Saldo da conta 1: "+c1.saldo);
		System.out.println("Saldo da conta 2: "+c2.saldo);
	}
}
