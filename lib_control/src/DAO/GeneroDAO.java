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
    
    @Override                                                                   //INSERIR
    public void Inserir(Genero obj) throws Exception {
        String SQL = "INSERT INTO genero(genero) VALUES(?);";
        
        PreparedStatement ps = this.connection.prepareStatement(SQL);
        
        ps.setString(1, obj.getGenero());
        
        ps.executeUpdate();

    }

    @Override                                                                   //DELETAR
    public void Deletar(Genero obj) throws Exception {
        String SQL = "DELETE FROM genero WHERE id_gen=?";
        
        PreparedStatement ps = this.connection.prepareStatement(SQL);
        
        ps.setInt(1, obj.getId_gen());
        
        ps.executeUpdate();
    }

    @Override                                                                   //ATUALIZAR
    public void Atualizar(Genero obj) throws Exception {
        String SQL = "UPDATE genero SET genero=? WHERE id_gen=?";
        
        PreparedStatement ps = this.connection.prepareStatement(SQL);
        
        ps.setString(1, obj.getGenero());
        ps.setInt(2, obj.getId_gen());
        
        ps.executeUpdate();
    }
    
}
