/**
 * AtributoAndamento.java
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
class AtributoAndamento implements Serializable {

	static final long serialVersionUID = 1L;

	private String nome;

	private String valor;

	private String idOrigem;

	public AtributoAndamento() {
	}

	public AtributoAndamento(String nome, String valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public AtributoAndamento(String nome, String valor, String idOrigem) {
		this.nome = nome;
		this.valor = valor;
		this.idOrigem = idOrigem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getIdOrigem() {
		return idOrigem;
	}

	public void setIdOrigem(String idOrigem) {
		this.idOrigem = idOrigem;
	}

	private Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof AtributoAndamento))
			return false;
		AtributoAndamento other = (AtributoAndamento) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.nome == null && other.getNome() == null)
						|| (this.nome != null && this.nome.equals(other.getNome())))
				&& ((this.valor == null && other.getValor() == null)
						|| (this.valor != null && this.valor.equals(other.getValor())))
				&& ((this.idOrigem == null && other.getIdOrigem() == null)
						|| (this.idOrigem != null && this.idOrigem.equals(other.getIdOrigem())));
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
		if (getNome() != null) {
			_hashCode += getNome().hashCode();
		}
		if (getValor() != null) {
			_hashCode += getValor().hashCode();
		}
		if (getIdOrigem() != null) {
			_hashCode += getIdOrigem().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
