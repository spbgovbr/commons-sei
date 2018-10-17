/**
 * HipoteseLegal.java
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
public class HipoteseLegal implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idHipoteseLegal;

	private String nome;

	private String baseLegal;

	private String nivelAcesso;

	public HipoteseLegal() {
	}

	public HipoteseLegal(String idHipoteseLegal, String nome, String baseLegal, String nivelAcesso) {
		this.idHipoteseLegal = idHipoteseLegal;
		this.nome = nome;
		this.baseLegal = baseLegal;
		this.nivelAcesso = nivelAcesso;
	}

	public String getIdHipoteseLegal() {
		return idHipoteseLegal;
	}

	public void setIdHipoteseLegal(String idHipoteseLegal) {
		this.idHipoteseLegal = idHipoteseLegal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBaseLegal() {
		return baseLegal;
	}

	public void setBaseLegal(String baseLegal) {
		this.baseLegal = baseLegal;
	}

	public String getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}

	private Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof HipoteseLegal))
			return false;
		HipoteseLegal other = (HipoteseLegal) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.idHipoteseLegal == null && other.getIdHipoteseLegal() == null)
						|| (this.idHipoteseLegal != null && this.idHipoteseLegal.equals(other.getIdHipoteseLegal())))
				&& ((this.nome == null && other.getNome() == null)
						|| (this.nome != null && this.nome.equals(other.getNome())))
				&& ((this.baseLegal == null && other.getBaseLegal() == null)
						|| (this.baseLegal != null && this.baseLegal.equals(other.getBaseLegal())))
				&& ((this.nivelAcesso == null && other.getNivelAcesso() == null)
						|| (this.nivelAcesso != null && this.nivelAcesso.equals(other.getNivelAcesso())));
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
		if (getIdHipoteseLegal() != null) {
			_hashCode += getIdHipoteseLegal().hashCode();
		}
		if (getNome() != null) {
			_hashCode += getNome().hashCode();
		}
		if (getBaseLegal() != null) {
			_hashCode += getBaseLegal().hashCode();
		}
		if (getNivelAcesso() != null) {
			_hashCode += getNivelAcesso().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
