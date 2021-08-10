package juegolaberinto;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JuegoLaberinto extends JPanel {
boolean reiniciar=false;
    JLabel labelpiso = new JLabel();
    ImageIcon piso1 = new ImageIcon("src/masimagenes/piso.jpg");
    Image piso = piso1.getImage();
    int numeronivel = 1;
    Personaje personaje = new Personaje(this, 380, 520);
    Piedra piedra = new Piedra(this, 300, 80);
    Piedra piedra2 = new Piedra(this, 340, 80);
    Piedra piedra3 = new Piedra(this, 420, 80);
    Piedra piedra4 = new Piedra(this, 460, 80);
    Piedra piedra5 = new Piedra(this, 340, 120);
    Piedra piedra6 = new Piedra(this, 380, 120);
    Piedra piedra7 = new Piedra(this, 420, 120);
    Piedra piedra8 = new Piedra(this, 300, 160);
    Piedra piedra9 = new Piedra(this, 460, 160);
    Piedra piedra10 = new Piedra(this, 340, 200);
    Piedra piedra11 = new Piedra(this, 380, 200);
    Piedra piedra12 = new Piedra(this, 420, 200);
    Cuadro cuadro = new Cuadro(this);
    Cuadro2 cuadro2 = new Cuadro2(this);
    Puerta puerta = new Puerta(this, 380, 40);
    Items item = new Items(this);
    Caja caja = new Caja(this);
    Espada espada = new Espada(this);
    Pared pared = new Pared(this, 0, 0, 300, 600);
    Pared pared2 = new Pared(this, 500, 0, 300, 600);
    Pared pared3 = new Pared(this, 300, 0, 200, 40);

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
        puerta.ActivarPuerta();
        item.ObtenerItem();
        pared.Pisastelava();
        pared2.Pisastelava();
        cuadro.ColisionTotal();
        cuadro2.ColisionTotal();

    }

    public JuegoLaberinto() {
        setFocusable(true);
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
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawImage(piso, 0, 0, 800, 600, labelpiso);
        personaje.paint(g2d);
        puerta.paint(g2d);
        piedra.paint(g2d);
        piedra6.paint(g2d);
        piedra2.paint(g2d);
        piedra7.paint(g2d);
        piedra3.paint(g2d);
        piedra8.paint(g2d);
        piedra4.paint(g2d);
        piedra9.paint(g2d);
        piedra5.paint(g2d);
        piedra10.paint(g2d);
        piedra11.paint(g2d);
        piedra12.paint(g2d);
        item.paint(g2d);
        espada.paint(g2d);
        pared.paint(g2d);
        pared2.paint(g2d);
        pared3.paint(g2d);
        cuadro.paint(g2d);
        cuadro2.paint(g2d);
    }

    public  void main() {
        JFrame pantalla = new JFrame("laberinto");
        JuegoLaberinto juegoLaberinto = new JuegoLaberinto();
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
            juegoLaberinto.ColisionesDelJuegoNivel1();
           if(juegoLaberinto.personaje.reiniciar==true){
                 Musica.Mnivel1.stop();
                   pantalla.setVisible(false);
                juegoLaberinto=null;
                break;
           }
            if (juegoLaberinto.puerta.ColisionPuerta()) {
                Musica.Mnivel1.stop();
                JOptionPane.showMessageDialog(null, "acabaste el nivel 1", "final", JOptionPane.YES_NO_OPTION);
                   pantalla.setVisible(false);
                juegoLaberinto=null;
                break;
            }

        }
    }
}
