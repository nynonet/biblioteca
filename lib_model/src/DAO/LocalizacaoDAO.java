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

    @Override
    public void Inserir(Localizacao obj) throws Exception {
        String SQL = "INSERT INTO localizacao(corredor, estante, lado) VALUES(?, ?, ?);";
        
        PreparedStatement ps = this.connection.prepareStatement(SQL);
        
        ps.setString(0, obj.getCorredor());
        ps.setString(1, obj.getEstante());
        ps.setString(2, obj.getLado());
        
        ps.executeUpdate();
    }

    @Override
    public void Deletar(Localizacao obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Atualizar(Localizacao obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
