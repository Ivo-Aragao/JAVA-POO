package projetopequenosservicos;


public class Cliente {
    private String nome;
    private String endereco;
    private int idade;
  
    //metodos publicos
    public void apresentar(){
         
 
        System.out.println("nome " + this.getNome());
          System.out.println("idade " + this.getIdade());
          System.out.println("endereco " + this.getEndereco());
          
     
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

   
        //metodos especiais
    public Cliente(String no, String en, int id) {
        this.nome = no;
        this.endereco = en;
        this.idade = id;
      

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

  }
   



