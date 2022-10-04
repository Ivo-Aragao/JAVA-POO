
package projetopequenosservicos;

public class Servidor{
    private String nome;
    private int idade;
    private String funcao; 
    private int valor;

    //metodos publicos
    public void apresentar(){
         
        System.out.println("nome " + this.getNome());
    
          System.out.println("idade " + this.getIdade());
     
           System.out.println("funcao " + this.getFuncao());

             System.out.println("valor do serviço " + this.getValor());
    }
    public void Status(){
        System.out.println(this.getNome());
        System.out.println("Funcao " + this.getFuncao());
       
    }
        //metodos especiais
    public Servidor(String no, int id, String fu, int va) {
        this.nome = no;
        this.idade = id;
        this.funcao = fu;
        this.valor = va;
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getFuncao() {
        return funcao;
    }

    private void setFuncao() {

    }
        public String getValor() {
        return funcao;
    }

    private void setValor() {

    }
    
}