package DIO.javabootcamp.poo.exercicio;

public class Carro {
    /*atributos*/

    String cor, modelo;
    int capacidadeTanque;


    // construtores

    Carro(){

    }
    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    //gets e sets

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque(){
        return capacidadeTanque;
    }
    public void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    double valorTotalTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }




}
