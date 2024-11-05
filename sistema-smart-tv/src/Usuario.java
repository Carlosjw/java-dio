public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv tá ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> Tv tá ligada: " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo volume -> Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo volume -> Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo volume -> Volume atual: " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Novo canal -> Canal atual: " + smartTv.canal);
        
        smartTv.diminuirCanal();
        System.out.println("Novo canal -> Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(89);
        System.out.println("Novo canal -> Canal atual: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Novo canal -> Canal atual: " + smartTv.canal);

        smartTv.mudarMarca("Samsung");
        System.out.println("Nova marca -> Marca atual: " + smartTv.marca);

    }
}
