/**
 * ArquivoExtensao.java
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
public class ArquivoExtensao implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idArquivoExtensao;

	private String extensao;

	private String descricao;

	public ArquivoExtensao() {
	}

	public ArquivoExtensao(String idArquivoExtensao, String extensao, String descricao) {
		this.idArquivoExtensao = idArquivoExtensao;
		this.extensao = extensao;
		this.descricao = descricao;
	}

	public String getIdArquivoExtensao() {
		return idArquivoExtensao;
	}

	public void setIdArquivoExtensao(String idArquivoExtensao) {
		this.idArquivoExtensao = idArquivoExtensao;
	}

	public String getExtensao() {
		return extensao;
	}

	public void setExtensao(String extensao) {
		this.extensao = extensao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	private Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof ArquivoExtensao))
			return false;
		ArquivoExtensao other = (ArquivoExtensao) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && ((this.idArquivoExtensao == null && other.getIdArquivoExtensao() == null)
				|| (this.idArquivoExtensao != null && this.idArquivoExtensao.equals(other.getIdArquivoExtensao())))
				&& ((this.extensao == null && other.getExtensao() == null)
						|| (this.extensao != null && this.extensao.equals(other.getExtensao())))
				&& ((this.descricao == null && other.getDescricao() == null)
						|| (this.descricao != null && this.descricao.equals(other.getDescricao())));
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
		if (getIdArquivoExtensao() != null) {
			_hashCode += getIdArquivoExtensao().hashCode();
		}
		if (getExtensao() != null) {
			_hashCode += getExtensao().hashCode();
		}
		if (getDescricao() != null) {
			_hashCode += getDescricao().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
