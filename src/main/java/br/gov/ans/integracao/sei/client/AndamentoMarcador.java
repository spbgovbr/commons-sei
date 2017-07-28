/**
 * AndamentoMarcador.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.ans.integracao.sei.client;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AndamentoMarcador  implements java.io.Serializable {
    private java.lang.String idAndamentoMarcador;

    private java.lang.String texto;

    private java.lang.String dataHora;

    private br.gov.ans.integracao.sei.client.Usuario usuario;

    private br.gov.ans.integracao.sei.client.Marcador marcador;

    public AndamentoMarcador() {
    }

    public AndamentoMarcador(
           java.lang.String idAndamentoMarcador,
           java.lang.String texto,
           java.lang.String dataHora,
           br.gov.ans.integracao.sei.client.Usuario usuario,
           br.gov.ans.integracao.sei.client.Marcador marcador) {
           this.idAndamentoMarcador = idAndamentoMarcador;
           this.texto = texto;
           this.dataHora = dataHora;
           this.usuario = usuario;
           this.marcador = marcador;
    }


    /**
     * Gets the idAndamentoMarcador value for this AndamentoMarcador.
     * 
     * @return idAndamentoMarcador
     */
    public java.lang.String getIdAndamentoMarcador() {
        return idAndamentoMarcador;
    }


    /**
     * Sets the idAndamentoMarcador value for this AndamentoMarcador.
     * 
     * @param idAndamentoMarcador
     */
    public void setIdAndamentoMarcador(java.lang.String idAndamentoMarcador) {
        this.idAndamentoMarcador = idAndamentoMarcador;
    }


    /**
     * Gets the texto value for this AndamentoMarcador.
     * 
     * @return texto
     */
    public java.lang.String getTexto() {
        return texto;
    }


    /**
     * Sets the texto value for this AndamentoMarcador.
     * 
     * @param texto
     */
    public void setTexto(java.lang.String texto) {
        this.texto = texto;
    }


    /**
     * Gets the dataHora value for this AndamentoMarcador.
     * 
     * @return dataHora
     */
    public java.lang.String getDataHora() {
        return dataHora;
    }


    /**
     * Sets the dataHora value for this AndamentoMarcador.
     * 
     * @param dataHora
     */
    public void setDataHora(java.lang.String dataHora) {
        this.dataHora = dataHora;
    }


    /**
     * Gets the usuario value for this AndamentoMarcador.
     * 
     * @return usuario
     */
    public br.gov.ans.integracao.sei.client.Usuario getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this AndamentoMarcador.
     * 
     * @param usuario
     */
    public void setUsuario(br.gov.ans.integracao.sei.client.Usuario usuario) {
        this.usuario = usuario;
    }


    /**
     * Gets the marcador value for this AndamentoMarcador.
     * 
     * @return marcador
     */
    public br.gov.ans.integracao.sei.client.Marcador getMarcador() {
        return marcador;
    }


    /**
     * Sets the marcador value for this AndamentoMarcador.
     * 
     * @param marcador
     */
    public void setMarcador(br.gov.ans.integracao.sei.client.Marcador marcador) {
        this.marcador = marcador;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AndamentoMarcador)) return false;
        AndamentoMarcador other = (AndamentoMarcador) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idAndamentoMarcador==null && other.getIdAndamentoMarcador()==null) || 
             (this.idAndamentoMarcador!=null &&
              this.idAndamentoMarcador.equals(other.getIdAndamentoMarcador()))) &&
            ((this.texto==null && other.getTexto()==null) || 
             (this.texto!=null &&
              this.texto.equals(other.getTexto()))) &&
            ((this.dataHora==null && other.getDataHora()==null) || 
             (this.dataHora!=null &&
              this.dataHora.equals(other.getDataHora()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario()))) &&
            ((this.marcador==null && other.getMarcador()==null) || 
             (this.marcador!=null &&
              this.marcador.equals(other.getMarcador())));
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
        if (getIdAndamentoMarcador() != null) {
            _hashCode += getIdAndamentoMarcador().hashCode();
        }
        if (getTexto() != null) {
            _hashCode += getTexto().hashCode();
        }
        if (getDataHora() != null) {
            _hashCode += getDataHora().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        if (getMarcador() != null) {
            _hashCode += getMarcador().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
