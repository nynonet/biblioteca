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
        String SQL = "INSERT INTO revista (titulo, ano, id_genero, id_localizacao,classificacao,"
                + " autor, ano, pagina, editora, volume, edicao) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
    PreparedStatement ps = connection.prepareStatement(SQL);
        ps.setString(1, obj.getTitulo());                                       //Título
        ps.setInt(2, obj.getAno());                                             //Ano
        ps.setInt(3, obj.getGenero().getId_gen());                              //Genero
        ps.setInt(4, obj.getLocalizacao().getId_loc());                         //Localização
        ps.setString(5, obj.getClassificacao().Classificacao());                //Classificação
        ps.setString(6, obj.getAutor()); 
        ps.setInt(7, obj.getAno()); 
        ps.setInt(8, obj.getPagina());
        ps.setString(9, obj.getEditora());
        ps.setInt(10, obj.getVolume()); 
        ps.setInt(11, obj.getEdicao());
        
        ps.executeUpdate(); 
    
    }

    @Override
    public void Deletar(Revista obj) throws Exception {
        String SQL = "DELETE FROM revista WHERE id_acervo=?";   
        PreparedStatement ps = connection.prepareStatement(SQL);
        ps.setInt(1, obj.getId_acervo());
        ps.executeUpdate();
    
    }

    @Override
    public void Atualizar(Revista obj) throws Exception {
        String SQL = "UPDATE revista SET titulo=?, ano=?, id_genero=?, id_localizacao=?,classificacao=?,"
                + " autor=?, ano=?, pagina=?, editora=?, volume=?, edicao=? "
              + "WHERE id_acervo=?";
    PreparedStatement ps = connection.prepareStatement(SQL);
        ps.setString(1, obj.getTitulo());                                       //Título
        ps.setInt(2, obj.getAno());                                             //Ano
        ps.setInt(3, obj.getGenero().getId_gen());                              //Genero
        ps.setInt(4, obj.getLocalizacao().getId_loc());                         //Localização
        ps.setString(5, obj.getClassificacao().Classificacao());
        ps.setString(6, obj.getAutor()); 
        ps.setInt(7, obj.getAno()); 
        ps.setInt(8, obj.getPagina());
        ps.setString(9, obj.getEditora());
        ps.setInt(10, obj.getVolume()); 
        ps.setInt(11, obj.getEdicao());
        ps.setInt(11, obj.getId_acervo());
        
        ps.executeUpdate(); 
    }
    
}
