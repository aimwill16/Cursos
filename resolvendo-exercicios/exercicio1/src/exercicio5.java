import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número para descobrir sua tabuada:");
        numero = x.nextInt();

        int resultado = 0;
        int multi = 0;
        do {
            resultado=numero*multi;
            System.out.println(""+numero+" X "+multi+" = " +resultado);
            multi++;
        }while(multi<=10);
    }
}
