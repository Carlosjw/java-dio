package edu.carlos.primeirasemana;
public class TiposVariaveis {

    public static void main(String[] args) {
        double salarioMinimo = 1412;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        final String MEU_NOME = "Carlos Lima";

        System.out.println(salarioMinimo + " : " + numeroCurto2 + " : " + MEU_NOME);
    }
}
