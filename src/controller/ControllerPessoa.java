package controller;

import dao.PessoaDAO;
import model.Pessoa;
import util.Log;

public class ControllerPessoa {
	private PessoaDAO	dao;
	private GeradorDeLog log;
	
	public ControllerPessoa(GeradorDeLog log) {
		this.dao = new PessoaDAO();
		this.log = log;
	}
	
	public void exclui(Pessoa pessoa){
		this.dao.exclui(pessoa);
		log.criaLog(pessoa.getNome());
	}
	
	
}

















