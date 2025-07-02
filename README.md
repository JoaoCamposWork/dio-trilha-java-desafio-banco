# java-desafio-banco

## EXERCICIO DE JAVA 

### EXPLICAÇÃO :

**Importação do Scanner:** Importa a classe Scanner para ler a entrada do usuário.
<br>
**Criação do objeto Scanner:** Cria um objeto scanner para ler dados do terminal.
<br>
**Solicitação e leitura dos dados:**
<br>
Solicita cada informação (agência, conta, nome, saldo) ao usuário.
<br>
Lê os dados inseridos usando os métodos nextInt(), nextLine(), e nextDouble() do scanner.
<br>
scanner.nextLine() é usado após nextInt() para consumir a quebra de linha que fica no buffer.


**Construção da mensagem:**
<br>
Cria a mensagem final usando concatenação (+) para combinar texto e variáveis.

**Exibição da mensagem:**
<br>
Imprime a mensagem final formatada no terminal.

**Fechamento do scanner:**

  agora fecha o objeto scanner para liberar recursos.

# Como executar:

## Salve o código como ContaTerminal.java na pasta src.
Compile o código: javac src/ContaTerminal.java
Execute: java src/ContaTerminal
Siga as instruções no terminal para inserir os dados.
Observações:

O código assume que o usuário inserirá dados válidos (números para agência, conta e saldo, e texto para o nome).
Você pode adicionar validações de entrada se desejar.
A formatação da mensagem final pode ser personalizada de acordo com suas preferências.
