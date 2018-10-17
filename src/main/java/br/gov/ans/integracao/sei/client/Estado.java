/**
 * Estado.java
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
public class Estado implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idEstado;

	private String idPais;

	private String sigla;

	private String nome;

	private String codigoIbge;

	public Estado() {
	}

	public Estado(String sigla) {
		this.sigla = sigla;
	}

	public Estado(String idEstado, String idPais, String sigla, String nome, String codigoIbge) {
		this.idEstado = idEstado;
		this.idPais = idPais;
		this.sigla = sigla;
		this.nome = nome;
		this.codigoIbge = codigoIbge;
	}

	public String getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(String idEstado) {
		this.idEstado = idEstado;
	}

	public String getIdPais() {
		return idPais;
	}

	public void setIdPais(String idPais) {
		this.idPais = idPais;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoIbge() {
		return codigoIbge;
	}

	public void setCodigoIbge(String codigoIbge) {
		this.codigoIbge = codigoIbge;
	}

	private Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof Estado))
			return false;
		Estado other = (Estado) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && ((this.sigla == null && other.getSigla() == null)
				|| (this.sigla != null && this.sigla.equals(other.getSigla())));
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
		if (getIdEstado() != null) {
			_hashCode += getIdEstado().hashCode();
		}
		if (getIdPais() != null) {
			_hashCode += getIdPais().hashCode();
		}
		if (getSigla() != null) {
			_hashCode += getSigla().hashCode();
		}
		if (getNome() != null) {
			_hashCode += getNome().hashCode();
		}
		if (getCodigoIbge() != null) {
			_hashCode += getCodigoIbge().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
