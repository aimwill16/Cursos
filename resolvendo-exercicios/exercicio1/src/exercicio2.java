import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] arg) {
        Scanner x = new Scanner(System.in);
        int valor;
        double[] notas = new double[11];

        /* Aqui eu crio uma array com as notas*/
        for (int i = 0; i <= 10; i++) {
            notas[i] = i;
        }
        /*peço a entrada de nota para o usuário*/
        System.out.println("Digite o valor da nota:");
        valor = x.nextInt();

        /*processamento de informação, onde o programa verificará se o valor digitado corresponde a uma nota válida*/
        boolean encontrado = false;
        for (int i=0; i<=10;i++) {
            if (notas[i] == valor) {
                System.out.println("Sua nota é: " + valor);
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("Valor inválido");
            }
        x.close();
    }
}
