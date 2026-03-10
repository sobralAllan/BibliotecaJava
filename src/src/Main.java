package src;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codigo;
		long CPF;
		String nome;
		String telefone;
		String email;
		Endereco endereco;
		Pessoa pessoa;
		int codigoEndereco;
		String logradouro;
		int numero;
		String bairro;
		String complemento;
		String cidade;
		String estado;
		String uf;
		long CEP;
		
		//Variável que representa a entrada via console
		Scanner entrada = new Scanner(System.in);
		
		//Coletar os dados de pessoa
		System.out.println("\nInforme um código: ");
		codigo = Integer.parseInt(entrada.nextLine());
		
		System.out.println("\nInforme um CPF: ");
		CPF   = Long.parseLong(entrada.nextLine());
		
		System.out.println("\nInfomre o telefone: ");
		telefone = entrada.nextLine();
		
		System.out.println("\nInforme o nome: ");
		nome  = entrada.nextLine();
		
		System.out.println("\nInforme o email: ");
		email = entrada.nextLine();
		
		//------- COLETAR OS DADOS DO ENDEREÇO
		System.out.println("\nInforme um código de endereco: ");
		codigoEndereco = Integer.parseInt(entrada.nextLine());
		
		System.out.println("\nInforme o logradouro: ");
		logradouro = entrada.nextLine();
		
		System.out.println("\nInforme o número: ");
		numero = Integer.parseInt(entrada.nextLine());
		
		System.out.println("\nInforme o bairro: ");
		bairro = entrada.nextLine();
		
		System.out.println("\nInforme o complemento: ");
		complemento = entrada.nextLine();
		
		System.out.println("\nInforme a cidade: ");
		cidade = entrada.nextLine();
		
		System.out.println("\nInforme o estado: ");
		estado = entrada.nextLine();
		
		System.out.println("\nInforme o UF: ");
		uf = entrada.nextLine();
		
		System.out.println("\nInforme o CEP: ");
		CEP = Long.parseLong(entrada.nextLine());
		
		//Criar o objeto endereço:
		endereco = new Endereco(codigo, logradouro, numero, bairro, complemento, cidade, estado, uf, CEP);
		pessoa   = new Pessoa(codigo, CPF, nome, telefone, email, endereco);
		
		//Mostrar o resultado dos dados
		System.out.println(pessoa.imprimir());//Mostrar os dados
	}//fim do método static
}//fim da classe
