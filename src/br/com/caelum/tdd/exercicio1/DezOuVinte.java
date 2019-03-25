package br.com.caelum.tdd.exercicio1;



public class DezOuVinte implements RegraDeCalculo {

	@Override
	public double calcula(Funcionario funcionario) {
		// TODO Auto-generated method stub

		if(funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() * 0.8;
		}
		else {
			return funcionario.getSalarioBase() * 0.9;
		}

	}

}
