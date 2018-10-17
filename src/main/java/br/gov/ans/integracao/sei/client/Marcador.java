/**
 * Marcador.java
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
public class Marcador implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idMarcador;

	private String nome;

	private String icone;

	private String sinAtivo;

	public Marcador() {
	}

	public Marcador(String idMarcador, String nome, String icone, String sinAtivo) {
		this.idMarcador = idMarcador;
		this.nome = nome;
		this.icone = icone;
		this.sinAtivo = sinAtivo;
	}

	public String getIdMarcador() {
		return idMarcador;
	}

	public void setIdMarcador(String idMarcador) {
		this.idMarcador = idMarcador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIcone() {
		return icone;
	}

	public void setIcone(String icone) {
		this.icone = icone;
	}

	public String getSinAtivo() {
		return sinAtivo;
	}

	public void setSinAtivo(String sinAtivo) {
		this.sinAtivo = sinAtivo;
	}

	private Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof Marcador))
			return false;
		Marcador other = (Marcador) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.idMarcador == null && other.getIdMarcador() == null)
						|| (this.idMarcador != null && this.idMarcador.equals(other.getIdMarcador())))
				&& ((this.nome == null && other.getNome() == null)
						|| (this.nome != null && this.nome.equals(other.getNome())))
				&& ((this.icone == null && other.getIcone() == null)
						|| (this.icone != null && this.icone.equals(other.getIcone())))
				&& ((this.sinAtivo == null && other.getSinAtivo() == null)
						|| (this.sinAtivo != null && this.sinAtivo.equals(other.getSinAtivo())));
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
		if (getIdMarcador() != null) {
			_hashCode += getIdMarcador().hashCode();
		}
		if (getNome() != null) {
			_hashCode += getNome().hashCode();
		}
		if (getIcone() != null) {
			_hashCode += getIcone().hashCode();
		}
		if (getSinAtivo() != null) {
			_hashCode += getSinAtivo().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
