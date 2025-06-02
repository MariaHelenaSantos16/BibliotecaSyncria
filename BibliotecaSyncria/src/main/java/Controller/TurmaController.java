/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.TurmaModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ALUNO
 */
public class TurmaController {
    
   public boolean cadastrarTurma(TurmaModel t) {
    String sql = "INSERT INTO Turma (turno, codigoTurma) VALUES (?, ?)";

    try (Connection conn = ConexaoComBancoDados.conectar();
         PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setString(1, t.getTurno());
        ps.setString(2, t.getCodigoTurma());

        int linhasAfetadas = ps.executeUpdate();
        return linhasAfetadas > 0;

    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }//fim trycatch
}// fim boolean

}//fim classe
