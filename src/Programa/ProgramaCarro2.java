package Programa;

import Classes.Carro;
import Classes.Motorista;

public class ProgramaCarro2 {
    public static void main(String[] args) {
        Motorista mot = new Motorista("ANA", "12345");
        Carro car = new Carro("abc789", 12345678, mot);

        System.out.println("velocidade atual do carro:" + car.getVelocidadeAtual());
        car.getMotorista().acelerar(130);

        System.out.println("Acelerando...");
        System.out.println("velocidade atual do carro:" + car.getVelocidadeAtual());
        System.out.println("Nome do motorista: " + car.getMotorista().getNome());
        
    }
    
}