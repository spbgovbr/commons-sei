/**
 * Pais.java
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
public class Pais implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idPais;

	private String nome;

	public Pais() {
	}

	public Pais(String idPais, String nome) {
		this.idPais = idPais;
		this.nome = nome;
	}

	public String getIdPais() {
		return idPais;
	}

	public void setIdPais(String idPais) {
		this.idPais = idPais;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof Pais))
			return false;
		Pais other = (Pais) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.idPais == null && other.getIdPais() == null)
						|| (this.idPais != null && this.idPais.equals(other.getIdPais())))
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
		if (getIdPais() != null) {
			_hashCode += getIdPais().hashCode();
		}
		if (getNome() != null) {
			_hashCode += getNome().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
