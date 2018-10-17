/**
 * Cidade.java
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
public class Cidade implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idCidade;

	private String idEstado;

	private String idPais;

	private String nome;

	private String codigoIbge;

	private String sinCapital;

	private String latitude;

	private String longitude;

	public Cidade() {
	}

	public Cidade(String ibge) {
		this.codigoIbge = ibge;
	}

	public Cidade(String idCidade, String idEstado, String idPais, String nome, String codigoIbge, String sinCapital, String latitude, String longitude) {
		this.idCidade = idCidade;
		this.idEstado = idEstado;
		this.idPais = idPais;
		this.nome = nome;
		this.codigoIbge = codigoIbge;
		this.sinCapital = sinCapital;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(String idCidade) {
		this.idCidade = idCidade;
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

	public String getSinCapital() {
		return sinCapital;
	}

	public void setSinCapital(String sinCapital) {
		this.sinCapital = sinCapital;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	private Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof Cidade))
			return false;
		Cidade other = (Cidade) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && ((this.codigoIbge == null && other.getCodigoIbge() == null)
				|| (this.codigoIbge != null && this.codigoIbge.equals(other.getCodigoIbge())));
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
		if (getIdCidade() != null) {
			_hashCode += getIdCidade().hashCode();
		}
		if (getIdEstado() != null) {
			_hashCode += getIdEstado().hashCode();
		}
		if (getIdPais() != null) {
			_hashCode += getIdPais().hashCode();
		}
		if (getNome() != null) {
			_hashCode += getNome().hashCode();
		}
		if (getCodigoIbge() != null) {
			_hashCode += getCodigoIbge().hashCode();
		}
		if (getSinCapital() != null) {
			_hashCode += getSinCapital().hashCode();
		}
		if (getLatitude() != null) {
			_hashCode += getLatitude().hashCode();
		}
		if (getLongitude() != null) {
			_hashCode += getLongitude().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
