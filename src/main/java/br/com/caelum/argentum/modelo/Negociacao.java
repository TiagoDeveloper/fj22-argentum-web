package br.com.caelum.argentum.modelo;

import java.io.Serializable;
import java.util.Calendar;

public final class Negociacao implements Serializable {
	
	private final double preco;
	private final int quantidade;
	private final Calendar data;
	
	
	public Negociacao(double preco, int quantidade, Calendar data) {
		this.preco = preco;
		this.quantidade = quantidade;
		this.data = data;
	}
	
	
	public double getVolume(){
		
			
		return preco * quantidade;
				
	}
	
	
	

//getters INICIO
	
	public double getPreco() {
		return preco;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public Calendar getData() {
		return data;
	}


	public boolean isMesmoDia(Calendar outraData) {

		return this.data.get(Calendar.DAY_OF_MONTH) == outraData.get(Calendar.DAY_OF_MONTH)&&
		this.data.get(Calendar.MONTH) == outraData.get(Calendar.MONTH) && 
		this.data.get(Calendar.YEAR)== outraData.get(Calendar.YEAR);
	}
	
	
	//getters FIM
}
