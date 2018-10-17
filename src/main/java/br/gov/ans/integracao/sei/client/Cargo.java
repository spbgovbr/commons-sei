/**
 * Cargo.java
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
public class Cargo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idCargo;

	private String expressaoCargo;

	private String expressaoTratamento;

	private String expressaoVocativo;

	public Cargo() {
	}

	public Cargo(String idCargo, String expressaoCargo, String expressaoTratamento, String expressaoVocativo) {
		this.idCargo = idCargo;
		this.expressaoCargo = expressaoCargo;
		this.expressaoTratamento = expressaoTratamento;
		this.expressaoVocativo = expressaoVocativo;
	}

	public String getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(String idCargo) {
		this.idCargo = idCargo;
	}

	public String getExpressaoCargo() {
		return expressaoCargo;
	}

	public void setExpressaoCargo(String expressaoCargo) {
		this.expressaoCargo = expressaoCargo;
	}

	public String getExpressaoTratamento() {
		return expressaoTratamento;
	}

	public void setExpressaoTratamento(String expressaoTratamento) {
		this.expressaoTratamento = expressaoTratamento;
	}

	public String getExpressaoVocativo() {
		return expressaoVocativo;
	}

	public void setExpressaoVocativo(String expressaoVocativo) {
		this.expressaoVocativo = expressaoVocativo;
	}

	private Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof Cargo))
			return false;
		Cargo other = (Cargo) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.idCargo == null && other.getIdCargo() == null)
						|| (this.idCargo != null && this.idCargo.equals(other.getIdCargo())))
				&& ((this.expressaoCargo == null && other.getExpressaoCargo() == null)
						|| (this.expressaoCargo != null && this.expressaoCargo.equals(other.getExpressaoCargo())))
				&& ((this.expressaoTratamento == null && other.getExpressaoTratamento() == null)
						|| (this.expressaoTratamento != null
								&& this.expressaoTratamento.equals(other.getExpressaoTratamento())))
				&& ((this.expressaoVocativo == null && other.getExpressaoVocativo() == null)
						|| (this.expressaoVocativo != null
								&& this.expressaoVocativo.equals(other.getExpressaoVocativo())));
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
		if (getIdCargo() != null) {
			_hashCode += getIdCargo().hashCode();
		}
		if (getExpressaoCargo() != null) {
			_hashCode += getExpressaoCargo().hashCode();
		}
		if (getExpressaoTratamento() != null) {
			_hashCode += getExpressaoTratamento().hashCode();
		}
		if (getExpressaoVocativo() != null) {
			_hashCode += getExpressaoVocativo().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
