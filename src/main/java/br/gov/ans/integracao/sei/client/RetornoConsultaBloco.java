/**
 * RetornoConsultaBloco.java
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
public class RetornoConsultaBloco  implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idBloco;

    private Unidade unidade;

    private Usuario usuario;

    private String descricao;

    private String tipo;

    private String estado;

    private Unidade[] unidadesDisponibilizacao;

    private ProtocoloBloco[] protocolos;

    public RetornoConsultaBloco() {
    }

    public RetornoConsultaBloco(
           String idBloco,
           Unidade unidade,
           Usuario usuario,
           String descricao,
           String tipo,
           String estado,
           Unidade[] unidadesDisponibilizacao,
           ProtocoloBloco[] protocolos) {
           this.idBloco = idBloco;
           this.unidade = unidade;
           this.usuario = usuario;
           this.descricao = descricao;
           this.tipo = tipo;
           this.estado = estado;
           this.unidadesDisponibilizacao = unidadesDisponibilizacao;
           this.protocolos = protocolos;
    }


    /**
     * Gets the idBloco value for this RetornoConsultaBloco.
     * 
     * @return idBloco
     */
    public String getIdBloco() {
        return idBloco;
    }


    /**
     * Sets the idBloco value for this RetornoConsultaBloco.
     * 
     * @param idBloco
     */
    public void setIdBloco(String idBloco) {
        this.idBloco = idBloco;
    }


    /**
     * Gets the unidade value for this RetornoConsultaBloco.
     * 
     * @return unidade
     */
    public Unidade getUnidade() {
        return unidade;
    }


    /**
     * Sets the unidade value for this RetornoConsultaBloco.
     * 
     * @param unidade
     */
    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }


    /**
     * Gets the usuario value for this RetornoConsultaBloco.
     * 
     * @return usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this RetornoConsultaBloco.
     * 
     * @param usuario
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    /**
     * Gets the descricao value for this RetornoConsultaBloco.
     * 
     * @return descricao
     */
    public String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this RetornoConsultaBloco.
     * 
     * @param descricao
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the tipo value for this RetornoConsultaBloco.
     * 
     * @return tipo
     */
    public String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this RetornoConsultaBloco.
     * 
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the estado value for this RetornoConsultaBloco.
     * 
     * @return estado
     */
    public String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this RetornoConsultaBloco.
     * 
     * @param estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }


    /**
     * Gets the unidadesDisponibilizacao value for this RetornoConsultaBloco.
     * 
     * @return unidadesDisponibilizacao
     */
    public Unidade[] getUnidadesDisponibilizacao() {
        return unidadesDisponibilizacao;
    }


    /**
     * Sets the unidadesDisponibilizacao value for this RetornoConsultaBloco.
     * 
     * @param unidadesDisponibilizacao
     */
    public void setUnidadesDisponibilizacao(Unidade[] unidadesDisponibilizacao) {
        this.unidadesDisponibilizacao = unidadesDisponibilizacao;
    }


    /**
     * Gets the protocolos value for this RetornoConsultaBloco.
     * 
     * @return protocolos
     */
    public ProtocoloBloco[] getProtocolos() {
        return protocolos;
    }


    /**
     * Sets the protocolos value for this RetornoConsultaBloco.
     * 
     * @param protocolos
     */
    public void setProtocolos(ProtocoloBloco[] protocolos) {
        this.protocolos = protocolos;
    }

    private Object __equalsCalc = null;
    public boolean equals(Object obj) {
        if (!(obj instanceof RetornoConsultaBloco)) return false;
        RetornoConsultaBloco other = (RetornoConsultaBloco) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idBloco==null && other.getIdBloco()==null) || 
             (this.idBloco!=null &&
              this.idBloco.equals(other.getIdBloco()))) &&
            ((this.unidade==null && other.getUnidade()==null) || 
             (this.unidade!=null &&
              this.unidade.equals(other.getUnidade()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.unidadesDisponibilizacao==null && other.getUnidadesDisponibilizacao()==null) || 
             (this.unidadesDisponibilizacao!=null &&
              java.util.Arrays.equals(this.unidadesDisponibilizacao, other.getUnidadesDisponibilizacao()))) &&
            ((this.protocolos==null && other.getProtocolos()==null) || 
             (this.protocolos!=null &&
              java.util.Arrays.equals(this.protocolos, other.getProtocolos())));
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
        if (getIdBloco() != null) {
            _hashCode += getIdBloco().hashCode();
        }
        if (getUnidade() != null) {
            _hashCode += getUnidade().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getUnidadesDisponibilizacao() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnidadesDisponibilizacao());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getUnidadesDisponibilizacao(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProtocolos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProtocolos());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProtocolos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }
}
