package model;

public class Notas {
    private double nota1;
    private double nota2;
    private String disciplina;
    private Aluno aluno;
    private turmas turma;

    public Notas(double nota1, double nota2, String disciplina, Aluno aluno, turmas turma) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.disciplina = disciplina;
        this.aluno = aluno;
        this.turma = turma;
    }

    public double getNota1() { 
        return nota1; 
    }
    public void setNota1(double nota1) { 
        this.nota1 = nota1; 
    }

    public double getNota2() { 
        return nota2; 
    }
    public void setNota2(double nota2) { 
        this.nota2 = nota2; 
    }

    public String getDisciplina() { 
        return disciplina; 
    }
    public void setDisciplina(String disciplina) { 
        this.disciplina = disciplina; 
    }

    public Aluno getAluno() { 
        return aluno; 
    }
    public void setAluno(Aluno aluno) { 
        this.aluno = aluno; 
    }

    public turmas getTurma() { 
        return turma; 
    }
    public void setTurma(turmas turma) { 
        this.turma = turma; 
    }

    public Notas() {
    }
}