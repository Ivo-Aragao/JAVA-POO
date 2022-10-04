
package projetopessoas;


public class Funcionario extends Pessoa{
    
    private String setor;
    private boolean trabalhando;
    
    //metodos abstratos
    public void mudarTrabalho(){
        this.trabalhando = false;
    }
    //metodos especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = !this.trabalhando;
    }
    
}
