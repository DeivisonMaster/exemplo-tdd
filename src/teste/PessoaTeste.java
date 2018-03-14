package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import controller.ControllerPessoa;
import model.Pessoa;
import util.Log;

public class PessoaTeste {
	/* Verificando se o método da criação do Log foi invocado */
	
	@Test
	public void deveCriarUmLogQuandoUmaPessoaForExcluida(){
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("alex");
		
		Log log = new Log();
		ControllerPessoa controllerPessoa = new ControllerPessoa(log);
		controllerPessoa.exclui(pessoa);
		
		assertEquals(pessoa.getNome(), log.getNomePessoa());
	}
}
