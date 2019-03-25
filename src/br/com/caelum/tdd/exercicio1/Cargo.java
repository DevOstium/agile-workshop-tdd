package br.com.caelum.tdd.exercicio1;

public enum Cargo {

	GERENTE(new QuinzeOuVinte()),
	DESENVOLVEDOR(new DezOuVinte()),
	DBA(new QuinzeOuVinte());
//	SECRETARIO;  nao compila por ele pede a regra, pedo o new classe
	
	private RegraDeCalculo regra;
	
	private Cargo(RegraDeCalculo regra) {
		// TODO Auto-generated constructor stub
		this.regra = regra;
		
	}

	public RegraDeCalculo getRegra() {
		return regra;
	}
	
}
