/**
 * Cidade.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.ans.integracao.sei.client;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cidade implements java.io.Serializable {
    private java.lang.String idCidade;

    private java.lang.String idEstado;

    private java.lang.String idPais;

    private java.lang.String nome;

    private java.lang.String codigoIbge;

    private java.lang.String sinCapital;

    private java.lang.String latitude;

    private java.lang.String longitude;

    public Cidade() {
    }
    
    public Cidade(String ibge) {
    	this.codigoIbge = ibge;
    }

    public Cidade(
           java.lang.String idCidade,
           java.lang.String idEstado,
           java.lang.String idPais,
           java.lang.String nome,
           java.lang.String codigoIbge,
           java.lang.String sinCapital,
           java.lang.String latitude,
           java.lang.String longitude) {
           this.idCidade = idCidade;
           this.idEstado = idEstado;
           this.idPais = idPais;
           this.nome = nome;
           this.codigoIbge = codigoIbge;
           this.sinCapital = sinCapital;
           this.latitude = latitude;
           this.longitude = longitude;
    }


    /**
     * Gets the idCidade value for this Cidade.
     * 
     * @return idCidade
     */
    public java.lang.String getIdCidade() {
        return idCidade;
    }


    /**
     * Sets the idCidade value for this Cidade.
     * 
     * @param idCidade
     */
    public void setIdCidade(java.lang.String idCidade) {
        this.idCidade = idCidade;
    }


    /**
     * Gets the idEstado value for this Cidade.
     * 
     * @return idEstado
     */
    public java.lang.String getIdEstado() {
        return idEstado;
    }


    /**
     * Sets the idEstado value for this Cidade.
     * 
     * @param idEstado
     */
    public void setIdEstado(java.lang.String idEstado) {
        this.idEstado = idEstado;
    }


    /**
     * Gets the idPais value for this Cidade.
     * 
     * @return idPais
     */
    public java.lang.String getIdPais() {
        return idPais;
    }


    /**
     * Sets the idPais value for this Cidade.
     * 
     * @param idPais
     */
    public void setIdPais(java.lang.String idPais) {
        this.idPais = idPais;
    }


    /**
     * Gets the nome value for this Cidade.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Cidade.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the codigoIbge value for this Cidade.
     * 
     * @return codigoIbge
     */
    public java.lang.String getCodigoIbge() {
        return codigoIbge;
    }


    /**
     * Sets the codigoIbge value for this Cidade.
     * 
     * @param codigoIbge
     */
    public void setCodigoIbge(java.lang.String codigoIbge) {
        this.codigoIbge = codigoIbge;
    }


    /**
     * Gets the sinCapital value for this Cidade.
     * 
     * @return sinCapital
     */
    public java.lang.String getSinCapital() {
        return sinCapital;
    }


    /**
     * Sets the sinCapital value for this Cidade.
     * 
     * @param sinCapital
     */
    public void setSinCapital(java.lang.String sinCapital) {
        this.sinCapital = sinCapital;
    }


    /**
     * Gets the latitude value for this Cidade.
     * 
     * @return latitude
     */
    public java.lang.String getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this Cidade.
     * 
     * @param latitude
     */
    public void setLatitude(java.lang.String latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this Cidade.
     * 
     * @return longitude
     */
    public java.lang.String getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this Cidade.
     * 
     * @param longitude
     */
    public void setLongitude(java.lang.String longitude) {
        this.longitude = longitude;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cidade)) return false;
        Cidade other = (Cidade) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoIbge==null && other.getCodigoIbge()==null) || 
             (this.codigoIbge!=null &&
              this.codigoIbge.equals(other.getCodigoIbge())));
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
        if (getIdCidade() != null) {
            _hashCode += getIdCidade().hashCode();
        }
        if (getIdEstado() != null) {
            _hashCode += getIdEstado().hashCode();
        }
        if (getIdPais() != null) {
            _hashCode += getIdPais().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getCodigoIbge() != null) {
            _hashCode += getCodigoIbge().hashCode();
        }
        if (getSinCapital() != null) {
            _hashCode += getSinCapital().hashCode();
        }
        if (getLatitude() != null) {
            _hashCode += getLatitude().hashCode();
        }
        if (getLongitude() != null) {
            _hashCode += getLongitude().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
