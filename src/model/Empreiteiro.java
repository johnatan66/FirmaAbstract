package model;

public class Empreiteiro extends Funcionario {
	protected float valorEmpreita;
	protected float Salario;
	
	
	public Empreiteiro(String nome, int numeroRegistro, float valorEmpreita) {
		super(nome, numeroRegistro);
		this.valorEmpreita = valorEmpreita;
	}
	
	public float CalcularSalario() {
		return valorEmpreita;
	}

	@Override
	public String toString() {
		return "Empreiteiro [valorEmpreita=" + valorEmpreita + ", Salario=" + Salario + "]";
	}

	public float getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(float valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}

	public float getSalario() {
		return Salario;
	}

	public void setSalario(float salario) {
		Salario = salario;
	}
	
	
	
}
