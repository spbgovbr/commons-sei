package br.gov.ans.integracao.sei.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(content = Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ArquivoCriado {
	
	private String identificador;

	public ArquivoCriado(){
		
	}
	
	public ArquivoCriado(String identificador){
		this.identificador = identificador;
	}
	
	public String getIdentificador() {
		return this.identificador;
	}
}
