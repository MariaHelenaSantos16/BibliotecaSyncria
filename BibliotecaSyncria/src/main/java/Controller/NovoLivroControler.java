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

     public void inserirLivro(NovoLivroModel livro) {
        String sql = "INSERT INTO livro (tituloObra, numeroCopias, dataCadastro, generoLiterarios, subgenerosLiterarios, autor, numeroRegistro, edicao, volume, localizacao, editora, anoFabricacao, anoPublicacao, aquisicao, exemplar, numeroChamada, isbn, statusLivro, observacoes, quantidadeTituloEmprestados, quatidadeTituloAcervo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConexaoComBancoDados.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, livro.getTituloObra());
            stmt.setInt(2, livro.getNumeroCopias());
            stmt.setString(3, livro.getDataCadastro());
            stmt.setString(4, livro.getGenerosLiterarios());
            stmt.setString(5, livro.getSubgenerosLiterarios());
            stmt.setString(6, livro.getAutor());
            stmt.setInt(7, livro.getNumeroRegistro());
            stmt.setString(8, livro.getEdicao());
            stmt.setInt(9, livro.getVolume());
            stmt.setString(10, livro.getLocalizacao());
            stmt.setString(11, livro.getEditora());
            stmt.setInt(12, livro.getAnoFabricacao());
            stmt.setInt(13, livro.getAnoPublicacao());
            stmt.setString(14, livro.getAquisicao());
            stmt.setString(15, livro.getExemplar());
            stmt.setString(16, livro.getNumeroChamada());
            stmt.setString(17, livro.getIsbn());
            stmt.setString(18, livro.getStatus());
            stmt.setString(19, livro.getObservacoes());
            stmt.setInt(20, livro.getQuantidadeTituloEmprestado());
            stmt.setInt(21, livro.getQuantidadeTituloAcervo());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao inserir livro: " + e.getMessage());
        }
    }

}
