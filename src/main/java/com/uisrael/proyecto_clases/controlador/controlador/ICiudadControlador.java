/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.controlador.controlador;

import com.requerimientos.requerimientospro.entidades.Ciudad;
import com.requerimientos.requerimientospro.entidades.Cliente;
import com.requerimientos.requerimientospro.entidades.Orden;
import java.util.List;

/**
 *
 * @author fernanda
 */
public interface ICiudadControlador {

    public void insert(Ciudad cliente) throws Exception;

    public List<Ciudad> findByid(int cod) throws Exception;

    public List<Ciudad> findAll() throws Exception;

    public boolean delete(int code) throws Exception;

    public boolean update(Ciudad cliente) throws Exception;

}
