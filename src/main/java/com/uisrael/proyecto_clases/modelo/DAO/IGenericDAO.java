/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.modelo.DAO;

import java.util.List;

/**
 *
 * @author esanchez
 */
public interface IGenericDAO<T> {

    /**
     *
     * @param t
     * @return
     */
    public T create(T t);

    public T read(Object id);

    public void beginTransaction();

    public void commit();

    public void rollback();

    public void closeTransaction();

    public void commitAndCloseTransaction();

    public void flush();

    public List<T> findAll();

}
