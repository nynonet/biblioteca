/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author James
 */
public class Conexao {
    private Connection conexao;
    private String Porta = "3306";
    private String Database = "dbBiblioteca";   //Criar banco de dados e passar usuario e senha via parametros
    private String Usuario = "";
    private String Senha = "";
    private String Host = "localhost";//localhost ou 127.0.0.1

    public Conexao() {
        String link = "jdbc:mysql://" + this.Host + ":" + this.Porta + "/" + this.Database;
    
        try {
            conexao = DriverManager.getConnection(link, this.Usuario, this.Senha);
            System.out.println("Conectado com sucesso!");
        } catch (SQLException ex) {
            System.out.println("Erro na conexão com " + link + "\nErro apresentado: " + ex.getMessage());
        }
    }

     public Connection getConexao(){
        return this.conexao;
    }   
    
    
}
