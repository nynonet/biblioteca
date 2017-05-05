/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Fisico.Periodico;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Enoch Junior
 */
public class PeriodicoDAO implements InterfaceDAO<Periodico> {
    
    Connection connection;

    public PeriodicoDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void Inserir(Periodico obj) throws Exception {
        String SQL = "INSERT INTO revista (id_per, autor, ano, mes, dia, paginas) "
                + "VALUES (?,?,?,?,?,?)";
    PreparedStatement ps = connection.prepareStatement(SQL);
        ps.setString(1, obj.getAutor()); 
        ps.setInt(2, obj.getAno()); 
        ps.setInt(3, obj.getMes());
        ps.setInt(4, obj.getDia()); 
        ps.setInt(5, obj.getPaginas());
        
        ps.executeUpdate(); 
    
    }

    @Override
    public void Deletar(Periodico obj) throws Exception {
        String SQL = "DELETE FROM periodico WHERE id_per=?";   
        PreparedStatement ps = connection.prepareStatement(SQL);
        ps.setInt(1, obj.getId_per());
        ps.executeUpdate();
    }

    @Override
    public void Atualizar(Periodico obj) throws Exception {
        String SQL = "UPDATE periodico SET autor=?, ano=?, mes=?, dia=?, paginas=? "
              + "WHERE id_rev=?";
    PreparedStatement ps = connection.prepareStatement(SQL);
     ps.setString(1, obj.getAutor()); 
        ps.setInt(2, obj.getAno()); 
        ps.setInt(3, obj.getMes());
        ps.setInt(4, obj.getDia()); 
        ps.setInt(5, obj.getPaginas());
        ps.setInt(6, obj.getId_per());
        
        ps.executeUpdate();

    }
    
}
