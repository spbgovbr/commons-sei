package br.gov.ans.sei.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
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
