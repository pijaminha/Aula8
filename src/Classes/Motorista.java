package Classes;

public class Motorista {
    private String nome;
    private String matricula;
    private Carro veiculoAtual;

    public Motorista (Carro veiculoAtual) {
        this.veiculoAtual = veiculoAtual;
    }

    public Motorista(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void acelerar(int limite) {
        veiculoAtual.acelerar(limite);
    }

    public Carro getVeiculoAtual() {
        return veiculoAtual;
    }

    public void setVeiculoAtual(Carro veiculoAtual) {
        this.veiculoAtual = veiculoAtual;
    }

    
}