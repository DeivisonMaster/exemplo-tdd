package util;

import controller.GeradorDeLog;

public class Log implements GeradorDeLog {
	private String nomePessoa;

	@Override
	public void criaLog(String nomePessoa){
		this.nomePessoa = nomePessoa;
		// c�digo para criar um log no banco
	}
	
	public String getNomePessoa() {
		return nomePessoa;
	}
}
