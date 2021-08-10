package juegolaberinto2;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Rectangle;

import java.awt.Graphics2D;

public class Personaje implements KeyListener {
    boolean reiniciar=false;
     boolean silenciar = true;
    int x = 0;
    int y = 0;
    int inicialx = 0, inicialy = 0;
    static final int WITH = 40, HEIGHT = 40;
    int movimiento = 1;
    int imagenes = 0;
    JLabel cuadroeirika = new JLabel();
    public JuegoLaberinto2 juegoLaberinto;

    public Personaje(JuegoLaberinto2 juegoLaberinto, int px, int py) {
        inicialx = px;
        inicialy = py;
        x = px;
        y = py;
        this.juegoLaberinto = juegoLaberinto;
       Musica2.Mnivel2.play();
    }

    public void paint(Graphics2D g) {
        g.drawImage(movimientoseirika[imagenes], x, y, WITH, HEIGHT, cuadroeirika);
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, WITH, HEIGHT);
    }

    @Override
    public void keyTyped(KeyEvent evento) {
    }

    @Override
    public void keyPressed(KeyEvent evento) {
        if (KeyEvent.VK_W == evento.getKeyCode()) {
            imagenes = 3;
            juegoLaberinto.cuadro.x = x;
            juegoLaberinto.cuadro.y = y - 40;
            juegoLaberinto.cuadro2.x = x;
            juegoLaberinto.cuadro2.y = y - 80;
        }
        if (KeyEvent.VK_S == evento.getKeyCode()) {
            imagenes = 0;
            juegoLaberinto.cuadro.x = x;
            juegoLaberinto.cuadro.y = y + 40;
            juegoLaberinto.cuadro2.x = x;
            juegoLaberinto.cuadro2.y = y + 80;
        }
        if (KeyEvent.VK_A == evento.getKeyCode()) {
            imagenes = 6;
            juegoLaberinto.cuadro.x = x - 40;
            juegoLaberinto.cuadro.y = y;
            juegoLaberinto.cuadro2.x = x - 80;
            juegoLaberinto.cuadro2.y = y;
        }
        if (KeyEvent.VK_D == evento.getKeyCode()) {
            imagenes = 9;
            juegoLaberinto.cuadro.x = x + 40;
            juegoLaberinto.cuadro.y = y;
            juegoLaberinto.cuadro2.x = x + 80;
            juegoLaberinto.cuadro2.y = y;
        }
    }

    @Override
    public void keyReleased(KeyEvent evento) {
        if (KeyEvent.VK_W == evento.getKeyCode()) {
            if (!juegoLaberinto.cuadro2.ColisionTotal() || !juegoLaberinto.cuadro.ColisionTotal()) {
                if (y > 0) {

                    new MoverArriba();

                }
            }
        }
        if (KeyEvent.VK_S == evento.getKeyCode()) {
            if (!juegoLaberinto.cuadro.ColisionTotal() || !juegoLaberinto.cuadro2.ColisionTotal()) {
                if (y < 520) {
                    new MoverAbajo();
                }
            }
        }
        if (KeyEvent.VK_A == evento.getKeyCode()) {
            if (!juegoLaberinto.cuadro.ColisionTotal() || !juegoLaberinto.cuadro2.ColisionTotal()) {
                new Moverizquierda();
            }
        }
        if (KeyEvent.VK_D == evento.getKeyCode()) {
            if (!juegoLaberinto.cuadro.ColisionTotal() || !juegoLaberinto.cuadro2.ColisionTotal()) {
                new MoverDerecha();
            }
        }
        if (KeyEvent.VK_T == evento.getKeyCode()) {
            Musica2.Mnivel2.stop();
        }
        if (KeyEvent.VK_Y == evento.getKeyCode()) {
            Musica2.Mnivel2.play();
        }
        
              if(KeyEvent.VK_R==evento.getKeyCode()){
             reiniciar=true;
          }
    }

    /// HILOS DE ANIMACION
    public class MoverAbajo extends Thread {

        public MoverAbajo() {
            start();
        }

        public void run() {

            try {
                do {
                    if (movimiento == 1) {
                        imagenes = 0;
                        y += 14;
                        Thread.sleep(100);
                        movimiento++;
                    }
                    if (movimiento == 2) {
                        imagenes = 1;
                        y += 13;
                        Thread.sleep(100);
                        movimiento++;
                    }
                    if (movimiento == 3) {
                        imagenes = 2;
                        y += 13;
                        Thread.sleep(100);
                        movimiento = 4;
                        imagenes = 0;
                        Thread.sleep(100);
                    }
                } while (movimiento == 3);
                movimiento = 1;
            } catch (Exception e) {
            }

        }
    }

    public class MoverArriba extends Thread {

        public MoverArriba() {
            start();
        }

        public void run() {

            try {
                do {
                    if (movimiento == 1) {
                        imagenes = 3;
                        y -= 14;
                        Thread.sleep(100);
                        movimiento++;
                    }
                    if (movimiento == 2) {
                        imagenes = 4;
                        y -= 13;
                        Thread.sleep(100);
                        movimiento++;
                    }
                    if (movimiento == 3) {
                        imagenes = 5;
                        y -= 13;
                        Thread.sleep(100);
                        movimiento = 4;
                        imagenes = 3;
                        Thread.sleep(100);
                    }
                } while (movimiento == 3);
                movimiento = 1;
            } catch (Exception e) {
            }

        }
    }

    public class Moverizquierda extends Thread {

        public Moverizquierda() {
            start();
        }

        public void run() {
            try {
                do {
                    if (movimiento == 1) {
                        imagenes = 6;
                        x -= 14;
                        Thread.sleep(100);
                        movimiento++;
                    }
                    if (movimiento == 2) {
                        imagenes = 7;
                        x -= 13;
                        Thread.sleep(100);
                        movimiento++;
                    }
                    if (movimiento == 3) {
                        imagenes = 8;
                        x -= 13;
                        Thread.sleep(100);
                        imagenes = 6;
                        movimiento = 4;
                        Thread.sleep(100);
                    }
                } while (movimiento == 3);
                movimiento = 1;
            } catch (Exception e) {
            }
        }
    }

    public class MoverDerecha extends Thread {

        public MoverDerecha() {
            start();
        }

        public void run() {
            try {
                do {
                    if (movimiento == 1) {
                        imagenes = 9;
                        x += 14;
                        Thread.sleep(100);
                        movimiento++;
                    }
                    if (movimiento == 2) {
                        imagenes = 10;
                        x += 13;
                        Thread.sleep(100);
                        movimiento++;
                    }
                    if (movimiento == 3) {
                        imagenes = 11;
                        x += 13;
                        Thread.sleep(100);
//                        movimiento = 1;
                        imagenes = 9;
                        movimiento = 4;
                        Thread.sleep(100);

                    }
                } while (movimiento == 3);
                movimiento = 1;
            } catch (Exception e) {
            }

        }
    }

    /// DECLARACION DE VARIABLES IMAGENES
    ImageIcon imagenfrente1 = new ImageIcon("src/imagenes/efrontal2.png");
    Image frente1 = imagenfrente1.getImage();
    ImageIcon imagenfrente2 = new ImageIcon("src/imagenes/efrontal1.png");
    Image frente2 = imagenfrente2.getImage();
    ImageIcon imagenfrente3 = new ImageIcon("src/imagenes/efrontal3.png");
    Image frente3 = imagenfrente3.getImage();
    /// IMAGENES DE MOVER ARRIBA
    ImageIcon imagenatras1 = new ImageIcon("src/imagenes/eespalda2.png");
    Image atras1 = imagenatras1.getImage();
    ImageIcon imagenatras2 = new ImageIcon("src/imagenes/eespalda1.png");
    Image atras2 = imagenatras2.getImage();
    ImageIcon imagenatras3 = new ImageIcon("src/imagenes/eespalda3.png");
    Image atras3 = imagenatras3.getImage();
    //// IMAGENES DE MOVER IZQUIERDA
    ImageIcon imagenizquierda1 = new ImageIcon("src/imagenes/eizquierda2.png");
    Image izquierda1 = imagenizquierda1.getImage();
    ImageIcon imagenizquierda2 = new ImageIcon("src/imagenes/eizquierda1.png");
    Image izquierda2 = imagenizquierda2.getImage();
    ImageIcon imagenizquierda3 = new ImageIcon("src/imagenes/eizquierda3.png");
    Image izquierda3 = imagenizquierda3.getImage();
    //// IMAGENES DE MOVER DERECHA
    ImageIcon imagenderecha1 = new ImageIcon("src/imagenes/ederecha2.png");
    Image derecha1 = imagenderecha1.getImage();
    ImageIcon imagenderecha2 = new ImageIcon("src/imagenes/ederecha1.png");
    Image derecha2 = imagenderecha2.getImage();
    ImageIcon imagenderecha3 = new ImageIcon("src/imagenes/ederecha3.png");
    Image derecha3 = imagenderecha3.getImage();
    Image[] movimientoseirika = {frente1, frente2, frente3, atras1, atras2, atras3,
        izquierda1, izquierda2, izquierda3, derecha1, derecha2, derecha3};

}
