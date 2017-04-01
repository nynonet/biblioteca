/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geral;

/**
 *
 * @author Enoch Junior
 */
public class Patente extends Material {
    private int id_pat;
    private String inventor;
    private int ano;
    private String pais;
    private int numero;

    public int getId_pat() {
        return id_pat;
    }

    public void setId_pat(int id_pat) {
        this.id_pat = id_pat;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
