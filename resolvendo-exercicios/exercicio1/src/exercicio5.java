import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número para descobrir sua tabuada:");
        numero = x.nextInt();

        int resultado = 0;
        int multi = 0;

        // feito do {} while() e for para comparacao.
        /*
        do {
            resultado=numero*multi;
            System.out.println(""+numero+" X "+multi+" = " +resultado);
            multi++;
        }while(multi<=10);
        */
        for (multi=0;multi<=10;multi++) {
            resultado=numero*multi;
            System.out.println(""+numero+" X "+multi+" = " +resultado);
        }
    }
}
