/**
 * Assinatura.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.ans.sei.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Assinatura  implements java.io.Serializable {
    private java.lang.String nome;

    private java.lang.String cargoFuncao;

    private java.lang.String dataHora;

    public Assinatura() {
    }

    public Assinatura(
           java.lang.String nome,
           java.lang.String cargoFuncao,
           java.lang.String dataHora) {
           this.nome = nome;
           this.cargoFuncao = cargoFuncao;
           this.dataHora = dataHora;
    }


    /**
     * Gets the nome value for this Assinatura.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Assinatura.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the cargoFuncao value for this Assinatura.
     * 
     * @return cargoFuncao
     */
    public java.lang.String getCargoFuncao() {
        return cargoFuncao;
    }


    /**
     * Sets the cargoFuncao value for this Assinatura.
     * 
     * @param cargoFuncao
     */
    public void setCargoFuncao(java.lang.String cargoFuncao) {
        this.cargoFuncao = cargoFuncao;
    }


    /**
     * Gets the dataHora value for this Assinatura.
     * 
     * @return dataHora
     */
    public java.lang.String getDataHora() {
        return dataHora;
    }


    /**
     * Sets the dataHora value for this Assinatura.
     * 
     * @param dataHora
     */
    public void setDataHora(java.lang.String dataHora) {
        this.dataHora = dataHora;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Assinatura)) return false;
        Assinatura other = (Assinatura) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.cargoFuncao==null && other.getCargoFuncao()==null) || 
             (this.cargoFuncao!=null &&
              this.cargoFuncao.equals(other.getCargoFuncao()))) &&
            ((this.dataHora==null && other.getDataHora()==null) || 
             (this.dataHora!=null &&
              this.dataHora.equals(other.getDataHora())));
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
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getCargoFuncao() != null) {
            _hashCode += getCargoFuncao().hashCode();
        }
        if (getDataHora() != null) {
            _hashCode += getDataHora().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }
 
}
