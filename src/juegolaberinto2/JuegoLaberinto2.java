            package juegolaberinto2;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
public class JuegoLaberinto2 extends JPanel {
    JLabel labelpiso = new JLabel();
ImageIcon piso1= new ImageIcon("src/masimagenes/piso.jpg");
Image piso = piso1.getImage();

    Personaje personaje = new Personaje(this,560,520);
    Piedra piedra = new Piedra(this,520,320);
    Piedra piedra2 = new Piedra(this,240,320);
   Cuadro cuadro= new Cuadro(this);
    Cuadro2 cuadro2= new Cuadro2(this);
    Puerta puerta = new Puerta(this,380,40);
    Items item = new Items(this,360,320);
    Items item2 = new Items(this,240,360);
    Items item3 = new Items(this,520,360);
    Items item4 = new Items(this,560,320);
    Caja caja= new Caja(this);
    Espada espada = new Espada(this);
    Pared pared = new Pared(this, 0, 0, 200, 600);
    Pared pared2 = new Pared(this, 600, 0, 200, 600);
    Pared pared3 = new Pared(this,200,0,400,40);
    Pared pared4 = new Pared(this,280,360,240,160);
    Pared pared5 = new Pared(this,320,200,200,120);
    Pared pared6 = new Pared(this,200,200,120,80);
    Pared pared7 = new Pared(this,520,40,120,120);
    Pared pared8 = new Pared(this,560,120,40,200);
    Pared pared9 = new Pared(this,560,360,40,40);
    public void ColisionesDelJuegoNivel2() {
        puerta.ActivarPuerta();
        item.ObtenerItem();
        item2.ObtenerItem();
        item3.ObtenerItem();
        item4.ObtenerItem();
        pared.Pisastelava();
        pared2.Pisastelava();
          pared3.Pisastelava();
        pared4.Pisastelava();
          pared5.Pisastelava();
        pared6.Pisastelava();
          pared7.Pisastelava();
        pared8.Pisastelava();
        pared9.Pisastelava();
        cuadro.ColisionTotal();
        cuadro2.ColisionTotal();
        caja.Explotarcaja();
        piedra.moverpiedra();
        piedra2.moverpiedra();
    }
   
    public JuegoLaberinto2() {
        addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent evento) {
            }

            @Override
            public void keyPressed(KeyEvent evento) {
                personaje.keyPressed(evento);
                repaint();
            }

            @Override
            public void keyReleased(KeyEvent evento) {
                personaje.keyReleased(evento);
            }
        });
        setFocusable(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
          g.drawImage(piso,0,0,800,600,labelpiso);
             personaje.paint(g2d);
     
         item2.paint(g2d);
          item3.paint(g2d);
           item4.paint(g2d);
       puerta.paint(g2d);
        piedra.paint(g2d);
        piedra2.paint(g2d);
        item.paint(g2d);
        caja.paint(g2d);
        espada.paint(g2d);
        pared.paint(g2d);
        pared2.paint(g2d);
        pared3.paint(g2d);
        pared4.paint(g2d);
        pared5.paint(g2d);
        pared6.paint(g2d);
        pared7.paint(g2d);
        pared8.paint(g2d);
        pared9.paint(g2d);
    }
  
    public  void main() throws NullPointerException{
        
        JFrame pantalla = new JFrame("laberinto");
        JuegoLaberinto2 juegoLaberinto = new JuegoLaberinto2();
        pantalla.setBounds(200, 0, 800, 600);
        JOptionPane.showMessageDialog(null, "objetivo del juego:" + "\nllegar a la salida"
                + "\n recolectar todos los kemono"
                + "\n ARRIBA : W"
                + "\n Abajo : S" + "\n Derecha :D" + "\n Izquierda : A" + "\n reiniciar nivel: R"
                + "\n silenciar:T   " + "\nponer musica : y");
        pantalla.add(juegoLaberinto);
        pantalla.setResizable(false);
        pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pantalla.setVisible(true);
        while (true) {
            juegoLaberinto.repaint();
              juegoLaberinto.ColisionesDelJuegoNivel2();
               if(juegoLaberinto.personaje.reiniciar==true){
                 Musica2.Mnivel2.stop();
                   pantalla.setVisible(false);
                juegoLaberinto=null;
                break;
           }
              if (juegoLaberinto.puerta.ColisionPuerta()) {
                Musica2.Mnivel2.stop();
                JOptionPane.showMessageDialog(null, "acabaste el nivel 2", "final", JOptionPane.YES_NO_OPTION);
                   pantalla.setVisible(false);
                juegoLaberinto=null;
              break;
           
            }
             
          }
        }
    
    }



