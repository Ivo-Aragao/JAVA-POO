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

    String caneta;
    String cor;
    float  ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("caneta " + this.cor);
        System.out.println("marca " + this.caneta);
        System.out.println("ponta " + this.ponta);
        System.out.println("carga em " + this.carga);
        System.out.println("tampada? " + this.tampada);
    }
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERROR! CANETA TAMPADA");
            
        }else{
        System.out.println("a caneta esta rabiscando!");
    }
        if(this.carga == 0){
            System.out.println("Error! acabou a tinta");
        }
    }
    void tampar() {
     this.tampada = true;
}
    void destampar(){
        this.tampada = false;
    }
     void semcarga(){
         this.carga = 0;
     }
    }
    

