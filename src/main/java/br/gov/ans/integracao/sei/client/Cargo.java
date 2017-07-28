/**
 * Cargo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.ans.integracao.sei.client;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cargo  implements java.io.Serializable {
    private java.lang.String idCargo;

    private java.lang.String expressaoCargo;

    private java.lang.String expressaoTratamento;

    private java.lang.String expressaoVocativo;

    public Cargo() {
    }

    public Cargo(
           java.lang.String idCargo,
           java.lang.String expressaoCargo,
           java.lang.String expressaoTratamento,
           java.lang.String expressaoVocativo) {
           this.idCargo = idCargo;
           this.expressaoCargo = expressaoCargo;
           this.expressaoTratamento = expressaoTratamento;
           this.expressaoVocativo = expressaoVocativo;
    }


    /**
     * Gets the idCargo value for this Cargo.
     * 
     * @return idCargo
     */
    public java.lang.String getIdCargo() {
        return idCargo;
    }


    /**
     * Sets the idCargo value for this Cargo.
     * 
     * @param idCargo
     */
    public void setIdCargo(java.lang.String idCargo) {
        this.idCargo = idCargo;
    }


    /**
     * Gets the expressaoCargo value for this Cargo.
     * 
     * @return expressaoCargo
     */
    public java.lang.String getExpressaoCargo() {
        return expressaoCargo;
    }


    /**
     * Sets the expressaoCargo value for this Cargo.
     * 
     * @param expressaoCargo
     */
    public void setExpressaoCargo(java.lang.String expressaoCargo) {
        this.expressaoCargo = expressaoCargo;
    }


    /**
     * Gets the expressaoTratamento value for this Cargo.
     * 
     * @return expressaoTratamento
     */
    public java.lang.String getExpressaoTratamento() {
        return expressaoTratamento;
    }


    /**
     * Sets the expressaoTratamento value for this Cargo.
     * 
     * @param expressaoTratamento
     */
    public void setExpressaoTratamento(java.lang.String expressaoTratamento) {
        this.expressaoTratamento = expressaoTratamento;
    }


    /**
     * Gets the expressaoVocativo value for this Cargo.
     * 
     * @return expressaoVocativo
     */
    public java.lang.String getExpressaoVocativo() {
        return expressaoVocativo;
    }


    /**
     * Sets the expressaoVocativo value for this Cargo.
     * 
     * @param expressaoVocativo
     */
    public void setExpressaoVocativo(java.lang.String expressaoVocativo) {
        this.expressaoVocativo = expressaoVocativo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cargo)) return false;
        Cargo other = (Cargo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idCargo==null && other.getIdCargo()==null) || 
             (this.idCargo!=null &&
              this.idCargo.equals(other.getIdCargo()))) &&
            ((this.expressaoCargo==null && other.getExpressaoCargo()==null) || 
             (this.expressaoCargo!=null &&
              this.expressaoCargo.equals(other.getExpressaoCargo()))) &&
            ((this.expressaoTratamento==null && other.getExpressaoTratamento()==null) || 
             (this.expressaoTratamento!=null &&
              this.expressaoTratamento.equals(other.getExpressaoTratamento()))) &&
            ((this.expressaoVocativo==null && other.getExpressaoVocativo()==null) || 
             (this.expressaoVocativo!=null &&
              this.expressaoVocativo.equals(other.getExpressaoVocativo())));
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
        if (getIdCargo() != null) {
            _hashCode += getIdCargo().hashCode();
        }
        if (getExpressaoCargo() != null) {
            _hashCode += getExpressaoCargo().hashCode();
        }
        if (getExpressaoTratamento() != null) {
            _hashCode += getExpressaoTratamento().hashCode();
        }
        if (getExpressaoVocativo() != null) {
            _hashCode += getExpressaoVocativo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
