/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.controlador.controladorImpl;

import com.requerimientos.requerimientospro.entidades.Cliente;
import com.requerimientos.requerimientospro.entidades.Orden;
import com.requerimientos.requerimientospro.entidades.Requerimiento;
import com.uisrael.proyecto_clases.controlador.controlador.IClienteControlador;
import com.uisrael.proyecto_clases.controlador.controlador.IOrdenControlador;
import com.uisrael.proyecto_clases.controlador.controlador.IRequerimientoControlador;
import com.uisrael.proyecto_clases.modelo.DAO.IClienteDAO;
import com.uisrael.proyecto_clases.modelo.DAO.IOrdenDAO;
import com.uisrael.proyecto_clases.modelo.DAO.IRequerimientoDAO;
import com.uisrael.proyecto_clases.modelo.DAOImpl.ClienteDAOImpl;
import com.uisrael.proyecto_clases.modelo.DAOImpl.OrdenDAOImpl;
import com.uisrael.proyecto_clases.modelo.DAOImpl.RequerimientoDAOImpl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author esanchez
 */
public class RequerimientoControlerImpl implements IRequerimientoControlador {

    @Override
    public void insert(Requerimiento objeto) {
        try {
            IRequerimientoDAO sqlc = new RequerimientoDAOImpl(Requerimiento.class);
            sqlc.insertar(objeto);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public List<Requerimiento> findByid(int cod) throws Exception {
        try {
            IRequerimientoDAO sqlc = new RequerimientoDAOImpl(Requerimiento.class);
            return sqlc.findId(cod);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return new ArrayList<>();

        }
    }

    @Override
    public List<Requerimiento> findAll() throws Exception {
        try {
            IRequerimientoDAO sqlc = new RequerimientoDAOImpl(Requerimiento.class);
            return sqlc.findAll();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    @Override
    public boolean delete(Long code) throws Exception {
        try {
            IRequerimientoDAO sqlc = new RequerimientoDAOImpl(Requerimiento.class);
            return sqlc.eliminar(code);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean update(Requerimiento objeto) throws Exception {
        try {
            IRequerimientoDAO sqlc = new RequerimientoDAOImpl(Requerimiento.class);
            return sqlc.actualizar(objeto);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

}
