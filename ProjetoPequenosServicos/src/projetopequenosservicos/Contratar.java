package projetopequenosservicos;

public class Contratar {
    private Servidor contratado;
    private Cliente contratante;
    private boolean aprovada;
    
    //metodos publicos
    public void marcarServico(Servidor l0, Cliente n0){
            
    }
    //metodos especiais

    public Servidor getcontratado() {
        return contratado;
    }

    public void setcontratado(Servidor contratado) {
        this.contratado = contratado;
    }

    public Cliente getcontratante() {
        return contratante;
    }

    public void setcontratante(Cliente contratante) {
        this.contratante = contratante;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    public void ServicoEmAndameto(){
        if(this.aprovada){
            System.out.println("###contratado###");
         contratado.apresentar();
         System.out.println("###contratante###");
         contratante.apresentar();
    
           
        }
    }
    
}


