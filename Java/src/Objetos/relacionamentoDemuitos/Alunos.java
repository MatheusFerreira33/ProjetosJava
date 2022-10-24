package Objetos.relacionamentoDemuitos;

import java.util.ArrayList;
import java.util.List;
public class Alunos {

    String nomeAluno;

    List<Curso> cursos = new ArrayList<>();

    Alunos(String nomeAluno ){
        this.nomeAluno = nomeAluno;
    }

    void adcionarCurso(Curso curso){
       this.cursos.add(curso);
        curso.alunos.add(this);
    }
    
}
