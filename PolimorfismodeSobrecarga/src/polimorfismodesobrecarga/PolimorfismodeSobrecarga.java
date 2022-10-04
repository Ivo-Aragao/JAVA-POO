
package polimorfismodesobrecarga;

public class PolimorfismodeSobrecarga {

    public static void main(String[] args) {
       
        Cachorro c = new Cachorro();
        c.reagir("toma comida");
        c.reagir(false);
        c.reagir(10, 25);
    }
    
}
