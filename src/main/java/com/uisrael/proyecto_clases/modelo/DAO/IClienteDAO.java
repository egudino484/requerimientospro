/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.modelo.DAO;

import com.requerimientos.requerimientospro.entidades.Cliente;
import java.util.List;

/**
 *
 * @author esanchez
 */
public interface IClienteDAO {

    public boolean insertar(Cliente cliente);

    public List<Cliente> findById(int cod);

    public List<Cliente> findAll();

    public boolean eliminar(int code);

    public boolean actualizar(Cliente cliente);

}
