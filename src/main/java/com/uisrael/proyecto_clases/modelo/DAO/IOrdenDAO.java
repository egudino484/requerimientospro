/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.modelo.DAO;

import com.requerimientos.requerimientospro.entidades.Cliente;
import com.requerimientos.requerimientospro.entidades.Orden;
import java.util.List;

/**
 *
 * @author fernanda
 */
public interface IOrdenDAO {

    public boolean insert(Orden cliente);

    public List<Orden> findByid(int cod);

    public List<Orden> findByDescripcion(String nombre);

    public boolean delete(int code);

    public boolean update(Orden orden);

}
