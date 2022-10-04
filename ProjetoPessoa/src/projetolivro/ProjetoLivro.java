
package projetolivro;

public class ProjetoLivro {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[4];
        
        p[0] = new Pessoa("ivo", 25, "masculino"); 
        p[1] = new Pessoa("juma", 23, "feminina");
        
        l[0] = new Livro("game of trones", "barbudao", 1500, p[0]);
        l[1] = new Livro("estudando java", "jon snow", 400, p[1]);
        
        System.out.println(l[0].detalhes());
        
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        l[0].fechar();
        System.out.println(l[0].detalhes());
        l[0].abrir();
        l[0].folhear(200);
        System.out.println(l[0].detalhes());
     
        
    }
    
}
