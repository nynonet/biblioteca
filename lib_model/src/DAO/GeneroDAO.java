/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Cadastro.Genero;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author James
 */
public class GeneroDAO implements InterfaceDAO<Genero>{

    Connection connection;

    public GeneroDAO(Connection connection) {
        this.connection = connection;
    }
    
    @Override
    public void Inserir(Genero obj) throws Exception {
        String SQL = "INSERT INTO genero(genero) VALUES(?);";
        
        PreparedStatement ps = this.connection.prepareStatement(SQL);
        
        ps.setString(0, obj.getGenero());
        
        ps.executeUpdate();

    }

    @Override
    public void Deletar(Genero obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Atualizar(Genero obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
