/**
 * Contato.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.ans.integracao.sei.client;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(content = Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
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

	public Contato() {
	}

	public Contato(String staOperacao, String idContato, String idTipoContato,
			String nomeTipoContato, String sigla, String nome,
			String staNatureza, String idContatoAssociado, String nomeContatoAssociado,
			String sinEnderecoAssociado, String enderecoAssociado,
			String complementoAssociado, String bairroAssociado, String idCidadeAssociado,
			String nomeCidadeAssociado, String idEstadoAssociado,
			String siglaEstadoAssociado, String idPaisAssociado, String nomePaisAssociado,
			String cnpjAssociado, String endereco, String complemento,
			String bairro, String idCidade, String nomeCidade, String idEstado,
			String siglaEstado, String idPais, String nomePais, String cep,
			String staGenero, String idCargo, String expressaoCargo,
			String expressaoTratamento, String expressaoVocativo, String cpf,
			String cnpj, String rg, String orgaoExpedidor, String matricula,
			String matriculaOab, String telefoneFixo, String telefoneCelular,
			String dataNascimento, String email, String sitioInternet,
			String observacao, String sinAtivo) {
		this.staOperacao = staOperacao;
		this.idContato = idContato;
		this.idTipoContato = idTipoContato;
		this.nomeTipoContato = nomeTipoContato;
		this.sigla = sigla;
		this.nome = nome;
		this.staNatureza = staNatureza;
		this.idContatoAssociado = idContatoAssociado;
		this.nomeContatoAssociado = nomeContatoAssociado;
		this.sinEnderecoAssociado = sinEnderecoAssociado;
		this.cnpjAssociado = cnpjAssociado;
		this.endereco = endereco;
		this.complemento = complemento;
		this.bairro = bairro;
		this.idCidade = idCidade;
		this.nomeCidade = nomeCidade;
		this.idEstado = idEstado;
		this.siglaEstado = siglaEstado;
		this.idPais = idPais;
		this.nomePais = nomePais;
		this.cep = cep;
		this.staGenero = staGenero;
		this.idCargo = idCargo;
		this.expressaoCargo = expressaoCargo;
		this.expressaoTratamento = expressaoTratamento;
		this.expressaoVocativo = expressaoVocativo;
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.rg = rg;
		this.orgaoExpedidor = orgaoExpedidor;
		this.matricula = matricula;
		this.matriculaOab = matriculaOab;
		this.telefoneFixo = telefoneFixo;
		this.telefoneCelular = telefoneCelular;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.sitioInternet = sitioInternet;
		this.observacao = observacao;
		this.sinAtivo = sinAtivo;
	}

	public String getStaOperacao() {
		return staOperacao;
	}

	public void setStaOperacao(String staOperacao) {
		this.staOperacao = staOperacao;
	}

	public String getIdContato() {
		return idContato;
	}

	public void setIdContato(String idContato) {
		this.idContato = idContato;
	}

	public String getIdTipoContato() {
		return idTipoContato;
	}

	public void setIdTipoContato(String idTipoContato) {
		this.idTipoContato = idTipoContato;
	}

	public String getNomeTipoContato() {
		return nomeTipoContato;
	}

	public void setNomeTipoContato(String nomeTipoContato) {
		this.nomeTipoContato = nomeTipoContato;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getStaNatureza() {
		return staNatureza;
	}

	public void setStaNatureza(String staNatureza) {
		this.staNatureza = staNatureza;
	}

	public String getIdContatoAssociado() {
		return idContatoAssociado;
	}

	public void setIdContatoAssociado(String idContatoAssociado) {
		this.idContatoAssociado = idContatoAssociado;
	}

	public String getNomeContatoAssociado() {
		return nomeContatoAssociado;
	}

	public void setNomeContatoAssociado(String nomeContatoAssociado) {
		this.nomeContatoAssociado = nomeContatoAssociado;
	}

	public String getSinEnderecoAssociado() {
		return sinEnderecoAssociado;
	}

	public void setSinEnderecoAssociado(String sinEnderecoAssociado) {
		this.sinEnderecoAssociado = sinEnderecoAssociado;
	}

	public String getCnpjAssociado() {
		return cnpjAssociado;
	}

	public void setCnpjAssociado(String cnpjAssociado) {
		this.cnpjAssociado = cnpjAssociado;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(String idCidade) {
		this.idCidade = idCidade;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public String getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(String idEstado) {
		this.idEstado = idEstado;
	}

	public String getSiglaEstado() {
		return siglaEstado;
	}

	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}

	public String getIdPais() {
		return idPais;
	}

	public void setIdPais(String idPais) {
		this.idPais = idPais;
	}

	public String getNomePais() {
		return nomePais;
	}

	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getStaGenero() {
		return staGenero;
	}

	public void setStaGenero(String staGenero) {
		this.staGenero = staGenero;
	}

	public String getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(String idCargo) {
		this.idCargo = idCargo;
	}

	public String getExpressaoCargo() {
		return expressaoCargo;
	}

	public void setExpressaoCargo(String expressaoCargo) {
		this.expressaoCargo = expressaoCargo;
	}

	public String getExpressaoTratamento() {
		return expressaoTratamento;
	}

	public void setExpressaoTratamento(String expressaoTratamento) {
		this.expressaoTratamento = expressaoTratamento;
	}

	public String getExpressaoVocativo() {
		return expressaoVocativo;
	}

	public void setExpressaoVocativo(String expressaoVocativo) {
		this.expressaoVocativo = expressaoVocativo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getOrgaoExpedidor() {
		return orgaoExpedidor;
	}

	public void setOrgaoExpedidor(String orgaoExpedidor) {
		this.orgaoExpedidor = orgaoExpedidor;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMatriculaOab() {
		return matriculaOab;
	}

	public void setMatriculaOab(String matriculaOab) {
		this.matriculaOab = matriculaOab;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSitioInternet() {
		return sitioInternet;
	}

	public void setSitioInternet(String sitioInternet) {
		this.sitioInternet = sitioInternet;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getSinAtivo() {
		return sinAtivo;
	}

	public void setSinAtivo(String sinAtivo) {
		this.sinAtivo = sinAtivo;
	}

	private Object __equalsCalc = null;

	public boolean equals(Object obj) {
		if (!(obj instanceof Contato))
			return false;
		Contato other = (Contato) obj;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.staOperacao == null && other.getStaOperacao() == null)
						|| (this.staOperacao != null && this.staOperacao.equals(other.getStaOperacao())))
				&& ((this.idContato == null && other.getIdContato() == null)
						|| (this.idContato != null && this.idContato.equals(other.getIdContato())))
				&& ((this.idTipoContato == null && other.getIdTipoContato() == null)
						|| (this.idTipoContato != null && this.idTipoContato.equals(other.getIdTipoContato())))
				&& ((this.nomeTipoContato == null && other.getNomeTipoContato() == null)
						|| (this.nomeTipoContato != null && this.nomeTipoContato.equals(other.getNomeTipoContato())))
				&& ((this.sigla == null && other.getSigla() == null)
						|| (this.sigla != null && this.sigla.equals(other.getSigla())))
				&& ((this.nome == null && other.getNome() == null)
						|| (this.nome != null && this.nome.equals(other.getNome())))
				&& ((this.staNatureza == null && other.getStaNatureza() == null)
						|| (this.staNatureza != null && this.staNatureza.equals(other.getStaNatureza())))
				&& ((this.idContatoAssociado == null && other.getIdContatoAssociado() == null)
						|| (this.idContatoAssociado != null
								&& this.idContatoAssociado.equals(other.getIdContatoAssociado())))
				&& ((this.nomeContatoAssociado == null && other.getNomeContatoAssociado() == null)
						|| (this.nomeContatoAssociado != null
								&& this.nomeContatoAssociado.equals(other.getNomeContatoAssociado())))
				&& ((this.sinEnderecoAssociado == null && other.getSinEnderecoAssociado() == null)
						|| (this.sinEnderecoAssociado != null
								&& this.sinEnderecoAssociado.equals(other.getSinEnderecoAssociado())))
				&& ((this.cnpjAssociado == null && other.getCnpjAssociado() == null)
						|| (this.cnpjAssociado != null && this.cnpjAssociado.equals(other.getCnpjAssociado())))
				&& ((this.endereco == null && other.getEndereco() == null)
						|| (this.endereco != null && this.endereco.equals(other.getEndereco())))
				&& ((this.complemento == null && other.getComplemento() == null)
						|| (this.complemento != null && this.complemento.equals(other.getComplemento())))
				&& ((this.bairro == null && other.getBairro() == null)
						|| (this.bairro != null && this.bairro.equals(other.getBairro())))
				&& ((this.idCidade == null && other.getIdCidade() == null)
						|| (this.idCidade != null && this.idCidade.equals(other.getIdCidade())))
				&& ((this.nomeCidade == null && other.getNomeCidade() == null)
						|| (this.nomeCidade != null && this.nomeCidade.equals(other.getNomeCidade())))
				&& ((this.idEstado == null && other.getIdEstado() == null)
						|| (this.idEstado != null && this.idEstado.equals(other.getIdEstado())))
				&& ((this.siglaEstado == null && other.getSiglaEstado() == null)
						|| (this.siglaEstado != null && this.siglaEstado.equals(other.getSiglaEstado())))
				&& ((this.idPais == null && other.getIdPais() == null)
						|| (this.idPais != null && this.idPais.equals(other.getIdPais())))
				&& ((this.nomePais == null && other.getNomePais() == null)
						|| (this.nomePais != null && this.nomePais.equals(other.getNomePais())))
				&& ((this.cep == null && other.getCep() == null)
						|| (this.cep != null && this.cep.equals(other.getCep())))
				&& ((this.staGenero == null && other.getStaGenero() == null)
						|| (this.staGenero != null && this.staGenero.equals(other.getStaGenero())))
				&& ((this.idCargo == null && other.getIdCargo() == null)
						|| (this.idCargo != null && this.idCargo.equals(other.getIdCargo())))
				&& ((this.expressaoCargo == null && other.getExpressaoCargo() == null)
						|| (this.expressaoCargo != null && this.expressaoCargo.equals(other.getExpressaoCargo())))
				&& ((this.expressaoTratamento == null && other.getExpressaoTratamento() == null)
						|| (this.expressaoTratamento != null
								&& this.expressaoTratamento.equals(other.getExpressaoTratamento())))
				&& ((this.expressaoVocativo == null && other.getExpressaoVocativo() == null)
						|| (this.expressaoVocativo != null
								&& this.expressaoVocativo.equals(other.getExpressaoVocativo())))
				&& ((this.cpf == null && other.getCpf() == null)
						|| (this.cpf != null && this.cpf.equals(other.getCpf())))
				&& ((this.cnpj == null && other.getCnpj() == null)
						|| (this.cnpj != null && this.cnpj.equals(other.getCnpj())))
				&& ((this.rg == null && other.getRg() == null) || (this.rg != null && this.rg.equals(other.getRg())))
				&& ((this.orgaoExpedidor == null && other.getOrgaoExpedidor() == null)
						|| (this.orgaoExpedidor != null && this.orgaoExpedidor.equals(other.getOrgaoExpedidor())))
				&& ((this.matricula == null && other.getMatricula() == null)
						|| (this.matricula != null && this.matricula.equals(other.getMatricula())))
				&& ((this.matriculaOab == null && other.getMatriculaOab() == null)
						|| (this.matriculaOab != null && this.matriculaOab.equals(other.getMatriculaOab())))
				&& ((this.telefoneFixo == null && other.getTelefoneFixo() == null)
						|| (this.telefoneFixo != null && this.telefoneFixo.equals(other.getTelefoneFixo())))
				&& ((this.telefoneCelular == null && other.getTelefoneCelular() == null)
						|| (this.telefoneCelular != null && this.telefoneCelular.equals(other.getTelefoneCelular())))
				&& ((this.dataNascimento == null && other.getDataNascimento() == null)
						|| (this.dataNascimento != null && this.dataNascimento.equals(other.getDataNascimento())))
				&& ((this.email == null && other.getEmail() == null)
						|| (this.email != null && this.email.equals(other.getEmail())))
				&& ((this.sitioInternet == null && other.getSitioInternet() == null)
						|| (this.sitioInternet != null && this.sitioInternet.equals(other.getSitioInternet())))
				&& ((this.observacao == null && other.getObservacao() == null)
						|| (this.observacao != null && this.observacao.equals(other.getObservacao())))
				&& ((this.sinAtivo == null && other.getSinAtivo() == null)
						|| (this.sinAtivo != null && this.sinAtivo.equals(other.getSinAtivo())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	public int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = 1;
		if (getStaOperacao() != null) {
			_hashCode += getStaOperacao().hashCode();
		}
		if (getIdContato() != null) {
			_hashCode += getIdContato().hashCode();
		}
		if (getIdTipoContato() != null) {
			_hashCode += getIdTipoContato().hashCode();
		}
		if (getNomeTipoContato() != null) {
			_hashCode += getNomeTipoContato().hashCode();
		}
		if (getSigla() != null) {
			_hashCode += getSigla().hashCode();
		}
		if (getNome() != null) {
			_hashCode += getNome().hashCode();
		}
		if (getStaNatureza() != null) {
			_hashCode += getStaNatureza().hashCode();
		}
		if (getIdContatoAssociado() != null) {
			_hashCode += getIdContatoAssociado().hashCode();
		}
		if (getNomeContatoAssociado() != null) {
			_hashCode += getNomeContatoAssociado().hashCode();
		}
		if (getSinEnderecoAssociado() != null) {
			_hashCode += getSinEnderecoAssociado().hashCode();
		}
		if (getCnpjAssociado() != null) {
			_hashCode += getCnpjAssociado().hashCode();
		}
		if (getEndereco() != null) {
			_hashCode += getEndereco().hashCode();
		}
		if (getComplemento() != null) {
			_hashCode += getComplemento().hashCode();
		}
		if (getBairro() != null) {
			_hashCode += getBairro().hashCode();
		}
		if (getIdCidade() != null) {
			_hashCode += getIdCidade().hashCode();
		}
		if (getNomeCidade() != null) {
			_hashCode += getNomeCidade().hashCode();
		}
		if (getIdEstado() != null) {
			_hashCode += getIdEstado().hashCode();
		}
		if (getSiglaEstado() != null) {
			_hashCode += getSiglaEstado().hashCode();
		}
		if (getIdPais() != null) {
			_hashCode += getIdPais().hashCode();
		}
		if (getNomePais() != null) {
			_hashCode += getNomePais().hashCode();
		}
		if (getCep() != null) {
			_hashCode += getCep().hashCode();
		}
		if (getStaGenero() != null) {
			_hashCode += getStaGenero().hashCode();
		}
		if (getIdCargo() != null) {
			_hashCode += getIdCargo().hashCode();
		}
		if (getExpressaoCargo() != null) {
			_hashCode += getExpressaoCargo().hashCode();
		}
		if (getExpressaoTratamento() != null) {
			_hashCode += getExpressaoTratamento().hashCode();
		}
		if (getExpressaoVocativo() != null) {
			_hashCode += getExpressaoVocativo().hashCode();
		}
		if (getCpf() != null) {
			_hashCode += getCpf().hashCode();
		}
		if (getCnpj() != null) {
			_hashCode += getCnpj().hashCode();
		}
		if (getRg() != null) {
			_hashCode += getRg().hashCode();
		}
		if (getOrgaoExpedidor() != null) {
			_hashCode += getOrgaoExpedidor().hashCode();
		}
		if (getMatricula() != null) {
			_hashCode += getMatricula().hashCode();
		}
		if (getMatriculaOab() != null) {
			_hashCode += getMatriculaOab().hashCode();
		}
		if (getTelefoneFixo() != null) {
			_hashCode += getTelefoneFixo().hashCode();
		}
		if (getTelefoneCelular() != null) {
			_hashCode += getTelefoneCelular().hashCode();
		}
		if (getDataNascimento() != null) {
			_hashCode += getDataNascimento().hashCode();
		}
		if (getEmail() != null) {
			_hashCode += getEmail().hashCode();
		}
		if (getSitioInternet() != null) {
			_hashCode += getSitioInternet().hashCode();
		}
		if (getObservacao() != null) {
			_hashCode += getObservacao().hashCode();
		}
		if (getSinAtivo() != null) {
			_hashCode += getSinAtivo().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}
}
