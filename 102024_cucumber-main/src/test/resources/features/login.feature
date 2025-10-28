# language: pt
 
 @regressivo @release1 @sprint1 @login
 Funcionalidade: Login na plataforma
 Como usuário da plataforma 
 Quero enviar as minha credencias e realizar autenticação
 Para acessar as funcionalidades
 
 Contexto: Acessar a tela de login
 Dado que o usuário esteja no formulário de login
  
 @positivo
 Cenário: Realizar login
 Quando enviar o email e senha
 Entao acesso a tela de usuário logado
 
 @negativo @nãoExecutar
 Esquema do Cenário: Login inválidos
 Quando enviar o <email> e <senha> 
 Entao recebo mensagem de <erro>
  
 Exemplos:
 |email                |senha   |erro                          | 
 |                     |        | "Preencher campo obrigatório"|
 |"erra@e2e.com.br"    |        | "Usuário ou senha inválidos."|
 |"anderson@e2e.com.br"|"errada"| "Usuário ou senha inválidos."|