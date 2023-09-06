import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero:"));
            if (num % 2 == 0) JOptionPane.showMessageDialog(null, "El numero " + num + " es par");
            else JOptionPane.showMessageDialog(null, "El numero " + num + " es impar");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(
                    null,
                    "El valor introducido no es numerico, el programa se cerrara"
            );
        }
    }
}