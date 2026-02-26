package src;

public class Pessoa {
	
	//1ª Máxima da O.O. = Encapsulamento
	private int codigo;
	private long cpf;
	private String nome; 
	private String telefone;
	private String email;
	
	public Pessoa() {
		this.codigo   = 0;
		this.cpf      = 0;
		this.nome     = "";
		this.telefone = "";
		this.email    = "";
	}//fim do construtor padrão
	
	//2ª Máxima da O.O. = Sobrecarga
	public Pessoa(int codigo, long cpf, String nome, String telefone, String email) {
		this.codigo   = codigo;
		this.cpf      = cpf;
		this.nome     = nome;
		this.telefone = telefone;
		this.email    = email;
	}//fim do construtor pessoa
	
	//Métodos modificadores - GETS e SETS
	public int getCodigo() {
		return this.codigo;
	}//fim do getCodigo
	
	public long getCPF() {
		return this.cpf;
	}//fim do getCPF
	
	public String getNome() {
		return this.nome;
	}//fim do getNome
	
	public String getTelefone() {
		return this.telefone;
	}//fim do getTelefone
	
	public String getEmail() {
		return this.email;
	}//fim do getEmail
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}//fim do setCodigo
	
	public void setCPF(long cpf) {
		this.cpf = cpf;
	}//fim do setCPF
	
	public void setNome(String nome) {
		this.nome = nome;
	}//fim do setNome
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}//fim do setTelefone
	
	public void setEmail(String email) {
		this.email = email;
	}//fim do setEmail
	
	public String imprimir() {
		return "Código: "     + getCodigo()   +
			   "\nCPF: "      + getCPF()      +
			   "\nNome: "     + getNome()     +
			   "\nTelefone: " + getTelefone() +
			   "\nEmail: "    + getEmail();
	}//fim do imprimir
}//fim da classe
