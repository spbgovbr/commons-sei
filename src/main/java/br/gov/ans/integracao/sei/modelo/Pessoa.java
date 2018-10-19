package br.gov.ans.integracao.sei.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import lombok.Getter;
import lombok.Setter;

@JsonInclude(content = Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@JsonSubTypes({
    @JsonSubTypes.Type(value = PessoaFisica.class, name = "Fisica"),
    @JsonSubTypes.Type(value = PessoaJuridica.class, name = "Juridica") }
)
@Getter
@Setter
public abstract class Pessoa {
	
	private String nome;
	private String sigla;
	private Endereco endereco;
	private String email;
	private String celular;
	private String telefone;
	private String observacao;
	private boolean ativo;
	private PessoaJuridica associado;
	
}
