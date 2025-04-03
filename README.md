Desafio de Controle de Fluxo

Este repositório contém a solução para o desafio de Controle de Fluxo em Java, onde criamos um sistema que recebe dois parâmetros inteiros e realiza uma contagem baseada na diferença entre eles.

📌 Descrição do Desafio

O sistema recebe dois números inteiros via terminal:

Se o primeiro número for maior que o segundo, o sistema lança uma exceção personalizada (ParametrosInvalidosException).

Caso contrário, realiza a contagem e imprime os números incrementados no console.

Exemplo de Entrada e Saída:

Entrada:

Digite o primeiro parâmetro:
5
Digite o segundo parâmetro:
10

Saída:

Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
Imprimindo o número 4
Imprimindo o número 5

🛠 Tecnologias Utilizadas

Java 17+

Scanner para entrada de dados

Try/Catch para tratamento de exceção personalizada

🚀 Como Executar o Projeto

Clone este repositório:

git clone https://github.com/seu-usuario/desafio-controle-fluxo.git

Acesse o diretório do projeto:

cd desafio-controle-fluxo

Compile o projeto:

javac Contador.java ParametrosInvalidosException.java

Execute o programa:

java Contador

Insira os valores conforme solicitado no terminal.

📂 Estrutura do Projeto

/desafio-controle-fluxo
│── Contador.java  # Classe principal que executa o programa
│── ParametrosInvalidosException.java  # Classe da exceção personalizada
│── README.md  # Documentação do projeto

🛠 Melhorias Futuras

Implementar suporte para entrada via argumentos de linha de comando.

Criar testes unitários para validar a lógica de contagem e exceção.

📜 Licença

Este projeto está sob a licença MIT. Sinta-se à vontade para usá-lo e modificá-lo.

Desenvolvido por rafafdx 🚀
