# Árvore de Produto

Desenvolvido por: Fabricio Adriano da Cruz

Este repositório contém os arquivos de uma estrutura de dados em árvore para cadastrar um produto e suas sub-partes, todos sendo inseridos pelo usuário via teclado. Este projeto foi desenvolvido em linguagem JAVA, como parte de um trabalho para a disciplina de Estrtura de Dados.

Ao iniciar o programa, é apresentado um menu ao usuário com as opções para cadastrar um produto e suas sub-partes, para mostrar as partes mais simples do produto e uma opção para realizar o cálculo do valor total do produto cadastrado.

Neste projeto existem diferentes classes em que se subdivide as funções do programa.Na primeira opção de cadastro, o programa pede para o usuário digitar o nome do produto que deseja criar e então esse dado é salvo gerando assim a raiz da estrutura da árvore. Em seguida, o programa solicita a inserção das partes desse produto, indo até as partes mais simples. Cada parte é um nó da árvore, sendo que o primeiro nó (raiz) contém uma lista em que vão sendo inseridos os nós posteriores (sub-partes) e a cada vez que uma parte mais simples vai sendo inserida, essas partes menores vão sendo salvas na lista do nó referente a essas partes. 

Após a leitura dos dados o programa passa a exibir novamente o menu principal.

A partir daqui é possível verificar através das funcionalidades do programa, mostrar as partes mais simples e o cálculo do valor do produto para o usuário.

A função de cálculo é uma chamada de método para a classe da estrutura da árvore, onde uma função recursiva tende a procurar os nós mais simples, ao encontrá-los as chamadas de cada contexto desse método passa a realizar o cálculo de cada nó com base no seu valor unitário multiplicado pela quantidade necessária para se criar uma unidade de sua parte que esta a compõe. Por fim, o programa exibe na tela para o usuário, uma mensagem com o valor total do produto cadastrado.
