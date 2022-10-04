
package projetoyoutube;

public class ProjetoYouTube {
    
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("aula 1 de poo");
        v[1] = new Video("aula 2 de poo");
        v[2] = new Video("aula 3 de poo");
        v[1].like();
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("ivo", 25, "M", "ivoaragao");
        System.out.println(g[0].toString());
        
        Vizualizacao vis[] = new Vizualizacao[5];
        vis[0] = new Vizualizacao(g[0], v[0]);
        vis[0].avaliar(80.0f);
        System.out.println(vis[0].toString());
        
    }
    
}
