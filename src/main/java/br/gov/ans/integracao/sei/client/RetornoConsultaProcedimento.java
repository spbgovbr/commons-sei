/**
 * RetornoConsultaProcedimento.java
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
public class RetornoConsultaProcedimento implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idProcedimento;

	private String procedimentoFormatado;

	private String especificacao;

	private String dataAutuacao;

	private String linkAcesso;

	private TipoProcedimento tipoProcedimento;

	private Andamento andamentoGeracao;

	private Andamento andamentoConclusao;

	private Andamento ultimoAndamento;

	private UnidadeProcedimentoAberto[] unidadesProcedimentoAberto;

	private Assunto[] assuntos;

	private Interessado[] interessados;

	private Observacao[] observacoes;

	private ProcedimentoResumido[] procedimentosRelacionados;

	private ProcedimentoResumido[] procedimentosAnexados;

	public RetornoConsultaProcedimento() {
	}

	public RetornoConsultaProcedimento(String idProcedimento, String procedimentoFormatado,
			String especificacao, String dataAutuacao, String linkAcesso,
			TipoProcedimento tipoProcedimento,
			Andamento andamentoGeracao,
			Andamento andamentoConclusao,
			Andamento ultimoAndamento,
			UnidadeProcedimentoAberto[] unidadesProcedimentoAberto,
			Assunto[] assuntos,
			Interessado[] interessados,
			Observacao[] observacoes,
			ProcedimentoResumido[] procedimentosRelacionados,
			ProcedimentoResumido[] procedimentosAnexados) {
		this.idProcedimento = idProcedimento;
		this.procedimentoFormatado = procedimentoFormatado;
		this.especificacao = especificacao;
		this.dataAutuacao = dataAutuacao;
		this.linkAcesso = linkAcesso;
		this.tipoProcedimento = tipoProcedimento;
		this.andamentoGeracao = andamentoGeracao;
		this.andamentoConclusao = andamentoConclusao;
		this.ultimoAndamento = ultimoAndamento;
		this.unidadesProcedimentoAberto = unidadesProcedimentoAberto;
		this.assuntos = assuntos;
		this.interessados = interessados;
		this.observacoes = observacoes;
		this.procedimentosRelacionados = procedimentosRelacionados;
		this.procedimentosAnexados = procedimentosAnexados;
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

	public String getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}

	public String getDataAutuacao() {
		return dataAutuacao;
	}

	public void setDataAutuacao(String dataAutuacao) {
		this.dataAutuacao = dataAutuacao;
	}

	public String getLinkAcesso() {
		return linkAcesso;
	}

	public void setLinkAcesso(String linkAcesso) {
		this.linkAcesso = linkAcesso;
	}

	public TipoProcedimento getTipoProcedimento() {
		return tipoProcedimento;
	}

	public void setTipoProcedimento(TipoProcedimento tipoProcedimento) {
		this.tipoProcedimento = tipoProcedimento;
	}

	public Andamento getAndamentoGeracao() {
		return andamentoGeracao;
	}

	public void setAndamentoGeracao(Andamento andamentoGeracao) {
		this.andamentoGeracao = andamentoGeracao;
	}

	public Andamento getAndamentoConclusao() {
		return andamentoConclusao;
	}

	public void setAndamentoConclusao(Andamento andamentoConclusao) {
		this.andamentoConclusao = andamentoConclusao;
	}

	public Andamento getUltimoAndamento() {
		return ultimoAndamento;
	}

	public void setUltimoAndamento(Andamento ultimoAndamento) {
		this.ultimoAndamento = ultimoAndamento;
	}

	public UnidadeProcedimentoAberto[] getUnidadesProcedimentoAberto() {
		return unidadesProcedimentoAberto;
	}

	public void setUnidadesProcedimentoAberto(
			UnidadeProcedimentoAberto[] unidadesProcedimentoAberto) {
		this.unidadesProcedimentoAberto = unidadesProcedimentoAberto;
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

	public Observacao[] getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(Observacao[] observacoes) {
		this.observacoes = observacoes;
	}

	public ProcedimentoResumido[] getProcedimentosRelacionados() {
		return procedimentosRelacionados;
	}

	public void setProcedimentosRelacionados(
			ProcedimentoResumido[] procedimentosRelacionados) {
		this.procedimentosRelacionados = procedimentosRelacionados;
	}

	public ProcedimentoResumido[] getProcedimentosAnexados() {
		return procedimentosAnexados;
	}

	public void setProcedimentosAnexados(
			ProcedimentoResumido[] procedimentosAnexados) {
		this.procedimentosAnexados = procedimentosAnexados;
	}

	private Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof RetornoConsultaProcedimento))
			return false;
		RetornoConsultaProcedimento other = (RetornoConsultaProcedimento) obj;
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
				&& ((this.especificacao == null && other.getEspecificacao() == null)
						|| (this.especificacao != null && this.especificacao.equals(other.getEspecificacao())))
				&& ((this.dataAutuacao == null && other.getDataAutuacao() == null)
						|| (this.dataAutuacao != null && this.dataAutuacao.equals(other.getDataAutuacao())))
				&& ((this.linkAcesso == null && other.getLinkAcesso() == null)
						|| (this.linkAcesso != null && this.linkAcesso.equals(other.getLinkAcesso())))
				&& ((this.tipoProcedimento == null && other.getTipoProcedimento() == null)
						|| (this.tipoProcedimento != null && this.tipoProcedimento.equals(other.getTipoProcedimento())))
				&& ((this.andamentoGeracao == null && other.getAndamentoGeracao() == null)
						|| (this.andamentoGeracao != null && this.andamentoGeracao.equals(other.getAndamentoGeracao())))
				&& ((this.andamentoConclusao == null && other.getAndamentoConclusao() == null)
						|| (this.andamentoConclusao != null
								&& this.andamentoConclusao.equals(other.getAndamentoConclusao())))
				&& ((this.ultimoAndamento == null && other.getUltimoAndamento() == null)
						|| (this.ultimoAndamento != null && this.ultimoAndamento.equals(other.getUltimoAndamento())))
				&& ((this.unidadesProcedimentoAberto == null && other.getUnidadesProcedimentoAberto() == null)
						|| (this.unidadesProcedimentoAberto != null && java.util.Arrays
								.equals(this.unidadesProcedimentoAberto, other.getUnidadesProcedimentoAberto())))
				&& ((this.assuntos == null && other.getAssuntos() == null)
						|| (this.assuntos != null && java.util.Arrays.equals(this.assuntos, other.getAssuntos())))
				&& ((this.interessados == null && other.getInteressados() == null) || (this.interessados != null
						&& java.util.Arrays.equals(this.interessados, other.getInteressados())))
				&& ((this.observacoes == null && other.getObservacoes() == null) || (this.observacoes != null
						&& java.util.Arrays.equals(this.observacoes, other.getObservacoes())))
				&& ((this.procedimentosRelacionados == null && other.getProcedimentosRelacionados() == null)
						|| (this.procedimentosRelacionados != null && java.util.Arrays
								.equals(this.procedimentosRelacionados, other.getProcedimentosRelacionados())))
				&& ((this.procedimentosAnexados == null && other.getProcedimentosAnexados() == null)
						|| (this.procedimentosAnexados != null && java.util.Arrays.equals(this.procedimentosAnexados,
								other.getProcedimentosAnexados())));
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
		if (getEspecificacao() != null) {
			_hashCode += getEspecificacao().hashCode();
		}
		if (getDataAutuacao() != null) {
			_hashCode += getDataAutuacao().hashCode();
		}
		if (getLinkAcesso() != null) {
			_hashCode += getLinkAcesso().hashCode();
		}
		if (getTipoProcedimento() != null) {
			_hashCode += getTipoProcedimento().hashCode();
		}
		if (getAndamentoGeracao() != null) {
			_hashCode += getAndamentoGeracao().hashCode();
		}
		if (getAndamentoConclusao() != null) {
			_hashCode += getAndamentoConclusao().hashCode();
		}
		if (getUltimoAndamento() != null) {
			_hashCode += getUltimoAndamento().hashCode();
		}
		if (getUnidadesProcedimentoAberto() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getUnidadesProcedimentoAberto()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getUnidadesProcedimentoAberto(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
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
		if (getObservacoes() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getObservacoes()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getObservacoes(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getProcedimentosRelacionados() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getProcedimentosRelacionados()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getProcedimentosRelacionados(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getProcedimentosAnexados() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getProcedimentosAnexados()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getProcedimentosAnexados(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
