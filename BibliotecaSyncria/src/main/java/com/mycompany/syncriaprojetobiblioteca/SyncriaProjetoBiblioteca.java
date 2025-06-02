/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.syncriaprojetobiblioteca;

import static Controller.ConexaoComBancoDados.conectar;
import java.sql.Connection;

/**
 *
 * @author ALUNO
 */
public class SyncriaProjetoBiblioteca {

    public static void main(String[] args) {
        Connection conexao = conectar();
        
        if(conexao!=null){
        System.out.println(conexao);
        }//Fim do if
        
        
    }
    
}//fim da classe
