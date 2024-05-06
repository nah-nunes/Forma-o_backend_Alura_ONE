## Estudando orientação a objetos 
**Classe**
  Em Java, uma classe é um modelo ou um template que define as características e 
comportamentos de um objeto. É como um molde que você pode usar para criar objetos 
com propriedades e métodos específicos.
Uma classe  é composta por três partes principais:
Atributos (ou campos): são as variáveis que armazenam os dados do objeto.<br>
Métodos: são as ações que o objeto pode realizar.<br>
Construtor: é um método especial que é chamado quando um objeto é criado.
 

*******************************************************************************
#### Exercícios para praticar
1. Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.
2. Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o
dobro desse número.
3. Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a 
ficha técnica, avaliar a música e calcular a média de avaliações.
4. Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e
calcular a idade do carro.
5. Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações.
6. Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o 
7. método para exibir as informações.

*******************************************************************************

**Encapsulamento**
Esconde os detalhes da implementação de uma classe e expõe apenas as informações necessárias para que outras 
classes possam interagir com ela. Isso ajuda a manter a integridade dos dados e a reduzir a complexidade do sistema.
 - Modificadores de acesso:
    - public
    - private 
 
*******************************************************************************
Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.
Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.
Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada() para exibir a tabuada de um número. A classe deve receber o número como parâmetro.
Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.
Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.
Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria lógica de cálculo de preço.
***********************************************************************************