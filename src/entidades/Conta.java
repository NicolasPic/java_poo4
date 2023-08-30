package entidades;

public class Conta {

	private int numero;
	private String nome;
	private double valor;
	
	public void depositar(double valor) {
		this.valor+= valor ;
	}
	
	public void retirar(double valor) {
		this.valor-= valor + 5;
	}
	
	public Conta() {
		
	}
	
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;	
	}
	
	public Conta(int numero, String nome, double valor) {
		this.numero = numero;
		this.nome = nome;
		this.valor = valor;
	}
	
	public String toString() {
		return "Conta: " + numero + ", Titular: " + nome + ", Saldo: $ " + valor;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValor() {
		return valor;
	}
	
}
