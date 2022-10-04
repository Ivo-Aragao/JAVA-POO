
package projetopessoas;


public class ProjetoPessoas {

    public static void main(String[] args) {
        // programa principal
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("ivo");
        p2.setNome("jose");
        p3.setNome("maria");
        p4.setNome("joao");
        
        p1.setIdade(18);
        p2.setIdade(16);
        p3.setIdade(48);
        p4.setIdade(38);
        
        p1.setSexo("m");
        p2.setSexo("m");
        p3.setSexo("f");
        p4.setSexo("m");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        p2.setCurso("sistemas");
        p3.setSalario(2500);
        p4.setSetor("estoque");
        
        p3.receberAumento(550.20f);
        
    }
    
}
