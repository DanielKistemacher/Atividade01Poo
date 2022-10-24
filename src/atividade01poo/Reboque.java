package atividade01poo;

public class Reboque {
    private String tipo;
    
    public Reboque(){
        this.tipo = "";
    }
    
    // Método que irá definir o tipo do reboque
    public void definirTipo(String novoTipo){
        this.tipo = novoTipo;
    }

    public String getTipo() {
        return this.tipo;
    }   
}
