package DIO.javabootcamp.poo.exercicio;

public class RodarAplicacao {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("Corsa 1.6 1999");
        carro1.setCapacidadeTanque(57);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.valorTotalTanque(6.41));

        Carro carro2 = new Carro("Amarelo","Voyage", 104);


        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.valorTotalTanque(4.22));


    }
}
