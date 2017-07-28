package br.gov.ans.integracao.sei.modelo;

import java.util.Date;

public class DocumentoResumido {
	private String numero;
	private String numeroInformado;
	private String tipo;
	private String unidade;
	private String origem;
	private Date dataGeracao;
	private String processo;

	public DocumentoResumido(){
		
	}
	
	public DocumentoResumido(String numero, String tipo, String numeroInformado, String origem, Date dataGeracao){
		this.numero = numero;
		this.tipo = tipo;
		this.numeroInformado = numeroInformado;
		this.origem = origem;
		this.dataGeracao = dataGeracao;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getProcesso() {
		return processo;
	}

	public void setProcesso(String processo) {
		this.processo = processo;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public Date getDataGeracao() {
		return dataGeracao;
	}

	public void setDataGeracao(Date dataGeracao) {
		this.dataGeracao = dataGeracao;
	}

	public String getNumeroInformado() {
		return numeroInformado;
	}

	public void setNumeroInformado(String numeroInformado) {
		this.numeroInformado = numeroInformado;
	}

}
