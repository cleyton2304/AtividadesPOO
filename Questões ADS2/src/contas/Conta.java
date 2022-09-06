package contas;

public class Conta {
	
	public double saldo;
	public int conta;
	public int agencia;
	
	public boolean sacar(double valor) {
		if(valor<=this.saldo) {
			this.saldo-=valor;
			return true;
		}
		return false;
	}
	
	public boolean transferir(double valor, Conta outraConta) {
		if(valor<=this.saldo) {
			this.saldo-=valor;
			outraConta.saldo+=valor;
			return true;
		}
		return true;
	}
}
