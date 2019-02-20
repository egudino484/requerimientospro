/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.controlador.controlador;

import com.requerimientos.requerimientospro.entidades.Cliente;
import com.requerimientos.requerimientospro.entidades.Orden;
import com.requerimientos.requerimientospro.entidades.Usuario;
import java.util.List;

/**
 *
 * @author esanchez
 */
public interface IUsuarioControlador {

    public void insert(Usuario cliente) throws Exception;

    public List<Usuario> findByid(int cod) throws Exception;

    public List<Usuario> findAll() throws Exception;

    public boolean delete(Long code) throws Exception;

    public boolean update(Usuario cliente) throws Exception;

}
