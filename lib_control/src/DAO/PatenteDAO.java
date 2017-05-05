/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Fisico.Patente;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Enoch Junior
 */
public class PatenteDAO implements InterfaceDAO<Patente> {
    
    Connection connection;

    public PatenteDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void Inserir(Patente obj) throws Exception {
        String SQL = "INSERT INTO patente (id_pat, inventor, ano, pais, numero) "
                + "VALUES (?,?,?,?,?)";
    PreparedStatement ps = connection.prepareStatement(SQL);
        ps.setString(1, obj.getInventor()); 
        ps.setInt(2, obj.getAno()); 
        ps.setString(3, obj.getPais());
        ps.setInt(4, obj.getNumero());
        
        ps.executeUpdate(); 
    
    
    }

    @Override
    public void Deletar(Patente obj) throws Exception {
        String SQL = "DELETE FROM patente WHERE id_pat=?";   
        PreparedStatement ps = connection.prepareStatement(SQL);
        ps.setInt(1, obj.getId_pat());
        ps.executeUpdate();
    
    }

    @Override
    public void Atualizar(Patente obj) throws Exception {
        String SQL = "UPDATE patente SET inventor=?, ano=?, pais=?, numero=? "
              + "WHERE id_pat=?";
    PreparedStatement ps = connection.prepareStatement(SQL);
        ps.setString(1, obj.getInventor()); 
        ps.setInt(2, obj.getAno()); 
        ps.setString(3, obj.getPais());
        ps.setInt(4, obj.getNumero());
        ps.setInt(5, obj.getId_pat());
        
        
        ps.executeUpdate(); 
    
    
    }
    
}
