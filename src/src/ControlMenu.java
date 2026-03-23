package src;

import java.util.Scanner;

public class ControlMenu {
	Scanner entrada;
	public int opcao;
	public int codigo;
	public long CPF;
	public String nome;
	public String telefone;
	public String email;
	Endereco endereco;
	Pessoa pessoa;
	public int codigoEndereco;
	public String logradouro;
	public int numero;
	public String bairro;
	public String complemento;
	public String cidade;
	public String estado;
	public String uf;
	public long CEP;
	
	
	public ControlMenu() {
		this.entrada = new Scanner(System.in);
		this.opcao   = 0;
	}//fim do construtor padrão
	
	public void MostrarMenu() {
		//Mostrar as opções
		System.out.println("\n\nBem-Vindo(a)\n\n" + 
			    "Escolha uma das opções abaixo: " +
				"\n0. Sair"                       +
				"\n1. Cadastrar Pessoa"           + 
				"\n2. Consultar Pessoa"           + 
				"\n3. Atualizar Pessoa"           +
				"\n4. Excluir Pessoa"           
				);
		//Coleta a opção
		this.opcao = Integer.parseInt(entrada.nextLine());
	}//fim do mostrarMenu
	
	public void executar() {
		do {
			this.MostrarMenu();//Mostrar as opções disponíveis para o usuário
			
			switch(this.opcao) {
			case 0:
				System.out.println("Obrigado!");
				break;
			case 1:
				System.out.println("Cadastrar!");
				
				//Variável que representa a entrada via console
				this.entrada = new Scanner(System.in);
				
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
				this.endereco = new Endereco(codigo, logradouro, numero, bairro, complemento, cidade, estado, uf, CEP);
				this.pessoa   = new Pessoa(codigo, CPF, nome, telefone, email, endereco);
				
				break;
			case 2:
				System.out.println("Consultar!");
				
				//Mostrar o resultado dos dados
				System.out.println(this.pessoa.imprimir());//Mostrar os dados		
				
				break;
			case 3:
				System.out.println("Atualizar!");
				System.out.println("Escolha abaixo o que deseja atualizar: " +
								   "\n1. Nome"                                 +
								   "\n2. CPF"                                  +
								   "\n3. Telefone"                             +
								   "\n4. E-mail"                               +
								   "\n5. Logradouro"                           +
								   "\n6. Número"                               +
								   "\n7. Bairro"                               +
								   "\n8. Complemento"                          +
								   "\n9. Cidade"                               +
								   "\n10. Estado"                              +
								   "\n11. UF"                                  +
								   "\n12. CEP");
				this.opcao = Integer.parseInt(this.entrada.nextLine());
				//Escolha caso para atualização
				switch(this.opcao) {
				case 1:
					System.out.println("Qual o novo nome?");
					String nome = this.entrada.nextLine();//Coletando o novo nome do usuário
					this.pessoa.setNome(nome);
					break;
				case 2: 
					System.out.println("Qual o novo CPF?");
					String cpf = this.entrada.nextLine();
					this.pessoa.setCPF(Long.parseLong(cpf));
					break;
				case 3: 
					System.out.println("Qual o novo Telefone?");
					String telefone = this.entrada.nextLine();
					this.pessoa.setTelefone(telefone);
					break;
				case 4: 
					System.out.println("Qual o novo E-mail?");
					String email = this.entrada.nextLine();
					this.pessoa.setEmail(email);
					break;
				case 5: 
					System.out.println("Qual o novo logradouro?");
					String logradouro = this.entrada.nextLine();
					this.endereco.setLogradouro(logradouro);
					break;
				case 6: 
					System.out.println("Qual o novo numero?");
					int numero = Integer.parseInt(this.entrada.nextLine());
					this.endereco.setNumero(numero);
					break;
				case 7: 
					System.out.println("Qual o novo Bairro?");
					String bairro = this.entrada.nextLine();
					this.endereco.setBairro(bairro);
					break;
				case 8: 
					System.out.println("Qual o novo Complemento?");
					String complemento = this.entrada.nextLine();
					this.endereco.setComplemento(complemento);
					break;
				case 9: 
					System.out.println("Qual a nova cidade?");
					String cidade = this.entrada.nextLine();
					this.endereco.setCidade(cidade);
					break;
				case 10: 
					System.out.println("Qual o novo estado?");
					String estado = this.entrada.nextLine();
					this.endereco.setEstado(estado);
					break;
				case 11: 
					System.out.println("Qual o novo UF?");
					String uf = this.entrada.nextLine();
					this.endereco.setUF(uf);
					break;
				case 12: 
					System.out.println("Qual o novo CEP?");
					Long CEP = Long.parseLong(this.entrada.nextLine());
					this.endereco.setCEP(CEP);
					break;
				default:
					System.out.println("Código inválido!");
					break;					
				}//fim do método
				
				break;//fim do case 3
			case 4:
				System.out.println("Deletar!");
				this.endereco = new Endereco();//Chamando o construtor vazio
				this.pessoa = new Pessoa();//Chamando o construtor vazio
				break;
			default:
				System.out.println("Código informado inválido!");
				break;
			}//fim do switch			
		}while(this.opcao != 0);
	}//fim do método que executa a ação escolhida
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//fim da controle
