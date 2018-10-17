/**
 * RetornoConsultaDocumento.java
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
public class RetornoConsultaDocumento implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idProcedimento;

	private String procedimentoFormatado;

	private String idDocumento;

	private String documentoFormatado;

	private String linkAcesso;

	private Serie serie;

	private String numero;
	
	private String descricao;

	private String data;

	private Unidade unidadeElaboradora;

	private Andamento andamentoGeracao;

	private Assinatura[] assinaturas;

	private Publicacao publicacao;

	private Campo[] campos;

	public RetornoConsultaDocumento() {
	}

	public RetornoConsultaDocumento(String idProcedimento, String procedimentoFormatado,
			String idDocumento, String documentoFormatado, String linkAcesso,
			Serie serie, String numero, String descricao,
			String data, Unidade unidadeElaboradora,
			Andamento andamentoGeracao,
			Assinatura[] assinaturas,
			Publicacao publicacao, Campo[] campos) {
		this.idProcedimento = idProcedimento;
		this.procedimentoFormatado = procedimentoFormatado;
		this.idDocumento = idDocumento;
		this.documentoFormatado = documentoFormatado;
		this.linkAcesso = linkAcesso;
		this.serie = serie;
		this.numero = numero;
		this.descricao = descricao;
		this.data = data;
		this.unidadeElaboradora = unidadeElaboradora;
		this.andamentoGeracao = andamentoGeracao;
		this.assinaturas = assinaturas;
		this.publicacao = publicacao;
		this.campos = campos;
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

	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Unidade getUnidadeElaboradora() {
		return unidadeElaboradora;
	}

	public void setUnidadeElaboradora(Unidade unidadeElaboradora) {
		this.unidadeElaboradora = unidadeElaboradora;
	}

	public Andamento getAndamentoGeracao() {
		return andamentoGeracao;
	}

	public void setAndamentoGeracao(Andamento andamentoGeracao) {
		this.andamentoGeracao = andamentoGeracao;
	}

	public Assinatura[] getAssinaturas() {
		return assinaturas;
	}

	public void setAssinaturas(Assinatura[] assinaturas) {
		this.assinaturas = assinaturas;
	}

	public Publicacao getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(Publicacao publicacao) {
		this.publicacao = publicacao;
	}

	public Campo[] getCampos() {
		return campos;
	}

	public void setCampos(Campo[] campos) {
		this.campos = campos;
	}

	private Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof RetornoConsultaDocumento))
			return false;
		RetornoConsultaDocumento other = (RetornoConsultaDocumento) obj;
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
				&& ((this.idDocumento == null && other.getIdDocumento() == null)
						|| (this.idDocumento != null && this.idDocumento.equals(other.getIdDocumento())))
				&& ((this.documentoFormatado == null && other.getDocumentoFormatado() == null)
						|| (this.documentoFormatado != null
								&& this.documentoFormatado.equals(other.getDocumentoFormatado())))
				&& ((this.linkAcesso == null && other.getLinkAcesso() == null)
						|| (this.linkAcesso != null && this.linkAcesso.equals(other.getLinkAcesso())))
				&& ((this.serie == null && other.getSerie() == null)
						|| (this.serie != null && this.serie.equals(other.getSerie())))
				&& ((this.numero == null && other.getNumero() == null)
						|| (this.numero != null && this.numero.equals(other.getNumero())))
				&& ((this.data == null && other.getData() == null)
						|| (this.data != null && this.data.equals(other.getData())))
				&& ((this.unidadeElaboradora == null && other.getUnidadeElaboradora() == null)
						|| (this.unidadeElaboradora != null
								&& this.unidadeElaboradora.equals(other.getUnidadeElaboradora())))
				&& ((this.andamentoGeracao == null && other.getAndamentoGeracao() == null)
						|| (this.andamentoGeracao != null && this.andamentoGeracao.equals(other.getAndamentoGeracao())))
				&& ((this.assinaturas == null && other.getAssinaturas() == null) || (this.assinaturas != null
						&& java.util.Arrays.equals(this.assinaturas, other.getAssinaturas())))
				&& ((this.publicacao == null && other.getPublicacao() == null)
						|| (this.publicacao != null && this.publicacao.equals(other.getPublicacao())))
				&& ((this.campos == null && other.getCampos() == null)
						|| (this.campos != null && java.util.Arrays.equals(this.campos, other.getCampos())));
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
		if (getIdDocumento() != null) {
			_hashCode += getIdDocumento().hashCode();
		}
		if (getDocumentoFormatado() != null) {
			_hashCode += getDocumentoFormatado().hashCode();
		}
		if (getLinkAcesso() != null) {
			_hashCode += getLinkAcesso().hashCode();
		}
		if (getSerie() != null) {
			_hashCode += getSerie().hashCode();
		}
		if (getNumero() != null) {
			_hashCode += getNumero().hashCode();
		}
		if (getData() != null) {
			_hashCode += getData().hashCode();
		}
		if (getUnidadeElaboradora() != null) {
			_hashCode += getUnidadeElaboradora().hashCode();
		}
		if (getAndamentoGeracao() != null) {
			_hashCode += getAndamentoGeracao().hashCode();
		}
		if (getAssinaturas() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getAssinaturas()); i++) {
				Object obj = java.lang.reflect.Array.get(getAssinaturas(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getPublicacao() != null) {
			_hashCode += getPublicacao().hashCode();
		}
		if (getCampos() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getCampos()); i++) {
				Object obj = java.lang.reflect.Array.get(getCampos(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
