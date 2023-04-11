import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int numero, soma=0,media, maior=0;

        int count = 0;
        do{
            System.out.println("Digite um número: ");
            numero= x.nextInt();

            soma+= numero;
            media= soma/5;
            System.out.println("Soma: "+soma);
            if (numero > maior) maior = numero;
            count+= 1;
        }while(count < 5);

        System.out.println("Media: "+media);
        System.out.println("Maior :" +maior);
        x.close();
    }
}
