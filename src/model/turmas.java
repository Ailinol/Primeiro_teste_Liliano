package model;

import java.util.ArrayList;
import java.util.List;

public class turmas {
    private String codigoTurma;
    private String disciplina;
    private Professor professor;
    private List<Aluno> alunos;
    private String curso;
    private String horario;

    public turmas(String codigoTurma, String disciplina, Professor professor, String curso, String horario) {
        this.codigoTurma = codigoTurma;
        this.disciplina = disciplina;
        this.professor = professor;
        this.curso = curso;
        this.horario = horario;
        this.alunos = new ArrayList<>();
    }

    public String getCodigoTurma() { 
        return codigoTurma; 
    }
    public void setCodigoTurma(String codigoTurma) { 
        this.codigoTurma = codigoTurma; 
    }

    public String getDisciplina() { 
        return disciplina; 
    }
    public void setDisciplina(String disciplina) { 
        this.disciplina = disciplina; 
    }

    public Professor getProfessor() { 
        return professor; 
    }
    public void setProfessor(Professor professor) { 
        this.professor = professor; 
    }

    public List<Aluno> getAlunos() { 
        return alunos; 
    }
    public void setAlunos(List<Aluno> alunos) { 
        this.alunos = alunos; 
    }

    public void adicionarAluno(Aluno aluno) { 
        this.alunos.add(aluno); 
    }
    public void removerAluno(Aluno aluno) { 
        this.alunos.remove(aluno); 
    }

    public String getCurso() { 
        return curso; 
    }
    public void setCurso(String curso) { 
        this.curso = curso; 
    }

    public String getHorario() { 
        return horario; 
    }
    public void setHorario(String horario) { 
        this.horario = horario; 
    }

    public turmas() {
        this.alunos = new ArrayList<>();
    }
}