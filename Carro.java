
package carro;

import java.util.Scanner;

public class Carro {
String modelo;
String marca;
int vm;
int potencia;

//set: inserir as variáveis
public void set(){
    Scanner sc = new Scanner(System.in);   
       System.out.println("Informe o modelo");
    this.modelo = sc.next();
       System.out.println("Informe a marca");
    this.marca = sc.next();
           System.out.println("Informe a velocidade máxima");
    this.vm = sc.nextInt();
           System.out.println("Informe a potência do veículo");
    this.potencia = sc.nextInt();    
}

//menu: onde será lido as variáveis lançadas no set
public void menu(){
        System.out.println("Os dados digitados foram:");
        System.out.println(""+this.modelo);    
        System.out.println(""+this.marca);
        System.out.println(""+this.vm);
        System.out.println(""+this.potencia);
}




//funções do carro
public void ligarcarro(){
    System.out.println("Carro ligado");        
}

public void virardireita (){
Scanner sc = new Scanner (System.in);    
    System.out.println("O carro esta ligado? 1-sim, 2-nao");
int ligado = sc.nextInt();
if(ligado<2){    
    System.out.println("Manobrado para a direita");
}else{
    System.out.println("Carro parado, ligue para efetuar a acao");    
}
}

public void viraresquerda(){
    Scanner sc = new Scanner (System.in);
int manobra = 0;
    System.out.println("O carro esta ligado? 1-sim, 2-nao");
    manobra = sc.nextInt();
if(manobra<2){    
    System.out.println("Manobrado para a esquerda");
}else{
    System.out.println("Carro parado, ligue para efetuar a acao");    
}    
}
public void frear(){
Scanner sc = new Scanner (System.in);    
    System.out.println("O carro esta ligado? 1-sim, 2-nao");
    int frear = sc.nextInt();
if(frear<2){
    for (int i=5;i>=0;i--)
    System.out.println(i);
    System.out.println("Freando");
}else{
    System.out.println("Carro parado, ligue para efetuar a acao");    
}   
}    
public void desligar (){
    Scanner sc = new Scanner (System.in);
    int parar = 0;    
    System.out.println("O carro esta ligado? 1-sim, 2-nao");
    parar = sc.nextInt();
if(parar<2){    
    System.out.println("carro parado");
}else{
    System.out.println("Carro ja parado, ligue para efetuar a acao");   
}
}

   
    public static void main(String[] args) {    
    Carro atv = new Carro();
    atv.set();
    atv.menu();
    
    int opcao = 0;
    Scanner sc = new Scanner(System.in);
        System.out.println("O que voce deseja fazer? 1 - Ligar o carro, 2 - Virar para a direita, 3 - Virar para a esquerda, 4 - Freiar, 5 - Desligar");    
    opcao = sc.nextInt();
        
    switch (opcao){
    case 1:
    atv.ligarcarro();
    break;

    case 2:
    atv.virardireita();
    break;
    
    case 3:
    atv.viraresquerda();
    break;
    
    case 4: 
    atv.frear();
    break;
    
    case 5:
    atv.desligar();
    break;

    }

     }
    }
    
