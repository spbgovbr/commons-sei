/**
 * RetornoConsultaDocumento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.ans.sei.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RetornoConsultaDocumento  implements java.io.Serializable {
    private java.lang.String idProcedimento;

    private java.lang.String procedimentoFormatado;

    private java.lang.String idDocumento;

    private java.lang.String documentoFormatado;

    private java.lang.String linkAcesso;

    private Serie serie;

    private java.lang.String numero;

    private java.lang.String data;

    private Unidade unidadeElaboradora;

    private Andamento andamentoGeracao;

    private Assinatura[] assinaturas;

    private Publicacao publicacao;

    public RetornoConsultaDocumento() {
    }

    public RetornoConsultaDocumento(
           java.lang.String idProcedimento,
           java.lang.String procedimentoFormatado,
           java.lang.String idDocumento,
           java.lang.String documentoFormatado,
           java.lang.String linkAcesso,
           Serie serie,
           java.lang.String numero,
           java.lang.String data,
           Unidade unidadeElaboradora,
           Andamento andamentoGeracao,
           Assinatura[] assinaturas,
           Publicacao publicacao) {
           this.idProcedimento = idProcedimento;
           this.procedimentoFormatado = procedimentoFormatado;
           this.idDocumento = idDocumento;
           this.documentoFormatado = documentoFormatado;
           this.linkAcesso = linkAcesso;
           this.serie = serie;
           this.numero = numero;
           this.data = data;
           this.unidadeElaboradora = unidadeElaboradora;
           this.andamentoGeracao = andamentoGeracao;
           this.assinaturas = assinaturas;
           this.publicacao = publicacao;
    }


    /**
     * Gets the idProcedimento value for this RetornoConsultaDocumento.
     * 
     * @return idProcedimento
     */
    public java.lang.String getIdProcedimento() {
        return idProcedimento;
    }


    /**
     * Sets the idProcedimento value for this RetornoConsultaDocumento.
     * 
     * @param idProcedimento
     */
    public void setIdProcedimento(java.lang.String idProcedimento) {
        this.idProcedimento = idProcedimento;
    }


    /**
     * Gets the procedimentoFormatado value for this RetornoConsultaDocumento.
     * 
     * @return procedimentoFormatado
     */
    public java.lang.String getProcedimentoFormatado() {
        return procedimentoFormatado;
    }


    /**
     * Sets the procedimentoFormatado value for this RetornoConsultaDocumento.
     * 
     * @param procedimentoFormatado
     */
    public void setProcedimentoFormatado(java.lang.String procedimentoFormatado) {
        this.procedimentoFormatado = procedimentoFormatado;
    }


    /**
     * Gets the idDocumento value for this RetornoConsultaDocumento.
     * 
     * @return idDocumento
     */
    public java.lang.String getIdDocumento() {
        return idDocumento;
    }


    /**
     * Sets the idDocumento value for this RetornoConsultaDocumento.
     * 
     * @param idDocumento
     */
    public void setIdDocumento(java.lang.String idDocumento) {
        this.idDocumento = idDocumento;
    }


    /**
     * Gets the documentoFormatado value for this RetornoConsultaDocumento.
     * 
     * @return documentoFormatado
     */
    public java.lang.String getDocumentoFormatado() {
        return documentoFormatado;
    }


    /**
     * Sets the documentoFormatado value for this RetornoConsultaDocumento.
     * 
     * @param documentoFormatado
     */
    public void setDocumentoFormatado(java.lang.String documentoFormatado) {
        this.documentoFormatado = documentoFormatado;
    }


    /**
     * Gets the linkAcesso value for this RetornoConsultaDocumento.
     * 
     * @return linkAcesso
     */
    public java.lang.String getLinkAcesso() {
        return linkAcesso;
    }


    /**
     * Sets the linkAcesso value for this RetornoConsultaDocumento.
     * 
     * @param linkAcesso
     */
    public void setLinkAcesso(java.lang.String linkAcesso) {
        this.linkAcesso = linkAcesso;
    }


    /**
     * Gets the serie value for this RetornoConsultaDocumento.
     * 
     * @return serie
     */
    public Serie getSerie() {
        return serie;
    }


    /**
     * Sets the serie value for this RetornoConsultaDocumento.
     * 
     * @param serie
     */
    public void setSerie(Serie serie) {
        this.serie = serie;
    }


    /**
     * Gets the numero value for this RetornoConsultaDocumento.
     * 
     * @return numero
     */
    public java.lang.String getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this RetornoConsultaDocumento.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }


    /**
     * Gets the data value for this RetornoConsultaDocumento.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this RetornoConsultaDocumento.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }


    /**
     * Gets the unidadeElaboradora value for this RetornoConsultaDocumento.
     * 
     * @return unidadeElaboradora
     */
    public Unidade getUnidadeElaboradora() {
        return unidadeElaboradora;
    }


    /**
     * Sets the unidadeElaboradora value for this RetornoConsultaDocumento.
     * 
     * @param unidadeElaboradora
     */
    public void setUnidadeElaboradora(Unidade unidadeElaboradora) {
        this.unidadeElaboradora = unidadeElaboradora;
    }


    /**
     * Gets the andamentoGeracao value for this RetornoConsultaDocumento.
     * 
     * @return andamentoGeracao
     */
    public Andamento getAndamentoGeracao() {
        return andamentoGeracao;
    }


    /**
     * Sets the andamentoGeracao value for this RetornoConsultaDocumento.
     * 
     * @param andamentoGeracao
     */
    public void setAndamentoGeracao(Andamento andamentoGeracao) {
        this.andamentoGeracao = andamentoGeracao;
    }


    /**
     * Gets the assinaturas value for this RetornoConsultaDocumento.
     * 
     * @return assinaturas
     */
    public Assinatura[] getAssinaturas() {
        return assinaturas;
    }


    /**
     * Sets the assinaturas value for this RetornoConsultaDocumento.
     * 
     * @param assinaturas
     */
    public void setAssinaturas(Assinatura[] assinaturas) {
        this.assinaturas = assinaturas;
    }


    /**
     * Gets the publicacao value for this RetornoConsultaDocumento.
     * 
     * @return publicacao
     */
    public Publicacao getPublicacao() {
        return publicacao;
    }


    /**
     * Sets the publicacao value for this RetornoConsultaDocumento.
     * 
     * @param publicacao
     */
    public void setPublicacao(Publicacao publicacao) {
        this.publicacao = publicacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetornoConsultaDocumento)) return false;
        RetornoConsultaDocumento other = (RetornoConsultaDocumento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idProcedimento==null && other.getIdProcedimento()==null) || 
             (this.idProcedimento!=null &&
              this.idProcedimento.equals(other.getIdProcedimento()))) &&
            ((this.procedimentoFormatado==null && other.getProcedimentoFormatado()==null) || 
             (this.procedimentoFormatado!=null &&
              this.procedimentoFormatado.equals(other.getProcedimentoFormatado()))) &&
            ((this.idDocumento==null && other.getIdDocumento()==null) || 
             (this.idDocumento!=null &&
              this.idDocumento.equals(other.getIdDocumento()))) &&
            ((this.documentoFormatado==null && other.getDocumentoFormatado()==null) || 
             (this.documentoFormatado!=null &&
              this.documentoFormatado.equals(other.getDocumentoFormatado()))) &&
            ((this.linkAcesso==null && other.getLinkAcesso()==null) || 
             (this.linkAcesso!=null &&
              this.linkAcesso.equals(other.getLinkAcesso()))) &&
            ((this.serie==null && other.getSerie()==null) || 
             (this.serie!=null &&
              this.serie.equals(other.getSerie()))) &&
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.unidadeElaboradora==null && other.getUnidadeElaboradora()==null) || 
             (this.unidadeElaboradora!=null &&
              this.unidadeElaboradora.equals(other.getUnidadeElaboradora()))) &&
            ((this.andamentoGeracao==null && other.getAndamentoGeracao()==null) || 
             (this.andamentoGeracao!=null &&
              this.andamentoGeracao.equals(other.getAndamentoGeracao()))) &&
            ((this.assinaturas==null && other.getAssinaturas()==null) || 
             (this.assinaturas!=null &&
              java.util.Arrays.equals(this.assinaturas, other.getAssinaturas()))) &&
            ((this.publicacao==null && other.getPublicacao()==null) || 
             (this.publicacao!=null &&
              this.publicacao.equals(other.getPublicacao())));
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
        if (getIdProcedimento() != null) {
            _hashCode += getIdProcedimento().hashCode();
        }
        if (getProcedimentoFormatado() != null) {
            _hashCode += getProcedimentoFormatado().hashCode();
        }
        if (getIdDocumento() != null) {
            _hashCode += getIdDocumento().hashCode();
        }
        if (getDocumentoFormatado() != null) {
            _hashCode += getDocumentoFormatado().hashCode();
        }
        if (getLinkAcesso() != null) {
            _hashCode += getLinkAcesso().hashCode();
        }
        if (getSerie() != null) {
            _hashCode += getSerie().hashCode();
        }
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getUnidadeElaboradora() != null) {
            _hashCode += getUnidadeElaboradora().hashCode();
        }
        if (getAndamentoGeracao() != null) {
            _hashCode += getAndamentoGeracao().hashCode();
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
        if (getPublicacao() != null) {
            _hashCode += getPublicacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }
 
}
