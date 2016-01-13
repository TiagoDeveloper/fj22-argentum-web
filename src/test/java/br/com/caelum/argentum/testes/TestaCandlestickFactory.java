package br.com.caelum.argentum.testes;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.caelum.argentum.modelo.CandleBuilder;
import br.com.caelum.argentum.modelo.Candle;
import br.com.caelum.argentum.modelo.CandlestickFactory;
import br.com.caelum.argentum.modelo.Negociacao;

public class TestaCandlestickFactory {

	public static void main(String[] args) {
		
		Calendar hoje = Calendar.getInstance();
	
		
		Negociacao negociacao1 = new Negociacao(40.5,100, hoje);
		Negociacao negociacao2 = new Negociacao(45.0,100, hoje);
		Negociacao negociacao3 = new Negociacao(39.8,100, hoje);
		Negociacao negociacao4 = new Negociacao(42.3,100, hoje);
		
		
		List<Negociacao> negociacoes = Arrays.asList(negociacao1,negociacao2,negociacao3,negociacao4);
		
		CandlestickFactory fabrica= new CandlestickFactory();
		
		Candle candle = fabrica.constroiCandleParaData(hoje, negociacoes);
		
		System.out.println(candle.getAbertura());
		System.out.println(candle.getFechamento());
		System.out.println(candle.getMinimo());
		System.out.println(candle.getMaximo());
		System.out.println(candle.getVolume());
		
		
		//NÃO ENTENDI NADA SOBRE ESSE CANDLEBUILDER
		/**CandleBuilder builder = new CandleBuilder();
		
		builder.comAbertura(40.5);
		builder.comFechamento(42.3);
		builder.comMinimo(39.8);
		builder.comMaximo(45.0);
		builder.comVolume(145234.20);
		builder.comData(new GregorianCalendar(2012, 8, 12, 0, 0, 0));
		
		Candlestick candle = builder.geraCandle();
		
		System.out.println(candle.getAbertura());
		System.out.println(candle.getFechamento());
		System.out.println(candle.getMinimo());
		System.out.println(candle.getMaximo());
		System.out.println(candle.getVolume());
		System.out.println(candle.getData());**/

	}

}
