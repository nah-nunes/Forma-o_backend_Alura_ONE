import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println(filme);
        System.out.println(" Qual o ano de lançamento?");
        int ano = leitura.nextInt();
        System.out.println( filme +" " + ano);


        leitura.close();
    }
}
