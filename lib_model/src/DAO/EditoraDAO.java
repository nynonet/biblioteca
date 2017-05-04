/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Cadastro.Editora;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author James
 */
public class EditoraDAO implements InterfaceDAO<Editora>{
    
    Connection connection;

    public EditoraDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void Inserir(Editora obj) throws Exception {
        String SQL = "INSERT INTO editora(nome, site, email) VALUES(?, ?, ?);";
        
        PreparedStatement ps = this.connection.prepareStatement(SQL);
        
        ps.setString(0, obj.getNome());
        ps.setString(1, obj.getSite());
        ps.setString(2, obj.getEmail());
        
        ps.executeUpdate();
        
    }

    @Override
    public void Deletar(Editora obj) throws Exception {
        String SQL = "DELETE FROM editora WHERE id_edit=?";
        
        PreparedStatement ps = this.connection.prepareStatement(SQL);
        
        ps.setInt(0, obj.getId_edit());
        
        ps.executeUpdate();
    }

    @Override
    public void Atualizar(Editora obj) throws Exception {
        String SQL = "UPDATE editora SET nome=?, site=?, email=?, WHERE id_edit=?";
        
        PreparedStatement ps = this.connection.prepareStatement(SQL);
        
        ps.setString(0, obj.getNome());
        ps.setString(1, obj.getSite());
        ps.setString(2, obj.getEmail());
        ps.setInt(3, obj.getId_edit());
        
        ps.executeUpdate();
    }
    
}
