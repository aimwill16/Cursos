public class exercicio1 {
    public static void main(String[] args) {
        int[] vetor = {1, 3, 3, 1, 2, 3};

        System.out.print("vetor: ");
        /*int count = 0;
        while(count < (vetor.length)) {
            System.out.print(vetor[count]);
            count++;
        }*/

        for (int i = (vetor.length -1); i >= 0; i--){
            System.out.print(vetor[i] + " ");

        }
    }
}
