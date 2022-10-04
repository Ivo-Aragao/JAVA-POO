
package polimorfismoanimal;


public class PolimorfismoAnimal {


    public static void main(String[] args) {
      Cachorro c1 = new Cachorro();
      
      c1.setCorPelo("amarelo");
        System.out.println(c1.getCorPelo());
      c1.setIdade(8);
      c1.setMembros(4);
      c1.setPeso(20);
      c1.emitirSom();
      c1.setFazercarinho(Boolean.TRUE);
      c1.reagir();
        System.out.println(c1.toString());
    }
    
}
