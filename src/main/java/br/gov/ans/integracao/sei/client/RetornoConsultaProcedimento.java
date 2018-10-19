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
public class RetornoConsultaProcedimento implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idProcedimento;
	private String procedimentoFormatado;
	private String especificacao;
	private String dataAutuacao;
	private String linkAcesso;
	private TipoProcedimento tipoProcedimento;
	private Andamento andamentoGeracao;
	private Andamento andamentoConclusao;
	private Andamento ultimoAndamento;
	private UnidadeProcedimentoAberto[] unidadesProcedimentoAberto;
	private Assunto[] assuntos;
	private Interessado[] interessados;
	private Observacao[] observacoes;
	private ProcedimentoResumido[] procedimentosRelacionados;
	private ProcedimentoResumido[] procedimentosAnexados;
	
}
