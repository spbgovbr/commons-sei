/**
 * RetornoGeracaoProcedimento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.ans.sei.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RetornoGeracaoProcedimento  implements java.io.Serializable {
    private java.lang.String idProcedimento;

    private java.lang.String procedimentoFormatado;

    private java.lang.String linkAcesso;

    private RetornoInclusaoDocumento[] retornoInclusaoDocumentos;

    public RetornoGeracaoProcedimento() {
    }

    public RetornoGeracaoProcedimento(
           java.lang.String idProcedimento,
           java.lang.String procedimentoFormatado,
           java.lang.String linkAcesso,
           RetornoInclusaoDocumento[] retornoInclusaoDocumentos) {
           this.idProcedimento = idProcedimento;
           this.procedimentoFormatado = procedimentoFormatado;
           this.linkAcesso = linkAcesso;
           this.retornoInclusaoDocumentos = retornoInclusaoDocumentos;
    }


    /**
     * Gets the idProcedimento value for this RetornoGeracaoProcedimento.
     * 
     * @return idProcedimento
     */
    public java.lang.String getIdProcedimento() {
        return idProcedimento;
    }


    /**
     * Sets the idProcedimento value for this RetornoGeracaoProcedimento.
     * 
     * @param idProcedimento
     */
    public void setIdProcedimento(java.lang.String idProcedimento) {
        this.idProcedimento = idProcedimento;
    }


    /**
     * Gets the procedimentoFormatado value for this RetornoGeracaoProcedimento.
     * 
     * @return procedimentoFormatado
     */
    public java.lang.String getProcedimentoFormatado() {
        return procedimentoFormatado;
    }


    /**
     * Sets the procedimentoFormatado value for this RetornoGeracaoProcedimento.
     * 
     * @param procedimentoFormatado
     */
    public void setProcedimentoFormatado(java.lang.String procedimentoFormatado) {
        this.procedimentoFormatado = procedimentoFormatado;
    }


    /**
     * Gets the linkAcesso value for this RetornoGeracaoProcedimento.
     * 
     * @return linkAcesso
     */
    public java.lang.String getLinkAcesso() {
        return linkAcesso;
    }


    /**
     * Sets the linkAcesso value for this RetornoGeracaoProcedimento.
     * 
     * @param linkAcesso
     */
    public void setLinkAcesso(java.lang.String linkAcesso) {
        this.linkAcesso = linkAcesso;
    }


    /**
     * Gets the retornoInclusaoDocumentos value for this RetornoGeracaoProcedimento.
     * 
     * @return retornoInclusaoDocumentos
     */
    public RetornoInclusaoDocumento[] getRetornoInclusaoDocumentos() {
        return retornoInclusaoDocumentos;
    }


    /**
     * Sets the retornoInclusaoDocumentos value for this RetornoGeracaoProcedimento.
     * 
     * @param retornoInclusaoDocumentos
     */
    public void setRetornoInclusaoDocumentos(RetornoInclusaoDocumento[] retornoInclusaoDocumentos) {
        this.retornoInclusaoDocumentos = retornoInclusaoDocumentos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetornoGeracaoProcedimento)) return false;
        RetornoGeracaoProcedimento other = (RetornoGeracaoProcedimento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idProcedimento==null && other.getIdProcedimento()==null) || 
             (this.idProcedimento!=null &&
              this.idProcedimento.equals(other.getIdProcedimento()))) &&
            ((this.procedimentoFormatado==null && other.getProcedimentoFormatado()==null) || 
             (this.procedimentoFormatado!=null &&
              this.procedimentoFormatado.equals(other.getProcedimentoFormatado()))) &&
            ((this.linkAcesso==null && other.getLinkAcesso()==null) || 
             (this.linkAcesso!=null &&
              this.linkAcesso.equals(other.getLinkAcesso()))) &&
            ((this.retornoInclusaoDocumentos==null && other.getRetornoInclusaoDocumentos()==null) || 
             (this.retornoInclusaoDocumentos!=null &&
              java.util.Arrays.equals(this.retornoInclusaoDocumentos, other.getRetornoInclusaoDocumentos())));
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
        if (getIdProcedimento() != null) {
            _hashCode += getIdProcedimento().hashCode();
        }
        if (getProcedimentoFormatado() != null) {
            _hashCode += getProcedimentoFormatado().hashCode();
        }
        if (getLinkAcesso() != null) {
            _hashCode += getLinkAcesso().hashCode();
        }
        if (getRetornoInclusaoDocumentos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRetornoInclusaoDocumentos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRetornoInclusaoDocumentos(), i);
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
