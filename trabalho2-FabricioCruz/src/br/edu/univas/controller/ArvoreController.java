package br.edu.univas.controller;

import java.util.Scanner;

import br.edu.univas.view.ViewTree;
import br.edu.univas.vo.ArvoreGenerica;
import br.edu.univas.vo.Componente;
import br.edu.univas.vo.No;

public class ArvoreController {
	
	private Scanner sc;
	private ArvoreGenerica arvGen = new ArvoreGenerica();
	
	public void inicializacao() {
		
		sc = new Scanner(System.in);
		
		try {
			int option;
			do {
				ViewTree.imprimeMenu();
				option = readInteger();
				option = validaOpcao(option);
				
				if (option == 1) {
					leituraDadosProduto();
				}
				else if(option == 2) {
					arvGen.imprimeNosFolha();				
				}
				else if (option == 3) {
					ViewTree.imprimeValorTotalProduto(arvGen.ValorTotalProduto());			
				}
				
			} while (option != 9);			
		} 
		finally {
			ViewTree.imprimeMsgAplicacaoEncerrada();
			sc.close();
		}
		

		
	}
	
	private void leituraDadosProduto() {

		ViewTree.inputNome();
		String s = sc.nextLine();

		// Cria raiz - Produto - Nivel 0 da ARVORE
		Componente cp = new Componente();
		cp.setNome(s);
		cp.setVlrUn(0);
		cp.setQtd(1);		
		arvGen.criarRaiz(cp);

		// Cria nós filho de raiz - Mas também nós Pai (Inclusos na lista da Raiz) - Nivel 1 da ARVORE
		ViewTree.qtdNosPai();
		int qtd = readInteger();
		
		for (int i = 0; i < qtd; i++) {
			Componente componente = new Componente();
			ViewTree.inputNome();
			componente.setNome(sc.nextLine());
			componente.setVlrUn(0);
			ViewTree.inputQtdPecas();
			componente.setQtd(readInteger());
			
			No no = arvGen.criarNo(componente);
			arvGen.addNoPai(no);
		}
		
		// Cria nós folha - Nível 2 da ARVORE
		ViewTree.qtdNosFolha();
		qtd = readInteger();
		
		int idx = 0;
		
		for (int i = 0; i < qtd; i++) {
			Componente componente = new Componente();
			
			ViewTree.inputNome();
			componente.setNome(sc.nextLine());
			
			ViewTree.inputVlrUn();
			componente.setVlrUn(readFloat());
		
			ViewTree.inputQtdPecas();
			componente.setQtd(readInteger());
			
			No no = arvGen.criarNo(componente);
			
			if(i >= 2 && i <= 4) {
				idx = 1;
			}
			
			else if (i > 4) {
				idx = 2;
			}
			
			arvGen.addNoFolha(no, idx);				
		}
	}

	private int readInteger() {
		int numero = sc.nextInt();
		sc.nextLine();
		return numero;
	}
	
	private float readFloat() {
		float numero = sc.nextFloat();
		sc.nextLine();		
		return numero;
	}
	
	private int validaOpcao(int option) {
		if(option < 1 || (option > 3 && option != 9)) {
			ViewTree.imprimeOpcaoInvalida();
			ViewTree.imprimeMenu();
			option = readInteger();
		}
		return option;
	}

}
