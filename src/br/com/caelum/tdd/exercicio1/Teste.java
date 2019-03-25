package br.com.caelum.tdd.exercicio1;


public class Teste {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.setNome("fagner");
		
		f.setSalarioBase(5000);
		f.setCargo(Cargo.DESENVOLVEDOR);
		
		System.out.println(f.calculaSalario());
	}
}
