
package herancapessoa;

public class HerancaPessoa {

    public static void main(String[] args) {
       Visitante v1 = new Visitante();
       Aluno a1 = new Aluno();
       Bolsista b1 = new Bolsista();
       v1.setNome("ivo");
       v1.setIdade(18);
       v1.setSexo("M");
        System.out.println("os dados do visitante são \n" + v1.toString());
        v1.fazerAniversario();
        System.out.println("os dados do visitante são \n" + v1.toString());
        
        a1.setNome("jose");
        a1.setIdade(20);
        a1.setSexo("M");
        a1.setCurso("JAVA");
        a1.setMatricula(28555);
        System.out.println("matricula " + a1.getMatricula());
        System.out.println("os dados do aluno são " + a1.toString());
        a1.pagarMensalidade(0);
        
        b1.setNome("atoin");
        b1.setIdade(19);
        b1.setSexo("M");
        b1.setCurso("JAVA");
        System.out.println("os dados do aluno são " + b1.toString());
        b1.setBolsa(250);
        System.out.println("o valor da mensalidade foi " + b1.getBolsa());
    }
    
}
