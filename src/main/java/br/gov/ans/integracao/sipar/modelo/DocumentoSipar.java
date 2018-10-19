package br.gov.ans.integracao.sipar.modelo;

import java.io.Serializable;
import java.util.Date;

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
public class DocumentoSipar implements Serializable{

	private static final long serialVersionUID = 1L;

	private String digito;
	private String operadora;
	private Date emissao;
	private Date registro;
	private String tipo;
	private String resumo;
	private Long orgaoPosse;
	private Long orgaoOrigem;
	private Long orgaoRegistro;
	private Long assunto;
		
}
