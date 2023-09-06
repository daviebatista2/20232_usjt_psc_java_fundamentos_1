import javax.swing.JOptionPane;

public class TesteEntrada1  {
    public static void main (String [] args)    {
        int numeroInteiro;
        double numeroDouble;
        boolean valorBoolean;
        String strTemp;

        // Leitura do inteiro
        strTemp = JOptionPane.showInputDialog("Digite um inteiro");
        numeroInteiro = Integer.parseInt(strTemp);
        
        // Leitura do Double
        strTemp = JOptionPane.showInputDialog("Digite um double");
        numeroDouble = Double.parseDouble(strTemp);

        // Leitura do boolean
        strTemp = JOptionPane.showInputDialog("Digite um boolean");
        valorBoolean = Boolean.parseBoolean(strTemp);
        JOptionPane.showMessageDialog(null, "double: " + numeroDouble + "\ninteiro: " + numeroInteiro + "\nbooleano: " + valorBoolean);

    }
}