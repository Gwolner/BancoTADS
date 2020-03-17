# Banco TADS

Sistema de um banco para prática de requisições concorrentes em servlets na disciplina de Desenvolvimento de Sistemas Web 2.

## Observação

Nesta atividade <b>NÃO FAÇA UMA INTERFACE BONITA (fron-end)</b>, apenas funcional. A proposta aqui é praticar a relação das requisições (GET e POST) com os servlets, tratar requisições concorrentes e manter a coerencia nas operações esperadas pra um banco simples (saque, depósito, transferencia, etc).

## Instruções

1) Criar um sistema web para simular um sistema bancário.

2) Criar um projeto no eclipse chamado BancoTads.

3) O sistema deve levar em consideração as questões de acesso concorrente/simultâneo (conforme visto na ultima aula).

4) Através do endereço http://localhost:8080/BancoTads/home exibir a lista de opções abaixo (Defina os outros endereços do sistema):
* Listar contas;
* Cadastrar Conta;
* Depósito;
* Saque;
* Transferência.

5) A opção Listar contas deve:
  a) Exibir uma lista com todas as contas cadastradas.
  
6) A opção Cadastrar Conta deve:</br>
  a) Exibir um formulário com os campos número da conta e nome;</br>
  b) Ao clicar no botão cadastrar deve ir para a tela com a lista de contas.
  
7) A opção Depósito deve:</br>
  a) Exibir a lista de todas as contas cadastradas com os respectivos saldos;</br>
  b) Ao clicar na conta exibir um formulário solicitando o valor do depósito;</br>
  c) Ao clicar no botão depositar deve voltar para a tela com a lista de contas.
  
8) A opção Saque deve:</br>
  a) Exibir a lista de todas as contas cadastradas com os respectivos saldos;</br>
  b) Ao clicar na conta exibir um formulário solicitando o valor do saque;</br>
  c) Ao clicar no botão Sacar deve voltar para a tela com a lista de contas, o saque só deve ser realizado se tiver saldo.
  
9) A definição da opção Transferência fica a seu critério!

## Submissão

Ao submeter os arquivos no Google Classroom siga as seguintes regras:
* Não envie o projeto completo, apenas o conteudo da pasta src;
* A pasta src deve estar formato .zip (zipada);
* Outros formatos de compactação serão desconsiderados;
* O titulo do conteúdo zipado deve conter <b>apenas<b> sua matricula.
