/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.controlador.controlador;

import com.requerimientos.requerimientospro.entidades.Cliente;
import com.requerimientos.requerimientospro.entidades.Orden;
import java.util.List;

/**
 *
 * @author fernanda
 */
public interface IOrdenControlador {

    public void insert(Orden cliente) throws Exception;

    public List<Orden> findByid(int cod) throws Exception;

    public List<Orden> findAll() throws Exception;

    public boolean delete(Long code) throws Exception;

    public boolean update(Orden cliente) throws Exception;

}
