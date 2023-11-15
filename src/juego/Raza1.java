package juego;

import juego.Interfaces.Skills;

public class Raza1 implements Skills {
    public int hp;
    private int ph;
    private int atk;

    public Raza1() {
        this.hp = 500;
        this.ph = 0;
        this.atk = 50;
    }

    @Override
    public void escapar() {
        
        System.out.println("El guerrero escapa... :c");
        
    }

    @Override
    public void atacar() {
        
        System.out.println("El guerrero ataca");
        
    }

   
    public void dobleAtaque() {
        
        System.out.println("El guerrero hace un ataque doble");
        
    }

    @Override
    public void ataqueDoble() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void mostar (){
        System.out.println("guerrero");
        System.out.println("sus estadisticas son: ");
        System.out.println("su vida es:"+hp);
        System.out.println("su magia es: "+ph);
        System.out.println("su ataque es: "+atk);
    }
    
}
