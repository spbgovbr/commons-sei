/**
 * PublicacaoImprensaNacional.java
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
public class PublicacaoImprensaNacional implements Serializable {

	private static final long serialVersionUID = 1L;

	private String siglaVeiculo;

	private String descricaoVeiculo;

	private String pagina;

	private String secao;

	private String data;

	public PublicacaoImprensaNacional() {
	}

	public PublicacaoImprensaNacional(String siglaVeiculo, String descricaoVeiculo, String pagina, String secao, String data) {
		this.siglaVeiculo = siglaVeiculo;
		this.descricaoVeiculo = descricaoVeiculo;
		this.pagina = pagina;
		this.secao = secao;
		this.data = data;
	}

	public String getSiglaVeiculo() {
		return siglaVeiculo;
	}

	public void setSiglaVeiculo(String siglaVeiculo) {
		this.siglaVeiculo = siglaVeiculo;
	}

	public String getDescricaoVeiculo() {
		return descricaoVeiculo;
	}

	public void setDescricaoVeiculo(String descricaoVeiculo) {
		this.descricaoVeiculo = descricaoVeiculo;
	}

	public String getPagina() {
		return pagina;
	}

	public void setPagina(String pagina) {
		this.pagina = pagina;
	}

	public String getSecao() {
		return secao;
	}

	public void setSecao(String secao) {
		this.secao = secao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	private Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof PublicacaoImprensaNacional))
			return false;
		PublicacaoImprensaNacional other = (PublicacaoImprensaNacional) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.siglaVeiculo == null && other.getSiglaVeiculo() == null)
						|| (this.siglaVeiculo != null && this.siglaVeiculo.equals(other.getSiglaVeiculo())))
				&& ((this.descricaoVeiculo == null && other.getDescricaoVeiculo() == null)
						|| (this.descricaoVeiculo != null && this.descricaoVeiculo.equals(other.getDescricaoVeiculo())))
				&& ((this.pagina == null && other.getPagina() == null)
						|| (this.pagina != null && this.pagina.equals(other.getPagina())))
				&& ((this.secao == null && other.getSecao() == null)
						|| (this.secao != null && this.secao.equals(other.getSecao())))
				&& ((this.data == null && other.getData() == null)
						|| (this.data != null && this.data.equals(other.getData())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	public int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = 1;
		if (getSiglaVeiculo() != null) {
			_hashCode += getSiglaVeiculo().hashCode();
		}
		if (getDescricaoVeiculo() != null) {
			_hashCode += getDescricaoVeiculo().hashCode();
		}
		if (getPagina() != null) {
			_hashCode += getPagina().hashCode();
		}
		if (getSecao() != null) {
			_hashCode += getSecao().hashCode();
		}
		if (getData() != null) {
			_hashCode += getData().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
