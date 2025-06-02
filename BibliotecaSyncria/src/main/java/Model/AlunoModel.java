/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNO
 */
public class AlunoModel {
        
    private int idAluno;
    private String nome;
    private int livrosEmDivida;
    private int livrosEmprestados;
    private int livrosAlugados;
    private int matricula;
    private int turmaId; // representa o campo Turma_id

    // Construtor vazio
    public AlunoModel() {}

    // Construtor completo (opcional)
    public AlunoModel(int idAluno, String nome, int livrosEmDivida, int livrosEmprestados, int livrosAlugados, int matricula, int turmaId) {
        this.idAluno = idAluno;
        this.nome = nome;
        this.livrosEmDivida = livrosEmDivida;
        this.livrosEmprestados = livrosEmprestados;
        this.livrosAlugados = livrosAlugados;
        this.matricula = matricula;
        this.turmaId = turmaId;
    }

    // Getters e Setters
    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLivrosEmDivida() {
        return livrosEmDivida;
    }

    public void setLivrosEmDivida(int livrosEmDivida) {
        this.livrosEmDivida = livrosEmDivida;
    }

    public int getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(int livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    public int getLivrosAlugados() {
        return livrosAlugados;
    }

    public void setLivrosAlugados(int livrosAlugados) {
        this.livrosAlugados = livrosAlugados;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getTurmaId() {
        return turmaId;
    }

    public void setTurmaId(int turmaId) {
        this.turmaId = turmaId;
    }
}

