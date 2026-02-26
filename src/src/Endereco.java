package src;

public class Endereco {
	private String logradouro;
	private int numero;
	private String bairro;
	private String complemento;
	private String cidade;
	private String estado;
	private String uf;
	private long CEP;
	
	public Endereco() {
		this.logradouro  = "";
		this.numero      = 0;
		this.bairro      = "";
		this.complemento = "";
		this.cidade      = "";
		this.estado      = "";
		this.uf          = "";
		this.CEP         = 0;		 
	}//fim do construtor
	
	public Endereco(String logradouro, int numero, String bairro, String complemento, 
					String cidade, String estado, String uf, long CEP) 
	{
		this.logradouro  = logradouro;
		this.numero      = numero;
		this.bairro      = bairro;
		this.complemento = complemento;
		this.cidade      = cidade;
		this.estado      = estado;
		this.uf          = uf;
		this.CEP         = CEP;
	}//fim do construtor
	
	public String getLogradouro() {
		return this.logradouro;
	}//fim do getLogradouro
	
	public int getNumero() {
		return this.numero;
	}//fim do método
	
	public String getBairro() {
		return this.bairro;
	}//fim do método
	
	public String getComplemento() {
		return this.complemento;		
	}//fim do método
	
	public String getCidade() {
		return this.cidade;
	}//fim do método
	
	public String getEstado() {
		return this.estado;
	}//fim do método
	
	public String getUF() {
		return this.uf;
	}//fim do método
	
	public long getCEP() {
		return this.CEP;
	}//fim do método
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}//fim do setLogradouro
	
	public void setNumero(int numero) {
		this.numero = numero;
	}//fim do setLogradouro
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}//fim do setLogradouro
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}//fim do setLogradouro
	
	public void setUF(String UF) {
		this.uf = UF;
	}//fim do setLogradouro
	
	public void setCEP(long CEP) {
		this.CEP = CEP;
	}//fim do setLogradouro
	
	public String imprimir() {
		return "Logradouro: "    + getLogradouro()  + 
			   "\nNúmero: "      + getNumero()      +
			   "\nBairro: "      + getBairro()      +
			   "\nComplemento: " + getComplemento() +
			   "\nCidade: "      + getCidade()      +
			   "\nEstado: "      + getEstado()      +
			   "\nUF: "          + getUF()          +
			   "\nCEP: "         + getCEP();
    }//fim do método
	
}//fim da classe
