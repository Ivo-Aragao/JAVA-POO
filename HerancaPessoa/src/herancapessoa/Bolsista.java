
package herancapessoa;


public class Bolsista extends Aluno{
    private int bolsa;
    
    public void renovarBolsa(){
        this.pagarMensalidade(-this.getBolsa());
    }
    
    @Override
    public void pagarMensalidade(int me){
   
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
