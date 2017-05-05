/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Fisico.Livro;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author James
 */
public class LivroDAO implements InterfaceDAO<Livro>{
    
    Connection connection;

    public LivroDAO(Connection connection) {
        this.connection = connection;
    }

    @Override                                                                   //INSERIR
    public void Inserir(Livro obj) throws Exception {
        String SQL = "INSERT INTO acervo(titulo, ano, id_genero, id_localizacao,"
                   + " classificacao, id_autor, id_editora, isbn, npaginas, "
                   + "exemplar, edicao) VALUES" +
                     "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        
        PreparedStatement ps = this.connection.prepareStatement(SQL);
        
        ps.setString(1, obj.getTitulo());                                       //Título
        ps.setInt(2, obj.getAno());                                             //Ano
        ps.setInt(3, obj.getGenero().getId_gen());                              //Genero
        ps.setInt(4, obj.getLocalizacao().getId_loc());                         //Localização
        ps.setString(5, obj.getClassificacao().Classificacao());                //Classificação
        ps.setInt(6, obj.getAutor().getId_autor());                             //Autor
        ps.setInt(7, obj.getEditora().getId_edit());                            //Editora
        ps.setInt(8, obj.getIsbn());                                            //ISBN
        ps.setInt(9, obj.getNpaginas());                                        //Número de Páginas
        ps.setInt(10, obj.getExemplar());                                        //Quantidade de Exemplares
        ps.setInt(11, obj.getEdicao());                                         //Edição
        
        ps.executeUpdate();
    }

    @Override                                                                   //DELETAR
    public void Deletar(Livro obj) throws Exception {
        String SQL = "DELETE FROM acervo WHERE id_acervo=?";
        
        PreparedStatement ps = this.connection.prepareStatement(SQL);
        
        ps.setInt(1, obj.getId_acervo());
        
        ps.executeUpdate();
    }

    @Override                                                                   //ATUALIZAR
    public void Atualizar(Livro obj) throws Exception {
        String SQL = "UPDATE acervo SET titulo=?, ano=?, id_genero=?, id_localizacao=?, "
                   + "classificacao=?, id_autor=?, id_editora=?, isbn=?, npaginas=?, "
                   + "exemplar=?, edicao=? WHERE id_acervo=?";
        
        PreparedStatement ps = this.connection.prepareStatement(SQL);
        
        ps.setString(1, obj.getTitulo());                                       //Título
        ps.setInt(2, obj.getAno());                                             //Ano
        ps.setInt(3, obj.getGenero().getId_gen());                              //Genero
        ps.setInt(4, obj.getLocalizacao().getId_loc());                         //Localização
        ps.setString(5, obj.getClassificacao().Classificacao());                //Classificação
        ps.setInt(6, obj.getAutor().getId_autor());                             //Autor
        ps.setInt(7, obj.getEditora().getId_edit());                            //Editora
        ps.setInt(8, obj.getIsbn());                                            //ISBN
        ps.setInt(9, obj.getNpaginas());                                        //Número de Páginas
        ps.setInt(10, obj.getExemplar());                                        //Quantidade de Exemplares
        ps.setInt(11, obj.getEdicao());                                         //Edição
        ps.setInt(12, obj.getId_acervo());                                      //Código ID
        
        ps.executeUpdate();
    }
    
}
