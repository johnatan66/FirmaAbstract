package model;

public class Comissionado extends Funcionario{
	protected float salarioBase;
	protected float comissao;
	protected float Salario;
	
	public Comissionado(String nome, int numeroRegistro, float slarioBase, float comissao) {
		super(nome, numeroRegistro);
		this.salarioBase = slarioBase;
		this.comissao = comissao;
	}
	
	public float CalcularSalario() {
		return salarioBase + salarioBase * comissao/100;
	}

	@Override
	public String toString() {
		return "Comissionado [salarioBase=" + salarioBase + ", comissao=" + comissao + ", nome=" + nome
				+ ", numeroRegistro=" + numeroRegistro + "Salario final: "+Salario+ "]";
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	public float getSalario() {
		return Salario;
	}

	public void setSalario(float salario) {
		Salario = salario;
	}	

}
