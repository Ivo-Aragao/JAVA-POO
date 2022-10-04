
package aula02;

public class Aula02 {
    
     public static void main(String[] args) {
         
         Caneta c1 = new Caneta();
         c1.status();
          c1.caneta = "BIC CONFORT ";
         c1.cor = "preta";
         //c1.ponta = (float) 0.5;
         c1.carga = 90;
         c1.destampar();
          c1.rabiscar();
     }
    
     
}
