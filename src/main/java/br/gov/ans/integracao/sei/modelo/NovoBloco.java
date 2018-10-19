package br.gov.ans.integracao.sei.modelo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import br.gov.ans.integracao.sei.modelo.enums.TipoBloco;
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
public class NovoBloco {

	private TipoBloco tipo;
	private String descricao;
	private String[] unidades;
	private String[] documentos;
	private boolean disponibilizar;

}
