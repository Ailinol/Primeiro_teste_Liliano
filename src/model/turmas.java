/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author liliano
 */
public class turmas {
    private String curso;
    private Object turmas = new Object();
    private ArrayList<turmas> lista = new ArrayList<>();

    public turmas(String curso) {
        this.curso = curso;
    }
    

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Object getTurmas() {
        return turmas;
    }

    public void setTurmas(Object turmas) {
        this.turmas = turmas;
    }

    public ArrayList<turmas> getLista() {
        return lista;
    }

    public void setLista(ArrayList<turmas> lista) {
        this.lista = lista;
    }
    
    
    
    

    public turmas() {
    }
    
    
}
