package atividade01poo;

public class Atividade01Poo {
    public static void main(String[] args) {

        Caminhao caminhao1 = new Caminhao();
        caminhao1.setModelo("FH Classic");
        caminhao1.setCor("Branco");
        caminhao1.setMarca("Renault");
        
        System.out.println("INFORMAÇÕES");
        System.out.println("===== CAMINHÃO =====");
        System.out.println("Modelo: "+ caminhao1.getModelo());
        System.out.println("Cor: "+ caminhao1.getCor());
        System.out.println("Marca: "+ caminhao1.getMarca());
        
        Reboque reboque1 = new Reboque();
        reboque1.setTipo("Produtos químicos");
        
        System.out.println("===== REBOQUE =====");
        System.out.println("Tipo: "+ reboque1.getTipo());
        
        Carro carro1 = new Carro();
        carro1.setModelo("Siena");
        carro1.setCor("Amarelo");
        carro1.setMarca("Fiat");
        System.out.println("===== CARRO =====");
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Modelo: " + carro1.getCor());
        System.out.println("Modelo: " + carro1.getMarca());
    }
}
