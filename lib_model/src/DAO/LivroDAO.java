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

    @Override
    public void Inserir(Livro obj) throws Exception {
        String SQL = "INSERT INTO acervo(titulo, ano, id_genero, id_localizacao, classificacao, id_autor, id_editora, isbn, npaginas, exemplar, edicao) VALUES" +
                     "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        
        PreparedStatement ps = this.connection.prepareStatement(SQL);
        
        ps.setString(0, obj.getTitulo());
        ps.setInt(1, obj.getAno());
        ps.setInt(2, obj.getGenero().getId_gen());
        ps.setInt(3, obj.getLocalizacao().getId_loc());
        ps.setString(4, obj.getClassificacao().Classificacao());
        ps.setInt(5, obj.getAutor().getId_autor());
        ps.setInt(6, obj.getEditora().getId_edit());
        ps.setInt(7, obj.getIsbn());
        ps.setInt(8, obj.getNpaginas());
        ps.setInt(9, obj.getExemplar());
        ps.setInt(10, obj.getEdicao());
        
        ps.executeUpdate();
    }

    @Override
    public void Deletar(Livro obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Atualizar(Livro obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
