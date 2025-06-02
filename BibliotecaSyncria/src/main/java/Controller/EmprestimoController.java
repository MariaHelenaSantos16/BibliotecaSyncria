/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.EmprestimoModel;
import java.sql.Connection;


/**
 *
 * @author ALUNO
 */
public class EmprestimoController {
    
    //Cadastrar novos emprestimos
    
   /*
    
    /* 
    public boolean CadastrarEmprestimo(EmprestimoModel e) {
    String sql = "INSERT INTO Emprestimo (livrosDevolvidos, saldo, dataRetirada, Aluno_idAluno, Aluno_Turma_idTurma, Livro_idLivro) VALUES (?, ?, ?, ?, ?, ?)";

    try (Connection conn = ConexaoComBancoDados.conectar();
         PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setInt(1, e.getLivrosDevolvidos());
        ps.setInt(2, e.getSaldo());
        ps.setString(3,e.getDataRetirada());
        ps.setInt(4, e.getAluno_idAluno());
        ps.setInt(5, e.getAluno_Turma_idTurma());
        ps.setInt(6, e.getLivro_idLivro());

        int linhasAfetadas = ps.executeUpdate();
        return linhasAfetadas > 0;

    } catch (SQLException e) {
        e.printStackTrace();
        return false;
        
    }//fim do trycatch
}//fim da boolean

    
    */
    
}//fim da classe
