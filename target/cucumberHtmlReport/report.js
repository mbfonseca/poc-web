$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# encoding: utf-8"
    },
    {
      "line": 2,
      "value": "# language: pt"
    }
  ],
  "line": 4,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 6,
  "name": "Login no site",
  "description": "",
  "id": "login;login-no-site",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 7,
  "name": "que um usuario entre com o user \"admin\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "a senha \"admin\"",
  "keyword": "E "
});
formatter.step({
  "line": 9,
  "name": "clicar no botão login",
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "deve ocorrer o login com sucesso",
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 33
    }
  ],
  "location": "LoginSteps.queUmUsuarioEntreComOUser(String)"
});
formatter.result({
  "duration": 261491828,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 9
    }
  ],
  "location": "LoginSteps.aSenha(String)"
});
formatter.result({
  "duration": 103771056,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.clicarNoBotãoLogin()"
});
formatter.result({
  "duration": 140206423,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.deveOcorrerOLoginComSucesso()"
});
formatter.result({
  "duration": 1076340175,
  "status": "passed"
});
});