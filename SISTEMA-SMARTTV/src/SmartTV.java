public class SmartTV {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void aumentarCanal(){
        canal++;
    }  public void diminuirCanal(){
        canal--;
    }
    public void selecionarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal selecionado é: " + canal);
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void volumeMais(){
        volume++;
    }
    public void volumeMenos(){
        volume--;
        System.out.println("Volume diminuiu");
    }
    public void canalMais(){
        canal++;
        System.out.println("Volume aumentou");
    } public void canalMenos(){
        canal--;
    }
}
