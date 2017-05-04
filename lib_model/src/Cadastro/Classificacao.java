/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

/**
 *
 * @author James
 */
public enum Classificacao {
    LIVRO("Livro"),
    RELATORIO("Relatório"),
    ENTREVISTA("Entrevista"),
    PROCESSO("Processo"),
    REVISTA("Revista"),
    PERIODICO("Periódico"),
    ATAS_DE_CONFERECIA("Atlas de Conferência"),
    PATENTE("Patente"),
    FILME("Filme"),
    GRAVACAO_SOM("Gravação de Som"),
    DIVERSOS("Diversos");

    private final String tipo;

    /**
     *
     * @param tipo
     */
    Classificacao(String tipo) {
        this.tipo = tipo;
    }

    public String Classificacao(){
        return this.tipo;
    }
    
    
}
