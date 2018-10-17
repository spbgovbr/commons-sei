package br.gov.ans.integracao.sei.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import br.gov.ans.integracao.sei.client.RetornoConsultaDocumento;
import br.gov.ans.integracao.sipar.modelo.DocumentoSipar;

@JsonInclude(content = Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultadoConsultaDocumento {
	
	private DocumentoSipar documentoSIPAR;
	private RetornoConsultaDocumento documentoSEI;
	
	public DocumentoSipar getDocumentoSIPAR() {
		return documentoSIPAR;
	}
	
	public void setDocumentoSIPAR(DocumentoSipar documentoSIPAR) {
		this.documentoSIPAR = documentoSIPAR;
	}
	
	public RetornoConsultaDocumento getDocumentoSEI() {
		return documentoSEI;
	}
	
	public void setDocumentoSEI(RetornoConsultaDocumento documentoSEI) {
		this.documentoSEI = documentoSEI;
	}

}
