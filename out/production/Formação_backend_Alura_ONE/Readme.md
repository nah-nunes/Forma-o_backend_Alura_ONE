
### convenções em JAVA

Nomes de classes devem começar com letra maiúscula e usar a convenção PascalCase (também conhecida como Upper CamelCase).

Exemplo: MinhaClasse.
Nomes de métodos devem começar com letra minúscula e usar a convenção camelCase.

Exemplo: meuMetodo().
Nomes de constantes devem ser totalmente em letras maiúsculas, separadas por underline.

Exemplo: MINHA_CONSTANTE.
Nomes de variáveis devem começar com letra minúscula e usar a convenção camelCase.

Exemplo: minhaVariavel.
Todas as linhas de código devem ter no máximo 80 caracteres de largura para facilitar a leitura.

Recomenda-se usar espaços em branco para separar operadores, palavras-chave e elementos de controle de fluxo.

Exemplo: if (condicao) {.
Use comentários para documentar seu código, explicando o que ele faz e por que ele faz isso. Comentários devem ser claros e concisos. 


### Tipos de Dados 

Java possui 8 tipos primitivos diferentes
 - boolean: true ou false
 - byte: utilizado para representar valores númericos inteiros de 8bits, faixa de valores de -128 a 127. 
 - char: utilizado para representar caracteres individuais. Ele pode armazenar qualquer caractere Unicode e é representado por aspas simples (").
 - short: O tipo short é utilizado para representar valores numéricos inteiros de 16 bits. Ele possui uma faixa de valores de -32768 a 32767
 - int: Representa valores inteiros de 32 bits, possui uma faixa de valores de -2147483648 a 2147483647
 - long: Caracteres númericos inteiros de 64 bits, representa uma faiza de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
 - float: Representa valores númericos de ponto flutuante, pode representar números decimais com até sete dígitos e tem uma precisão limitada, o que significa que pode arredondar os números se eles forem mto grandes ou muito pequenos.
 - double: similar ao float, entretando ocupa 64 bits de memória e pode representar números decimais com até 15 digitos 

<hr>

#### Casting 
Recurso utilizado para converter um tipo de dado em outro. Essa conversão pode ser feita de forma automática pelo compilador 
ou de forma manual explicita utilizando o operador de casting. 

```java 
int x = 10;
double y = x; // casting implícito

double x = 10.5;
int y = (int) x; // casting explícito

```
Vimos como usar comparações para condicionais, integrar leitura do teclado com a classe Scanner, explorar alternativas para condicionais e empregar estruturas de repetição como for e while. Esses conhecimentos constituem a base para o desenvolvimento eficaz de programas em Java.

Para aprimorar essas habilidades, propomos atividades práticas (não obrigatórias). Vamos lá?

Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.