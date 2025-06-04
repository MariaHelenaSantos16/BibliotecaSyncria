/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.UsuarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ALUNO
 */
public class UsuarioController {
    public boolean CadastrarUsuario (UsuarioModel u){
        String sql = "INSERT INTO Usuario (nome,senha,cpf)"
        + " values(?,?,?)";
        
        try(Connection con = ConexaoComBancoDados.conectar();
                PreparedStatement ps=con.prepareStatement(sql)){
            
            ps.setString(1, u.getNome());
            ps.setString(2, u.getSenha());
            ps.setString(3, u.getCpf());
        
            //solicitar o retorno
            int retorno = ps.executeUpdate();
            // realizando o retorno caso tenha dado certo
            return retorno >0;
            
        }catch(SQLException e){
           e.getStackTrace();
        return false;
        }
        
        
        
        
        
    }//fim cadastrar
    
}
