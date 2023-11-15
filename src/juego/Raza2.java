package juego;

import juego.Interfaces.Magias;

public class Raza2 implements Magias{
    public int hp;
    private int ph;
    private int atk;

    public Raza2() {
        this.hp = 300;
        this.ph = 500;
        this.atk = 20;
    }
    
    
    

    @Override
    public void ataqueHielo() {
        
        System.out.println("El mago realiza un ataque de hielo");
        
    }

   
    public void ataqueFuego() {
        
        System.out.println("El mago realiza un ataque de fuego");
        
        
    }

    @Override
    public void atkRayo() {
        System.out.println("el mago realiza ataque de rayo");
    }

    @Override
    public void atkTierra() {
        System.out.println("el mago realiza ataqe de tierra");
    }
     public void mostar (){
        System.out.println(" mago");
        System.out.println("sus estadisticas son: ");
        System.out.println("su vida es:"+hp);
        System.out.println("su magia es: "+ph);
        System.out.println("su ataque es: "+atk);
    }

}
