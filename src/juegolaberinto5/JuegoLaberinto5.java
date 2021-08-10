package juegolaberinto5;

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

public class JuegoLaberinto5 extends JPanel {

    JLabel labelpiso = new JLabel();
    ImageIcon piso1 = new ImageIcon("src/masimagenes/piso.jpg");
    Image piso = piso1.getImage();
    Boton boton = new Boton(this);
    Personaje personaje = new Personaje(this, 80, 80);
    Cuadro cuadro = new Cuadro(this);
    Cuadro2 cuadro2 = new Cuadro2(this);
    Puerta puerta = new Puerta(this, 720,160);
    Items item = new Items(this,680,240);
      Items item2 = new Items(this,720,80);
       Items item3 = new Items(this,120,80);
        Items item4 = new Items(this,200,120);
          Items item5 = new Items(this,280,160);
           Items item6 = new Items(this,480,80);
       Items item7 = new Items(this,360,120);
       Piedra piedra = new Piedra(this, 280, 120);
       Piedra piedra2 = new Piedra(this, 400,120);
       Piedra piedra3 = new Piedra(this, 560, 120);
       Piedra piedra4 = new Piedra(this, 320, 240);
       Piedra piedra5 = new Piedra(this, 440, 240);
       Piedra piedra6 = new Piedra(this, 560, 240);
        
   Caja caja = new Caja(this);
    Espada espada = new Espada(this);
    Pared pared = new Pared(this, 0, 0, 800, 80);
    Pared pared2 = new Pared(this, 0, 280, 800, 200);
    Pared pared3 = new Pared(this, 680,200, 80, 40);
    Pared pared4 = new Pared(this, 760, 80, 120, 280);
    Pared pared5 = new Pared(this, 160, 40,80, 80);
    Pared pared6 = new Pared(this, 160, 160,80, 80);
    Pared pared7 = new Pared(this, 280, 40, 80, 80);
    Pared pared8 = new Pared(this, 280, 160, 80, 80);
   Pared pared9 = new Pared(this, 400, 40, 80, 80);
    Pared pared10 = new Pared(this, 400, 160, 80, 80);
     Pared pared11 = new Pared(this, 520, 40, 80, 80);
    Pared pared12 = new Pared(this, 520, 160, 80, 80);
     Pared pared13 = new Pared(this, 640, 40, 80, 80);
    Pared pared14 = new Pared(this, 640, 160, 80, 80);

    public void ColisionesDelJuegoNivel5() {

        puerta.ActivarPuerta();
        item.ObtenerItem();
          item2.ObtenerItem();
            item3.ObtenerItem();
              item4.ObtenerItem();
                item5.ObtenerItem();
                item6.ObtenerItem();
                item7.ObtenerItem();
          piedra.moverpiedra();
            piedra2.moverpiedra();
              piedra3.moverpiedra();
               piedra4.moverpiedra();
            piedra5.moverpiedra();
              piedra6.moverpiedra();
        cuadro.ColisionTotal();
        cuadro2.ColisionTotal();
        piedra.moverpiedra();
        boton.ActivarBoton();
        pared.Pisastelava();
        pared2.Pisastelava();
        pared3.Pisastelava();
        pared4.Pisastelava();
        pared5.Pisastelava();
        pared6.Pisastelava();
        pared7.Pisastelava();
        pared8.Pisastelava();
        pared9.Pisastelava();
        pared10.Pisastelava();
          pared11.Pisastelava();
        pared12.Pisastelava();
        pared13.Pisastelava();
        pared14.Pisastelava();
       
    }

   

    public JuegoLaberinto5() {
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
        g.drawImage(piso, 200, 0, 800, 480, labelpiso);

        boton.paint(g2d);
        personaje.paint(g2d);
        puerta.paint(g2d);
        piedra.paint(g2d);
        item.paint(g2d);
         item2.paint(g2d);
          item3.paint(g2d);
           item4.paint(g2d);
            item5.paint(g2d);
             item6.paint(g2d);
            item7.paint(g2d);
            piedra.paint(g2d);
             piedra2.paint(g2d);
              piedra3.paint(g2d);
                 piedra4.paint(g2d);
             piedra5.paint(g2d);
              piedra6.paint(g2d);
        puerta.paint(g2d);
        pared.paint(g2d);
        pared2.paint(g2d);
         pared3.paint(g2d);
        pared4.paint(g2d);
        pared5.paint(g2d);
         pared6.paint(g2d);
       pared7.paint(g2d);
       pared8.paint(g2d);
    pared9.paint(g2d);
      pared10.paint(g2d);
      pared11.paint(g2d);
      pared12.paint(g2d);
      pared13.paint(g2d);
      pared14.paint(g2d);

    }

    public  void main() {
        JFrame pantalla = new JFrame("laberinto");
        JuegoLaberinto5 juegoLaberinto = new JuegoLaberinto5();
        pantalla.setBounds(200, 200, 800, 400);
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
            juegoLaberinto.ColisionesDelJuegoNivel5();
              if(juegoLaberinto.personaje.reiniciar==true){
                 Musica5.Mnivel5.stop();
                   pantalla.setVisible(false);
                juegoLaberinto=null;
                break;
           }
            if (juegoLaberinto.puerta.ColisionPuerta()) {
                Musica5.Mnivel5.stop();
                JOptionPane.showMessageDialog(null, "acabaste el nivel 5", "final", JOptionPane.YES_NO_OPTION);
              pantalla.setVisible(false);
                juegoLaberinto=null;
                 break;
                
            }

        }
    }
}
