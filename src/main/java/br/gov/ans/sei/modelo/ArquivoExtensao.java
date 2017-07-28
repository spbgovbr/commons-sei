/**
 * ArquivoExtensao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.ans.sei.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ArquivoExtensao  implements java.io.Serializable {
    private java.lang.String idArquivoExtensao;

    private java.lang.String extensao;

    private java.lang.String descricao;

    public ArquivoExtensao() {
    }

    public ArquivoExtensao(
           java.lang.String idArquivoExtensao,
           java.lang.String extensao,
           java.lang.String descricao) {
           this.idArquivoExtensao = idArquivoExtensao;
           this.extensao = extensao;
           this.descricao = descricao;
    }


    /**
     * Gets the idArquivoExtensao value for this ArquivoExtensao.
     * 
     * @return idArquivoExtensao
     */
    public java.lang.String getIdArquivoExtensao() {
        return idArquivoExtensao;
    }


    /**
     * Sets the idArquivoExtensao value for this ArquivoExtensao.
     * 
     * @param idArquivoExtensao
     */
    public void setIdArquivoExtensao(java.lang.String idArquivoExtensao) {
        this.idArquivoExtensao = idArquivoExtensao;
    }


    /**
     * Gets the extensao value for this ArquivoExtensao.
     * 
     * @return extensao
     */
    public java.lang.String getExtensao() {
        return extensao;
    }


    /**
     * Sets the extensao value for this ArquivoExtensao.
     * 
     * @param extensao
     */
    public void setExtensao(java.lang.String extensao) {
        this.extensao = extensao;
    }


    /**
     * Gets the descricao value for this ArquivoExtensao.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this ArquivoExtensao.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArquivoExtensao)) return false;
        ArquivoExtensao other = (ArquivoExtensao) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idArquivoExtensao==null && other.getIdArquivoExtensao()==null) || 
             (this.idArquivoExtensao!=null &&
              this.idArquivoExtensao.equals(other.getIdArquivoExtensao()))) &&
            ((this.extensao==null && other.getExtensao()==null) || 
             (this.extensao!=null &&
              this.extensao.equals(other.getExtensao()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao())));
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
        if (getIdArquivoExtensao() != null) {
            _hashCode += getIdArquivoExtensao().hashCode();
        }
        if (getExtensao() != null) {
            _hashCode += getExtensao().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
