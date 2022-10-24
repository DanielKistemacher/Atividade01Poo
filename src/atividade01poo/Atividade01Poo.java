package atividade01poo;

import java.util.Scanner;

public class Atividade01Poo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String novoModeloCaminhao, novaCorCaminhao, novaMarcaCaminhao, tipoReboque, novoModeloCarro, novaCorCarro, novaMarcaCarro;
        boolean estadoCaminhao, luzesCaminhao, estadoCarro, luzesCarro;
        
        // RECEBENDO AS INFORMAÇÕES DO CAMINHÃO
        Caminhao caminhao1 = new Caminhao();
        System.out.println("Informe os dados do caminhão");
        System.out.print("Modelo do caminhão: ");
        novoModeloCaminhao = input.nextLine();
        caminhao1.definirModelo(novoModeloCaminhao);
        
        System.out.print("Cor do caminhão: ");
        novaCorCaminhao = input.nextLine();
        caminhao1.definirCor(novaCorCaminhao);
        
        System.out.print("Marca do caminhão: ");
        novaMarcaCaminhao = input.nextLine();
        caminhao1.definirMarca(novaMarcaCaminhao);
        
        caminhao1.ligar();
        caminhao1.ligarLuzes();
        caminhao1.acelerar();
        caminhao1.acelerar();
        caminhao1.acelerar();
        caminhao1.acelerar();
        caminhao1.acelerar();
        caminhao1.frear();
        
        
        // RECEBENDO AS INFORMAÇÕES DO REBOQUE        
        Reboque reboque1 = new Reboque();
        System.out.println("Informe os dados do reboque");
        System.out.print("Tipo de reboque: ");
        tipoReboque = input.nextLine();
        reboque1.definirTipo(tipoReboque);
        
        // RECEBENDO AS INFORMAÇÕES DO CARRO
        Carro carro1 = new Carro();
        System.out.println("Informe os dados do carro");
        System.out.print("Modelo do carro: ");
        novoModeloCarro = input.nextLine();
        carro1.definirModelo(novoModeloCarro);
        
        System.out.print("Cor do carro: ");
        novaCorCarro = input.nextLine();
        carro1.definirCor(novaCorCarro);
        
        System.out.print("Marca do carro: ");
        novaMarcaCarro = input.nextLine();
        carro1.definirMarca(novaMarcaCarro);
        
        carro1.ligar();
        carro1.ligarLuzes();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.frear();
        
        
        // APRESENTANDO OS VALORES DE CADA ATRIBUTO DOS OBJETOS
        System.out.println("\n" + "===== INFORMAÇÕES SOBRE O CAMINHÃO =====");
        System.out.println("Modelo: "+ caminhao1.getModelo());
        System.out.println("Cor: "+ caminhao1.getCor());
        System.out.println("Marca: "+ caminhao1.getMarca());
        estadoCaminhao = caminhao1.isLigado();
        if (estadoCaminhao == true){
            System.out.println("Estado atual: Caminhão ligado !");
        } else if (estadoCaminhao == false){
            System.out.println("Estado atual: Caminhão desligado !");
        }
        System.out.println("Velocidade: "+ caminhao1.getVelocidade() + " km/h");
        luzesCaminhao = caminhao1.isLuzes();
        if (luzesCaminhao == true){
            System.out.println("Luzes: As luzes do caminhão estão ligadas!");
        } else if (luzesCaminhao == false){
            System.out.println("Luzes: As luzes do caminhão estão desligadas!");
        }
                
        System.out.println("\n" + "===== INFORMAÇÕES DO REBOQUE =====");
        System.out.println("Tipo: "+ reboque1.getTipo());
                
        System.out.println("\n" + "===== INFORMAÇÕES SOBRE O CARRO =====");
        System.out.println("Modelo: "+ carro1.getModelo());
        System.out.println("Cor: "+ carro1.getCor());
        System.out.println("Marca: "+ carro1.getMarca());
        estadoCarro = carro1.isLigado();
        if (estadoCarro == true){
            System.out.println("Estado atual: Carro ligado !");
        } else if (estadoCarro == false){
            System.out.println("Estado atual: Carro desligado !");
        }
        System.out.println("Velocidade: "+ carro1.getVelocidade() + " km/h");
        luzesCarro = carro1.isLuzes();
        if (luzesCarro == true){
            System.out.println("Luzes: As luzes do carro estão ligadas!");
        } else if (luzesCarro == false){
            System.out.println("Luzes: As luzes do carro estão desligadas!");
        }
    }
}
