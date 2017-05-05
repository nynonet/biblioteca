/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Fisico.Revista;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Enoch Junior
 */
public class RevistaDAO implements InterfaceDAO<Revista> {
    
    Connection connection;

    public RevistaDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void Inserir(Revista obj) throws Exception {
        String SQL = "INSERT INTO revista (id_rev, autor, ano, pagina, editora, volume, edicao) "
                + "VALUES (?,?,?,?,?,?,?)";
    PreparedStatement ps = connection.prepareStatement(SQL);
        ps.setString(1, obj.getAutor()); 
        ps.setInt(2, obj.getAno()); 
        ps.setInt(3, obj.getPagina());
        ps.setString(4, obj.getEditora());
        ps.setInt(5, obj.getVolume()); 
        ps.setInt(6, obj.getEdicao());
        ps.setInt(7, obj.getId_rev());
        ps.executeUpdate(); 
    
    }

    @Override
    public void Deletar(Revista obj) throws Exception {
        String SQL = "DELETE FROM revista WHERE id_rev=?";   
        PreparedStatement ps = connection.prepareStatement(SQL);
        ps.setInt(1, obj.getId_rev());
        ps.executeUpdate();
    
    }

    @Override
    public void Atualizar(Revista obj) throws Exception {
        String SQL = "UPDATE revista SET autor=?, ano=?, pagina=?, editora=?, volume=?, edicao=? "
              + "WHERE id_rev=?";
    PreparedStatement ps = connection.prepareStatement(SQL);
    ps.setString(1, obj.getAutor()); 
        ps.setInt(2, obj.getAno()); 
        ps.setInt(3, obj.getPagina());
        ps.setString(4, obj.getEditora());
        ps.setInt(5, obj.getVolume()); 
        ps.setInt(6, obj.getEdicao());
        
        ps.executeUpdate(); 
    }
    
}
