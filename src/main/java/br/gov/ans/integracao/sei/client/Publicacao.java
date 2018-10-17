/**
 * Publicacao.java
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
public class Publicacao implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nomeVeiculo;

	private String numero;

	private String dataDisponibilizacao;

	private String dataPublicacao;

	private String estado;

	private PublicacaoImprensaNacional imprensaNacional;

	public Publicacao() {
	}

	public Publicacao(String nomeVeiculo, String numero, String dataDisponibilizacao, String dataPublicacao, String estado, PublicacaoImprensaNacional imprensaNacional) {
		this.nomeVeiculo = nomeVeiculo;
		this.numero = numero;
		this.dataDisponibilizacao = dataDisponibilizacao;
		this.dataPublicacao = dataPublicacao;
		this.estado = estado;
		this.imprensaNacional = imprensaNacional;
	}

	public String getNomeVeiculo() {
		return nomeVeiculo;
	}

	public void setNomeVeiculo(String nomeVeiculo) {
		this.nomeVeiculo = nomeVeiculo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDataDisponibilizacao() {
		return dataDisponibilizacao;
	}

	public void setDataDisponibilizacao(String dataDisponibilizacao) {
		this.dataDisponibilizacao = dataDisponibilizacao;
	}

	public String getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public PublicacaoImprensaNacional getImprensaNacional() {
		return imprensaNacional;
	}

	public void setImprensaNacional(PublicacaoImprensaNacional imprensaNacional) {
		this.imprensaNacional = imprensaNacional;
	}

	private Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof Publicacao))
			return false;
		Publicacao other = (Publicacao) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.nomeVeiculo == null && other.getNomeVeiculo() == null)
						|| (this.nomeVeiculo != null && this.nomeVeiculo.equals(other.getNomeVeiculo())))
				&& ((this.numero == null && other.getNumero() == null)
						|| (this.numero != null && this.numero.equals(other.getNumero())))
				&& ((this.dataDisponibilizacao == null && other.getDataDisponibilizacao() == null)
						|| (this.dataDisponibilizacao != null
								&& this.dataDisponibilizacao.equals(other.getDataDisponibilizacao())))
				&& ((this.dataPublicacao == null && other.getDataPublicacao() == null)
						|| (this.dataPublicacao != null && this.dataPublicacao.equals(other.getDataPublicacao())))
				&& ((this.estado == null && other.getEstado() == null)
						|| (this.estado != null && this.estado.equals(other.getEstado())))
				&& ((this.imprensaNacional == null && other.getImprensaNacional() == null)
						|| (this.imprensaNacional != null
								&& this.imprensaNacional.equals(other.getImprensaNacional())));
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
		if (getNomeVeiculo() != null) {
			_hashCode += getNomeVeiculo().hashCode();
		}
		if (getNumero() != null) {
			_hashCode += getNumero().hashCode();
		}
		if (getDataDisponibilizacao() != null) {
			_hashCode += getDataDisponibilizacao().hashCode();
		}
		if (getDataPublicacao() != null) {
			_hashCode += getDataPublicacao().hashCode();
		}
		if (getEstado() != null) {
			_hashCode += getEstado().hashCode();
		}
		if (getImprensaNacional() != null) {
			_hashCode += getImprensaNacional().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
