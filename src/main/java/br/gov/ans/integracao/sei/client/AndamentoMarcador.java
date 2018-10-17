/**
 * AndamentoMarcador.java
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
public class AndamentoMarcador implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idAndamentoMarcador;

	private String texto;

	private String dataHora;

	private Usuario usuario;

	private Marcador marcador;

	public AndamentoMarcador() {
	}

	public AndamentoMarcador(String idAndamentoMarcador, String texto, String dataHora, Usuario usuario, Marcador marcador) {
		this.idAndamentoMarcador = idAndamentoMarcador;
		this.texto = texto;
		this.dataHora = dataHora;
		this.usuario = usuario;
		this.marcador = marcador;
	}

	public String getIdAndamentoMarcador() {
		return idAndamentoMarcador;
	}

	public void setIdAndamentoMarcador(String idAndamentoMarcador) {
		this.idAndamentoMarcador = idAndamentoMarcador;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Marcador getMarcador() {
		return marcador;
	}

	public void setMarcador(Marcador marcador) {
		this.marcador = marcador;
	}

	private Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof AndamentoMarcador))
			return false;
		AndamentoMarcador other = (AndamentoMarcador) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.idAndamentoMarcador == null && other.getIdAndamentoMarcador() == null)
						|| (this.idAndamentoMarcador != null
								&& this.idAndamentoMarcador.equals(other.getIdAndamentoMarcador())))
				&& ((this.texto == null && other.getTexto() == null)
						|| (this.texto != null && this.texto.equals(other.getTexto())))
				&& ((this.dataHora == null && other.getDataHora() == null)
						|| (this.dataHora != null && this.dataHora.equals(other.getDataHora())))
				&& ((this.usuario == null && other.getUsuario() == null)
						|| (this.usuario != null && this.usuario.equals(other.getUsuario())))
				&& ((this.marcador == null && other.getMarcador() == null)
						|| (this.marcador != null && this.marcador.equals(other.getMarcador())));
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
		if (getIdAndamentoMarcador() != null) {
			_hashCode += getIdAndamentoMarcador().hashCode();
		}
		if (getTexto() != null) {
			_hashCode += getTexto().hashCode();
		}
		if (getDataHora() != null) {
			_hashCode += getDataHora().hashCode();
		}
		if (getUsuario() != null) {
			_hashCode += getUsuario().hashCode();
		}
		if (getMarcador() != null) {
			_hashCode += getMarcador().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
