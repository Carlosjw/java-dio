package edu.carlos.primeirasemana;

public class operadores {
    public static void main(String[] args) {
        final String nomeCompleto = "LINGUAGEM" + " JAVA";
        System.out.println(nomeCompleto);

        /* CONCATENAÇÃO:
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);
        */

        // OPERADORES II
        int numero = 5;
        System.out.println(numero);

        numero = - 5; // alterando tipo de valor para negativo
        System.out.println(numero);

        numero = numero * -1; // alterando número para positivo
        System.out.println(numero);

        // NEGAÇÃO
        boolean verdade = true;
        System.out.println(verdade);

        verdade = !verdade;
        System.out.println(verdade);
        

    }
}
