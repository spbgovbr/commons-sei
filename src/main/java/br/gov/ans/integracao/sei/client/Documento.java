/**
 * Documento.java
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
public class Documento implements Serializable {

	private static final long serialVersionUID = 1L;

	private String tipo;

	private String idProcedimento;

	private String protocoloProcedimento;

	private String idSerie;

	private String numero;

	private String data;

	private String descricao;

	private String idTipoConferencia;

	private Remetente remetente;

	private Interessado[] interessados;

	private Destinatario[] destinatarios;

	private String observacao;

	private String nomeArquivo;

	private String nivelAcesso;

	private String idHipoteseLegal;

	private String conteudo;

	private String idArquivo;

	private Campo[] campos;

	private String sinBloqueado;

	public Documento() {
	}

	public Documento(String tipo, String idProcedimento, String protocoloProcedimento,
			String idSerie, String numero, String data, String descricao,
			String idTipoConferencia, Remetente remetente,
			Interessado[] interessados,
			Destinatario[] destinatarios, String observacao,
			String nomeArquivo, String nivelAcesso, String idHipoteseLegal,
			String conteudo, byte[] conteudoMTOM, String idArquivo,
			Campo[] campos, String sinBloqueado) {
		
		this.tipo = tipo;
		this.idProcedimento = idProcedimento;
		this.protocoloProcedimento = protocoloProcedimento;
		this.idSerie = idSerie;
		this.numero = numero;
		this.data = data;
		this.descricao = descricao;
		this.idTipoConferencia = idTipoConferencia;
		this.remetente = remetente;
		this.interessados = interessados;
		this.destinatarios = destinatarios;
		this.observacao = observacao;
		this.nomeArquivo = nomeArquivo;
		this.nivelAcesso = nivelAcesso;
		this.idHipoteseLegal = idHipoteseLegal;
		this.conteudo = conteudo;
		this.idArquivo = idArquivo;
		this.campos = campos;
		this.sinBloqueado = sinBloqueado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getIdProcedimento() {
		return idProcedimento;
	}

	public void setIdProcedimento(String idProcedimento) {
		this.idProcedimento = idProcedimento;
	}

	public String getProtocoloProcedimento() {
		return protocoloProcedimento;
	}

	public void setProtocoloProcedimento(String protocoloProcedimento) {
		this.protocoloProcedimento = protocoloProcedimento;
	}

	public String getIdSerie() {
		return idSerie;
	}

	public void setIdSerie(String idSerie) {
		this.idSerie = idSerie;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIdTipoConferencia() {
		return idTipoConferencia;
	}

	public void setIdTipoConferencia(String idTipoConferencia) {
		this.idTipoConferencia = idTipoConferencia;
	}

	public Remetente getRemetente() {
		return remetente;
	}

	public void setRemetente(Remetente remetente) {
		this.remetente = remetente;
	}

	public Interessado[] getInteressados() {
		return interessados;
	}

	public void setInteressados(Interessado[] interessados) {
		this.interessados = interessados;
	}

	public Destinatario[] getDestinatarios() {
		return destinatarios;
	}

	public void setDestinatarios(Destinatario[] destinatarios) {
		this.destinatarios = destinatarios;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
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

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getIdArquivo() {
		return idArquivo;
	}

	public void setIdArquivo(String idArquivo) {
		this.idArquivo = idArquivo;
	}

	public Campo[] getCampos() {
		return campos;
	}

	public void setCampos(Campo[] campos) {
		this.campos = campos;
	}

	public String getSinBloqueado() {
		return sinBloqueado;
	}

	public void setSinBloqueado(String sinBloqueado) {
		this.sinBloqueado = sinBloqueado;
	}

	private Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof Documento))
			return false;
		Documento other = (Documento) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.tipo == null && other.getTipo() == null)
						|| (this.tipo != null && this.tipo.equals(other.getTipo())))
				&& ((this.idProcedimento == null && other.getIdProcedimento() == null)
						|| (this.idProcedimento != null && this.idProcedimento.equals(other.getIdProcedimento())))
				&& ((this.protocoloProcedimento == null && other.getProtocoloProcedimento() == null)
						|| (this.protocoloProcedimento != null
								&& this.protocoloProcedimento.equals(other.getProtocoloProcedimento())))
				&& ((this.idSerie == null && other.getIdSerie() == null)
						|| (this.idSerie != null && this.idSerie.equals(other.getIdSerie())))
				&& ((this.numero == null && other.getNumero() == null)
						|| (this.numero != null && this.numero.equals(other.getNumero())))
				&& ((this.data == null && other.getData() == null)
						|| (this.data != null && this.data.equals(other.getData())))
				&& ((this.descricao == null && other.getDescricao() == null)
						|| (this.descricao != null && this.descricao.equals(other.getDescricao())))
				&& ((this.idTipoConferencia == null && other.getIdTipoConferencia() == null)
						|| (this.idTipoConferencia != null
								&& this.idTipoConferencia.equals(other.getIdTipoConferencia())))
				&& ((this.remetente == null && other.getRemetente() == null)
						|| (this.remetente != null && this.remetente.equals(other.getRemetente())))
				&& ((this.interessados == null && other.getInteressados() == null) || (this.interessados != null
						&& java.util.Arrays.equals(this.interessados, other.getInteressados())))
				&& ((this.destinatarios == null && other.getDestinatarios() == null) || (this.destinatarios != null
						&& java.util.Arrays.equals(this.destinatarios, other.getDestinatarios())))
				&& ((this.observacao == null && other.getObservacao() == null)
						|| (this.observacao != null && this.observacao.equals(other.getObservacao())))
				&& ((this.nomeArquivo == null && other.getNomeArquivo() == null)
						|| (this.nomeArquivo != null && this.nomeArquivo.equals(other.getNomeArquivo())))
				&& ((this.nivelAcesso == null && other.getNivelAcesso() == null)
						|| (this.nivelAcesso != null && this.nivelAcesso.equals(other.getNivelAcesso())))
				&& ((this.idHipoteseLegal == null && other.getIdHipoteseLegal() == null)
						|| (this.idHipoteseLegal != null && this.idHipoteseLegal.equals(other.getIdHipoteseLegal())))
				&& ((this.conteudo == null && other.getConteudo() == null)
						|| (this.conteudo != null && this.conteudo.equals(other.getConteudo())))
				&& ((this.idArquivo == null && other.getIdArquivo() == null)
						|| (this.idArquivo != null && this.idArquivo.equals(other.getIdArquivo())))
				&& ((this.campos == null && other.getCampos() == null)
						|| (this.campos != null && java.util.Arrays.equals(this.campos, other.getCampos())))
				&& ((this.sinBloqueado == null && other.getSinBloqueado() == null)
						|| (this.sinBloqueado != null && this.sinBloqueado.equals(other.getSinBloqueado())));
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
		if (getTipo() != null) {
			_hashCode += getTipo().hashCode();
		}
		if (getIdProcedimento() != null) {
			_hashCode += getIdProcedimento().hashCode();
		}
		if (getProtocoloProcedimento() != null) {
			_hashCode += getProtocoloProcedimento().hashCode();
		}
		if (getIdSerie() != null) {
			_hashCode += getIdSerie().hashCode();
		}
		if (getNumero() != null) {
			_hashCode += getNumero().hashCode();
		}
		if (getData() != null) {
			_hashCode += getData().hashCode();
		}
		if (getDescricao() != null) {
			_hashCode += getDescricao().hashCode();
		}
		if (getIdTipoConferencia() != null) {
			_hashCode += getIdTipoConferencia().hashCode();
		}
		if (getRemetente() != null) {
			_hashCode += getRemetente().hashCode();
		}
		if (getInteressados() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getInteressados()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getInteressados(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getDestinatarios() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getDestinatarios()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getDestinatarios(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getObservacao() != null) {
			_hashCode += getObservacao().hashCode();
		}
		if (getNomeArquivo() != null) {
			_hashCode += getNomeArquivo().hashCode();
		}
		if (getNivelAcesso() != null) {
			_hashCode += getNivelAcesso().hashCode();
		}
		if (getIdHipoteseLegal() != null) {
			_hashCode += getIdHipoteseLegal().hashCode();
		}
		if (getConteudo() != null) {
			_hashCode += getConteudo().hashCode();
		}
		if (getIdArquivo() != null) {
			_hashCode += getIdArquivo().hashCode();
		}
		if (getCampos() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getCampos()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getCampos(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getSinBloqueado() != null) {
			_hashCode += getSinBloqueado().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
