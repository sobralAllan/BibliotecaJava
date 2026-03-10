package src;

public class ControlPessoa {
	Pessoa pessoa;
	
	public ControlPessoa() 	
	{ 
		this.pessoa = new Pessoa();	
	}//fim da controle // CADASTRAR
	
	public ControlPessoa(int codigo, long cpf, String nome, String telefone, String email, Endereco endereco) 
	{
		this.pessoa = new Pessoa(codigo, cpf, nome, telefone, email, endereco);
	}//fim do controle com parâmetros //CADASTRAR
	
	
	
}//fim do controlePessoa
