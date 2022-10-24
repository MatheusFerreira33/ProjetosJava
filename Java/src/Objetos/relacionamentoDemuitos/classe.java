package Objetos.relacionamentoDemuitos;

public class classe {

    public static void main(String [] args){

         
        Alunos aluno1 = new Alunos("matheus");
        Alunos aluno2 = new Alunos("joaquim");
        Alunos aluno3 = new Alunos("moises");

        Curso Curso1 = new Curso("Java");
        Curso Curso2 = new Curso("Negocios");
        Curso Curso3 = new Curso("Web");

        Curso1.adcionarAlunos(aluno1);
        Curso2.adcionarAlunos(aluno2);
        Curso3.adcionarAlunos(aluno3);


        System.out.println(Curso1.alunos.size());




        
    }
    
}
