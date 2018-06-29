# language: pt

@all @req002

Funcionalidade: REQ002 - Ajuda do Sistema

  Esquema do Cenario: Acesso à Ajuda do Sistema via menu principal

    Dado   que estou na página inicial do sistema
    Quando clico no menu de acesso à funcionalidade atual
      | textoDoLink | <textoDoLink>  |
    Entao  verifico que estou na página correta
      | titulo | <titulo> |
      | secao  | <secao>  |

    Exemplos:
    | textoDoLink | titulo | secao   |
    | Ajuda       | Ajuda  | Seção 1 |
    | Ajuda       | Ajuda  | Seção 2 |
    | Ajuda       | Ajuda  | Seção 3 |
