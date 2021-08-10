
package juegolaberinto2;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;
public class Espada {
  int x=1200; int y=1200;
static final int WITH=40, HEIGHT=40;      
JLabel labelespada = new JLabel();
ImageIcon espada1= new ImageIcon("src/masimagenes/espada.png");
Image espada = espada1.getImage();
public JuegoLaberinto2 juegoLaberinto;
public Espada( JuegoLaberinto2 juegoLaberinto){
 this.juegoLaberinto= juegoLaberinto;   
}
  public void paint(Graphics2D g ){
  g.drawImage(espada,x, y,WITH,HEIGHT, labelespada);   
 
 }
  
  public Rectangle getBounds(){
  return new Rectangle(x,y,WITH,HEIGHT);
 }
  
}
