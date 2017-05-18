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
        String SQL = "INSERT INTO patente (titulo, ano, id_genero, id_localizacao,classificacao, "
                + "inventor, ano, pais, numero)  VALUES (?,?,?,?,?,?,?,?,?)";
    PreparedStatement ps = connection.prepareStatement(SQL);
        ps.setString(1, obj.getTitulo());                                       //Título
        ps.setInt(2, obj.getAno());                                             //Ano
        ps.setInt(3, obj.getGenero().getId_gen());                              //Genero
        ps.setInt(4, obj.getLocalizacao().getId_loc());                         //Localização
        ps.setString(5, obj.getClassificacao().Classificacao());                //Classificação
        ps.setString(6, obj.getInventor()); 
        ps.setInt(7, obj.getAno()); 
        ps.setString(8, obj.getPais());
        ps.setInt(9, obj.getNumero());
               
        ps.executeUpdate(); 
    
    
    }

    @Override
    public void Deletar(Patente obj) throws Exception {
        String SQL = "DELETE FROM patente WHERE id_acervo=?";   
        PreparedStatement ps = connection.prepareStatement(SQL);
        ps.setInt(1, obj.getId_acervo());
        ps.executeUpdate();
    
    }

    @Override
    public void Atualizar(Patente obj) throws Exception {
        String SQL = "UPDATE patente SET titulo=?, ano=?, id_genero=?, id_localizacao=?,classificacao=?,"
                + " inventor=?, ano=?, pais=?, numero=? "
              + "WHERE id_acervo=?";
    PreparedStatement ps = connection.prepareStatement(SQL);
        ps.setString(1, obj.getTitulo());                                       //Título
        ps.setInt(2, obj.getAno());                                             //Ano
        ps.setInt(3, obj.getGenero().getId_gen());                              //Genero
        ps.setInt(4, obj.getLocalizacao().getId_loc());                         //Localização
        ps.setString(5, obj.getClassificacao().Classificacao());                //Classificação
        ps.setString(6, obj.getInventor()); 
        ps.setInt(7, obj.getAno()); 
        ps.setString(8, obj.getPais());
        ps.setInt(9, obj.getNumero());
        ps.setInt(10, obj.getId_acervo());
        
        
        ps.executeUpdate(); 
    
    
    }
    
}
