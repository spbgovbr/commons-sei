package br.gov.ans.integracao.sei.client;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(content = Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RetornoConsultaBloco  implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idBloco;

    private Unidade unidade;

    private Usuario usuario;

    private String descricao;

    private String tipo;

    private String estado;

    private Unidade[] unidadesDisponibilizacao;

    private ProtocoloBloco[] protocolos;
    
}
