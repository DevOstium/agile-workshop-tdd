package br.com.caelum.tdd.exercicio1;


public class QuinzeOuVinte  implements RegraDeCalculo {

	@Override
	public double calcula(Funcionario funcionario) {
		// TODO Auto-generated method stub
		
		if(funcionario.getSalarioBase() >= 5000.0){
			return funcionario.getSalarioBase() * 0.8;
		}
		else {
			return funcionario.getSalarioBase() * 0.85;
		}
		
		
	}

}
