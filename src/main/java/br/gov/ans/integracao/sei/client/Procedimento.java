/**
 * Procedimento.java
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
public class Procedimento implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idTipoProcedimento;

	private String numeroProtocolo;

	private String dataAutuacao;

	private String especificacao;

	private Assunto[] assuntos;

	private Interessado[] interessados;

	private String observacao;

	private String nivelAcesso;

	private String idHipoteseLegal;

	public Procedimento() {
	}

	public Procedimento(String idTipoProcedimento, String numeroProtocolo, String dataAutuacao, String especificacao, Assunto[] assuntos, Interessado[] interessados, String observacao, String nivelAcesso, String idHipoteseLegal) {
		this.idTipoProcedimento = idTipoProcedimento;
		this.numeroProtocolo = numeroProtocolo;
		this.dataAutuacao = dataAutuacao;
		this.especificacao = especificacao;
		this.assuntos = assuntos;
		this.interessados = interessados;
		this.observacao = observacao;
		this.nivelAcesso = nivelAcesso;
		this.idHipoteseLegal = idHipoteseLegal;
	}

	public String getIdTipoProcedimento() {
		return idTipoProcedimento;
	}

	public void setIdTipoProcedimento(String idTipoProcedimento) {
		this.idTipoProcedimento = idTipoProcedimento;
	}

	public String getNumeroProtocolo() {
		return numeroProtocolo;
	}

	public void setNumeroProtocolo(String numeroProtocolo) {
		this.numeroProtocolo = numeroProtocolo;
	}

	public String getDataAutuacao() {
		return dataAutuacao;
	}

	public void setDataAutuacao(String dataAutuacao) {
		this.dataAutuacao = dataAutuacao;
	}

	public String getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}

	public Assunto[] getAssuntos() {
		return assuntos;
	}

	public void setAssuntos(Assunto[] assuntos) {
		this.assuntos = assuntos;
	}

	public Interessado[] getInteressados() {
		return interessados;
	}

	public void setInteressados(Interessado[] interessados) {
		this.interessados = interessados;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}

	public String getIdHipoteseLegal() {
		return idHipoteseLegal;
	}

	public void setIdHipoteseLegal(String idHipoteseLegal) {
		this.idHipoteseLegal = idHipoteseLegal;
	}

	private Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof Procedimento))
			return false;
		Procedimento other = (Procedimento) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && ((this.idTipoProcedimento == null && other.getIdTipoProcedimento() == null)
				|| (this.idTipoProcedimento != null && this.idTipoProcedimento.equals(other.getIdTipoProcedimento())))
				&& ((this.numeroProtocolo == null && other.getNumeroProtocolo() == null)
						|| (this.numeroProtocolo != null && this.numeroProtocolo.equals(other.getNumeroProtocolo())))
				&& ((this.dataAutuacao == null && other.getDataAutuacao() == null)
						|| (this.dataAutuacao != null && this.dataAutuacao.equals(other.getDataAutuacao())))
				&& ((this.especificacao == null && other.getEspecificacao() == null)
						|| (this.especificacao != null && this.especificacao.equals(other.getEspecificacao())))
				&& ((this.assuntos == null && other.getAssuntos() == null)
						|| (this.assuntos != null && java.util.Arrays.equals(this.assuntos, other.getAssuntos())))
				&& ((this.interessados == null && other.getInteressados() == null) || (this.interessados != null
						&& java.util.Arrays.equals(this.interessados, other.getInteressados())))
				&& ((this.observacao == null && other.getObservacao() == null)
						|| (this.observacao != null && this.observacao.equals(other.getObservacao())))
				&& ((this.nivelAcesso == null && other.getNivelAcesso() == null)
						|| (this.nivelAcesso != null && this.nivelAcesso.equals(other.getNivelAcesso())))
				&& ((this.idHipoteseLegal == null && other.getIdHipoteseLegal() == null)
						|| (this.idHipoteseLegal != null && this.idHipoteseLegal.equals(other.getIdHipoteseLegal())));
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
		if (getIdTipoProcedimento() != null) {
			_hashCode += getIdTipoProcedimento().hashCode();
		}
		if (getNumeroProtocolo() != null) {
			_hashCode += getNumeroProtocolo().hashCode();
		}
		if (getDataAutuacao() != null) {
			_hashCode += getDataAutuacao().hashCode();
		}
		if (getEspecificacao() != null) {
			_hashCode += getEspecificacao().hashCode();
		}
		if (getAssuntos() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getAssuntos()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getAssuntos(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getInteressados() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getInteressados()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getInteressados(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getObservacao() != null) {
			_hashCode += getObservacao().hashCode();
		}
		if (getNivelAcesso() != null) {
			_hashCode += getNivelAcesso().hashCode();
		}
		if (getIdHipoteseLegal() != null) {
			_hashCode += getIdHipoteseLegal().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
