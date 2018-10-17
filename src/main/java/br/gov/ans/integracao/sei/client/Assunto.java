/**
 * Assunto.java
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
public class Assunto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String codigoEstruturado;

	private String descricao;

	public Assunto() {
	}

	public Assunto(String codigoEstruturado, String descricao) {
		this.codigoEstruturado = codigoEstruturado;
		this.descricao = descricao;
	}

	public String getCodigoEstruturado() {
		return codigoEstruturado;
	}

	public void setCodigoEstruturado(String codigoEstruturado) {
		this.codigoEstruturado = codigoEstruturado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	private Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof Assunto))
			return false;
		Assunto other = (Assunto) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && ((this.codigoEstruturado == null && other.getCodigoEstruturado() == null)
				|| (this.codigoEstruturado != null && this.codigoEstruturado.equals(other.getCodigoEstruturado())))
				&& ((this.descricao == null && other.getDescricao() == null)
						|| (this.descricao != null && this.descricao.equals(other.getDescricao())));
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
		if (getCodigoEstruturado() != null) {
			_hashCode += getCodigoEstruturado().hashCode();
		}
		if (getDescricao() != null) {
			_hashCode += getDescricao().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
