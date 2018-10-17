/**
 * Andamento.java
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
public class Andamento implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idAndamento;

	private String idTarefa;

	private String idTarefaModulo;

	private String descricao;

	private String dataHora;

	private Unidade unidade;

	private Usuario usuario;

	private AtributoAndamento[] atributos;

	public Andamento() {
	}

	public Andamento(String idAndamento, String idTarefa, String idTarefaModulo, String descricao, String dataHora, Unidade unidade, Usuario usuario, AtributoAndamento[] atributos) {
		this.idAndamento = idAndamento;
		this.idTarefa = idTarefa;
		this.idTarefaModulo = idTarefaModulo;
		this.descricao = descricao;
		this.dataHora = dataHora;
		this.unidade = unidade;
		this.usuario = usuario;
		this.atributos = atributos;
	}

	public String getIdAndamento() {
		return idAndamento;
	}

	public void setIdAndamento(String idAndamento) {
		this.idAndamento = idAndamento;
	}

	public String getIdTarefa() {
		return idTarefa;
	}

	public void setIdTarefa(String idTarefa) {
		this.idTarefa = idTarefa;
	}

	public String getIdTarefaModulo() {
		return idTarefaModulo;
	}

	public void setIdTarefaModulo(String idTarefaModulo) {
		this.idTarefaModulo = idTarefaModulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public AtributoAndamento[] getAtributos() {
		return atributos;
	}

	public void setAtributos(AtributoAndamento[] atributos) {
		this.atributos = atributos;
	}

	private Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof Andamento))
			return false;
		Andamento other = (Andamento) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.idAndamento == null && other.getIdAndamento() == null) || (this.idAndamento != null && this.idAndamento.equals(other.getIdAndamento())))
				&& ((this.idTarefa == null && other.getIdTarefa() == null) || (this.idTarefa != null && this.idTarefa.equals(other.getIdTarefa())))
				&& ((this.idTarefaModulo == null && other.getIdTarefaModulo() == null) || (this.idTarefaModulo != null && this.idTarefaModulo.equals(other.getIdTarefaModulo())))
				&& ((this.descricao == null && other.getDescricao() == null) || (this.descricao != null && this.descricao.equals(other.getDescricao())))
				&& ((this.dataHora == null && other.getDataHora() == null) || (this.dataHora != null && this.dataHora.equals(other.getDataHora())))
				&& ((this.unidade == null && other.getUnidade() == null) || (this.unidade != null && this.unidade.equals(other.getUnidade())))
				&& ((this.usuario == null && other.getUsuario() == null) || (this.usuario != null && this.usuario.equals(other.getUsuario())))
				&& ((this.atributos == null && other.getAtributos() == null) || (this.atributos != null && java.util.Arrays.equals(this.atributos, other.getAtributos())));
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
		if (getIdAndamento() != null) {
			_hashCode += getIdAndamento().hashCode();
		}
		if (getIdTarefa() != null) {
			_hashCode += getIdTarefa().hashCode();
		}
		if (getIdTarefaModulo() != null) {
			_hashCode += getIdTarefaModulo().hashCode();
		}
		if (getDescricao() != null) {
			_hashCode += getDescricao().hashCode();
		}
		if (getDataHora() != null) {
			_hashCode += getDataHora().hashCode();
		}
		if (getUnidade() != null) {
			_hashCode += getUnidade().hashCode();
		}
		if (getUsuario() != null) {
			_hashCode += getUsuario().hashCode();
		}
		if (getAtributos() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getAtributos()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getAtributos(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
