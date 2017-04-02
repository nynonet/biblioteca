/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

import Gerencial.Usuario;
/**
 *
 * @author Claudiney
 */
public class Cadastro_de_usuario extends Usuario{
    
    private String funcao; //Recebe a função do usuário, se é atendente ou bibliotecário

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    
}
