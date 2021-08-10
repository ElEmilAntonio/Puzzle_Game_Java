package Menu;


import javax.swing.JOptionPane;
import juegolaberinto.JuegoLaberinto;
import juegolaberinto2.JuegoLaberinto2;
import juegolaberinto3.JuegoLaberinto3;
import juegolaberinto4.JuegoLaberinto4;
import juegolaberinto5.JuegoLaberinto5;

public class MenuJuego {

    public static void main(String[] args) throws NullPointerException {
        int seleccion = 6;
        while (seleccion != 10) {

            seleccion = JOptionPane.showOptionDialog(null, "seleccione nivel", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"nivel 1", "nivel 2", "nivel 3", "nivel 4", "nivel 5", "cerrar"}, "nivel 1");
            switch (seleccion) {
                case 0:
                    JuegoLaberinto nivel1 = new JuegoLaberinto();
                    nivel1.main();
                    break;

                case 1:
                    JuegoLaberinto2 nivel2 = new JuegoLaberinto2();
                    nivel2.main();
                    break;
                case 2:
                    JuegoLaberinto3 nivel3 = new JuegoLaberinto3();
                    nivel3.main();
                    break;

                case 3:
                    JuegoLaberinto4 nivel4 = new JuegoLaberinto4();
                    nivel4.main();
                    break;
                case 4:
                    JuegoLaberinto5 nivel5 = new JuegoLaberinto5();
                    nivel5.main();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
