package DIO.DIO.javabootcamp.conceitos.pilhaLifo;

public class Main {
    public static void main(String[] args) {

        Pilha minhaPilha = new Pilha();

        minhaPilha.push(new No(1));
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));
        minhaPilha.push(new No(6));

        System.out.println(minhaPilha);
        minhaPilha.pop();
        minhaPilha.pop();
        minhaPilha.push(new No(7));
        minhaPilha.pop();
        minhaPilha.push(new No(000));

        System.out.println(minhaPilha);
    }
}
