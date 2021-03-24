package Classes;

public class Carro {
    private String placa;
    private int numChassi;
    private int velocidadeAtual;
    private Motorista motorista;

    public Carro(Motorista motorista){
        this.motorista = motorista;
        motorista.setVeiculoAtual(this);
    }

    public Carro(String placa, int numChassi) {
        this.placa = placa;
        this.numChassi = numChassi;  
    }

    public Carro(String placa, int numChassi, Motorista motorista) {
        this(motorista);
        this.placa = placa;
        this.numChassi = numChassi;  
    }

    public void acelerar () {
        velocidadeAtual++;
        
    }
    public void acelerar(int limite) {
        for(int i = velocidadeAtual; i < limite; i++)
        {
            acelerar();
        }
    }
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getNumChassi() {
        return numChassi;
    }
    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
    
 

    
}