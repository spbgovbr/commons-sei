package br.gov.ans.integracao.sei.modelo;

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
public class DocumentoResumido {
	
	private String numero;
	private String numeroInformado;
	private String nome;
	private String unidade;
	private String origem;
	private Date dataGeracao;
	private String processo;
	private Tipo tipo;
	private String tipoConferencia;
	private boolean assinado;

}
