package projetopequenosservicos;


public class ProjetoPequenosServicos {

   
    public static void main(String[] args) {
       Servidor l[] = new Servidor[6];
       
        l[0] = new Servidor("ivo", 15, "fdsfsd", 200);
        
        Cliente n[] = new Cliente[6];
         n[0] = new Cliente("jose", "fgdsfs", 18);
        
         Contratar UEC01 = new Contratar();
        UEC01.marcarServico(l[0], n[0]);
        UEC01.ServicoEmAndameto();
    }
    
}
      

