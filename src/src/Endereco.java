package src;

public class Endereco {
	private int codigo;
	private String logradouro;
	private int numero;
	private String bairro;
	private String complemento;
	private String cidade;
	private String estado;
	private String uf;
	private long CEP;
	
	public Endereco() {
		this.setCodigo(0);
		this.setLogradouro("");
		this.setNumero(0);
		this.setBairro("");
		this.setComplemento("");
		this.setCidade("");
		this.setEstado("");
		this.setUF("");
		this.setCEP(0);		 
	}//fim do construtor
	
	public Endereco(int codigo, String logradouro, int numero, String bairro, String complemento, 
					String cidade, String estado, String uf, long CEP) 
	{
		this.setCodigo(codigo);
		this.setLogradouro(logradouro);
		this.setNumero(numero);
		this.setBairro(bairro);
		this.setComplemento(complemento);
		this.setCidade(cidade);
		this.setEstado(estado);
		this.setUF(uf);
		this.setCEP(CEP);
	}//fim do construtor
	
	public int getCodigo() {
		return this.codigo;
	}//fim do getCodigo
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}//fim do setCodigo
	
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
	
	public void setCidade(String cidade) {
		this.cidade = cidade;		
	}//fim do método
	
	public String getEstado() {
		return this.estado;
	}//fim do método
	
	public void setEstado(String estado) {
		this.estado = estado;
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
