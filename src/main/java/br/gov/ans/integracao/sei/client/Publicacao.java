/**
 * Publicacao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.ans.integracao.sei.client;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Publicacao  implements java.io.Serializable {
    private java.lang.String nomeVeiculo;

    private java.lang.String numero;

    private java.lang.String dataDisponibilizacao;

    private java.lang.String dataPublicacao;

    private java.lang.String estado;

    private br.gov.ans.integracao.sei.client.PublicacaoImprensaNacional imprensaNacional;

    public Publicacao() {
    }

    public Publicacao(
           java.lang.String nomeVeiculo,
           java.lang.String numero,
           java.lang.String dataDisponibilizacao,
           java.lang.String dataPublicacao,
           java.lang.String estado,
           br.gov.ans.integracao.sei.client.PublicacaoImprensaNacional imprensaNacional) {
           this.nomeVeiculo = nomeVeiculo;
           this.numero = numero;
           this.dataDisponibilizacao = dataDisponibilizacao;
           this.dataPublicacao = dataPublicacao;
           this.estado = estado;
           this.imprensaNacional = imprensaNacional;
    }


    /**
     * Gets the nomeVeiculo value for this Publicacao.
     * 
     * @return nomeVeiculo
     */
    public java.lang.String getNomeVeiculo() {
        return nomeVeiculo;
    }


    /**
     * Sets the nomeVeiculo value for this Publicacao.
     * 
     * @param nomeVeiculo
     */
    public void setNomeVeiculo(java.lang.String nomeVeiculo) {
        this.nomeVeiculo = nomeVeiculo;
    }


    /**
     * Gets the numero value for this Publicacao.
     * 
     * @return numero
     */
    public java.lang.String getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this Publicacao.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }


    /**
     * Gets the dataDisponibilizacao value for this Publicacao.
     * 
     * @return dataDisponibilizacao
     */
    public java.lang.String getDataDisponibilizacao() {
        return dataDisponibilizacao;
    }


    /**
     * Sets the dataDisponibilizacao value for this Publicacao.
     * 
     * @param dataDisponibilizacao
     */
    public void setDataDisponibilizacao(java.lang.String dataDisponibilizacao) {
        this.dataDisponibilizacao = dataDisponibilizacao;
    }


    /**
     * Gets the dataPublicacao value for this Publicacao.
     * 
     * @return dataPublicacao
     */
    public java.lang.String getDataPublicacao() {
        return dataPublicacao;
    }


    /**
     * Sets the dataPublicacao value for this Publicacao.
     * 
     * @param dataPublicacao
     */
    public void setDataPublicacao(java.lang.String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }


    /**
     * Gets the estado value for this Publicacao.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this Publicacao.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the imprensaNacional value for this Publicacao.
     * 
     * @return imprensaNacional
     */
    public br.gov.ans.integracao.sei.client.PublicacaoImprensaNacional getImprensaNacional() {
        return imprensaNacional;
    }


    /**
     * Sets the imprensaNacional value for this Publicacao.
     * 
     * @param imprensaNacional
     */
    public void setImprensaNacional(br.gov.ans.integracao.sei.client.PublicacaoImprensaNacional imprensaNacional) {
        this.imprensaNacional = imprensaNacional;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Publicacao)) return false;
        Publicacao other = (Publicacao) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nomeVeiculo==null && other.getNomeVeiculo()==null) || 
             (this.nomeVeiculo!=null &&
              this.nomeVeiculo.equals(other.getNomeVeiculo()))) &&
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            ((this.dataDisponibilizacao==null && other.getDataDisponibilizacao()==null) || 
             (this.dataDisponibilizacao!=null &&
              this.dataDisponibilizacao.equals(other.getDataDisponibilizacao()))) &&
            ((this.dataPublicacao==null && other.getDataPublicacao()==null) || 
             (this.dataPublicacao!=null &&
              this.dataPublicacao.equals(other.getDataPublicacao()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.imprensaNacional==null && other.getImprensaNacional()==null) || 
             (this.imprensaNacional!=null &&
              this.imprensaNacional.equals(other.getImprensaNacional())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
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
