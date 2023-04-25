public class Usuario {
    public static void main (String[] args){
        SmartTV smartTv = new SmartTV();

        System.out.println("TV Ligada? " +smartTv.ligada);
        System.out.println("Canal atual: " +smartTv.canal);
        System.out.println("Volume atual: " +smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status: TV Ligada? " +smartTv.ligada);

        System.out.println("Volume alterado. Volume atual é: " +smartTv.volume);
        smartTv.volumeMais();
        System.out.println("Volume alterado. Volume atual é: " +smartTv.volume);

        smartTv.canalMais();
        System.out.println("Canal atual: " +smartTv.canal);

        smartTv.selecionarCanal(20);

    }
}
