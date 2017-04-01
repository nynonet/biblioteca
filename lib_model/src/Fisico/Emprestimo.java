/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fisico;

import Gerencial.Cliente;
import Gerencial.Usuario;
import java.util.Calendar;

/**
 *
 * @author Enoch Junior
 */
public class Emprestimo {
    private int id_emp;
    private Cliente cliente;
    private Acervo acervo;
    private Calendar data_emp;
    private Calendar data_dev;
    private Usuario usuario;

    public int getId_emp() {
        return id_emp;
    }

    public void setId_emp(int id_emp) {
        this.id_emp = id_emp;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Acervo getAcervo() {
        return acervo;
    }

    public void setAcervo(Acervo acervo) {
        this.acervo = acervo;
    }

    public Calendar getData_emp() {
        return data_emp;
    }

    public void setData_emp(Calendar data_emp) {
        this.data_emp = data_emp;
    }

    public Calendar getData_dev() {
        return data_dev;
    }

    public void setData_dev(Calendar data_dev) {
        this.data_dev = data_dev;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
}
