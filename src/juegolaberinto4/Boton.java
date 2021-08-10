

package juegolaberinto4;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;
public class Boton {
    int activacion=0;
   
  int x=40; int y=440;
static final int WITH=40, HEIGHT=40;   
public JuegoLaberinto4 juegoLaberinto;
JLabel labelboton = new JLabel();
ImageIcon boton1= new ImageIcon("src/imagenes/boton.png");
Image boton = boton1.getImage();

 public Boton(JuegoLaberinto4 juegoLaberinto){
  this.juegoLaberinto= juegoLaberinto;   
 }
  public void paint(Graphics2D g ){
  g.drawImage(boton,x, y,WITH,HEIGHT, labelboton);   
 }
 public Rectangle getBounds(){
  return new Rectangle(x,y,WITH,HEIGHT);
 }
 void ActivarBoton(){
 if(ColisionBotonPersona()){
     
    System.out.println("boton activado con persona");  
  
 }
 if(ColisionBotonPiedra()){
  
    System.out.println("boton activado con piedra");  
   activacion=1;     
 }
 }
 
  public boolean ColisionBotonPersona(){
 return juegoLaberinto.personaje.getBounds().intersects(getBounds());
 }
 public boolean ColisionBotonPiedra(){
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
        }else{
                return false;
            }
 }
}
