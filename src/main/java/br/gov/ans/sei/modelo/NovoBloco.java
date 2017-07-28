package br.gov.ans.sei.modelo;

public class NovoBloco {

	private TipoBloco tipo;
	private String descricao;
	private String[] unidades;
	private String[] documentos;
	private boolean disponibilizar;

	public TipoBloco getTipo() {
		return tipo;
	}

	public void setTipo(TipoBloco tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String[] getUnidades() {
		return unidades;
	}

	public void setUnidades(String[] unidades) {
		this.unidades = unidades;
	}

	public String[] getDocumentos() {
		return documentos;
	}

	public void setDocumentos(String[] documentos) {
		this.documentos = documentos;
	}

	public boolean isDisponibilizar() {
		return disponibilizar;
	}

	public void setDisponibilizar(boolean disponibilizar) {
		this.disponibilizar = disponibilizar;
	}

}
