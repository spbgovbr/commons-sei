/**
 * Usuario.java
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
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idUsuario;

	private String sigla;

	private String nome;

	public Usuario() {
	}

	public Usuario(String idUsuario, String sigla, String nome) {
		this.idUsuario = idUsuario;
		this.sigla = sigla;
		this.nome = nome;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
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

	public boolean equals(Object obj) {
		if (!(obj instanceof Usuario)) {
			return false;
		}

		Usuario other = (Usuario) obj;

		if (this.getSigla().equals(other.getSigla())) {
			return true;
		}

		return false;
	}

	private boolean __hashCodeCalc = false;

	public int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = 1;
		if (getIdUsuario() != null) {
			_hashCode += getIdUsuario().hashCode();
		}
		if (getSigla() != null) {
			_hashCode += getSigla().hashCode();
		}
		if (getNome() != null) {
			_hashCode += getNome().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
