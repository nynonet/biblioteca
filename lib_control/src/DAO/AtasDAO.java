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
        String SQL = "INSERT INTO atas_conferencia (titulo, ano, id_genero, id_localizacao,classificacao,"
                + "id_ata, autor, pagina, ano, cidade, editora) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
    PreparedStatement ps = connection.prepareStatement(SQL);
        ps.setString(1, obj.getTitulo());                                       //Título
        ps.setInt(2, obj.getAno());                                             //Ano
        ps.setInt(3, obj.getGenero().getId_gen());                              //Genero
        ps.setInt(4, obj.getLocalizacao().getId_loc());                         //Localização
        ps.setString(5, obj.getClassificacao().Classificacao());                //Classificação
        ps.setString(6, obj.getAutor()); 
        ps.setString(7, obj.getCidade()); 
        ps.setString(8, obj.getEditora());
        ps.setInt(9, obj.getPagina());
        ps.setInt(10, obj.getAno());
        ps.setInt(10, obj.getId_ata());
        ps.executeUpdate(); 
    
    }

    @Override
    public void Deletar(Atas_Conferencia obj) throws Exception {
        String SQL = "DELETE FROM atas_conferencia WHERE id_acervo=?";   
        PreparedStatement ps = connection.prepareStatement(SQL);
        ps.setInt(1, obj.getId_ata());
        ps.executeUpdate();
    
    }

    @Override
    public void Atualizar(Atas_Conferencia obj) throws Exception {
      String SQL = "UPDATE atas_conferencia SET titulo=?, ano=?, id_genero=?, id_localizacao=?,classificacao=?, "
              + "autor=?, pagina=?, ano=?, cidade=?, editora=? "
              + "WHERE id_acervo=?";
    PreparedStatement ps = connection.prepareStatement(SQL);
        ps.setString(1, obj.getTitulo());                                       //Título
        ps.setInt(2, obj.getAno());                                             //Ano
        ps.setInt(3, obj.getGenero().getId_gen());                              //Genero
        ps.setInt(4, obj.getLocalizacao().getId_loc());                         //Localização
        ps.setString(5, obj.getClassificacao().Classificacao());
        ps.setString(6, obj.getAutor()); 
        ps.setString(7, obj.getCidade()); 
        ps.setString(8, obj.getEditora());
        ps.setInt(9, obj.getPagina());
        ps.setInt(10, obj.getAno());
        ps.setInt(11, obj.getId_acervo());
         
        ps.executeUpdate(); 
    
    
    }
    
}
