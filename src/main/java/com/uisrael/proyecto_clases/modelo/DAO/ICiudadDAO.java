/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.modelo.DAO;

import com.requerimientos.requerimientospro.entidades.Ciudad;
import com.requerimientos.requerimientospro.entidades.Cliente;
import com.requerimientos.requerimientospro.entidades.Orden;
import java.util.List;

/**
 *
 * @author fernanda
 */
public interface ICiudadDAO {

    public boolean insertar(Ciudad cliente);

    public List<Ciudad> findByid(int cod);


    public boolean eliminar(int code);

    public boolean actualizar(Ciudad orden);

    public List<Ciudad> findAll();

}
