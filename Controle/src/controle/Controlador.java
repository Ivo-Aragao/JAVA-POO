
package controle;

public class Controlador {


    public Controlador(boolean ligado, int volume, boolean mute, String Status) {
        this.ligado = false;
        this.volume = volume;
        this.mute = mute;
        this.Status = Status;
    }
    private boolean ligado;
    private int volume;
    private boolean mute;
    private String Status;
    private String ligar;
private String desligar;
    private String aumentar;
    private String diminuir;

  

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean l) {
        this.ligado = l;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int v) {
        this.volume = v;
    }

    public boolean isMute() {
        return mute;
    }

    public void setMute(boolean m) {
        this.mute = m;
        
    }
    
    public void muteligado(){
        if (this.volume == 0){
            
        }else this.mute = false;
         System.out.println("o volume ja esta no minimo");
        if (this.volume > 0){ 
          this.mute = true;
            System.out.println("mudo");
                
        }
    }
        public void aumentar(){  
            if(this.getVolume() <= 100){
            }        
            else if (this.ligado = true){
            
        }else this.volume =+ 5;
            System.out.println("+5");
             
          } 
           public void diminuir(){  
            if(this.getVolume() == 100 || this.getVolume() > 0){
            }
                else if (this.ligado = true){
            
          }else this.volume =- 5;
            System.out.println("-5");
           }
           
           public void ligar(){
               if(this.ligado = false){
           }else this.ligado = true;
                   System.out.println("ligada");
}
           public void desligar(){
               if(this.ligado = true){
           }else this.ligado = false;
               System.out.println("desligando");
                   
}         
           public void status(){
               System.out.println("desligando" + this.desligar);
               System.out.println("ligada" + this.ligar);
        
           }
}     

