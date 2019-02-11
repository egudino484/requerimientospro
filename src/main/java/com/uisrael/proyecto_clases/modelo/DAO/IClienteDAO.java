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
 * @author fernanda
 */
public interface IClienteDAO {

    public boolean insertCliente(Cliente cliente);

    public List<Cliente> findClienteid(int cod);

    public List<Cliente> findClientenombre(String nombre);

    public boolean deleteCliente();

    public boolean updateCliente(Cliente cliente);

}
