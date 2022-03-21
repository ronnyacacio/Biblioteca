# Aplicação java para controle de biblioteca

Criado por: Ronny Acácio e Francisco Geovan. 

## Base do sistema

A aplicação será acessada por alunos e bibliotecários, assim os alunos ficaram responsáveis por alugar seus livros e os bibliotecários ficarão na parte de administração e povoamento dos dados.

## Cronograma de desenvolvimento

 - [x] Criar os models Aluno, Livro e demais classes de apoio para suportar as requisições do sistema.

- [x] Criar interfaces para as classes DAO implementarem os métodos ali definidos

- [x] Criar DAOs para servirem de controllers e implementar os métodos para o funcionamento da aplicação

- [x] Criar exceções para os metódos

- [x] Criar Interface gráfica usando a biblioteca Swing do java

## Desafios 

### Ações e restrições do aluno

- [x] Visualizar livros disponíveis

- [x] Solicitar empréstimo de livro

- [x] Devolver livros do empréstimo

- [x] Renovar empréstimo

- [x] Pesquisar livros

- [x] Visualizar livros emprestados

- [x] Na visualização de livros disponíveis os alunos poderão visualizar todos os
livros disponíveis na biblioteca, será apresentada o título e a descrição de
cada livro

- [x] Os alunos poderão solicitar os livros, mas só poderão pedir emprestados
no máximo 4 livros, caso tente pedir mais livros do que o permitido o sistema deverá emitir uma mensagem de que o aluno não pode pegar
mais livros

- [x] Quando o aluno clicar em devolver livro, o livro automaticamente voltará
para a biblioteca e diminuirá o números de livros que o aluno possui
emprestado.

- [x] Cada empréstimo terá uma data limite para entregar os livros, no momento
da solicitação de empréstimo o estudante terá 15 dias com os livros, o
estudante ainda poderá renovar o empréstimo dos livros apenas 1 vez em
mais 7 dias, caso o estudante já tenha solicitado a renovação ele não
poderá mais renovar o empréstimo. O empréstimo conterá os livros do
empréstimo, o aluno, a data da realização do empréstimo e a data de
devolução do(s) livro(s) emprestado

- [x] O estudante poderá pesquisar os livros pelo título ou pela descrição,
quando o estudante digitar na pesquisa, as obras deverão aparecer na
tela. O estudante poderá ainda ver os livros emprestados com o título e
descrição daqueles livros


### Ações e restrições do bibliotecário

- [x] Cadastrar, visualizar e excluir alunos

- [x] Cadastrar, visualizar e excluir livros

- [x] Visualizar apenas alunos que estão com livros emprestados

- [x] A bibliotecária poderá cadastrar os livros contendo título, autor, isbn e
descrição do livro, ela também poderá visualizar os livros com título e
descrição, ao clicar em um livro ela poderá visualizar as outras
informações daquele livro

- [x] A bibliotecária poderá cadastrar os alunos contendo nome, matrícula,
curso, cpf, telefone, data de nascimento

- [x] Ela também poderá visualizar todos os estudantes que possuem livros
emprestados, no momento de clicar no nome do aluno ela poderá verificar
as informações do empréstimo como nome do aluno, livros emprestados,
data do empréstimo e devolução do empréstimo
