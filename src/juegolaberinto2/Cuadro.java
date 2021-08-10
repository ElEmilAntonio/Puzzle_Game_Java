package juegolaberinto2;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Cuadro {

    public JuegoLaberinto2 juegoLaberinto;
    int x = 380;
    int y = 480;
    int WITH = 39, HEIGHT = 39;
    

    public Cuadro(JuegoLaberinto2 juegoLaberinto) {
        this.juegoLaberinto = juegoLaberinto;

    }

    public void paint(Graphics2D g) {
        g.drawRect(x, y, WITH, HEIGHT);
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, WITH, HEIGHT);
    }

    public boolean ColisionTotal() {
        
       if (juegoLaberinto.piedra.getBounds().intersects(getBounds())) {
            return true;
        } 
         if (juegoLaberinto.piedra2.getBounds().intersects(getBounds())) {
            return true;
        } 
         if(juegoLaberinto.caja.getBounds().intersects(getBounds())){
             return true;
         }
         if(juegoLaberinto.pared.getBounds().intersects(getBounds())){
         return true;
         }
         if(juegoLaberinto.pared2.getBounds().intersects(getBounds())){
         return true;
         }

         if(juegoLaberinto.pared3.getBounds().intersects(getBounds())){
         return true;
         }
         if(juegoLaberinto.pared4.getBounds().intersects(getBounds())){
         return true;
         }
         if(juegoLaberinto.pared5.getBounds().intersects(getBounds())){
         return true;
         }
         if(juegoLaberinto.pared6.getBounds().intersects(getBounds())){
         return true;
         }
         if(juegoLaberinto.pared7.getBounds().intersects(getBounds())){
         return true;
         }
         if(juegoLaberinto.pared8.getBounds().intersects(getBounds())){
         return true;
         }
         if(juegoLaberinto.pared9.getBounds().intersects(getBounds())){
         return true;
         }
         else{
            return false;
        }
       
        
////        {
////            return false;
////        }
        //return juegoLaberinto.piedra.getBounds().intersects(getBounds());
    }
    }

