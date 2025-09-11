/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author liliano
 */
public class Professor extends Pessoa{
    private String disciplina;
    private String nivelAcademico;
    private double salario;
    private String regime;

    public Professor(String disciplina, String nivelAcademico, double salario, String regime, String nome, String bi, int idade, String genero, String email) {
        super(nome, bi, idade, genero, email);
        this.disciplina = disciplina;
        this.nivelAcademico = nivelAcademico;
        this.salario = salario;
        this.regime = regime;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }
    
    
    
}
