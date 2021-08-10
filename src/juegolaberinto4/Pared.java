
package juegolaberinto4;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JOptionPane;
public class Pared {
public JuegoLaberinto4 juegoLaberinto;
int x=0; int y=0;
int WITH=0, HEIGHT=0;   
JLabel labellava= new JLabel();
ImageIcon lava1= new ImageIcon("src/masimagenes/Lava.png");
Image lava = lava1.getImage();
public Pared(JuegoLaberinto4 juegoLaberinto,int px, int py ,int pWITH ,int pHEIGTH) {
this.juegoLaberinto = juegoLaberinto;    
    x=px;  y=py;
    WITH=pWITH;  HEIGHT=pHEIGTH;
    }
   public void paint(Graphics2D g ){
   g.drawImage(lava,x,y,WITH,HEIGHT, labellava);
  }
   
   public Rectangle getBounds(){
  return new Rectangle(x,y,WITH,HEIGHT);
 }
   public void Pisastelava(){
    if(ColisionPared()){
    JOptionPane.showMessageDialog(null,"eh pringao te moriste");
   juegoLaberinto.personaje.x=juegoLaberinto.personaje.inicialx;
   juegoLaberinto.personaje.y=juegoLaberinto.personaje.inicialy;
    }   
   }
   
    public boolean ColisionPared(){
 return juegoLaberinto.personaje.getBounds().intersects(getBounds());
  
 }
 } 
    

