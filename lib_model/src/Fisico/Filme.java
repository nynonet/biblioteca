/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fisico;

/**
 *
 * @author Claudiney
 */
public class Filme extends Acervo{
    
    private String produtora;
    private String diretor;
    private String pais;
    private String duracao;

    public String getEmpresa_produtora() {
        return produtora;
    }

    public void setEmpresa_produtora(String empresa_produtora) {
        this.produtora = empresa_produtora;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
    
    
}
