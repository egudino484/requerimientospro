/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.controlador.controlador;

import com.requerimientos.requerimientospro.entidades.Cliente;
import com.requerimientos.requerimientospro.entidades.Estado;
import com.requerimientos.requerimientospro.entidades.Orden;
import java.util.List;

/**
 *
 * @author esanchez
 */
public interface IEstadoControlador {

    public void insert(Estado cliente) throws Exception;

    public List<Estado> findByid(int cod) throws Exception;

    public List<Estado> findAll() throws Exception;

    public boolean delete(int code) throws Exception;

    public boolean update(Estado cliente) throws Exception;

}
