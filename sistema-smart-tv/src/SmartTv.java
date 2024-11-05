public class SmartTv{
    String marca = "Samsung";
    boolean ligada = false;
    int canal = 1;
    int volume = 30;

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void mudarMarca(String novaMarca){
        marca = novaMarca;
    }
}