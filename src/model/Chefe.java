package model;

public class Chefe extends Funcionario {
	

	protected float SalarioBase;
	protected float adicionalFuncao;
	protected float beneficioTerno;
	
	
	
	public Chefe(String nome, int numeroRegistro, float salarioBase, float adicionalFuncao, float beneficioTerno) {
		super(nome, numeroRegistro);
		SalarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
	}
	
	public float CalcularSalario() {
		return SalarioBase+SalarioBase*adicionalFuncao/100+beneficioTerno;
		
	}

	@Override
	public String toString() {
		return "Chefe [SalarioBase=" + SalarioBase + ", adicionalFuncao=" + adicionalFuncao + ", beneficioTerno="
				+ beneficioTerno + ", nome=" + nome + ", numeroRegistro=" + numeroRegistro + "]";
	}

	public float getSalarioBase() {
		return SalarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		SalarioBase = salarioBase;
	}

	public float getAdicionalFuncao() {
		return adicionalFuncao;
	}

	public void setAdicionalFuncao(float adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}

	public float getBeneficioTerno() {
		return beneficioTerno;
	}

	public void setBeneficioTerno(float beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}
	
	

}
