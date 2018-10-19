package br.gov.ans.integracao.sei.modelo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import br.gov.ans.integracao.sei.client.Documento;
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
public class InclusaoDocumento {

	@JsonIgnore
	private long id;
	private Date data;
	private String nome;
	private String numero;
	private String hash;
	private String sistema;
	private String unidade;
	private String processo;
	private String numeroInformado;
	private String link;	
	
	public InclusaoDocumento(Documento documento, String unidade, String sistema, String hash){
		this.unidade = unidade;
		this.sistema = sistema;
		this.hash = hash;
		this.numeroInformado = documento.getNumero();
		
		this.nome = documento.getNomeArquivo();
		this.processo = documento.getIdProcedimento();
		
		this.data = new Date();
	}

}
