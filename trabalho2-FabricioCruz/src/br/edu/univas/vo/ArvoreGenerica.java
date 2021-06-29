package br.edu.univas.vo;

import br.edu.univas.view.ViewTree;

public class ArvoreGenerica {
	
	private No raiz;
	private float vlrProduto;
	
	public void criarRaiz(Componente prod) {
		raiz = criarNo(prod);		
	}
	
	public void addNoPai(No no) {
		raiz.lista.add(no);
	}
	
	public void addNoFolha(No no, int idx) {
		raiz.lista.get(idx).lista.add(no);
	}

	
	public No criarNo(Componente componente) {
		No no = new No();
		
		no.info = componente;
	return no;		
	}
	
	public void imprimeNosFolha() {
		if(raiz == null) {
			ViewTree.erroNenhumProdutoCadastrado();
			return;
		}
		ViewTree.imprimeMsgNosSimples();
		imprimeNosFolhaInterno(raiz);
	}
	
	private void imprimeNosFolhaInterno(No no) {
		if(no.lista.isEmpty()) {
			ViewTree.imprimeNomeProduto(no.info.getNome());
		}
		for (int i = 0; i < no.lista.size(); i++) {
			imprimeNosFolhaInterno(no.lista.get(i));
		}
	}
	
	public float ValorTotalProduto() {
		if(raiz == null) {
			return 0f;
		}
		vlrProduto = 0;
		return calculoTotalProduto(raiz);
	}
	
	private float calculoTotalProduto(No no) {
		for (int i = 0; i < no.lista.size(); i++) {
			if(!(no.lista.isEmpty())) {
				calculoTotalProduto(no.lista.get(i));
				if(no.lista.get(i).info.getVlrUn() == 0) {
					no.lista.get(i).info.setVlrUn(vlrProduto * no.lista.get(i).info.getQtd());
				}
				else {
					vlrProduto += no.lista.get(i).info.getVlrUn() * no.lista.get(i).info.getQtd();					
				}
			}
		}
		return vlrProduto;
	}
	
}
