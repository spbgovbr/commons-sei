/**
 * TipoConferencia.java
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
public class TipoConferencia implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idTipoConferencia;

	private String descricao;

	public TipoConferencia() {
	}

	public TipoConferencia(String idTipoConferencia, String descricao) {
		this.idTipoConferencia = idTipoConferencia;
		this.descricao = descricao;
	}

	public String getIdTipoConferencia() {
		return idTipoConferencia;
	}

	public void setIdTipoConferencia(String idTipoConferencia) {
		this.idTipoConferencia = idTipoConferencia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	private Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof TipoConferencia))
			return false;
		TipoConferencia other = (TipoConferencia) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && ((this.idTipoConferencia == null && other.getIdTipoConferencia() == null)
				|| (this.idTipoConferencia != null && this.idTipoConferencia.equals(other.getIdTipoConferencia())))
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
		if (getIdTipoConferencia() != null) {
			_hashCode += getIdTipoConferencia().hashCode();
		}
		if (getDescricao() != null) {
			_hashCode += getDescricao().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
