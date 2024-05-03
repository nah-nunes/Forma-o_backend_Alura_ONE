package Exercicios.src;
import java.util.Scanner;
public class Bank {

    public static void main(String[] args) {
/*
*****************************
Dados iniciais do cliente:
*
* Nome: Jacqueline Oliveira
* Tipo de conta: Corrente
* Saldo inicial : R$ 2500,00
******************************
*
* Operações
*
* 1- Consultar saldos
* 2- Receber valor
* 3- Transferir valor
* 4- Sair
*
* Digite a opção desejada:
*
 */Scanner leitura = new Scanner(System.in);
 String nome = "Jacqueline Oliveira";
 String tipoDeConta = "Corrente";
 Double saldoInicial = 2500.00;
 int opcao = 0;

        System.out.println("******************************");
        System.out.println("\nNome do Cliente " + nome);
        System.out.println(" Tipo da Conta" + tipoDeConta);
        System.out.println(" Saldo inicial: " + saldoInicial);
        System.out.println("\n******************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar Saldo 
                2 - Depositar 
                3 - Transferir 
                4 - Sair 
                """;


  while(opcao != 4){
      System.out.println(menu);
        opcao = leitura.nextInt();
        if(opcao == 1){
            System.out.println("O saldo atualizado é " + saldoInicial);

        }else if(opcao == 2){
            System.out.println("Qual o valor do depósito?");
             saldoInicial += leitura.nextDouble();
            System.out.println(" O salvo atualizado é :" + saldoInicial);

            }
        else if (opcao == 3) {
            System.out.println("Qual o valor da transferência ?");
            double valor = leitura.nextDouble();
            if (valor > saldoInicial) {
                System.out.println(" Não há saldo para realizar essa operação!");
            }else{
                saldoInicial -= valor;
                System.out.println(" O saldo atualizado é :" + saldoInicial);
            }
        }else if (opcao !=4){
            System.out.println("Opção Inválida! ");
        }
  }


    }
}
