/**
 * UnidadeProcedimentoAberto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.ans.integracao.sei.client;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UnidadeProcedimentoAberto  implements java.io.Serializable {
    private br.gov.ans.integracao.sei.client.Unidade unidade;

    private br.gov.ans.integracao.sei.client.Usuario usuarioAtribuicao;

    public UnidadeProcedimentoAberto() {
    }

    public UnidadeProcedimentoAberto(
           br.gov.ans.integracao.sei.client.Unidade unidade,
           br.gov.ans.integracao.sei.client.Usuario usuarioAtribuicao) {
           this.unidade = unidade;
           this.usuarioAtribuicao = usuarioAtribuicao;
    }


    /**
     * Gets the unidade value for this UnidadeProcedimentoAberto.
     * 
     * @return unidade
     */
    public br.gov.ans.integracao.sei.client.Unidade getUnidade() {
        return unidade;
    }


    /**
     * Sets the unidade value for this UnidadeProcedimentoAberto.
     * 
     * @param unidade
     */
    public void setUnidade(br.gov.ans.integracao.sei.client.Unidade unidade) {
        this.unidade = unidade;
    }


    /**
     * Gets the usuarioAtribuicao value for this UnidadeProcedimentoAberto.
     * 
     * @return usuarioAtribuicao
     */
    public br.gov.ans.integracao.sei.client.Usuario getUsuarioAtribuicao() {
        return usuarioAtribuicao;
    }


    /**
     * Sets the usuarioAtribuicao value for this UnidadeProcedimentoAberto.
     * 
     * @param usuarioAtribuicao
     */
    public void setUsuarioAtribuicao(br.gov.ans.integracao.sei.client.Usuario usuarioAtribuicao) {
        this.usuarioAtribuicao = usuarioAtribuicao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnidadeProcedimentoAberto)) return false;
        UnidadeProcedimentoAberto other = (UnidadeProcedimentoAberto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.unidade==null && other.getUnidade()==null) || 
             (this.unidade!=null &&
              this.unidade.equals(other.getUnidade()))) &&
            ((this.usuarioAtribuicao==null && other.getUsuarioAtribuicao()==null) || 
             (this.usuarioAtribuicao!=null &&
              this.usuarioAtribuicao.equals(other.getUsuarioAtribuicao())));
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
        if (getUnidade() != null) {
            _hashCode += getUnidade().hashCode();
        }
        if (getUsuarioAtribuicao() != null) {
            _hashCode += getUsuarioAtribuicao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
