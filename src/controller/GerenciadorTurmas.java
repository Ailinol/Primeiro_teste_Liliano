package controller;

import java.util.ArrayList;
import java.util.List;
import model.Aluno;
import model.Professor;
import model.turmas;

public class GerenciadorTurmas {
    private List<turmas> turmas;

    public GerenciadorTurmas() {
        this.turmas = new ArrayList<>();
    }

    public void criarTurma(String codigo, String disciplina, Professor professor, String curso, String horario) {
        turmas turma = new turmas(codigo, disciplina, professor, curso, horario);
        turmas.add(turma);
    }

    public turmas buscarTurmaPorCodigo(String codigo) {
        for (turmas turma : turmas) {
            if (turma.getCodigoTurma().equals(codigo)) {
                return turma;
            }
        }
        return null;
    }

    public void editarTurma(String codigo, String novaDisciplina, Professor novoProfessor, String novoCurso, String novoHorario) {
        turmas turma = buscarTurmaPorCodigo(codigo);
        if (turma != null) {
            turma.setDisciplina(novaDisciplina);
            turma.setProfessor(novoProfessor);
            turma.setCurso(novoCurso);
            turma.setHorario(novoHorario);
        }
    }

    public void adicionarAlunoTurma(String codigoTurma, Aluno aluno) {
        turmas turma = buscarTurmaPorCodigo(codigoTurma);
        if (turma != null) {
            turma.adicionarAluno(aluno);
        }
    }

    public void removerAlunoTurma(String codigoTurma, Aluno aluno) {
        turmas turma = buscarTurmaPorCodigo(codigoTurma);
        if (turma != null) {
            turma.removerAluno(aluno);
        }
    }

    public List<turmas> listarTurmasPorDisciplina(String disciplina) {
        List<turmas> resultado = new ArrayList<>();
        for (turmas turma : turmas) {
            if (turma.getDisciplina().equalsIgnoreCase(disciplina)) {
                resultado.add(turma);
            }
        }
        return resultado;
    }

    public List<turmas> getTodasTurmas() {
        return new ArrayList<>(turmas);
    }

    public boolean removerTurma(String codigo) {
        turmas turma = buscarTurmaPorCodigo(codigo);
        if (turma != null) {
            return turmas.remove(turma);
        }
        return false;
    }
}