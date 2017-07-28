/**
 * ProcedimentoResumido.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.ans.integracao.sei.client;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProcedimentoResumido  implements java.io.Serializable {
    private java.lang.String idProcedimento;

    private java.lang.String procedimentoFormatado;

    private br.gov.ans.integracao.sei.client.TipoProcedimento tipoProcedimento;

    public ProcedimentoResumido() {
    }

    public ProcedimentoResumido(
           java.lang.String idProcedimento,
           java.lang.String procedimentoFormatado,
           br.gov.ans.integracao.sei.client.TipoProcedimento tipoProcedimento) {
           this.idProcedimento = idProcedimento;
           this.procedimentoFormatado = procedimentoFormatado;
           this.tipoProcedimento = tipoProcedimento;
    }


    /**
     * Gets the idProcedimento value for this ProcedimentoResumido.
     * 
     * @return idProcedimento
     */
    public java.lang.String getIdProcedimento() {
        return idProcedimento;
    }


    /**
     * Sets the idProcedimento value for this ProcedimentoResumido.
     * 
     * @param idProcedimento
     */
    public void setIdProcedimento(java.lang.String idProcedimento) {
        this.idProcedimento = idProcedimento;
    }


    /**
     * Gets the procedimentoFormatado value for this ProcedimentoResumido.
     * 
     * @return procedimentoFormatado
     */
    public java.lang.String getProcedimentoFormatado() {
        return procedimentoFormatado;
    }


    /**
     * Sets the procedimentoFormatado value for this ProcedimentoResumido.
     * 
     * @param procedimentoFormatado
     */
    public void setProcedimentoFormatado(java.lang.String procedimentoFormatado) {
        this.procedimentoFormatado = procedimentoFormatado;
    }


    /**
     * Gets the tipoProcedimento value for this ProcedimentoResumido.
     * 
     * @return tipoProcedimento
     */
    public br.gov.ans.integracao.sei.client.TipoProcedimento getTipoProcedimento() {
        return tipoProcedimento;
    }


    /**
     * Sets the tipoProcedimento value for this ProcedimentoResumido.
     * 
     * @param tipoProcedimento
     */
    public void setTipoProcedimento(br.gov.ans.integracao.sei.client.TipoProcedimento tipoProcedimento) {
        this.tipoProcedimento = tipoProcedimento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcedimentoResumido)) return false;
        ProcedimentoResumido other = (ProcedimentoResumido) obj;
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
            ((this.tipoProcedimento==null && other.getTipoProcedimento()==null) || 
             (this.tipoProcedimento!=null &&
              this.tipoProcedimento.equals(other.getTipoProcedimento())));
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
        if (getTipoProcedimento() != null) {
            _hashCode += getTipoProcedimento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
