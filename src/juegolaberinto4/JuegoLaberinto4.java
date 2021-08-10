package juegolaberinto4;

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

public class JuegoLaberinto4 extends JPanel {

    JLabel labelpiso = new JLabel();
    ImageIcon piso1 = new ImageIcon("src/masimagenes/piso.jpg");
    Image piso = piso1.getImage();

    int numeronivel = 1;
    Boton boton = new Boton(this);
    Personaje personaje = new Personaje(this, 40, 520);
    Piedra piedra = new Piedra(this, 320, 360);
    Piedra piedra2 = new Piedra(this, 240, 360);
    Piedra piedra3 = new Piedra(this, 280, 400);
    Piedra piedra4 = new Piedra(this, 200, 440);
    Piedra piedra5 = new Piedra(this, 200, 320);
    Piedra piedra6 = new Piedra(this, 160, 280);
    Piedra piedra7 = new Piedra(this, 240, 280);
    Piedra piedra8 = new Piedra(this, 280, 320);
    Piedra piedra9 = new Piedra(this, 320, 280);
    Piedra piedra10 = new Piedra(this,280 ,280);
    Cuadro cuadro = new Cuadro(this);
    Cuadro2 cuadro2 = new Cuadro2(this);
    Puerta puerta = new Puerta(this, 400, 40);
    Items item = new Items(this,280,360);
     Items item2 = new Items(this,320,400);
      Items item3 = new Items(this,280,200);
       Items item4 = new Items(this,200,360);
    Caja caja = new Caja(this);
    Espada espada = new Espada(this);
    Pared pared = new Pared(this, 0, 0, 40, 600);
    Pared pared2 = new Pared(this, 40, 560, 800, 120);
    Pared pared3 = new Pared(this, 240, 480, 400, 120);
    Pared pared4 = new Pared(this, 480, 0, 400, 600);
    Pared pared5 = new Pared(this, 360, 320, 120, 80);
    Pared pared6 = new Pared(this, 40, 0, 120, 360);
    Pared pared7 = new Pared(this, 160, 0, 120, 240);
    Pared pared8 = new Pared(this, 280, 0, 80, 120);
    Pared pared9 = new Pared(this, 320, 120, 80, 160);

    public void ColisionesDelJuegoNivel4() {
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
        caja.Explotarcaja();
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
        boton.ActivarBoton();
        cuadro.ColisionTotal();
        cuadro2.ColisionTotal();
    }

    public JuegoLaberinto4() {
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
        g.drawImage(piso, 0, 0, 800, 600, labelpiso);
        item.paint(g2d);
        item2.paint(g2d);
        item3.paint(g2d);
        item4.paint(g2d);
        boton.paint(g2d);
        personaje.paint(g2d);
        puerta.paint(g2d);
        piedra.paint(g2d);
        piedra2.paint(g2d);
        piedra3.paint(g2d);
        piedra4.paint(g2d);
        piedra5.paint(g2d);
        piedra6.paint(g2d);
        piedra7.paint(g2d);
        piedra8.paint(g2d);
        piedra9.paint(g2d);
       
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
        piedra10.paint(g2d);
    

    }

    public  void main() {
        JFrame pantalla = new JFrame("laberinto");
        JuegoLaberinto4 juegoLaberinto = new JuegoLaberinto4();
        pantalla.setBounds(200, 200, 800, 600);
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
            juegoLaberinto.ColisionesDelJuegoNivel4();
              if(juegoLaberinto.personaje.reiniciar==true){
                 Musica4.Mnivel4.stop();
                   pantalla.setVisible(false);
                juegoLaberinto=null;
                break;
           }
            if (juegoLaberinto.puerta.ColisionPuerta()) {
                Musica4.Mnivel4.stop();
                JOptionPane.showMessageDialog(null, "acabaste el nivel 4", "final", JOptionPane.YES_NO_OPTION);
              pantalla.setVisible(false);
                juegoLaberinto=null;
                 break;
                
            }

        }
    }
}
