/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegolaberinto5;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;
public class Caja {
    int roto=0;
 int x=40; int y=440;
static final int WITH=40, HEIGHT=40;   
boolean cajarota=false;
JLabel labelcaja = new JLabel();
ImageIcon caja1= new ImageIcon("src/masimagenes/caja.png");
Image caja = caja1.getImage();
boolean bexplosion=false;
JLabel labelexplosion = new JLabel();
ImageIcon explosion1= new ImageIcon("src/masimagenes/explosion.png");
Image explosion = explosion1.getImage();
ImageIcon explosionimagens = new ImageIcon("src/masimagenes/explosion.png");
public JuegoLaberinto5 juegoLaberinto;  
    public Caja(JuegoLaberinto5 juegoLaberinto) {
    this.juegoLaberinto=juegoLaberinto;
    }
     public void paint(Graphics2D g ){
  g.drawImage(caja,x, y,WITH,HEIGHT, labelcaja);   
  if(bexplosion==true){
     g.drawImage(explosion,x, y,WITH,HEIGHT, labelexplosion);     
  }
 }
 public Rectangle getBounds(){
  return new Rectangle(x,y,WITH,HEIGHT);
 }
 void Explotarcaja(){
 if(ColisionCaja()){  
 bexplosion=true;
 try{
     cajarota=true;
     System.out.print("\nrompiste la caja");
     roto=1;
   Thread.sleep(1000);
     x=1000; y=1000;
 }catch(Exception e ){}
 }else if(ColisionEspada()){
     bexplosion=true;
 try{
     cajarota=true;
     System.out.print("\nrompiste la caja con la espada");
   Thread.sleep(1000);
     x=1000; y=1000;
 }catch(Exception e ){}    
 }
 }
  public boolean ColisionCaja(){
 return juegoLaberinto.personaje.getBounds().intersects(getBounds());
 }
  public boolean  ColisionEspada(){
      
    return juegoLaberinto.espada.getBounds().intersects(getBounds());
  }
}
