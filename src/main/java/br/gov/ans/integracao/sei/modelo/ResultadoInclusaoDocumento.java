package br.gov.ans.integracao.sei.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import br.gov.ans.integracao.sei.client.RetornoInclusaoDocumento;

@JsonInclude(content = Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultadoInclusaoDocumento {
	
	private RetornoInclusaoDocumento retorno;
	private String mensagem;
	
	public RetornoInclusaoDocumento getRetorno() {
		return retorno;
	}
	public void setRetorno(RetornoInclusaoDocumento retorno) {
		this.retorno = retorno;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}	
}
