import java.util.Scanner;

public class exercicio4 {
    /*
    Faça um programa que peça N números inteiros
    calcule e mostre a quantidade de números pares
    e a quantidade de números impares. */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int numero, par=0, impar=0;

        do {
            System.out.println("Digite um número:");
            numero = x.nextInt();
            if (numero % 2 == 0){
                par+= 1;
            } else {
                impar+=1;
            }
            System.out.println("Quantidade de números pares: " +par);
            System.out.println("Quantidade de números impares: " +impar);
        }while(impar<2 || par<2);

        x.close();

    }
}
