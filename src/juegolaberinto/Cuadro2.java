/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegolaberinto;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Cuadro2 {
  public JuegoLaberinto juegoLaberinto;
    int x = 380;
    int y = 480;
    int WITH = 39, HEIGHT = 39;
    public Cuadro2(JuegoLaberinto juegoLaberinto) {
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
         if (juegoLaberinto.piedra3.getBounds().intersects(getBounds())) {
            return true;
        }
         if (juegoLaberinto.piedra4.getBounds().intersects(getBounds())) {
            return true;
        } 
         if (juegoLaberinto.piedra5.getBounds().intersects(getBounds())) {
            return true;
        } 
         if (juegoLaberinto.piedra6.getBounds().intersects(getBounds())) {
            return true;
        } 
         if (juegoLaberinto.piedra7.getBounds().intersects(getBounds())) {
            return true;
        } 
         if (juegoLaberinto.piedra8.getBounds().intersects(getBounds())) {
            return true;
        } 
         if (juegoLaberinto.piedra9.getBounds().intersects(getBounds())) {
            return true;
        } 
          if (juegoLaberinto.piedra10.getBounds().intersects(getBounds())) {
            return true;
        } 
         if (juegoLaberinto.piedra11.getBounds().intersects(getBounds())) {
            return true;
        } 
         if (juegoLaberinto.piedra12.getBounds().intersects(getBounds())) {
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
         else{
            return false;
        }
       
        
////        {
////            return false;
////        }
        //return juegoLaberinto.piedra.getBounds().intersects(getBounds());
    }   
}
