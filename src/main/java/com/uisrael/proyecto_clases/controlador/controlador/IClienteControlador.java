/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.controlador.controlador;

import com.requerimientos.requerimientospro.entidades.Cliente;
import java.util.List;

/**
 *
 * @author esanchez
 */
public interface IClienteControlador {

    public void insertCliente(Cliente cliente) throws Exception;

    public List<Cliente> findClienteid(int cod) throws Exception;

    public List<Cliente> findAll()throws Exception;

    public boolean deleteCliente(int code )throws Exception;

    public boolean updateCliente(Cliente cliente)throws Exception;

}
