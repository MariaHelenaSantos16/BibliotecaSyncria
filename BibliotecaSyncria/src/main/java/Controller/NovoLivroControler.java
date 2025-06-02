/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.NovoLivroModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
;


/**
 *
 * @author ALUNO
 */
public class NovoLivroControler {
    
   public boolean CadastroLivro(NovoLivroModel n ) {
    String sql = "INSERT INTO NovoLivroModel (tituloObra, numeroCopias, dataCadastro, "
            + "generosLiterarios, subgenerosLiterarios, autor, numeroRegistro, edicao, volume, localizacao, editora, anoFabricacao,"
            + " anoPublicacao, aquisicao, exemplar, numeroChamada, isbn, status, observacoes, quantidadeTituloEmprestado, quantidadeTituloAcervo) VALUES)"
            + " (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    try (Connection conn = ConexaoComBancoDados.conectar();
         PreparedStatement ps = conn.prepareStatement(sql)) {

       ps.setString(1, n.getTituloObra());
ps.setInt(2, n.getNumeroCopias());
ps.setString(3,   n.getDataCadastro());
ps.setString(4, n.getGenerosLiterarios());
ps.setString(5, n.getSubgenerosLiterarios());
ps.setString(6, n.getAutor());
ps.setInt(7, n.getNumeroRegistro());
ps.setString(8, n.getEdicao());
ps.setInt(9, n.getVolume());
ps.setString(10, n.getLocalizacao());
ps.setString(11, n.getEditora());
ps.setInt(12, n.getAnoFabricacao());
ps.setInt(13, n.getAnoPublicacao());
ps.setString(14, n.getAquisicao());
ps.setString(15, n.getExemplar());
ps.setString(16, n.getNumeroChamada());
ps.setString(17, n.getIsbn());
ps.setString(18, n.getStatus());
ps.setString(19, n.getObservacoes());
ps.setInt(20, n.getQuantidadeTituloEmprestado());
ps.setInt(21, n.getQuantidadeTituloAcervo());

  // ajuste o tipo e o campo conforme sua entidade
        // Repita para os demais campos

        int linhasAfetadas = ps.executeUpdate();
        return linhasAfetadas > 0;

    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
 
    
}
