
package ultraemojicombate;
public class Lutador {
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria; 
    private int vitoria;
    private int derrota;
    private int empates;

    //metodos publicos
    public void apresentar(){
         
         System.out.println("Nacionalidade " + this.getNacionalidade());
        System.out.println("nome " + this.getNome());
        System.out.println("peso " + this.getPeso());
          System.out.println("idade " + this.getIdade());
          System.out.println("altura " + this.getAltura());
           System.out.println("categoria " + this.getCategoria());
        System.out.println("tem " + this.getVitoria() + " vitorias");
        System.out.println(this.getDerrota() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }
    public void Status(){
        System.out.println(this.getNome());
        System.out.println("categoria " + this.getCategoria());
        System.out.println("tem " + this.getVitoria() + " vitorias");
        System.out.println(this.getDerrota() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
        
    }
    public void ganharluta(){
        this.setVitoria(this.getVitoria() + 1);
    }
    public void perderluta(){
        this.setDerrota(this.getDerrota() + 1);
    }
    public void empatar(){
        this.setEmpates(this.getEmpates() + 1);
    }
        //metodos especiais
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
    
        this.vitoria = vi;
        this.derrota = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
       if (this.peso < 52.2){
          this.categoria = " invalido";
       }else if(this.peso <= 70.3){
           this.categoria = " leve";
       }else if (this.peso <= 83.9){
           this.categoria = "medio";
       }else if (this.peso <= 120.2){
           this.categoria = " pesado";
       }else{
           this.categoria = " invalido";
       }
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
}
