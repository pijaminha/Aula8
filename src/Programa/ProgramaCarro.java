package Programa;

import Classes.Carro;
import Classes.Motorista;

public class ProgramaCarro {
    public static void main(String[] args) {
        Carro car = new Carro("abc789", 12345678);
        Motorista mot = new Motorista(car);

        System.out.println("velocidade atual do carro:" + car.getVelocidadeAtual());
        mot.acelerar(120);
        System.out.println("Acelerando...");
        System.out.println("velocidade atual do carro:" + car.getVelocidadeAtual());
        
    }
}