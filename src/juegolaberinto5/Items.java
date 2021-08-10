
package juegolaberinto5;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;

public class Items {
    int x=0; int y=0;
static final int WITH=40, HEIGHT=40;   
JLabel labelitem = new JLabel();
ImageIcon item1= new ImageIcon("src/masimagenes/items.png");
Image item = item1.getImage();
   int score=0;
public JuegoLaberinto5 juegoLaberinto;  

    public Items(JuegoLaberinto5 juegoLaberinto,int px,int py) {
        this.juegoLaberinto = juegoLaberinto;
        x=px; y=py;
    }
     public void paint(Graphics2D g ){
  g.drawImage(item,x, y,WITH,HEIGHT, labelitem);   
 }
 public Rectangle getBounds(){
  return new Rectangle(x,y,WITH,HEIGHT);
 }
 void ObtenerItem(){
 if(ColisionItem()){  
 
             score+=10;
 System.out.print("score"+score);
  x=1000; y=1000;
  juegoLaberinto.puerta.numpuertas=1;
 }
 }
  public boolean ColisionItem(){
 return juegoLaberinto.personaje.getBounds().intersects(getBounds());
 }
 

}
