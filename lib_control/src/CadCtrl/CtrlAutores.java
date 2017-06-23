/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadCtrl;

import Cadastro.Autores;
import DAO.AutoresDAO;
import DAO.Conexao;

/**
 *
 * @author James
 */
public class CtrlAutores {
    
    AutoresDAO autDAO;
    
    public CtrlAutores(Conexao conexao) {
        autDAO = new AutoresDAO(conexao);
    }
    
    public String Novo(String Autor, String Email, String Nacionalidade){
        
        String msg = "OK";
        
        if(Autor.isEmpty()){
            msg = "Nome do Autor é obrigatório!";
            return msg;
        }
        
        Autores A = new Autores();
        
        A.setNome(Autor);
        A.setEmail(Email);
        A.setNacionalidade(Nacionalidade);
        
        try {
            autDAO.Inserir(A);
        } catch (Exception ex) {
            msg = ex.getMessage();
        }
        
        return msg;
    }
    
}
