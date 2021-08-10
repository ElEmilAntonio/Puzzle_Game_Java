
package juegolaberinto;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JOptionPane;
import javax.swing.JButton;
public class Nivel1 {
public JuegoLaberinto juegoLaberinto;
Personaje personaje = new Personaje(juegoLaberinto,380,520);
    Piedra piedra = new Piedra(juegoLaberinto,300,80);
    Piedra piedra2 = new Piedra(juegoLaberinto,340,80);
    Piedra piedra3 = new Piedra(juegoLaberinto,420,80);
    Piedra piedra4 = new Piedra(juegoLaberinto,460,80);
    Piedra piedra5 = new Piedra(juegoLaberinto,340,120);
    Piedra piedra6 = new Piedra(juegoLaberinto,380,120);
    Piedra piedra7 = new Piedra(juegoLaberinto,420,120);
    Piedra piedra8 = new Piedra(juegoLaberinto,300,160);
    Piedra piedra9 = new Piedra(juegoLaberinto,460,160);
    Piedra piedra10 = new Piedra(juegoLaberinto,340,200);
    Piedra piedra11 = new Piedra(juegoLaberinto,380,200);
    Piedra piedra12= new Piedra(juegoLaberinto,420,200);
    Cuadro cuadro= new Cuadro(juegoLaberinto);
    Cuadro2 cuadro2= new Cuadro2(juegoLaberinto);
//    Boton boton= new Boton(this);
    Puerta puerta = new Puerta(juegoLaberinto,380,40);
    Items item = new Items(juegoLaberinto);
    Caja caja= new Caja(juegoLaberinto);
    Espada espada = new Espada(juegoLaberinto);
    Pared pared = new Pared(juegoLaberinto, 0, 0, 300, 600);
    Pared pared2 = new Pared(juegoLaberinto, 500, 0, 300, 600);
    Pared pared3 = new Pared(juegoLaberinto, 300, 0, 200,40);     

public Nivel1(JuegoLaberinto juegoLaberinto){
this.juegoLaberinto=juegoLaberinto;
}
  public void ColisionesDelJuegoNivel1() {
        piedra.moverpiedra();
        piedra2.moverpiedra();
        piedra3.moverpiedra();
        piedra4.moverpiedra();
        piedra5.moverpiedra();
        piedra6.moverpiedra();
        piedra7.moverpiedra();
        piedra8.moverpiedra();
        piedra9.moverpiedra();
        piedra10.moverpiedra();
        piedra11.moverpiedra();
        piedra12.moverpiedra();
//     boton.ActivarBoton();
        puerta.ActivarPuerta();
        item.ObtenerItem();
        pared.Pisastelava();
        pared2.Pisastelava();
        pared3.Pisastelava();
   // caja.Explotarcaja();
    }
    
}
