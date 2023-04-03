package sintaxeJava;

public class Operadores {

    //Concatenação
    public static void main (String [] args){
        String nomeCompleto = "João" + " " + " da Silva";

        System.out.println(nomeCompleto);

        String concatenacao ="?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        int numero = 5;


        System.out.println(numero);

    }
}
