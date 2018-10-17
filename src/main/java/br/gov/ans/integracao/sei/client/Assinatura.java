/**
 * Assinatura.java
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
public class Assinatura implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;

	private String cargoFuncao;

	private String dataHora;

	private String idUsuario;

	private String idOrigem;

	private String idOrgao;

	private String sigla;

	public Assinatura() {
	}

	public Assinatura(String nome, String cargoFuncao, String dataHora, String idUsuario, String idOrigem, String idOrgao, String sigla) {
		this.nome = nome;
		this.cargoFuncao = cargoFuncao;
		this.dataHora = dataHora;
		this.idUsuario = idUsuario;
		this.idOrigem = idOrigem;
		this.idOrgao = idOrgao;
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargoFuncao() {
		return cargoFuncao;
	}

	public void setCargoFuncao(String cargoFuncao) {
		this.cargoFuncao = cargoFuncao;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getIdOrigem() {
		return idOrigem;
	}

	public void setIdOrigem(String idOrigem) {
		this.idOrigem = idOrigem;
	}

	public String getIdOrgao() {
		return idOrgao;
	}

	public void setIdOrgao(String idOrgao) {
		this.idOrgao = idOrgao;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	private Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof Assinatura))
			return false;
		Assinatura other = (Assinatura) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.nome == null && other.getNome() == null)
						|| (this.nome != null && this.nome.equals(other.getNome())))
				&& ((this.cargoFuncao == null && other.getCargoFuncao() == null)
						|| (this.cargoFuncao != null && this.cargoFuncao.equals(other.getCargoFuncao())))
				&& ((this.dataHora == null && other.getDataHora() == null)
						|| (this.dataHora != null && this.dataHora.equals(other.getDataHora())))
				&& ((this.idUsuario == null && other.getIdUsuario() == null)
						|| (this.idUsuario != null && this.idUsuario.equals(other.getIdUsuario())))
				&& ((this.idOrigem == null && other.getIdOrigem() == null)
						|| (this.idOrigem != null && this.idOrigem.equals(other.getIdOrigem())))
				&& ((this.idOrgao == null && other.getIdOrgao() == null)
						|| (this.idOrgao != null && this.idOrgao.equals(other.getIdOrgao())))
				&& ((this.sigla == null && other.getSigla() == null)
						|| (this.sigla != null && this.sigla.equals(other.getSigla())));
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
		if (getNome() != null) {
			_hashCode += getNome().hashCode();
		}
		if (getCargoFuncao() != null) {
			_hashCode += getCargoFuncao().hashCode();
		}
		if (getDataHora() != null) {
			_hashCode += getDataHora().hashCode();
		}
		if (getIdUsuario() != null) {
			_hashCode += getIdUsuario().hashCode();
		}
		if (getIdOrigem() != null) {
			_hashCode += getIdOrigem().hashCode();
		}
		if (getIdOrgao() != null) {
			_hashCode += getIdOrgao().hashCode();
		}
		if (getSigla() != null) {
			_hashCode += getSigla().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
