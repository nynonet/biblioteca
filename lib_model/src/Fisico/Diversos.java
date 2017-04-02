/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fisico;

import Cadastro.Autores;
import Cadastro.Editora;
/**
 *
 * @author Claudiney
 */
public class Diversos {
    
    private Autores autor;
    private String tipo_de_midia;
    private Editora editora;
    private String cidade;
    private String estado;
    private String pais;
    private int volume;

    public Autores getAutor() {
        return autor;
    }

    public void setAutor(Autores autor) {
        this.autor = autor;
    }

    public String getTipo_de_midia() {
        return tipo_de_midia;
    }

    public void setTipo_de_midia(String tipo_de_midia) {
        this.tipo_de_midia = tipo_de_midia;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    
}
