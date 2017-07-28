/**
 * DefinicaoMarcador.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.ans.integracao.sei.client;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DefinicaoMarcador  implements java.io.Serializable {
    private java.lang.String protocoloProcedimento;

    private java.lang.String idMarcador;

    private java.lang.String texto;

    public DefinicaoMarcador() {
    }

    public DefinicaoMarcador(
           java.lang.String protocoloProcedimento,
           java.lang.String idMarcador,
           java.lang.String texto) {
           this.protocoloProcedimento = protocoloProcedimento;
           this.idMarcador = idMarcador;
           this.texto = texto;
    }


    /**
     * Gets the protocoloProcedimento value for this DefinicaoMarcador.
     * 
     * @return protocoloProcedimento
     */
    public java.lang.String getProtocoloProcedimento() {
        return protocoloProcedimento;
    }


    /**
     * Sets the protocoloProcedimento value for this DefinicaoMarcador.
     * 
     * @param protocoloProcedimento
     */
    public void setProtocoloProcedimento(java.lang.String protocoloProcedimento) {
        this.protocoloProcedimento = protocoloProcedimento;
    }


    /**
     * Gets the idMarcador value for this DefinicaoMarcador.
     * 
     * @return idMarcador
     */
    public java.lang.String getIdMarcador() {
        return idMarcador;
    }


    /**
     * Sets the idMarcador value for this DefinicaoMarcador.
     * 
     * @param idMarcador
     */
    public void setIdMarcador(java.lang.String idMarcador) {
        this.idMarcador = idMarcador;
    }


    /**
     * Gets the texto value for this DefinicaoMarcador.
     * 
     * @return texto
     */
    public java.lang.String getTexto() {
        return texto;
    }


    /**
     * Sets the texto value for this DefinicaoMarcador.
     * 
     * @param texto
     */
    public void setTexto(java.lang.String texto) {
        this.texto = texto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DefinicaoMarcador)) return false;
        DefinicaoMarcador other = (DefinicaoMarcador) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.protocoloProcedimento==null && other.getProtocoloProcedimento()==null) || 
             (this.protocoloProcedimento!=null &&
              this.protocoloProcedimento.equals(other.getProtocoloProcedimento()))) &&
            ((this.idMarcador==null && other.getIdMarcador()==null) || 
             (this.idMarcador!=null &&
              this.idMarcador.equals(other.getIdMarcador()))) &&
            ((this.texto==null && other.getTexto()==null) || 
             (this.texto!=null &&
              this.texto.equals(other.getTexto())));
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
        if (getProtocoloProcedimento() != null) {
            _hashCode += getProtocoloProcedimento().hashCode();
        }
        if (getIdMarcador() != null) {
            _hashCode += getIdMarcador().hashCode();
        }
        if (getTexto() != null) {
            _hashCode += getTexto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
