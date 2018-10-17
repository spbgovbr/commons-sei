/**
 * Serie.java
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
public class Serie implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idSerie;

	private String nome;

	private String aplicabilidade;

	public Serie() {
	}

	public Serie(String idSerie, String nome, String aplicabilidade) {
		this.idSerie = idSerie;
		this.nome = nome;
		this.aplicabilidade = aplicabilidade;
	}

	public String getIdSerie() {
		return idSerie;
	}

	public void setIdSerie(String idSerie) {
		this.idSerie = idSerie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAplicabilidade() {
		return aplicabilidade;
	}

	public void setAplicabilidade(String aplicabilidade) {
		this.aplicabilidade = aplicabilidade;
	}

	private Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof Serie))
			return false;
		Serie other = (Serie) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.idSerie == null && other.getIdSerie() == null)
						|| (this.idSerie != null && this.idSerie.equals(other.getIdSerie())))
				&& ((this.nome == null && other.getNome() == null)
						|| (this.nome != null && this.nome.equals(other.getNome())))
				&& ((this.aplicabilidade == null && other.getAplicabilidade() == null)
						|| (this.aplicabilidade != null && this.aplicabilidade.equals(other.getAplicabilidade())));
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
		if (getIdSerie() != null) {
			_hashCode += getIdSerie().hashCode();
		}
		if (getNome() != null) {
			_hashCode += getNome().hashCode();
		}
		if (getAplicabilidade() != null) {
			_hashCode += getAplicabilidade().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
