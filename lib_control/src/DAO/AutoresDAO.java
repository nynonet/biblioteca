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
    
    @Override                                                                   //INSERIR
    public void Inserir(Autores obj) throws Exception {
        String SQL = "INSERT INTO autores(nome, email, nacionalidade) VALUES(?, ?, ?);";
        
        PreparedStatement ps = this.connection.prepareStatement(SQL);
        
        ps.setString(1, obj.getNome());                                         //Nome do Autor
        ps.setString(2, obj.getEmail());                                        //Email
        ps.setString(3, obj.getNacionalidade());                                //Nacionalidade
        
        ps.executeUpdate();
        
    }

    @Override                                                                   //DELETAR
    public void Deletar(Autores obj) throws Exception {
        String SQL = "DELETE FROM autores WHERE id_autor=?";
        
        PreparedStatement ps = this.connection.prepareStatement(SQL);
        
        ps.setInt(1, obj.getId_autor());
        
        ps.executeUpdate();
    }

    @Override                                                                   //ATUALIZAR
    public void Atualizar(Autores obj) throws Exception {
        String SQL = "UPDATE autores SET nome=?, email=?, nacionalidade=? WHERE id_autor=?";
        
        PreparedStatement ps = this.connection.prepareStatement(SQL);
        
        ps.setString(1, obj.getNome());                                         //Nome do Autor
        ps.setString(2, obj.getEmail());                                        //Email
        ps.setString(3, obj.getNacionalidade());                                //Nacionalidade
        ps.setInt(4, obj.getId_autor());                                        //Código ID
        
        ps.executeUpdate();
    }
    
}
