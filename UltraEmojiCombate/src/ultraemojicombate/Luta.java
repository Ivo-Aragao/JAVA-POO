
package ultraemojicombate;

import java.util.Random;

public class Luta {
    //atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //metodos publicos
    public void marcarluta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
            
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
            
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("###desafiado###");
         desafiado.apresentar();
         System.out.println("###desafiante###");
         desafiante.apresentar();
        Random aleatorio = new Random();
        int vencedor = aleatorio.nextInt(3); 
            System.out.println("========RESULTADO DA LUTA=========");
        switch(vencedor){
            case 0: //empate
                System.out.println("empatou");
                this.desafiado.empatar();
                this.desafiante.empatar();
                break;
            case 1: //desafiado vence
                System.out.println("vitoria do " + this.desafiado.getNome());
                this.desafiado.ganharluta();
                this.desafiante.perderluta();
                break;
            case 2: //desafiante vence 
                System.out.println("vitoria do " + this.desafiante.getNome());
                this.desafiado.perderluta();
                this.desafiante.ganharluta();
                break;
        }
            System.out.println("==================================");
        }else {
            System.out.println("a luta nao pode acontecer");
        }
    }
    //metodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}


