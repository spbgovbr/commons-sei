/**
 * Unidade.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.ans.integracao.sei.client;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Unidade  implements java.io.Serializable {
    private java.lang.String idUnidade;

    private java.lang.String sigla;

    private java.lang.String descricao;

    public Unidade() {
    }

    public Unidade(
           java.lang.String idUnidade,
           java.lang.String sigla,
           java.lang.String descricao) {
           this.idUnidade = idUnidade;
           this.sigla = sigla;
           this.descricao = descricao;
    }


    /**
     * Gets the idUnidade value for this Unidade.
     * 
     * @return idUnidade
     */
    public java.lang.String getIdUnidade() {
        return idUnidade;
    }


    /**
     * Sets the idUnidade value for this Unidade.
     * 
     * @param idUnidade
     */
    public void setIdUnidade(java.lang.String idUnidade) {
        this.idUnidade = idUnidade;
    }


    /**
     * Gets the sigla value for this Unidade.
     * 
     * @return sigla
     */
    public java.lang.String getSigla() {
        return sigla;
    }


    /**
     * Sets the sigla value for this Unidade.
     * 
     * @param sigla
     */
    public void setSigla(java.lang.String sigla) {
        this.sigla = sigla;
    }


    /**
     * Gets the descricao value for this Unidade.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this Unidade.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Unidade)) return false;
        Unidade other = (Unidade) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idUnidade==null && other.getIdUnidade()==null) || 
             (this.idUnidade!=null &&
              this.idUnidade.equals(other.getIdUnidade()))) &&
            ((this.sigla==null && other.getSigla()==null) || 
             (this.sigla!=null &&
              this.sigla.equals(other.getSigla()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao())));
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
        if (getIdUnidade() != null) {
            _hashCode += getIdUnidade().hashCode();
        }
        if (getSigla() != null) {
            _hashCode += getSigla().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
