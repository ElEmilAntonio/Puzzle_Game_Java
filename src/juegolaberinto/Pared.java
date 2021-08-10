
package juegolaberinto;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JOptionPane;
public class Pared {
public JuegoLaberinto juegoLaberinto;
int x=0; int y=0;
int WITH=0, HEIGHT=0;   
JLabel labellava= new JLabel();
ImageIcon lava1= new ImageIcon("src/masimagenes/Lava.png");
Image lava = lava1.getImage();
public Pared(JuegoLaberinto juegoLaberinto,int px, int py ,int pWITH ,int pHEIGTH) {
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
    JOptionPane.showMessageDialog(null,"caiste a la lava");
   juegoLaberinto.personaje.x=juegoLaberinto.personaje.inicialx;
   juegoLaberinto.personaje.y=juegoLaberinto.personaje.inicialy;
     juegoLaberinto.piedra.y=juegoLaberinto.piedra.inicialy;
      juegoLaberinto.piedra.x=juegoLaberinto.piedra.inicialx;
       juegoLaberinto.piedra2.y=juegoLaberinto.piedra.inicialy;
      juegoLaberinto.piedra2.x=juegoLaberinto.piedra.inicialx;
       juegoLaberinto.piedra3.y=juegoLaberinto.piedra.inicialy;
      juegoLaberinto.piedra3.x=juegoLaberinto.piedra.inicialx;
       juegoLaberinto.piedra4.y=juegoLaberinto.piedra.inicialy;
      juegoLaberinto.piedra4.x=juegoLaberinto.piedra.inicialx;
       juegoLaberinto.piedra5.y=juegoLaberinto.piedra.inicialy;
      juegoLaberinto.piedra5.x=juegoLaberinto.piedra.inicialx;
       juegoLaberinto.piedra6.y=juegoLaberinto.piedra.inicialy;
      juegoLaberinto.piedra6.x=juegoLaberinto.piedra.inicialx;
       juegoLaberinto.piedra7.y=juegoLaberinto.piedra.inicialy;
      juegoLaberinto.piedra7.x=juegoLaberinto.piedra.inicialx;
       juegoLaberinto.piedra8.y=juegoLaberinto.piedra.inicialy;
      juegoLaberinto.piedra8.x=juegoLaberinto.piedra.inicialx;
       juegoLaberinto.piedra9.y=juegoLaberinto.piedra.inicialy;
      juegoLaberinto.piedra9.x=juegoLaberinto.piedra.inicialx;
       juegoLaberinto.piedra10.y=juegoLaberinto.piedra.inicialy;
      juegoLaberinto.piedra10.x=juegoLaberinto.piedra.inicialx;
       juegoLaberinto.piedra11.y=juegoLaberinto.piedra.inicialy;
      juegoLaberinto.piedra11.x=juegoLaberinto.piedra.inicialx;
       juegoLaberinto.piedra12.y=juegoLaberinto.piedra.inicialy;
      juegoLaberinto.piedra12.x=juegoLaberinto.piedra.inicialx;
    }   
   }
   
    public boolean ColisionPared(){
 return juegoLaberinto.personaje.getBounds().intersects(getBounds());
  
 }
 } 
    

