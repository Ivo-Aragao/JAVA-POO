
package polimorfismoanimal;


public class Reptil extends Animal{
    private String escamas;
    
    public String getEscamas() {
        return escamas;
    }

    public void setEscamas(String escamas) {
        this.escamas = escamas;
    }
     @Override 
  public void locomover(){
      System.out.println("Rastejando!"); 
  }
  @Override 
  public void alimentar(){
      System.out.println("folhas!"); 
}
@Override 
  public void emitirSom(){
      System.out.println("Som de reptil!"); 
}

    
}
