
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digitie sua idade");
        int idade= scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Ola, me chamo " + nome.toUpperCase() + "Sobrenome");
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é "+altura + "cm" );
        }
        catch(InputMismatchException e){
            System.out.println("O campos de idade e altura precisam ser numéricos ");
        }
    }


}
