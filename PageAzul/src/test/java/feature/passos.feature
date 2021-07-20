# language: pt

  Funcionalidade: Comprar passagem
    Como cliente
    Quero preencher os dados pedidos
    Para comprar uma passagem

    Cenario: Comprando passagem no site da Azul
      Dado que estou no site https://www.voeazul.com.br
      Quando preencho os dados referentes a viagem
      Quando seleciono o voo
      Quando preencho dados do passageiro
      Quando escolho o assento
      Quando clico em prosseguir na tela de bagagens
      Quando preencho os dados de contato
      E marco a checkbox dizendo que Li e Concordo com as regras
      Entao valido se o botao Confirmar reserva esta habilitado



