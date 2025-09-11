/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author liliano
 */
public class Notas extends Aluno {
    private double not1;
    private double nota2;
    private String disciplina;

    public Notas(int matricula, String curso, int anoIngresso, String tipoAluno, double mensalidade, String nome, String bi, int idade, String genero, String email) {
        super(matricula, curso, anoIngresso, tipoAluno, mensalidade, nome, bi, idade, genero, email);
    }

    public double getNot1() {
        return not1;
    }

    public void setNot1(double not1) {
        this.not1 = not1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String getExame() {
        return disciplina;
    }

    public void setExame(String disciplina) {
        this.disciplina = disciplina;
    }

   
    
    
}
