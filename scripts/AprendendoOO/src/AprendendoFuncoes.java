import static javax.swing.JOptionPane.showMessageDialog; //exibir mensagens
import static javax.swing.JOptionPane.showInputDialog; //receber dados do usuário
import static java.lang.Integer.parseInt; // converter string -> int
import static java.lang.Float.parseFloat; // string -> float
public class AprendendoFuncoes {
    public static void main(String[] args) {
    
        int n1 = parseInt(showInputDialog("Digite o primeiro número"));
        int n2 = parseInt(showInputDialog("Digite o segundo número"));
        int resultado = calculaSoma(n1, n2);     
        showMessageDialog(null, resultado);
        
     
    }//Main
//somar 2 números [int]: [int]
    public static int calculaSoma(int num1, int num2) {
        int soma = num1 + num2;
        return soma;
    }

}//class
