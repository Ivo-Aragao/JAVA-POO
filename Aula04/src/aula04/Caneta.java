package aula04;
public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    public Caneta(String c, String m, float p) { // metodo construtor começo
        
        this.destampar();
        this.modelo = m;
        this.ponta = p;
        this.cor = c;       //metodo construtor fim
    }

    
    
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("sobra a caneta");
        System.out.println("a marca da caneta " + this.getModelo());
        System.out.println("a caneta tem ponta " + this.getPonta());
        System.out.println("cor " + this.cor);
        System.out.println("tampada?: " + this.tampada);
    }
}
