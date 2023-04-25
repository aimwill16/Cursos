package DIO.DIO.javabootcamp.conceitos.atribuicaoereferencia;

public class main {
    public static void main(String[] args) {

        int intA = 1;
        int intB = intA;

        System.out.println("IntA: "+intA+ " e intB: "+intB);
        intA = 2;
        System.out.println("IntA: "+intA+ " e intB: "+intB);

        meuObj objA = new meuObj(1);
        meuObj objB = objA;

        System.out.println("objA: "+objA+ " e objB: "+objB);
        objA.setNum(2);
        System.out.println("objA: "+objA+ " e objB: "+objB);



    }
}
