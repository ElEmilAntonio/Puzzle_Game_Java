
package juegolaberinto;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;
public class Piedra {
    int x=0; int y=0;
   int WITH=40, HEIGHT=40;
   int inicialx=0; int inicialy=0;
 JLabel labelpiedra = new JLabel();
ImageIcon piedra1= new ImageIcon("src/imagenes/piedra.png");
Image imagenpiedra = piedra1.getImage();
 public JuegoLaberinto juegoLaberinto;
 
 public Piedra(JuegoLaberinto juegoLaberinto,int px, int py ){
 this.juegoLaberinto= juegoLaberinto;
 x=px;  y=py;
 inicialx=px; inicialy=py;
 }
 public void paint(Graphics2D g ){
  g.drawImage(imagenpiedra,x, y,WITH,HEIGHT, labelpiedra);   
 }
 public Rectangle getBounds(){
  return new Rectangle(x,y,WITH,HEIGHT);
 }
 
 
  void moverpiedra(){
 if(ColisionMoverPiedra()){
     if(juegoLaberinto.personaje.x<x){
 x+=HEIGHT;
 }
     if(juegoLaberinto.personaje.x>x){
  x-=HEIGHT;   
 } 
     
     if(juegoLaberinto.personaje.y>y){
  y-=WITH;   
 }
     if(juegoLaberinto.personaje.y<y){
 y+=WITH;    
 }
 }
 }
 public boolean ColisionMoverPiedra(){
 return juegoLaberinto.personaje.getBounds().intersects(getBounds());
 }
}
