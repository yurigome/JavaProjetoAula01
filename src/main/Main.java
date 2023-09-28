package main;

import java.util.Scanner;
import java.util.UUID;

import entities.Cliente;

//declaração da classe
public class Main {

	// metodo/função para executar a classe

	public static void main(String[] args) {

		// Imprimindo mensagem no console da ide

		System.out.println("\n*** Cadastro de cliente ***\n");

		// criando um objeto para a classe cliente
		Cliente cliente = new Cliente();

		// criando um objeto para a classe scanner
		Scanner scanner = new Scanner(System.in);

		// preenchendo os dados do cliente

		cliente.setId(UUID.randomUUID());

		System.out.println("\nInforme seu nome: ");
		cliente.setNome(scanner.nextLine());
		
		System.out.println("\nInforme o cpf:");
		cliente.setCpf(scanner.nextLine());
		
		System.out.println("\nInforme o email do cliente: ");
		cliente.setEmail(scanner.nextLine());
		
		// imprimindo os dados do cliente

		System.out.println("\nDados do cliente:");
		System.out.println("ID: " + cliente.getId());
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Cpf: " + cliente.getCpf());
		System.out.println("Email: " + cliente.getEmail());

		// fechando o scanner

		scanner.close();

	}

}
