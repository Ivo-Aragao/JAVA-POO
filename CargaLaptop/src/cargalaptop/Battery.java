/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargalaptop;

public class Battery {
//     private int carga;
//    private boolean ligado;
//    private boolean jogando;
//
//    //construtor
//    public Battery() {
//        this.carga = 50;
//        this.ligado = false;
//        this.jogando = false;
//    }
//
//    public int getCarga() {
//        return carga;
//    }
//
//    public void setCarga(int c) {
//        this.carga = c;
//    }
//
//    public boolean getLigado() {
//        return ligado;
//    }
//
//    public void setLigado(boolean l) {
//        this.ligado = l;
//    }
//
//    public boolean getJogando() {
//        return jogando;
//    }
//
//    public void setJogando(boolean j) {
//        this.jogando = j;
//    }
//    //METODOS ABSTRATOS
//   
//    public void ligar() {
//        this.setLigado(true);
//    }
//
//  
//    public void desligar() {
//        this.setLigado(false);
//    }
//
// 
//    public void abrirmenu() {
//        System.out.println("esta ligado?" + this.getLigado());
//        System.out.println("esta jogando?" + this.getJogando());
//        System.out.println("carga: " + this.getCarga());
//        for (int i = 0; i <= this.getCarga(); i+=10){
//            System.out.println("[]");
//        }
//    }
//
//
//    public void fecharmenu() {
//        System.out.println("fechando menu");
//    }
//
//   
//    public void carregando() {
//         if(this.getLigado() == true){
//             this.setCarga(this.getCarga() + 10);
//         }else{
//         System.out.println("A carga não está aumentando, o carregador esta desconectado!");
//         }
//    }
//
//
//    public void naocarregando() {
//        if(this.getLigado() == true){
//          this.setCarga(this.getCarga() - 10);
//        }else{
//         System.out.println("A carga não diminui, o Laptop esta desligado!");
//        }
//    }
//
//  
//    public void jogando() {
//        if(this.getLigado() && !(this.getJogando())){
//            this.setJogando(true);
//        }
//    }
//
//    
//    public void naojogando() {
//        if(this.getLigado() && this.getJogando()){
//            this.setJogando(false);
//        }
//    }
//    

    public static int getBateria(int[] eventos) {
        int carga = 50;
        carga += eventos[0];
        carga += eventos[1];
        carga += eventos[2];
        if(carga > 100){
         carga = 100;
        }
        carga += eventos[3];

        return carga;
    }

    public static void main(String[] args) {

        int[] eventos = {10, -20, 120, -40};
        System.out.println("A carga da bateria está em " + getBateria(eventos));
    }

}
