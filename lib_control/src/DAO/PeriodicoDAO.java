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
        String SQL = "INSERT INTO revista (titulo, ano, id_genero, id_localizacao,classificacao,"
                + "id_per, autor, ano, mes, dia, paginas) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
    PreparedStatement ps = connection.prepareStatement(SQL);
        ps.setString(1, obj.getTitulo());                                       //Título
        ps.setInt(2, obj.getAno());                                             //Ano
        ps.setInt(3, obj.getGenero().getId_gen());                              //Genero
        ps.setInt(4, obj.getLocalizacao().getId_loc());                         //Localização
        ps.setString(5, obj.getClassificacao().Classificacao());                //Classificação
        ps.setString(6, obj.getAutor()); 
        ps.setInt(7, obj.getAno()); 
        ps.setInt(8, obj.getMes());
        ps.setInt(9, obj.getDia()); 
        ps.setInt(10, obj.getPaginas());
        ps.setInt(11, obj.getId_per());
        ps.executeUpdate(); 
    
    }

    @Override
    public void Deletar(Periodico obj) throws Exception {
        String SQL = "DELETE FROM periodico WHERE id_acervo=?";   
        PreparedStatement ps = connection.prepareStatement(SQL);
        ps.setInt(1, obj.getId_acervo());
        ps.executeUpdate();
    }

    @Override
    public void Atualizar(Periodico obj) throws Exception {
        String SQL = "UPDATE periodico SET  titulo=?, ano=?, id_genero=?, id_localizacao=?,classificacao=?,"
                + "autor=?, ano=?, mes=?, dia=?, paginas=? "
              + "WHERE id_acervo=?";
    PreparedStatement ps = connection.prepareStatement(SQL);
        ps.setString(1, obj.getTitulo());                                       //Título
        ps.setInt(2, obj.getAno());                                             //Ano
        ps.setInt(3, obj.getGenero().getId_gen());                              //Genero
        ps.setInt(4, obj.getLocalizacao().getId_loc());                         //Localização
        ps.setString(5, obj.getClassificacao().Classificacao());
        ps.setString(6, obj.getAutor()); 
        ps.setInt(7, obj.getAno()); 
        ps.setInt(8, obj.getMes());
        ps.setInt(9, obj.getDia()); 
        ps.setInt(10, obj.getPaginas());
        ps.setInt(11, obj.getId_acervo());
        
        ps.executeUpdate();

    }
    
}
