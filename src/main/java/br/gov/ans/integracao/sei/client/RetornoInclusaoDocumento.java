/**
 * RetornoInclusaoDocumento.java
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
public class RetornoInclusaoDocumento implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idDocumento;

	private String documentoFormatado;

	private String linkAcesso;

	public RetornoInclusaoDocumento() {
	}

	public RetornoInclusaoDocumento(String idDocumento, String documentoFormatado, String linkAcesso) {
		this.idDocumento = idDocumento;
		this.documentoFormatado = documentoFormatado;
		this.linkAcesso = linkAcesso;
	}

	public String getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(String idDocumento) {
		this.idDocumento = idDocumento;
	}

	public String getDocumentoFormatado() {
		return documentoFormatado;
	}

	public void setDocumentoFormatado(String documentoFormatado) {
		this.documentoFormatado = documentoFormatado;
	}

	public String getLinkAcesso() {
		return linkAcesso;
	}

	public void setLinkAcesso(String linkAcesso) {
		this.linkAcesso = linkAcesso;
	}

	private Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof RetornoInclusaoDocumento))
			return false;
		RetornoInclusaoDocumento other = (RetornoInclusaoDocumento) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.idDocumento == null && other.getIdDocumento() == null)
						|| (this.idDocumento != null && this.idDocumento.equals(other.getIdDocumento())))
				&& ((this.documentoFormatado == null && other.getDocumentoFormatado() == null)
						|| (this.documentoFormatado != null
								&& this.documentoFormatado.equals(other.getDocumentoFormatado())))
				&& ((this.linkAcesso == null && other.getLinkAcesso() == null)
						|| (this.linkAcesso != null && this.linkAcesso.equals(other.getLinkAcesso())));
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
		if (getIdDocumento() != null) {
			_hashCode += getIdDocumento().hashCode();
		}
		if (getDocumentoFormatado() != null) {
			_hashCode += getDocumentoFormatado().hashCode();
		}
		if (getLinkAcesso() != null) {
			_hashCode += getLinkAcesso().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
