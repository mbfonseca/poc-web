# encoding: utf-8
# language: pt

Funcionalidade: Login

  @teste1
  Cenario: Login no site
    Dado que um usuario entre com o user "admin1"
    E a senha "admin"
    Quando clicar no botão login
    Então deve ocorrer o login com sucesso



    @teste2
    Cenario: Login com usuario ou senha errado
      Dado que um usuario entre com o user "admin2"
      E a senha "1223"
      Quando clicar no botão login
      Então deve ocorrer o um erro de acesso
