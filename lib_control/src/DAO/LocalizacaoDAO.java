/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Cadastro.Localizacao;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author James
 */
public class LocalizacaoDAO implements InterfaceDAO<Localizacao>{
    
    Connection connection;

    public LocalizacaoDAO(Connection connection) {
        this.connection = connection;
    }

    @Override                                                                   //INSERIR
    public void Inserir(Localizacao obj) throws Exception {
        String SQL = "INSERT INTO localizacao(corredor, estante, lado) VALUES(?, ?, ?);";
        
        PreparedStatement ps = this.connection.prepareStatement(SQL);
        
        ps.setString(1, obj.getCorredor());                                     //Corredor
        ps.setString(2, obj.getEstante());                                      //Estante
        ps.setString(3, obj.getLado());                                         //Lado
        
        ps.executeUpdate();
    }

    @Override                                                                   //DELETAR
    public void Deletar(Localizacao obj) throws Exception {
        String SQL = "DELETE FROM localizacao WHERE id_loc=?";
        
        PreparedStatement ps = this.connection.prepareStatement(SQL);
        
        ps.setInt(1, obj.getId_loc());
        
        ps.executeUpdate();
    }

    @Override
    public void Atualizar(Localizacao obj) throws Exception {                   //ATUALIZAR
        String SQL = "UPDATE localizacao SET corredor=?, estante=?, lado=?, "
                   + "WHERE id_loc=?";
        
        PreparedStatement ps = this.connection.prepareStatement(SQL);
        
        ps.setString(1, obj.getCorredor());                                     //Corredor
        ps.setString(2, obj.getEstante());                                      //Estante
        ps.setString(3, obj.getLado());                                         //Lado
        ps.setInt(4, obj.getId_loc());                                          //Código ID
        
        ps.executeUpdate();
    }
    
}
