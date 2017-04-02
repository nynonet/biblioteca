/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gerencial;

import Cadastro.Classificacao;
/**
 *
 * @author Claudiney
 */

public class Lista_de_espera extends Cliente{
    
    private Classificacao tipo_de_acervo;   //Recebe o tipo de acervo que o cliente prcura, ex: livro, filme, revista...
    private String nome_do_acervo;          //Recebe o nome do acervo que o cliente procura, ex: nome do livro, do filme etc.

    public Classificacao getTipo_de_acervo() {
        return tipo_de_acervo;
    }

    public void setTipo_de_acervo(Classificacao tipo_de_acervo) {
        this.tipo_de_acervo = tipo_de_acervo;
    }

    public String getNome_do_acervo() {
        return nome_do_acervo;
    }

    public void setNome_do_acervo(String nome_do_acervo) {
        this.nome_do_acervo = nome_do_acervo;
    }
    
    
}
