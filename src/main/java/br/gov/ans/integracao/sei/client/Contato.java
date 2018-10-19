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
public class Contato implements Serializable {

	private static final long serialVersionUID = 1L;

	private String staOperacao;
	private String idContato;
	private String idTipoContato;
	private String nomeTipoContato;
	private String sigla;
	private String nome;
	private String staNatureza;
	private String idContatoAssociado;
	private String nomeContatoAssociado;
	private String sinEnderecoAssociado;
	private String cnpjAssociado;
	private String endereco;
	private String complemento;
	private String bairro;
	private String idCidade;
	private String nomeCidade;
	private String idEstado;
	private String siglaEstado;
	private String idPais;
	private String nomePais;
	private String cep;
	private String staGenero;
	private String idCargo;
	private String expressaoCargo;
	private String expressaoTratamento;
	private String expressaoVocativo;
	private String cpf;
	private String cnpj;
	private String rg;
	private String orgaoExpedidor;
	private String matricula;
	private String matriculaOab;
	private String telefoneFixo;
	private String telefoneCelular;
	private String dataNascimento;
	private String email;
	private String sitioInternet;
	private String observacao;
	private String sinAtivo;

}
