/**
 * DefinicaoMarcador.java
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
public class DefinicaoMarcador implements Serializable {

	private static final long serialVersionUID = 1L;

	private String protocoloProcedimento;

	private String idMarcador;

	private String texto;

	public DefinicaoMarcador() {
	}

	public DefinicaoMarcador(String protocoloProcedimento, String idMarcador, String texto) {
		this.protocoloProcedimento = protocoloProcedimento;
		this.idMarcador = idMarcador;
		this.texto = texto;
	}

	public String getProtocoloProcedimento() {
		return protocoloProcedimento;
	}

	public void setProtocoloProcedimento(String protocoloProcedimento) {
		this.protocoloProcedimento = protocoloProcedimento;
	}

	public String getIdMarcador() {
		return idMarcador;
	}

	public void setIdMarcador(String idMarcador) {
		this.idMarcador = idMarcador;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	private Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof DefinicaoMarcador))
			return false;
		DefinicaoMarcador other = (DefinicaoMarcador) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.protocoloProcedimento == null && other.getProtocoloProcedimento() == null)
						|| (this.protocoloProcedimento != null
								&& this.protocoloProcedimento.equals(other.getProtocoloProcedimento())))
				&& ((this.idMarcador == null && other.getIdMarcador() == null)
						|| (this.idMarcador != null && this.idMarcador.equals(other.getIdMarcador())))
				&& ((this.texto == null && other.getTexto() == null)
						|| (this.texto != null && this.texto.equals(other.getTexto())));
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
		if (getProtocoloProcedimento() != null) {
			_hashCode += getProtocoloProcedimento().hashCode();
		}
		if (getIdMarcador() != null) {
			_hashCode += getIdMarcador().hashCode();
		}
		if (getTexto() != null) {
			_hashCode += getTexto().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
