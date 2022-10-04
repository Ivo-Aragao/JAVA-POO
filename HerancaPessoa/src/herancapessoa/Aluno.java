
package herancapessoa;


public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    
    public void pagarMensalidade(int m){
        m = 500;
        System.out.println("pagou mensalidade de " + m);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
