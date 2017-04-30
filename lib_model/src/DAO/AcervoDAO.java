/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Fisico.Acervo;
import java.sql.Connection;

/**
 *
 * @author James
 */
public class AcervoDAO implements InterfaceDAO<Acervo>{
    
    Connection connection;

    public AcervoDAO(Connection connection) {
        this.connection = connection;
    }
    
    @Override
    public void Inserir(Acervo obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Deletar(Acervo obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Atualizar(Acervo obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
