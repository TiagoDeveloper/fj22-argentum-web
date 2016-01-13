package br.com.caelum.argentum.testes;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;

import br.com.caelum.argentum.modelo.Negociacao;


public class NegociacaoTest {
	
	@Test
	public void mesmoMilissegundoEhDoMesmoDia(){
		
		
		Calendar agora = Calendar.getInstance();
		
		Calendar mesmoMomento = (Calendar) agora.clone();
		
		Negociacao negociacao = new Negociacao(40.0,100, agora);
		
		Assert.assertTrue(negociacao.isMesmoDia(mesmoMomento));
		
	}
	
	@Test 
	public void comHorariosDiferentesEhNoMesmoDia(){
		
		Calendar manha = new GregorianCalendar(2011, 10, 20, 8, 30);
		Calendar tarde = new GregorianCalendar(2011, 10, 20, 15, 30);
		
		Negociacao negociacao = new Negociacao(40.0,100,manha);
		
		Assert.assertTrue(negociacao.isMesmoDia(tarde));
		
	}
	
	@Test
	public void mesmoDiaMasMesesDiferentesNaoSaoDoMesmoDia(){
		
		Calendar mesAtual = new GregorianCalendar(2011,10,20,8,30);
		Calendar mesQueVem = new GregorianCalendar(2011,11,20,8,30);
		
		Negociacao negociacao = new Negociacao(40.0,100,mesAtual);
		
		Assert.assertFalse(negociacao.isMesmoDia(mesQueVem));
		
		
	}
	
	

}
