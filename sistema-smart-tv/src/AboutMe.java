public class AboutMe {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Uso: java AboutMe <nome> <sobrenome> <idade> <altura>");
            return;
        }

        String nome = args[0];
        String sobrenome = args[1];
        int idade = 0;
        double altura = 0.0;

        try {
            idade = Integer.parseInt(args[2]);
            altura = Double.parseDouble(args[3]);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Idade deve ser um número inteiro e altura deve ser um número decimal.");
            return;
        }

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");
    }
}
