/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author USUARIO
 */
public class Caneta {

   public String caneta;
   public String cor;
   private float  ponta;
   protected int carga;
   private boolean tampada;
    
        public void status(){
        System.out.println("caneta " + this.cor);
        System.out.println("marca " + this.caneta);
        System.out.println("ponta " + this.ponta);
        System.out.println("carga em " + this.carga);
        System.out.println("tampada? " + this.tampada);
    }
     public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERROR! CANETA TAMPADA");
            
        }else{
        System.out.println("a caneta esta rabiscando!");
    }
    }
   public void tampar() {
     this.tampada = true;
}
   public void destampar(){
        this.tampada = false;
    }
     
    }
    

