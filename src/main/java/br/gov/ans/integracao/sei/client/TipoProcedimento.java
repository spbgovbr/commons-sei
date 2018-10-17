/**
 * TipoProcedimento.java
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
public class TipoProcedimento implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idTipoProcedimento;

	private String nome;

	public TipoProcedimento() {
	}

	public TipoProcedimento(String idTipoProcedimento, String nome) {
		this.idTipoProcedimento = idTipoProcedimento;
		this.nome = nome;
	}

	public String getIdTipoProcedimento() {
		return idTipoProcedimento;
	}

	public void setIdTipoProcedimento(String idTipoProcedimento) {
		this.idTipoProcedimento = idTipoProcedimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof TipoProcedimento))
			return false;
		TipoProcedimento other = (TipoProcedimento) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && ((this.idTipoProcedimento == null && other.getIdTipoProcedimento() == null)
				|| (this.idTipoProcedimento != null && this.idTipoProcedimento.equals(other.getIdTipoProcedimento())))
				&& ((this.nome == null && other.getNome() == null)
						|| (this.nome != null && this.nome.equals(other.getNome())));
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
		if (getIdTipoProcedimento() != null) {
			_hashCode += getIdTipoProcedimento().hashCode();
		}
		if (getNome() != null) {
			_hashCode += getNome().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
