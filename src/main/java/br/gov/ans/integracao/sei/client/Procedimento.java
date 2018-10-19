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
public class Procedimento implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idTipoProcedimento;
	private String numeroProtocolo;
	private String dataAutuacao;
	private String especificacao;
	private Assunto[] assuntos;
	private Interessado[] interessados;
	private String observacao;
	private String nivelAcesso;
	private String idHipoteseLegal;

}
