import java.util.Scanner;
import javax.swing.JOptionPane;


public class TesteEntrada2 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in); /* System.in refere-se ao teclado */
        System.out.print("digite um número: ");
        int numeroInteiro = scanner.nextInt();
        System.out.print("digite um double: ");
        double numeroDouble = scanner.nextDouble();
        System.out.print("digite true ou false: ");
        boolean valorBooleano = scanner.nextBoolean();

        System.out.print("\ninteiro: " + numeroInteiro + "\ndouble " + numeroDouble + "\nvalor booleano: " + valorBooleano);
        JOptionPane.showMessageDialog(null, "double: " + numeroDouble + "\ninteiro: " + numeroInteiro + "\nbooleano: " + valorBooleano);

        scanner.close();
    }
}
