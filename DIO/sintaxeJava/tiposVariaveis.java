package DIO.sintaxeJava;

public class tiposVariaveis {
    public static void main (String [] args){
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333;
        long cpf = 987654321;
        float pi = 3.14F;
        double salario = 1275.33;

        byte numeroCurto = 1;
        int numeroNormal = numeroCurto;
        //Aqui, eu preciso forçar o short (abaixo) para evitar erro de compilação.
        byte numeroCurto2 = (byte) numeroNormal;

        System.out.println(numeroCurto2);
        System.out.println(numeroNormal);
        System.out.println(numeroCurto);


    }
}
