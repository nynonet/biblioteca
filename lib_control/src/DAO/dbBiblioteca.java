/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author James
 */
public @interface dbBiblioteca {
    
    //  Executar script para criação do banco localmente
    
    //  As classes que extendem de Acervo terão que ficar na mesma tabela no banco de dados
    
/**    
    create database dbBiblioteca;
    use dbBiblioteca;

    create table acervo(
    id_acervo int primary key auto_increment,
    titulo varchar(100),
    ano int,
    id_genero int,
    id_localizacao int,
    classificacao varchar(20),
    id_autor int,
    id_editora int,
    isbn int unsigned,
    npaginas int,
    exemplar int,
    edicao int
    );

    create table genero(
    id_gen int primary key auto_increment,
    genero varchar(10)
    );

    create table localizacao(
    id_loc int primary key auto_increment,
    corredor varchar(10),
    estante varchar(10),
    lado varchar(10)
    );

    create table autores(
    id_autor int primary key auto_increment,
    nome varchar(45),
    email varchar(30),
    nacionalidade varchar(20)
    );

    create table editora(
    id_edit int primary key auto_increment,
    nome varchar(45),
    site varchar(50),
    email varchar(30)
    );

    alter table acervo
    add foreign key(id_genero)
    references genero(id_gen);

    alter table acervo
    add foreign key(id_localizacao)
    references localizacao(id_loc);

    alter table acervo
    add foreign key(id_autor)
    references autores(id_autor);

    alter table acervo
    add foreign key(id_editora)
    references editora(id_edit);
    
   **/ 
}
