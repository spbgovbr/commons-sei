package br.gov.ans.integracao.sei.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(content = Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tarefa {
	
	private Long identificador;
	private String nome;
	private Long identicadorTarefaModulo;
	private String historicoResumido;
	private String historicoCompleto;
	private String fecharAndamentosAbertos;
	private String lancarAndamentoFechado;
	private String permiteProcessoFechado;

	public Long getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getIdenticadorTarefaModulo() {
		return identicadorTarefaModulo;
	}

	public void setIdenticadorTarefaModulo(Long identicadorTarefaModulo) {
		this.identicadorTarefaModulo = identicadorTarefaModulo;
	}

	public String getHistoricoResumido() {
		return historicoResumido;
	}

	public void setHistoricoResumido(String historicoResumido) {
		this.historicoResumido = historicoResumido;
	}

	public String getHistoricoCompleto() {
		return historicoCompleto;
	}

	public void setHistoricoCompleto(String historicoCompleto) {
		this.historicoCompleto = historicoCompleto;
	}

	public String getFecharAndamentosAbertos() {
		return fecharAndamentosAbertos;
	}

	public void setFecharAndamentosAbertos(String fecharAndamentosAbertos) {
		this.fecharAndamentosAbertos = fecharAndamentosAbertos;
	}

	public String getLancarAndamentoFechado() {
		return lancarAndamentoFechado;
	}

	public void setLancarAndamentoFechado(String lancarAndamentoFechado) {
		this.lancarAndamentoFechado = lancarAndamentoFechado;
	}

	public String getPermiteProcessoFechado() {
		return permiteProcessoFechado;
	}

	public void setPermiteProcessoFechado(String permiteProcessoFechado) {
		this.permiteProcessoFechado = permiteProcessoFechado;
	}	
	
}
