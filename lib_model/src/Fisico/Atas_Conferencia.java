/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fisico;

/**
 *
 * @author Enoch Junior
 */
public class Atas_Conferencia extends Acervo {
    private int id_ata;
        private String autor;
        private int pagina;
        private int ano;
        private String cidade;
        private String editora;

    public int getId_ata() {
        return id_ata;
    }

    public void setId_ata(int id_ata) {
        this.id_ata = id_ata;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    
}
