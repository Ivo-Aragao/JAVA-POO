
package polimorfismoanimal;

public class Peixe extends Animal{
    private String corEscama;
    
    public void soltarBolhas(){
        System.out.println("soltou uma bolha!");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
     @Override 
  public void locomover(){
      System.out.println("nadando!"); 
  }
  @Override 
  public void alimentar(){
      System.out.println("substancias!"); 
}
@Override 
  public void emitirSom(){
      System.out.println("peixe nao faz som!"); 
}

}
