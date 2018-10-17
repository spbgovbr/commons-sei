package br.gov.ans.integracao.sei.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(content = Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AtribuicaoProcesso {
		
	private String processo;
	private boolean reabrir;
	
	public AtribuicaoProcesso(){}
	
	public String getProcesso() {
		return processo;
	}
	public void setProcesso(String processo) {
		this.processo = processo;
	}
	public boolean isReabrir() {
		return reabrir;
	}
	public void setReabrir(boolean reabrir) {
		this.reabrir = reabrir;
	}
	
}
