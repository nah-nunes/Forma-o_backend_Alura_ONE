public class Condicional {

    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022){

                System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
                System.out.println("Não curtem mesmo");
        }

        if(incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Liberado, pode assistir!");


        } else{
            System.out.println("Pague o aluguel");
        }

        /*switch (expressão) {
            case valor1:
                // código a ser executado se a expressão for igual a valor1
                break;
            case valor2:
                // código a ser executado se a expressão for igual a valor2
                break;
            case valor3:
                // código a ser executado se a expressão for igual a valor3
                break;
   ...
            default:
                // código a ser executado se a expressão não for igual a nenhum valor
                break;
        }*/


    }


}
