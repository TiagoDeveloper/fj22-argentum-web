package br.com.caelum.argentum.bean;

import javax.annotation.ManagedBean;

@ManagedBean
public class OlaMundoBean {
	
	private String mensagem = "quem é você?";
	private String nome;
	
	public void setNome(String nome){
		
		this.nome = nome;
	}
	
	public String getNome(){
		
		return nome;
	}
	

	
	public String getMensagem(){
		
		return this.mensagem;
		
	}
	
	public void nomeFoiDigitado(){
		
		System.out.println(getNome());
	
		
	}

}
