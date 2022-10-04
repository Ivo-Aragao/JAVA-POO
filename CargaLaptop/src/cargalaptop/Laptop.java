/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargalaptop;


public class Laptop {
     public Laptop() {
        this.ligado = false;
        this.carga = carga;
        this.Status = Status;
    }
    private boolean ligado;
    private int carga;
    private String Status;
    private String ligar;
    private String desligar;
    private String aumentarcarga;
    private String diminuircarga;

  

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

    public int getCarga() {
        return carga;
    }

    public void setCarga(int c) {
        this.carga = c;
    }

    
        public void carregando(){  
            if(this.getCarga() <= 100){
            }        
            else if (this.ligado = true){
            
        }else this.carga =+ 10;
            System.out.println("+10");
             
          } 
           public void naocarregando(){  
            if(this.getCarga() == 100 || this.getCarga() > 0){
            }
                else if (this.ligado = true){
            
          }else this.carga =- 10;
            System.out.println("-10");
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



