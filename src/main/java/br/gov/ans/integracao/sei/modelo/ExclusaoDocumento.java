package br.gov.ans.integracao.sei.modelo;

import java.util.Date;

public class ExclusaoDocumento {

	private Date data;

	private String numero;

	private String sistema;

	private String unidade;

	private String motivo;

	
	public ExclusaoDocumento(){		
	}

	public ExclusaoDocumento(String numero, String sistema, String unidade, String motivo){
		this.numero = numero;
		this.sistema = sistema;
		this.unidade = unidade;
		this.motivo = motivo;
		this.data = new Date();		
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

}
