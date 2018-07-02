# language: pt

@all @req003

Funcionalidade: REQ003 - Mensagem de Contato

  Esquema do Cenario: Envio do Contato do Sistema com sucesso

    Dado   que estou na página inicial do sistema

    Quando clico no menu de acesso à funcionalidade atual
      | menu | <menu>  |

    E      preencho os dados no formulário de contato
      | nome      | <nome> |
      | email     | <email> |
      | tipo_msg  | <tipo_msg> |
      | idade     | <idade>    |
      | texto_msg | <texto_msg> |

    E      submeto o formulário de mensagem de contato

    Entao  verifico que a mensagem de sucesso foi exibida
      | msg | <msg> |

    Exemplos:
    | menu        | nome | email   | tipo_msg   | idade              | texto_msg | msg                                                        |
    | Contato     | AAA  | A@A.com | Dúvida     | Menor que 18 anos  | AAAAAA    | duvida-Menor que 18 anos: Mensagem enviada com sucesso!    |
    | Contato     | BBB  | B@B.com | Sugestão   | Entre 18 e 60 anos | BBBBBB    | sugestao-Entre 18 e 60 anos: Mensagem enviada com sucesso! |
    | Contato     | CCC  | C@C.com | Reclamação | Acima de 60 anos   | CCCCCC    | reclamacao-Acima de 60 anos: Mensagem enviada com sucesso! |

