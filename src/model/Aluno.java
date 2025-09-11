/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author liliano
 */
public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    private int anoIngresso;
    private String tipoAluno;
    private double mensalidade;


    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public Aluno(int matricula, String curso, int anoIngresso, String tipoAluno, double mensalidade, String nome, String bi, int idade, String genero, String email) {
        super(nome, bi, idade, genero, email);
        this.matricula = matricula;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
        this.tipoAluno = tipoAluno;
        this.mensalidade = mensalidade;
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

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public String getTipoAluno() {
        return tipoAluno;
    }

    public void setTipoAluno(String tipoAluno) {
        this.tipoAluno = tipoAluno;
    }

    public Aluno() {
    }
    
    
    
}
