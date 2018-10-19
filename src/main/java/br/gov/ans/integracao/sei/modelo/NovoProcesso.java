package br.gov.ans.integracao.sei.modelo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import br.gov.ans.integracao.sei.client.Documento;
import br.gov.ans.integracao.sei.client.Procedimento;
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
public class NovoProcesso {	
	
	private Procedimento dadosProcesso;
	private Documento[] documentos;
	private String[] processosRelacionados;
	private String[] unidadesDestino;
	private boolean manterAbertoOrigem;
	private boolean enviarEmailNotificacao;
	private Date dataRetornoProgramado;
	private Integer qtdDiasAteRetorno;
	private boolean somenteDiasUteis;
	private String idMarcadador;
	private String textoMarcador;
	
}
