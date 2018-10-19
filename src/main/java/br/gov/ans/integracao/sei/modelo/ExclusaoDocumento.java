package br.gov.ans.integracao.sei.modelo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class ExclusaoDocumento {

	@JsonIgnore
	private long id;
	private Date data;
	private String numero;
	private String sistema;
	private String unidade;
	private String motivo;
	
	public ExclusaoDocumento(String numero, String sistema, String unidade, String motivo){
		this.numero = numero;
		this.sistema = sistema;
		this.unidade = unidade;
		this.motivo = motivo;
		this.data = new Date();		
	}
	
}
