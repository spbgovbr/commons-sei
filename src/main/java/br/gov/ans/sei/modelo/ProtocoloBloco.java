/**
 * ProtocoloBloco.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.ans.sei.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProtocoloBloco  implements java.io.Serializable {
    private java.lang.String protocoloFormatado;

    private java.lang.String identificacao;

    private Assinatura[] assinaturas;

    public ProtocoloBloco() {
    }

    public ProtocoloBloco(
           java.lang.String protocoloFormatado,
           java.lang.String identificacao,
           Assinatura[] assinaturas) {
           this.protocoloFormatado = protocoloFormatado;
           this.identificacao = identificacao;
           this.assinaturas = assinaturas;
    }


    /**
     * Gets the protocoloFormatado value for this ProtocoloBloco.
     * 
     * @return protocoloFormatado
     */
    public java.lang.String getProtocoloFormatado() {
        return protocoloFormatado;
    }


    /**
     * Sets the protocoloFormatado value for this ProtocoloBloco.
     * 
     * @param protocoloFormatado
     */
    public void setProtocoloFormatado(java.lang.String protocoloFormatado) {
        this.protocoloFormatado = protocoloFormatado;
    }


    /**
     * Gets the identificacao value for this ProtocoloBloco.
     * 
     * @return identificacao
     */
    public java.lang.String getIdentificacao() {
        return identificacao;
    }


    /**
     * Sets the identificacao value for this ProtocoloBloco.
     * 
     * @param identificacao
     */
    public void setIdentificacao(java.lang.String identificacao) {
        this.identificacao = identificacao;
    }


    /**
     * Gets the assinaturas value for this ProtocoloBloco.
     * 
     * @return assinaturas
     */
    public Assinatura[] getAssinaturas() {
        return assinaturas;
    }


    /**
     * Sets the assinaturas value for this ProtocoloBloco.
     * 
     * @param assinaturas
     */
    public void setAssinaturas(Assinatura[] assinaturas) {
        this.assinaturas = assinaturas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProtocoloBloco)) return false;
        ProtocoloBloco other = (ProtocoloBloco) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.protocoloFormatado==null && other.getProtocoloFormatado()==null) || 
             (this.protocoloFormatado!=null &&
              this.protocoloFormatado.equals(other.getProtocoloFormatado()))) &&
            ((this.identificacao==null && other.getIdentificacao()==null) || 
             (this.identificacao!=null &&
              this.identificacao.equals(other.getIdentificacao()))) &&
            ((this.assinaturas==null && other.getAssinaturas()==null) || 
             (this.assinaturas!=null &&
              java.util.Arrays.equals(this.assinaturas, other.getAssinaturas())));
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
        if (getProtocoloFormatado() != null) {
            _hashCode += getProtocoloFormatado().hashCode();
        }
        if (getIdentificacao() != null) {
            _hashCode += getIdentificacao().hashCode();
        }
        if (getAssinaturas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssinaturas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssinaturas(), i);
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
