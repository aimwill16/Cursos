import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int fatorial;

        System.out.println("Digite um número para saber o fatorial: ");
        fatorial = x.nextInt();

        int resultado = 1;

        for (int i = fatorial; i >= 1; i--) {
            resultado = resultado * i;
        }
        System.out.println(+resultado);
    }
}
