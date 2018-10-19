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
public class Documento implements Serializable {

	private static final long serialVersionUID = 1L;

	private String tipo;
	private String idProcedimento;
	private String protocoloProcedimento;
	private String idSerie;
	private String numero;
	private String data;
	private String descricao;
	private String idTipoConferencia;
	private Remetente remetente;
	private Interessado[] interessados;
	private Destinatario[] destinatarios;
	private String observacao;
	private String nomeArquivo;
	private String nivelAcesso;
	private String idHipoteseLegal;
	private String conteudo;
	private String idArquivo;
	private Campo[] campos;
	private String sinBloqueado;

}
