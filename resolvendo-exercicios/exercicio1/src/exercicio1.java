import java.util.Scanner;

public class exercicio1 {
    /*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int idade;
        String nome;

        while(true) {
            System.out.println("Nome: ");
            nome = x.next();
            if (nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = x.nextInt();
        }

    }
}