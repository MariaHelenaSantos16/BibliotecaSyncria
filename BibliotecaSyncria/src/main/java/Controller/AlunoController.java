/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.AlunoModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ALUNO
 */
public class AlunoController {
    
    public boolean cadastrarAluno(AlunoModel a) {
        String sql = "INSERT INTO Aluno (nome, livrosEmDivida, livrosEmprestados, livrosAlugados, matricula, Turma_id)  VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConexaoComBancoDados.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, a.getNome());
            ps.setInt(2, a.getLivrosEmDivida());
            ps.setInt(3, a.getLivrosEmprestados());
            ps.setInt(4, a.getLivrosAlugados());
            ps.setInt(5, a.getMatricula());
            ps.setInt(6, a.getTurmaId());

            int linhasAfetadas = ps.executeUpdate();
            return linhasAfetadas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}

