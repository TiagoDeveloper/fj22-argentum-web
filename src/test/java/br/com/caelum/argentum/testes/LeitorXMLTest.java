package br.com.caelum.argentum.testes;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Calendar;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import br.com.caelum.argentum.modelo.Candle;
import br.com.caelum.argentum.modelo.CandlestickFactory;
import br.com.caelum.argentum.modelo.Negociacao;
import br.com.caelum.argentum.reader.LeitorXML;

public class LeitorXMLTest {

	@Test
	public void carregaXmlComUmaNegociacaoEmListaUnitaria() {
		
		Calendar hoje = Calendar.getInstance();
		
		String xmlDeTeste = "<list>"+
								"<negociacao>"+
									"<preco>43.5</preco>"+
									"<quantidade>1000</quantidade>"+
									"<data>"+
										"<time>1322233344455</time>"+
									"</data>"+
								"</negociacao>"+
							"</list>";
		
		LeitorXML leitor = new LeitorXML();
		
		InputStream xml = new ByteArrayInputStream(xmlDeTeste.getBytes());
		
		
		
		List<Negociacao> negociacoes = leitor.carrega(xml);
		
		CandlestickFactory fabrica = new CandlestickFactory();
		
		Candle candle = fabrica.constroiCandleParaData(hoje, negociacoes);
		
	
		
		Assert.assertEquals(43.5, candle.getAbertura());
		
		
		
		for(Negociacao nome : negociacoes ){
			
			
			System.out.println(nome.getPreco()+"  "+nome.getQuantidade()+"  "+nome.getData().getTime());
			
			
		}
		
		
		
	}

}
