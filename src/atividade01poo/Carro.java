package atividade01poo;

public class Carro {
    private String modelo, cor, marca;
    private int velocidade, acelerar, frear, velocidadeMaxima;
    private boolean ligado, desligado, luzes;

    public Carro() {
        this.modelo = "";
        this.cor = "";
        this.marca = "";
        this.velocidade = 0;
        this.acelerar = 0;
        this.frear = 0;
        this.ligado = false;
        this.desligado = true;
        this.luzes = false;
        this.velocidadeMaxima = 180;
    }
    
    // Método que irá definir o nome do modelo para o carro
    public void definirModelo(String novoModelo){
        this.modelo = novoModelo;        
    }
    
    // Método que irá definir a cor para o carro
    public void definirCor(String novaCor){
        this.cor = novaCor;
    }
        
    public void definirMarca(String novaMarca){
        this.marca = novaMarca;
    }
    
    // Método que irá ligar o carro
    public void ligar(){
        if (this.ligado == false && this.desligado == true){
            this.ligado = true;
            this.desligado = false;
        }
    }
    
    // Método que irá ligar o carro
    public void desligar(){
        if (this.ligado == true && this.desligado == false){
            this.ligado = false;
            this.desligado = true;
        }
    }
    
    // Método que irá acelerar o carro
    public void acelerar(){
        if (this.velocidade + 1 < this.velocidadeMaxima){
            this.velocidade = this.velocidade + 1;
        }
    }
    
    // Método que irá  frear o carro
    public void frear(){
        this.velocidade = this.velocidade -1;
        if (this.velocidade < 0){
            this.velocidade = 0;
        }
    }
    
    // Método que irá ligar ou desligar as luzes do carro
    public void ligarLuzes(){
        if (this.luzes == false){
            this.luzes = true;
        }
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public int getAcelerar() {
        return this.acelerar;
    }

    public int getFrear() {
        return this.frear;
    }

    public int getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    public boolean isLigado() {
        return this.ligado;
    }

    public boolean isDesligado() {
        return this.desligado;
    }

    public boolean isLuzes() {
        return this.luzes;
    }
}
