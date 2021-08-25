# language: pt

  Funcionalidade: Entrar no site dos correios
    Eu desejo logar no site rastrear minha encomenda e consultar cep

  Contexto:
    Dado que estou no site https://www.correios.com.br

  Cenario: Logando no site dos correios
    Quando forneco usuario e senha
    Entao acesso Meus correios e valido o acesso

  Cenario: Rastreando objeto
    Quando clico em meus objetos
    E preencho numero de ratreio
    Entao verifico e valido onde a encomenda esta

  Cenario: Consultando CEP
    Quando clico em buscar CEP
    E digito o CEP
    Entao valido o endereco fornecido
