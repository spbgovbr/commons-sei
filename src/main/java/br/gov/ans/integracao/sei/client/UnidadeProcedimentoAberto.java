/**
 * UnidadeProcedimentoAberto.java
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
public class UnidadeProcedimentoAberto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Unidade unidade;

	private Usuario usuarioAtribuicao;

	public UnidadeProcedimentoAberto() {
	}

	public UnidadeProcedimentoAberto(Unidade unidade, Usuario usuarioAtribuicao) {
		this.unidade = unidade;
		this.usuarioAtribuicao = usuarioAtribuicao;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	public Usuario getUsuarioAtribuicao() {
		return usuarioAtribuicao;
	}

	public void setUsuarioAtribuicao(Usuario usuarioAtribuicao) {
		this.usuarioAtribuicao = usuarioAtribuicao;
	}

	private Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof UnidadeProcedimentoAberto))
			return false;
		UnidadeProcedimentoAberto other = (UnidadeProcedimentoAberto) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.unidade == null && other.getUnidade() == null)
						|| (this.unidade != null && this.unidade.equals(other.getUnidade())))
				&& ((this.usuarioAtribuicao == null && other.getUsuarioAtribuicao() == null)
						|| (this.usuarioAtribuicao != null
								&& this.usuarioAtribuicao.equals(other.getUsuarioAtribuicao())));
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
		if (getUnidade() != null) {
			_hashCode += getUnidade().hashCode();
		}
		if (getUsuarioAtribuicao() != null) {
			_hashCode += getUsuarioAtribuicao().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
