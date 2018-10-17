/**
 * Unidade.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.ans.integracao.sei.client;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(content = Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Unidade implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idUnidade;

	private String sigla;

	private String descricao;

	private String sinProtocolo;

	private String sinArquivamento;

	private String sinOuvidoria;

	public Unidade() {
	}

	public Unidade(String idUnidade, String sigla, String descricao, String sinProtocolo, String sinArquivamento, String sinOuvidoria) {
		this.idUnidade = idUnidade;
		this.sigla = sigla;
		this.descricao = descricao;
		this.sinProtocolo = sinProtocolo;
		this.sinArquivamento = sinArquivamento;
		this.sinOuvidoria = sinOuvidoria;
	}

	public String getIdUnidade() {
		return idUnidade;
	}

	public void setIdUnidade(String idUnidade) {
		this.idUnidade = idUnidade;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSinProtocolo() {
		return sinProtocolo;
	}

	public void setSinProtocolo(String sinProtocolo) {
		this.sinProtocolo = sinProtocolo;
	}

	public String getSinArquivamento() {
		return sinArquivamento;
	}

	public void setSinArquivamento(String sinArquivamento) {
		this.sinArquivamento = sinArquivamento;
	}

	public String getSinOuvidoria() {
		return sinOuvidoria;
	}

	public void setSinOuvidoria(String sinOuvidoria) {
		this.sinOuvidoria = sinOuvidoria;
	}

	private transient Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof Unidade))
			return false;
		Unidade other = (Unidade) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.idUnidade == null && other.getIdUnidade() == null)
						|| (this.idUnidade != null && this.idUnidade.equals(other.getIdUnidade())))
				&& ((this.sigla == null && other.getSigla() == null)
						|| (this.sigla != null && this.sigla.equals(other.getSigla())))
				&& ((this.descricao == null && other.getDescricao() == null)
						|| (this.descricao != null && this.descricao.equals(other.getDescricao())))
				&& ((this.sinProtocolo == null && other.getSinProtocolo() == null)
						|| (this.sinProtocolo != null && this.sinProtocolo.equals(other.getSinProtocolo())))
				&& ((this.sinArquivamento == null && other.getSinArquivamento() == null)
						|| (this.sinArquivamento != null && this.sinArquivamento.equals(other.getSinArquivamento())))
				&& ((this.sinOuvidoria == null && other.getSinOuvidoria() == null)
						|| (this.sinOuvidoria != null && this.sinOuvidoria.equals(other.getSinOuvidoria())));
		__equalsCalc = null;
		return _equals;
	}

	private transient boolean __hashCodeCalc = false;

	public int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = 1;
		if (getIdUnidade() != null) {
			_hashCode += getIdUnidade().hashCode();
		}
		if (getSigla() != null) {
			_hashCode += getSigla().hashCode();
		}
		if (getDescricao() != null) {
			_hashCode += getDescricao().hashCode();
		}
		if (getSinProtocolo() != null) {
			_hashCode += getSinProtocolo().hashCode();
		}
		if (getSinArquivamento() != null) {
			_hashCode += getSinArquivamento().hashCode();
		}
		if (getSinOuvidoria() != null) {
			_hashCode += getSinOuvidoria().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
