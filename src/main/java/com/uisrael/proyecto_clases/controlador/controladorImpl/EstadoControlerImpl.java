/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.controlador.controladorImpl;

import com.requerimientos.requerimientospro.entidades.Cliente;
import com.requerimientos.requerimientospro.entidades.Estado;
import com.requerimientos.requerimientospro.entidades.Orden;
import com.uisrael.proyecto_clases.controlador.controlador.IClienteControlador;
import com.uisrael.proyecto_clases.controlador.controlador.IEstadoControlador;
import com.uisrael.proyecto_clases.controlador.controlador.IOrdenControlador;
import com.uisrael.proyecto_clases.modelo.DAO.IClienteDAO;
import com.uisrael.proyecto_clases.modelo.DAO.IEstadoDAO;
import com.uisrael.proyecto_clases.modelo.DAO.IOrdenDAO;
import com.uisrael.proyecto_clases.modelo.DAOImpl.ClienteDAOImpl;
import com.uisrael.proyecto_clases.modelo.DAOImpl.EstadoDAOImpl;
import com.uisrael.proyecto_clases.modelo.DAOImpl.OrdenDAOImpl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author esanchez
 */
public class EstadoControlerImpl implements IEstadoControlador {

    @Override
    public void insert(Estado cliente) {
        try {
            IEstadoDAO sqlc = new EstadoDAOImpl(Estado.class);
            sqlc.insertar(cliente);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public List<Estado> findByid(int cod) throws Exception {
        try {
            IEstadoDAO sqlc = new EstadoDAOImpl(Estado.class);
            return sqlc.findByid(cod);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    @Override
    public List<Estado> findAll() throws Exception {
        try {
            IEstadoDAO sqlc = new EstadoDAOImpl(Estado.class);
            return sqlc.findAll();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    @Override
    public boolean delete(int cod) throws Exception {
        try {
            IEstadoDAO sqlc = new EstadoDAOImpl(Estado.class);
            sqlc.eliminar(cod);
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean update(Estado cliente) throws Exception {
        try {
            IEstadoDAO sqlc = new EstadoDAOImpl(Estado.class);
            sqlc.actualizar(cliente);
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

}
