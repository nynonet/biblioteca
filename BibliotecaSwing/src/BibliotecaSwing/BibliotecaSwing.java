/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BibliotecaSwing;

import Cadastro.Autores;
import Cadastro.Editora;
import Cadastro.Genero;
import Cadastro.Localizacao;
import DAO.AutoresDAO;
import DAO.Conexao;
import DAO.EditoraDAO;
import DAO.GeneroDAO;
import DAO.LivroDAO;
import DAO.LocalizacaoDAO;
import Fisico.Livro;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andeson
 */
public class BibliotecaSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Conexao cnx = new Conexao();
        
      //Livro       liv = new Livro();
        Autores     aut = new Autores();
        Editora     edt = new Editora();
        Genero      gnr = new Genero();
        Localizacao loc = new Localizacao();
        
        
        //INSERIR LOCALIZAÇÃO
        loc.setCorredor("Corredor 1");
        loc.setEstante("Estante 1");
        loc.setLado("Lado 1");
        
        //INSERIR GENERO
        gnr.setGenero("Genero 01");
        
        
        //INSERIR EDITORA
        edt.setNome("Editora 01");
        edt.setSite("www.site.editora01.com.br");
        edt.setEmail("editora01@email.com");
        
        //INSERIR AUTOR
        aut.setNome("Autor 02");
        aut.setEmail("autor02@email.com");
        aut.setNacionalidade("Brasileira");
        
        /**
        //INSERIR LIVRO
        liv.setTitulo("Teste livro 01");
        liv.setAno(2016);
        liv.setExemplar(5);
        liv.setIsbn(826377894);
        liv.setNpaginas(300);
        **/
        
      //LivroDAO        LivDAO = new LivroDAO(cnx.getConexao());       
        AutoresDAO      autDAO = new AutoresDAO(cnx.getConexao());
        EditoraDAO      edtDAO = new EditoraDAO(cnx.getConexao());
        GeneroDAO       gnrDAO = new GeneroDAO(cnx.getConexao());
        LocalizacaoDAO  locDAO = new LocalizacaoDAO(cnx.getConexao());
        
        try {
          //LivDAO.Inserir(liv);
            autDAO.Inserir(aut);    //Insere Autores
            edtDAO.Inserir(edt);    //Insere Editores
            gnrDAO.Inserir(gnr);    //Insere Genero
            locDAO.Inserir(loc);    //Insere Localização
            System.out.println("===OK===");
        } catch (Exception ex) {
            System.out.println("Não inserido!" + "\nErro: " + ex.getMessage());
        }
        
        
    }
    
}
