package br.gov.ans.integracao.sei.modelo;

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
public class Tarefa {
	
	private Long identificador;
	private String nome;
	private Long identicadorTarefaModulo;
	private String historicoResumido;
	private String historicoCompleto;
	private String fecharAndamentosAbertos;
	private String lancarAndamentoFechado;
	private String permiteProcessoFechado;

}
