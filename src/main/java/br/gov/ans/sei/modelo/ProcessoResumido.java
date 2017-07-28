package br.gov.ans.sei.modelo;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProcessoResumido {

	private String numero;
	private String numeroFormatado;
	private String descricao;
	private String unidade;
	private Date dataGeracao;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumeroFormatado() {
		return numeroFormatado;
	}

	public void setNumeroFormatado(String numeroFormatado) {
		this.numeroFormatado = numeroFormatado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public Date getDataGeracao() {
		return dataGeracao;
	}

	public void setDataGeracao(Date dataGeracao) {
		this.dataGeracao = dataGeracao;
	}

}
