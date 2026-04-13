# StreamAPI - Filtro de Notas com Java Stream API

Projeto de estudo sobre **Stream API** do Java, aplicando filtros e mapeamento em uma lista de alunos.

## O que o projeto faz

Cria uma lista de alunos com 3 notas cada um, calcula a média e filtra apenas os alunos que:
- Têm média **maior ou igual a 6** (aprovados)
- Têm média **menor ou igual a 10** (notas válidas)

Os aprovados são exibidos com o nome, média e uma mensagem de parabéns.

## Arquivos

### `Aluno.java`
Classe que representa um aluno com nome e 3 notas. Possui:
- Construtor com nome e as 3 notas
- `getNome()` — retorna o nome do aluno
- `getNotas()` — calcula e retorna a média das 3 notas

### `Filter.java`
Classe principal que executa o programa. Cria os alunos, monta o Stream e aplica os filtros com `.filter()` e `.map()`.

## Exemplo de saída

```
Filipe - 7,3 - Parabéns!
Ana - 10,0 - Parabéns!
André - 8,5 - Parabéns!
```

> João e Daniel foram reprovados (média abaixo de 6) e Leonardo foi desconsiderado (média acima de 10).

## Conceitos utilizados

- `Stream.of()` — cria um stream a partir de objetos
- `.filter()` — filtra elementos com base em uma condição
- `.map()` — transforma cada elemento em outro valor
- `.forEach()` — executa uma ação para cada elemento

## Tecnologias

- Java
- Stream API