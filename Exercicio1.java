import javax.swing.JOptionPane;
import java.util.Scanner;

public class Exercicio1 {
    public static void main (String [] args) {
        double celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em ºC:"));

        // Método showMessage do JOptionPane mostra a interface gráfica com o conteúdo desejado.
        JOptionPane.showMessageDialog(null, "Temperatura em ºF:\n" + ((celsius * 9 / 5) + 32));
    }
}
