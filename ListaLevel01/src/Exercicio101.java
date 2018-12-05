import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*; 
import static java.lang.Float.*;
public class Exercicio101 {
   public static void main (String[] args) {
   //variaveis númericas
   int x = 10;
   float xx = 10.0f;
   double xxx = 10.0;
   //variavel lógica 
   boolean y = true;
   
   //variavel de texto
   
   char z = 'z';
   String zz = "bonossauro";
   //como exibir dados
   
      // showMessageDialog(null, z);
  //como ler valores para variáveis 
  // showInputDialog("Digite qualquer coisa");
  // showMessageDialog(null, zz);
   //como converter números
   String texto = "10";
   int num1 = parseInt(texto);
   float num2 = parseFloat(texto);
   //resolvendo o exercicio
   int codpeca, valorpeca, quantidadepeca, total;
      codpeca = parseInt(showInputDialog("Digite o código da peça"));
      valorpeca = parseInt(showInputDialog("Digite o valor da peça"));
      quantidadepeca = parseInt(showInputDialog("Digite a quanditade de peças"));
      total = quantidadepeca*valorpeca;
       showMessageDialog(null,"Código da peça: " + codpeca + "\nPreço final: " + total);
       
       
   
        
    }//Main
    
}//class
