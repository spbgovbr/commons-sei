package br.gov.ans.integracao.sei.modelo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import br.gov.ans.integracao.sei.client.Unidade;

@JsonInclude(content = Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UnidadeTarefa extends Unidade{
	
	private static final long serialVersionUID = 1L;
	
	private int tarefa;
	private Date data;

	@JsonIgnore
	public int getTarefa() {
		return tarefa;
	}

	@JsonIgnore
	public void setTarefa(int tarefa) {
		this.tarefa = tarefa;
	}

	@JsonIgnore
	public Date getData() {
		return data;
	}

	@JsonIgnore
	public void setData(Date data) {
		this.data = data;
	}
}