/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Cadastro.Autores;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author James
 */
public class AutoresDAO implements InterfaceDAO<Autores>{
    
    Connection connection;

    public AutoresDAO(Connection connection) {
        this.connection = connection;
    }
    
    @Override
    public void Inserir(Autores obj) throws Exception {
        String SQL = "INSERT INTO autores(nome, email, nacionalidade) VALUES(?, ?, ?);";
        
        PreparedStatement ps = this.connection.prepareStatement(SQL);
        
        ps.setString(0, obj.getNome());
        ps.setString(1, obj.getEmail());
        ps.setString(2, obj.getNacionalidade());
        
        ps.executeUpdate();
        
    }

    @Override
    public void Deletar(Autores obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Atualizar(Autores obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
