/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoquevalor;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class EstoqueValor {

    /**
     * @param args the command line arguments
     */
    
        public static void main(String[] args) {
 
        int numeroTotalMercadoria;
        Double valorMercadoria;
        Double valorTotalEmEstoque = 0.0;
        Double mediaValorMercadoria = 0.0;
        int soma = 0;
 
        System.out.println("Informe o número total de mercadorias no estoque");
        numeroTotalMercadoria = Integer.parseInt(JOptionPane.showInputDialog("Informe o número total de mercadorias"
                + " no estoque"));
 
        for (int i = 1; i == numeroTotalMercadoria; i++) {
            System.out.println("Informe o valor de cada mercadoria");
            valorMercadoria = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de cada mercadoria"));
 
            soma = soma + i;
            valorTotalEmEstoque = numeroTotalMercadoria * valorMercadoria;
            mediaValorMercadoria = valorTotalEmEstoque / soma;
 
        }
 
        System.out.println("O valor total em estoque é de:" + valorTotalEmEstoque);
        System.out.println("A média de valor da mercadoria é de:" + mediaValorMercadoria);
    }
 
}
