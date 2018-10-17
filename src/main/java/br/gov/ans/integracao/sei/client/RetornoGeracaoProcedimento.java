/**
 * RetornoGeracaoProcedimento.java
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
public class RetornoGeracaoProcedimento implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idProcedimento;

	private String procedimentoFormatado;

	private String linkAcesso;

	private RetornoInclusaoDocumento[] retornoInclusaoDocumentos;

	public RetornoGeracaoProcedimento() {
	}

	public RetornoGeracaoProcedimento(String idProcedimento, String procedimentoFormatado, String linkAcesso, RetornoInclusaoDocumento[] retornoInclusaoDocumentos) {
		this.idProcedimento = idProcedimento;
		this.procedimentoFormatado = procedimentoFormatado;
		this.linkAcesso = linkAcesso;
		this.retornoInclusaoDocumentos = retornoInclusaoDocumentos;
	}

	public String getIdProcedimento() {
		return idProcedimento;
	}

	public void setIdProcedimento(String idProcedimento) {
		this.idProcedimento = idProcedimento;
	}

	public String getProcedimentoFormatado() {
		return procedimentoFormatado;
	}

	public void setProcedimentoFormatado(String procedimentoFormatado) {
		this.procedimentoFormatado = procedimentoFormatado;
	}

	public String getLinkAcesso() {
		return linkAcesso;
	}

	public void setLinkAcesso(String linkAcesso) {
		this.linkAcesso = linkAcesso;
	}

	public RetornoInclusaoDocumento[] getRetornoInclusaoDocumentos() {
		return retornoInclusaoDocumentos;
	}

	public void setRetornoInclusaoDocumentos(
			RetornoInclusaoDocumento[] retornoInclusaoDocumentos) {
		this.retornoInclusaoDocumentos = retornoInclusaoDocumentos;
	}

	private Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof RetornoGeracaoProcedimento))
			return false;
		RetornoGeracaoProcedimento other = (RetornoGeracaoProcedimento) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.idProcedimento == null && other.getIdProcedimento() == null)
						|| (this.idProcedimento != null && this.idProcedimento.equals(other.getIdProcedimento())))
				&& ((this.procedimentoFormatado == null && other.getProcedimentoFormatado() == null)
						|| (this.procedimentoFormatado != null
								&& this.procedimentoFormatado.equals(other.getProcedimentoFormatado())))
				&& ((this.linkAcesso == null && other.getLinkAcesso() == null)
						|| (this.linkAcesso != null && this.linkAcesso.equals(other.getLinkAcesso())))
				&& ((this.retornoInclusaoDocumentos == null && other.getRetornoInclusaoDocumentos() == null)
						|| (this.retornoInclusaoDocumentos != null && java.util.Arrays
								.equals(this.retornoInclusaoDocumentos, other.getRetornoInclusaoDocumentos())));
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
		if (getIdProcedimento() != null) {
			_hashCode += getIdProcedimento().hashCode();
		}
		if (getProcedimentoFormatado() != null) {
			_hashCode += getProcedimentoFormatado().hashCode();
		}
		if (getLinkAcesso() != null) {
			_hashCode += getLinkAcesso().hashCode();
		}
		if (getRetornoInclusaoDocumentos() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getRetornoInclusaoDocumentos()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getRetornoInclusaoDocumentos(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
