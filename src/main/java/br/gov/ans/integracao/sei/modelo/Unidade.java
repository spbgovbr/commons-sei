package br.gov.ans.integracao.sei.modelo;

/**
 * Enum que relaciona as Unidades da organização.
 * Preencher conforme a organização.
 * 
 *
 */
public enum Unidade {
	
	DESCONHECIDA("0000");
	
	private String codigo;
	
	private Unidade(String codigo){
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}	
	
}
