package src;

import java.util.Scanner;

public class ControlMenu {
	Scanner entrada;
	public int opcao;
	
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
				break;
			case 2:
				System.out.println("Consultar!");
				break;
			case 3:
				System.out.println("Atualizar!");
				break;
			case 4:
				System.out.println("Deletar!");
				break;
			default:
				System.out.println("Código informado inválido!");
				break;
			}//fim do switch			
		}while(this.opcao != 0);
	}//fim do método que executa a ação escolhida
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//fim da controle
