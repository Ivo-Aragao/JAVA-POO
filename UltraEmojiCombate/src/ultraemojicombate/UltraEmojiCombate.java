
package ultraemojicombate;

public class UltraEmojiCombate {

    public static void main(String[] args) {
       Lutador l[] = new Lutador[6];
       
        l[0] = new Lutador("ivo", "brasileiro", 25, 1.80f, 82.5f, 12, 3, 2);
        l[1] = new Lutador("joao", "britanico", 28, 1.70f, 88.5f, 14, 1, 2);    
        l[2] = new Lutador("joe", "sueco", 21, 1.68f, 89.5f, 13, 3, 1);
        l[3] = new Lutador("caspita", "brasileiro", 24, 1.82f, 64.5f, 11, 4, 2);
        l[4] = new Lutador("louro", "romeno", 23, 1.70f, 68.5f, 10, 5, 2);
        l[5] = new Lutador("deadpool", "croata", 25, 1.90f, 70.5f, 12, 5, 0);
        
        Luta UEC01 = new Luta();
        UEC01.marcarluta(l[2], l[1]);
        UEC01.lutar();
       
    }
    
}
