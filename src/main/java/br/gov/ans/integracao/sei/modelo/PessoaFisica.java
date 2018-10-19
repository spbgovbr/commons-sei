package br.gov.ans.integracao.sei.modelo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import br.gov.ans.integracao.sei.modelo.enums.Sexo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@JsonInclude(content = Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Data
@Builder
public class PessoaFisica extends Pessoa {
	
	private Sexo sexo;
	private String cpf;
	private String rg;
	private String orgaoEmissor;
	private Date dataNascimento;
	private String matricula;
	private String matriculaOab;
	
}
