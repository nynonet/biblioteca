/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gerencial;

/**
 *
 * @author Enoch Junior
 */
public class Usuario {
    private int id_user;    // Código do usuário
    private int mat_user;   // Matrícula do usuário
    private String Nome;    // Nome do usuário
    private String funcao;  // --> Criar classe FuncaoUsuario(Enum) | Definir a função do usuário

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getMat_user() {
        return mat_user;
    }

    public void setMat_user(int mat_user) {
        this.mat_user = mat_user;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    
}
