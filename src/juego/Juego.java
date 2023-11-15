package juego;

import java.util.Scanner;

public class Juego {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Raza1 guerrero1 = new Raza1();
        Raza2 mago1 = new Raza2();
        Raza3 hibrido = new Raza3();
        
        Raza1 guerrero2 = new Raza1();
        Raza2 mago2 = new Raza2();
        Raza3 hibrido2 = new Raza3(); 
        
        System.out.println("eliga un personaje");
        System.out.println("1. guerrero");
        System.out.println("2. mago");
        System.out.println("3. hibrido");
        int vida1=0;
        int vida2=0;
        int op = sc.nextInt();
        int op2 = (int) (Math.random() * (3 - 1+1)) + 1;  
        
        switch (op) {
            case 1:
                guerrero1.mostar();
                vida1=guerrero1.hp;
                break;
            case 2:
                mago1.mostar();
                vida1=mago1.hp;
                break;
            case 3:
                hibrido.mostar();
                vida1=hibrido.hp;
                break;
            default:
                System.out.println("eliga uno de los peronsajes");        }
       
        System.out.println(" ");
        System.out.println("tu rival es: ");
        
        switch (op2) {
            case 1:
                guerrero2.mostar();
                vida2=guerrero2.hp;
                break;
            case 2:
                mago2.mostar();
                vida2=mago2.hp;
                break;
            case 3:
                hibrido2.mostar();
                vida2=hibrido2.hp;
                break;
            default:
              }
        
//        System.out.println("vida1 "+vida1);
//        System.out.println("vida2 "+vida2);
        System.out.println(" ");
        int atk = 0;
       // while(vida1>0 && vida2>0){
            if(op==1){
                
                //guerrero
                System.out.println("elige tu ataque");
                System.out.println("1. atque");
                System.out.println("2. doble ataque");
                atk =sc.nextInt();
                if(atk==1){
                   guerrero1.atacar();
                }
                if(atk==2){
                    guerrero2.dobleAtaque();
                }
            }
            
            if(op==2){
                //magooo
                System.out.println("elige tu ataque");
                System.out.print("1.ataque fuego ");
                System.out.println("2.ataque rayo ");
                System.out.print("3.ataque tierra ");
                System.out.print("4.ataque hielo ");
                atk= sc.nextInt();
                if(atk==1){
                    mago1.ataqueFuego();
                }
                if(atk==2){
                    mago1.atkRayo();
                }
                if (atk==3){
                    mago1.atkTierra();
                }
                if(atk==4){
                    mago1.atkTierra();
                }
          //  }
       }
    }
}