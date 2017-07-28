package br.gov.ans.integracao.sei.modelo;

import java.util.Date;

public class DocumentoSipar {	
	private String digito;
	private String operadora;
	private Date emissao;
	private Date registro;
	private String tipo;
	private String resumo;
	private Long orgaoPosse;
	private Long orgaoOrigem;
	private Long orgaoRegistro;
	private Long assunto;
	
	public String getDigito() {
		return digito;
	}
	
	public void setDigito(String digito) {
		this.digito = digito;
	}
	
	public Long getAssunto() {
		return assunto;
	}
	
	public void setAssunto(Long assunto) {
		this.assunto = assunto;
	}
	
	public String getOperadora() {
		return operadora;
	}
	
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public Date getEmissao() {
		return emissao;
	}

	public void setEmissao(Date emissao) {
		this.emissao = emissao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public Long getOrgaoPosse() {
		return orgaoPosse;
	}

	public void setOrgaoPosse(Long orgaoPosse) {
		this.orgaoPosse = orgaoPosse;
	}

	public Long getOrgaoOrigem() {
		return orgaoOrigem;
	}

	public void setOrgaoOrigem(Long orgaoOrigem) {
		this.orgaoOrigem = orgaoOrigem;
	}

	public Long getOrgaoRegistro() {
		return orgaoRegistro;
	}

	public void setOrgaoRegistro(Long orgaoRegistro) {
		this.orgaoRegistro = orgaoRegistro;
	}

	public Date getRegistro() {
		return registro;
	}

	public void setRegistro(Date registro) {
		this.registro = registro;
	}
		
}
