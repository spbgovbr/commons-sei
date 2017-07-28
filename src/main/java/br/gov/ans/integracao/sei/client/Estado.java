/**
 * Estado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.ans.integracao.sei.client;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Estado  implements java.io.Serializable {
    private java.lang.String idEstado;

    private java.lang.String idPais;

    private java.lang.String sigla;

    private java.lang.String nome;

    private java.lang.String codigoIbge;

    public Estado() {
    }

    public Estado(String sigla){
    	this.sigla = sigla;
    }
    
    public Estado(
           java.lang.String idEstado,
           java.lang.String idPais,
           java.lang.String sigla,
           java.lang.String nome,
           java.lang.String codigoIbge) {
           this.idEstado = idEstado;
           this.idPais = idPais;
           this.sigla = sigla;
           this.nome = nome;
           this.codigoIbge = codigoIbge;
    }


    /**
     * Gets the idEstado value for this Estado.
     * 
     * @return idEstado
     */
    public java.lang.String getIdEstado() {
        return idEstado;
    }


    /**
     * Sets the idEstado value for this Estado.
     * 
     * @param idEstado
     */
    public void setIdEstado(java.lang.String idEstado) {
        this.idEstado = idEstado;
    }


    /**
     * Gets the idPais value for this Estado.
     * 
     * @return idPais
     */
    public java.lang.String getIdPais() {
        return idPais;
    }


    /**
     * Sets the idPais value for this Estado.
     * 
     * @param idPais
     */
    public void setIdPais(java.lang.String idPais) {
        this.idPais = idPais;
    }


    /**
     * Gets the sigla value for this Estado.
     * 
     * @return sigla
     */
    public java.lang.String getSigla() {
        return sigla;
    }


    /**
     * Sets the sigla value for this Estado.
     * 
     * @param sigla
     */
    public void setSigla(java.lang.String sigla) {
        this.sigla = sigla;
    }


    /**
     * Gets the nome value for this Estado.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Estado.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the codigoIbge value for this Estado.
     * 
     * @return codigoIbge
     */
    public java.lang.String getCodigoIbge() {
        return codigoIbge;
    }


    /**
     * Sets the codigoIbge value for this Estado.
     * 
     * @param codigoIbge
     */
    public void setCodigoIbge(java.lang.String codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Estado)) return false;
        Estado other = (Estado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sigla==null && other.getSigla()==null) || 
             (this.sigla!=null &&
              this.sigla.equals(other.getSigla())));
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
        if (getIdEstado() != null) {
            _hashCode += getIdEstado().hashCode();
        }
        if (getIdPais() != null) {
            _hashCode += getIdPais().hashCode();
        }
        if (getSigla() != null) {
            _hashCode += getSigla().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getCodigoIbge() != null) {
            _hashCode += getCodigoIbge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
