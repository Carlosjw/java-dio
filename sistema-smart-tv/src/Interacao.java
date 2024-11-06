import java.util.Locale;
import java.util.Scanner;

public class Interacao {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = inputUser.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = inputUser.next();

        System.out.println("Digite a sua idade: ");
        int idade = inputUser.nextInt();

        System.out.println("Digite sua altura:");
        double altura = inputUser.nextDouble();

        System.out.println("Olá, meu nome é " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");

        System.out.println("Minha altura é " + altura + "m");

    }
}
