package br.gov.ans.integracao.sei.modelo;

import java.util.Date;

import br.gov.ans.integracao.sei.client.Documento;

public class InclusaoDocumento {

	private Date data;

	private String nome;

	private String numero;

	private String hash;

	private String sistema;

	private String unidade;

	private String processo;

	private String numeroInformado;

	private String link;	
	
	public InclusaoDocumento(){
		
	}
	
	public InclusaoDocumento(Documento documento, String unidade, String sistema, String hash){
		this.unidade = unidade;
		this.sistema = sistema;
		this.hash = hash;
		this.numeroInformado = documento.getNumero();
		
		this.nome = documento.getNomeArquivo();
		this.processo = documento.getIdProcedimento();
		
		this.data = new Date();
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
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

	public String getProcesso() {
		return processo;
	}

	public void setProcesso(String processo) {
		this.processo = processo;
	}

	public String getNumeroInformado() {
		return numeroInformado;
	}

	public void setNumeroInformado(String numeroInformado) {
		this.numeroInformado = numeroInformado;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}