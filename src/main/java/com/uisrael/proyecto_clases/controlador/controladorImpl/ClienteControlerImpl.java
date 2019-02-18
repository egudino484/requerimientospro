/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.controlador.controladorImpl;

import com.requerimientos.requerimientospro.entidades.Cliente;
import com.uisrael.proyecto_clases.controlador.controlador.IClienteControlador;
import com.uisrael.proyecto_clases.modelo.DAO.IClienteDAO;
import com.uisrael.proyecto_clases.modelo.DAOImpl.ClienteDAOImpl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fernanda
 */
public class ClienteControlerImpl implements IClienteControlador {

    @Override
    public void insertCliente(Cliente cliente) {
        try {
            IClienteDAO sqlc = new ClienteDAOImpl(Cliente.class);
            sqlc.insertar(cliente);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public List<Cliente> findClienteid(int code) throws Exception {
        try {
            IClienteDAO sqlc = new ClienteDAOImpl(Cliente.class);
            return sqlc.findById(code);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    @Override
    public List<Cliente> findAll() throws Exception {
        try {
            IClienteDAO sqlc = new ClienteDAOImpl(Cliente.class);
            return sqlc.findAll();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    @Override
    public boolean deleteCliente(int code) throws Exception {
        try {
            IClienteDAO sqlc = new ClienteDAOImpl(Cliente.class);
            return sqlc.eliminar(code);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public boolean updateCliente(Cliente cliente) {
        try {
            IClienteDAO sqlc = new ClienteDAOImpl(Cliente.class);
            return sqlc.actualizar(cliente);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

}
