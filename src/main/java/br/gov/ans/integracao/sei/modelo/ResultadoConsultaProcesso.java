package br.gov.ans.integracao.sei.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import br.gov.ans.integracao.sei.client.RetornoConsultaProcedimento;
import br.gov.ans.integracao.sipar.modelo.DocumentoSipar;

@JsonInclude(content = Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultadoConsultaProcesso {
	
	private DocumentoSipar sipar;
	private RetornoConsultaProcedimento sei;
	
	public DocumentoSipar getSipar() {
		return sipar;
	}
	
	public void setSipar(DocumentoSipar sipar) {
		this.sipar = sipar;
	}
	
	public RetornoConsultaProcedimento getSei() {
		return sei;
	}
	
	public void setSei(RetornoConsultaProcedimento sei) {
		this.sei = sei;
	}	
	
}
