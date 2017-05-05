/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Fisico.Atas_Conferencia;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Enoch Junior
 */
public class AtasDAO implements InterfaceDAO<Atas_Conferencia> {

    
    Connection connection;

    public AtasDAO(Connection connection) {
        this.connection = connection;
    }
    @Override
    public void Inserir(Atas_Conferencia obj) throws Exception {
        String SQL = "INSERT INTO atas_conferencia (id_ata, autor, pagina, ano, cidade, editora) "
                + "VALUES (?,?,?,?,?,?)";
    PreparedStatement ps = connection.prepareStatement(SQL);
        ps.setString(1, obj.getAutor()); 
        ps.setString(2, obj.getCidade()); 
        ps.setString(3, obj.getEditora());
        ps.setInt(4, obj.getPagina());
        ps.setInt(5, obj.getAno());
        
        ps.executeUpdate(); 
    
    }

    @Override
    public void Deletar(Atas_Conferencia obj) throws Exception {
        String SQL = "DELETE FROM atas_conferencia WHERE id=?";   
        PreparedStatement ps = connection.prepareStatement(SQL);
        ps.setInt(1, obj.getId_ata());
        ps.executeUpdate();
    
    }

    @Override
    public void Atualizar(Atas_Conferencia obj) throws Exception {
      String SQL = "UPDATE atas_conferencia SET autor=?, pagina=?, ano=?, cidade=?, editora=? "
              + "WHERE id_ata=?";
    PreparedStatement ps = connection.prepareStatement(SQL);
    ps.setString(1, obj.getAutor()); 
    ps.setString(2, obj.getCidade()); 
        ps.setString(3, obj.getEditora());
        ps.setInt(4, obj.getPagina());
        ps.setInt(5, obj.getAno());
        ps.setInt(6, obj.getId_ata());
         
        ps.executeUpdate(); 
    
    
    }
    
}
