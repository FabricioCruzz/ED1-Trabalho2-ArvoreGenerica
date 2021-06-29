package br.edu.univas.view;

import java.text.DecimalFormat;

public class ViewTree {
	
	public static void imprimeMenu() {
		System.out.println("::::Criador de Produtos::::");
		System.out.println("1 - Cadastrar Produto e Sub-Partes");
		System.out.println("2 - Exibir Pe�as Simples");
		System.out.println("3 - C�lculo do Custo Total do Produto");
		System.out.println("9 - Sair\n");
	}
	
	public static void imprimeValorTotalProduto(float valor) {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("O valor total do produto �: "+ df.format(valor) + "\n");
	}
	
	public static void imprimeOpcaoInvalida() {
		System.out.println("Op��o inv�lida! Por favor, digite corretamente!\n");
	}
	
	public static void inputNome() {
		System.out.println("Digite o nome do produto:");
	}
	
	public static void qtdNosPai() {
		System.out.println("Quantos sub-partes deseja adicionar?");
	}
	
	public static void qtdNosFolha() {
		System.out.println("Quantas partes simples deseja adicionar?");
	}
	
	public static void inputVlrUn() {
		System.out.println("Digite o valor unit�rio:");
	}
	
	public static void inputQtdPecas() {
		System.out.println("Digite a quantidade de pe�as necess�rias na cria��o de 1 unidade do produto:");
	}
	
	public static void erroNenhumProdutoCadastrado() {
		System.out.println("ERRO!!! Nenhum produto foi cadastrado ainda!!!\n");
	}
	
	public static void imprimeMsgNosSimples() {
		System.out.println("Esses s�o as partes mais simples:\n");
	}
	
	public static void imprimeNomeProduto(String nomeProduto) {
		System.out.println(nomeProduto);
	}
	
	public static void imprimeMsgAplicacaoEncerrada() {
		System.out.println("Aplica��o encerrada!");
	}

}
