package br.com.caelum.tdd.exercicio1;


import org.junit.Assert;
import org.junit.Test;

public class DezOuVinteTest {

	@Test
	public void salarioMaiorQueTresMil(){
		Funcionario funcionario = new Funcionario();
		funcionario.setSalarioBase(3001.0);

		DezOuVinte dezOuVinte = new DezOuVinte();
		
		double result  =  dezOuVinte.calcula(funcionario);
		
		Assert.assertEquals(3001 * 0.8 , result, 0.00001 );
	}

	
	@Test
	public void salarioMenorQueTresMil(){
		Funcionario funcionario = new Funcionario();
		funcionario.setSalarioBase(2999.0);

		DezOuVinte dezOuVinte = new DezOuVinte();
		
		double result  =  dezOuVinte.calcula(funcionario);
		
		Assert.assertEquals(2999 * 0.9 , result, 0.00001 );
	}
	
	@Test
	public void salarioMaiorQueCincoMil(){
		Funcionario funcionario = new Funcionario();
		funcionario.setSalarioBase(5000.0);

		DezOuVinte dezOuVinte = new DezOuVinte();
		
		double result  =  dezOuVinte.calcula(funcionario);
		
		Assert.assertEquals(5000 * 0.8 , result, 0.00001 );
	}

	
}
