package model;
public class Horista extends Funcionario{
	protected float valorHora;
	protected float numeroHoras;
	protected float Salario;
	
	public Horista(String nome, int numeroRegistro, float valorHora, float numeroHoras) {
		super(nome, numeroRegistro);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}
	
	public float CalcularSalario() {
		return valorHora * numeroHoras;	
		
	}

	@Override
	public String toString() {
		return "Horista [valorHora=" + valorHora + ", numeroHoras=" + numeroHoras + ", Salario=" + Salario + "]";
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	public float getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(float numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	public float getSalario() {
		return Salario;
	}

	public void setSalario(float salario) {
		Salario = salario;
	}

	
	
}
