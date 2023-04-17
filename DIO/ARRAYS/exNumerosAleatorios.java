package DIO.ARRAYS;

import java.util.Random;

public class exNumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(2);
            numerosAleatorios[i] = numero;
        }
        System.out.print("Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero+ " ");
        }
        System.out.println("\nSucessores dos numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) +" ");
        }

        int[][] numeros = {{4, 9, 8, 5}, {3, 0, 1, 5}, {1, 2, 7, 4}};
        System.out.print(numeros[2][2]);
    }
}
