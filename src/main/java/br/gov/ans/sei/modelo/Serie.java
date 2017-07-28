/**
 * Serie.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.ans.sei.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Serie  implements java.io.Serializable {
    private java.lang.String idSerie;

    private java.lang.String nome;

    public Serie() {
    }

    public Serie(
           java.lang.String idSerie,
           java.lang.String nome) {
           this.idSerie = idSerie;
           this.nome = nome;
    }


    /**
     * Gets the idSerie value for this Serie.
     * 
     * @return idSerie
     */
    public java.lang.String getIdSerie() {
        return idSerie;
    }


    /**
     * Sets the idSerie value for this Serie.
     * 
     * @param idSerie
     */
    public void setIdSerie(java.lang.String idSerie) {
        this.idSerie = idSerie;
    }


    /**
     * Gets the nome value for this Serie.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Serie.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Serie)) return false;
        Serie other = (Serie) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idSerie==null && other.getIdSerie()==null) || 
             (this.idSerie!=null &&
              this.idSerie.equals(other.getIdSerie()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome())));
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
        if (getIdSerie() != null) {
            _hashCode += getIdSerie().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
