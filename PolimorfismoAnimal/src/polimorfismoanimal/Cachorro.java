
package polimorfismoanimal;

public class Cachorro extends Mamifero{
     
    private Boolean fazercarinho; 

    public Boolean getFazercarinho() {
        return fazercarinho;
    }

    public void setFazercarinho(Boolean fazercarinho) {
        this.fazercarinho = fazercarinho;
    }
    
    public void reagir(){
      if(this.getFazercarinho()){
       System.out.println("abanou o rabo!");  
      }
    }
     @Override 
  public void locomover(){
      System.out.println("Correndo!"); 
  }
  
@Override 
  public void emitirSom(){
      System.out.println("au!, au!, au!"); 
}

}
