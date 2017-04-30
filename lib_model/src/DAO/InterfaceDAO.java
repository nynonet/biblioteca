/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author James
 * @param <T>
 */
public interface InterfaceDAO<T> {
    public void Inserir( T obj ) throws Exception;
    public void Deletar( T obj ) throws Exception;
    public void Atualizar( T obj ) throws Exception;
    
}
