# Jogo Da Forca em Java
Um simples jogo da forca desenvolvido em Java, utilizando conceitos de Programação Orientada a Objetos (POO), como encapsulamento.

## Descrição
Este projeto simula o clássico jogo da forca, onde o jogador deve adivinhar uma palavra escolhendo letras. A cada letra errada, o número de tentativas diminui. O jogador pode vencer ao adivinhar a palavra antes de esgotar suas chances.

## Estrutura do Projeto
O projeto é composto por três classes principais:

1. `Jogador`: Representa o jogador e seus atributos (nome, nível, pontos).
Métodos para gerenciar o progresso do jogador, como avançar de nível e acumular pontos.
2. `Forca`: Gerencia a lógica do jogo, como tentativas, controle de erros, e verificação de vitória/derrota.
Exibe o progresso da palavra em formato "oculto" (_ __ _).
3. `JogoForca`: Classe principal (main) que controla a interação com o usuário, integrando as funcionalidades do jogo.

## Melhorias Futuras
Algumas ideias para aprimorar o projeto:

- Permitir que o jogador jogue várias rodadas com palavras diferentes, acumulando pontos e níveis.
- Criar níveis de dificuldade com palavras mais complexas.
- Implementar uma interface gráfica.

## Como Executar
1. Clone o repositório:

`git clone https://github.com/seu-usuario/jogo-da-forca-java.git`

2. Compile e execute o programa:

`javac JogoForca.java`
`java JogoForca`