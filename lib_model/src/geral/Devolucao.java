/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geral;

import java.util.Calendar;

/**
 *
 * @author Enoch Junior
 */
public class Devolucao {
    private int id_dev;
    private Emprestimo cliente;
    private Emprestimo acervo;
    private Emprestimo data_dev;
    private Calendar devolucao;
    private Usuario usuario;

    public int getId_dev() {
        return id_dev;
    }

    public void setId_dev(int id_dev) {
        this.id_dev = id_dev;
    }

    public Emprestimo getCliente() {
        return cliente;
    }

    public void setCliente(Emprestimo cliente) {
        this.cliente = cliente;
    }

    public Emprestimo getAcervo() {
        return acervo;
    }

    public void setAcervo(Emprestimo acervo) {
        this.acervo = acervo;
    }

    public Emprestimo getData_dev() {
        return data_dev;
    }

    public void setData_dev(Emprestimo data_dev) {
        this.data_dev = data_dev;
    }

    public Calendar getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(Calendar devolucao) {
        this.devolucao = devolucao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
}
