/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.controlador.controladorImpl;

import com.requerimientos.requerimientospro.entidades.Cliente;
import com.requerimientos.requerimientospro.entidades.Orden;
import com.uisrael.proyecto_clases.controlador.controlador.IClienteControlador;
import com.uisrael.proyecto_clases.controlador.controlador.IOrdenControlador;
import com.uisrael.proyecto_clases.modelo.DAO.IClienteDAO;
import com.uisrael.proyecto_clases.modelo.DAO.IOrdenDAO;
import com.uisrael.proyecto_clases.modelo.DAOImpl.ClienteDAOImpl;
import com.uisrael.proyecto_clases.modelo.DAOImpl.OrdenDAOImpl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author esanchez
 */
public class OrdenControlerImpl implements IOrdenControlador {

    @Override
    public void insert(Orden cliente) {
        try {
            IOrdenDAO sqlc = new OrdenDAOImpl(Orden.class);
            sqlc.insertar(cliente);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public List<Orden> findByid(int cod) throws Exception {
        try {
            IOrdenDAO sqlc = new OrdenDAOImpl(Orden.class);
            return sqlc.findByid(cod);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    @Override
    public List<Orden> findAll() throws Exception {
        try {
            IOrdenDAO sqlc = new OrdenDAOImpl(Orden.class);
            return sqlc.findAll();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    @Override
    public boolean delete(Long cod) throws Exception {
        try {
            IOrdenDAO sqlc = new OrdenDAOImpl(Orden.class);
            sqlc.eliminar(cod);
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean update(Orden cliente) throws Exception {
        try {
            IOrdenDAO sqlc = new OrdenDAOImpl(Orden.class);
            sqlc.actualizar(cliente);
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

  

}
