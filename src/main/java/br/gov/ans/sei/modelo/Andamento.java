/**
 * Andamento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.ans.sei.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Andamento  implements java.io.Serializable {
    private String descricao;

    private String dataHora;

    private Unidade unidade;

    private Usuario usuario;

    public Andamento() {
    }

    public Andamento(
           String descricao,
           String dataHora,
           Unidade unidade,
           Usuario usuario) {
           this.descricao = descricao;
           this.dataHora = dataHora;
           this.unidade = unidade;
           this.usuario = usuario;
    }


    /**
     * Gets the descricao value for this Andamento.
     * 
     * @return descricao
     */
    public String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this Andamento.
     * 
     * @param descricao
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the dataHora value for this Andamento.
     * 
     * @return dataHora
     */
    public String getDataHora() {
        return dataHora;
    }


    /**
     * Sets the dataHora value for this Andamento.
     * 
     * @param dataHora
     */
    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }


    /**
     * Gets the unidade value for this Andamento.
     * 
     * @return unidade
     */
    public Unidade getUnidade() {
        return unidade;
    }


    /**
     * Sets the unidade value for this Andamento.
     * 
     * @param unidade
     */
    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }


    /**
     * Gets the usuario value for this Andamento.
     * 
     * @return usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this Andamento.
     * 
     * @param usuario
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Andamento)) return false;
        Andamento other = (Andamento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.dataHora==null && other.getDataHora()==null) || 
             (this.dataHora!=null &&
              this.dataHora.equals(other.getDataHora()))) &&
            ((this.unidade==null && other.getUnidade()==null) || 
             (this.unidade!=null &&
              this.unidade.equals(other.getUnidade()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario())));
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
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getDataHora() != null) {
            _hashCode += getDataHora().hashCode();
        }
        if (getUnidade() != null) {
            _hashCode += getUnidade().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
