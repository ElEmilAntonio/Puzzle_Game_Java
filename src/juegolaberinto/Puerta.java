
package juegolaberinto;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JOptionPane;
public class Puerta {
    int numpuertas=0;
   int x=0; int y=0;
   int WITH=40, HEIGHT=40;  
JLabel labelpuerta = new JLabel();
ImageIcon puerta1= new ImageIcon("src/masimagenes/puerta.png");
Image puerta = puerta1.getImage();
ImageIcon puerta2= new ImageIcon("src/masimagenes/puertaapagada.png");
Image puertaapagada = puerta2.getImage();
public JuegoLaberinto juegoLaberinto;
Image[] puertas={puertaapagada,puerta};

 public Puerta(JuegoLaberinto juegoLaberinto,int px, int py){
  this.juegoLaberinto= juegoLaberinto;  
  x=px;  y=py;
 }
  public void paint(Graphics2D g ){
      if(juegoLaberinto.item.score>0){
          numpuertas=1;
       g.drawImage(puertas[numpuertas],x, y,WITH,HEIGHT, labelpuerta);       
      }else{
          numpuertas=0;
  g.drawImage(puertas[numpuertas],x, y,WITH,HEIGHT, labelpuerta);
      }
 }
 public Rectangle getBounds(){
  return new Rectangle(x,y,WITH,HEIGHT);
 }
 
 void ActivarPuerta(){
 if(ColisionPuerta()){  
     if(numpuertas==0){
 
    System.out.println("\n puerta esta desactivada");  
  

   }else{
    
    System.out.println("\n has pasado el nivel1 ");  
    
     }
 }
 }
  public boolean ColisionPuerta(){
 return juegoLaberinto.personaje.getBounds().intersects(getBounds());
  
 }
}
