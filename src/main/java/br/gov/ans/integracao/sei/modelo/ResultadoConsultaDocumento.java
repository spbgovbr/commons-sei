package br.gov.ans.integracao.sei.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import br.gov.ans.integracao.sei.client.RetornoConsultaDocumento;
import br.gov.ans.integracao.sipar.modelo.DocumentoSipar;
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
public class ResultadoConsultaDocumento {
	
	private DocumentoSipar documentoSIPAR;
	private RetornoConsultaDocumento documentoSEI;

}
