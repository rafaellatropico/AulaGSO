import static javax.swing.JOptionPane.showInputDialog; 
import static javax.swing.JOptionPane.showMessageDialog; 
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;
 import java.util.*;
public class Array {
    public static void main(String[] args) {
        int qtdNumeros = 5;
        float[] a = new float [qtdNumeros];
        float soma = 0; 
        for (int cont = 0; cont < a.length; cont++) {
            a[cont] = receberFloat (
                    "Digite o " + (cont + 1) + "º número"
            );
          soma = a[cont] = cont % 2 != 0 ?
                    soma + a [cont] 
                    :
                    soma;
            
                   
    }
        exibir("soma: " + soma);
        
    }
       public static int receberFloat(String mensagemProUsuario) {
        String aux = showInputDialog(mensagemProUsuario);
        try {
            return parseInt(aux);
        } catch (Exception e) {
            exibir("Voceª digitou algo errado :(");
            return 0;
        }
    }

    public static void exibir(String mensagemProUsuario) {
        showMessageDialog(null, mensagemProUsuario);
    }
    }
    
