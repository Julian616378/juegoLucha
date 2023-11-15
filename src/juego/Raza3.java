package juego;

import juego.Interfaces.Magias;
import juego.Interfaces.Skills;

public class Raza3 implements Magias, Skills{
    public int hp;
    private int ph;
    private int atk;

    public Raza3() {
        this.hp = 400;
        this.ph = 200;
        this.atk = 30;
    }
    
   

    @Override
    public void ataqueHielo() {
        
        System.out.println("El jugador realiza ataque de hielo");
        
    }

    @Override
    public void ataqueFuego() {
        
        System.out.println("El jugador realiza ataque de fuego");
        
    }

    @Override
    public void escapar() {
        
        System.out.println("El jugador escapa");
        
    }

    @Override
    public void atacar() {
        
        System.out.println("El jugador realiza un ataque basico");
        
    }

    public void dobleAtaque() {
        
        System.out.println("El jugador realiza un ataque doble");
        
    }

    @Override
    public void atkRayo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void atkTierra() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ataqueDoble() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     public void mostar (){
         System.out.println("hibrido");
        System.out.println("sus estadisticas son: ");
        System.out.println("su vida es:"+hp);
        System.out.println("su magia es: "+ph);
        System.out.println("su ataque es: "+atk);
    }
    
}
