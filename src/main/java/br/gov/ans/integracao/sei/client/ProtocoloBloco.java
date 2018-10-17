/**
 * ProtocoloBloco.java
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
public class ProtocoloBloco implements Serializable {

	private static final long serialVersionUID = 1L;

	private String protocoloFormatado;

	private String identificacao;

	private Assinatura[] assinaturas;

	public ProtocoloBloco() {
	}

	public ProtocoloBloco(String protocoloFormatado, String identificacao, Assinatura[] assinaturas) {
		this.protocoloFormatado = protocoloFormatado;
		this.identificacao = identificacao;
		this.assinaturas = assinaturas;
	}

	public String getProtocoloFormatado() {
		return protocoloFormatado;
	}

	public void setProtocoloFormatado(String protocoloFormatado) {
		this.protocoloFormatado = protocoloFormatado;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public Assinatura[] getAssinaturas() {
		return assinaturas;
	}

	public void setAssinaturas(Assinatura[] assinaturas) {
		this.assinaturas = assinaturas;
	}

	private Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof ProtocoloBloco))
			return false;
		ProtocoloBloco other = (ProtocoloBloco) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && ((this.protocoloFormatado == null && other.getProtocoloFormatado() == null)
				|| (this.protocoloFormatado != null && this.protocoloFormatado.equals(other.getProtocoloFormatado())))
				&& ((this.identificacao == null && other.getIdentificacao() == null)
						|| (this.identificacao != null && this.identificacao.equals(other.getIdentificacao())))
				&& ((this.assinaturas == null && other.getAssinaturas() == null) || (this.assinaturas != null
						&& java.util.Arrays.equals(this.assinaturas, other.getAssinaturas())));
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
		if (getProtocoloFormatado() != null) {
			_hashCode += getProtocoloFormatado().hashCode();
		}
		if (getIdentificacao() != null) {
			_hashCode += getIdentificacao().hashCode();
		}
		if (getAssinaturas() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getAssinaturas()); i++) {
				Object obj = java.lang.reflect.Array.get(getAssinaturas(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
