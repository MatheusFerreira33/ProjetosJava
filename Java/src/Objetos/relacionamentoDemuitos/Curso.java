package Objetos.relacionamentoDemuitos;

import java.util.ArrayList;

public class Curso {
    
    String nomeCurso;

    ArrayList<Alunos> alunos = new ArrayList<>();

     Curso(String nomeCurso){
        
        this.nomeCurso = nomeCurso;
    }

    void adcionarAlunos(Alunos alunos){ // esse laranja qualquer nome
        
        this.alunos.add(alunos);
        alunos.cursos.add(this);



    }

}
