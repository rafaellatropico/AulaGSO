import static javax.swing.JOptionPane.showInputDialog; 
import static javax.swing.JOptionPane.showMessageDialog; 
import static java.lang.Integer.parseInt; 
import static java.lang.String.valueOf;
import java.util.Random;
public class array {
    public static void main(String[] args) {
           
       int qtdApostador = 4;
       String [] nomes = new String [qtdApostador];
      String [] animais = {"01 - Ara Azul", "02 – Veado Galheiro", "03 – Bisão", 
      "04 – Ornitorrinco", "05 – Panda Albino", "06 – Basilisco", 
      "07 – Tubarão Martelo", "08 – Peixe Palhaço", "09 – Raia Jamanta", " 10 – Baleia Azul",
      "00- Jacaré-Coroa", "11 - Pica-Pau-Anão-Dourado"};
       
           for (int contador = 0; contador < qtdApostador; contador++)
               nomes[contador] = showInputDialog(
               "CONTROLE DE APOSTADORES\n" +
                       "DIGITE O NOME DO" + (contador+1) + "º APOSTADOR"
               
               );
       
        String random = (animais[new Random().nextInt(animais.length)]);
        
        
        showInputDialog("Nome: " + nomes 
                       + "Animal" + random                   
        ); 
        
        
        }
    }

