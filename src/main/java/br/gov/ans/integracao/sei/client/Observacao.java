/**
 * Observacao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.ans.integracao.sei.client;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Observacao  implements java.io.Serializable {
    private java.lang.String descricao;

    private br.gov.ans.integracao.sei.client.Unidade unidade;

    public Observacao() {
    }

    public Observacao(
           java.lang.String descricao,
           br.gov.ans.integracao.sei.client.Unidade unidade) {
           this.descricao = descricao;
           this.unidade = unidade;
    }


    /**
     * Gets the descricao value for this Observacao.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this Observacao.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the unidade value for this Observacao.
     * 
     * @return unidade
     */
    public br.gov.ans.integracao.sei.client.Unidade getUnidade() {
        return unidade;
    }


    /**
     * Sets the unidade value for this Observacao.
     * 
     * @param unidade
     */
    public void setUnidade(br.gov.ans.integracao.sei.client.Unidade unidade) {
        this.unidade = unidade;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Observacao)) return false;
        Observacao other = (Observacao) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.unidade==null && other.getUnidade()==null) || 
             (this.unidade!=null &&
              this.unidade.equals(other.getUnidade())));
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
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getUnidade() != null) {
            _hashCode += getUnidade().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
