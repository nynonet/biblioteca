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
public class Cliente {
    private int id_cli;  // Código do cliente
    private int mat_cli; // Nº de Matrícula do cliente/aluno
    private String nome; // Nome do cliente
    String email;        // E-mail do cliente
    String telefone;     // Número de telefone fixo
    String celular;      // Número de celular
    Boolean situacao;    // True = Ativo | False = Inativo

    public int getId_cli() {
        return id_cli;
    }

    public void setId_cli(int id_cli) {
        this.id_cli = id_cli;
    }

    public int getMat_cli() {
        return mat_cli;
    }

    public void setMat_cli(int mat_cli) {
        this.mat_cli = mat_cli;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
