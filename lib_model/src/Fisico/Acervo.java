/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fisico;

/**
 *
 * @author Andeson
 */
class Acervo {
    private int id_acervo;
    private String titulo;
    private int ano;
    private Genero genero;
    private Localizacao localizacao;
    private Classificacao classificacao;

    public int getAno() {
        return ano;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    
    public void setAno(int ano) {
        this.ano = ano;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getId_acervo() {
        return id_acervo;
    }

    public void setId_acervo(int id_acervo) {
        this.id_acervo = id_acervo;
    }
    
    
    
    
    
}
