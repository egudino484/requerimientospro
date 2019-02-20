/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.modelo.DAO;

import com.requerimientos.requerimientospro.entidades.Ciudad;
import com.requerimientos.requerimientospro.entidades.Cliente;
import com.requerimientos.requerimientospro.entidades.Estado;
import com.requerimientos.requerimientospro.entidades.Orden;
import java.util.List;

/**
 *
 * @author esanchez
 */
public interface IEstadoDAO {

    public boolean insertar(Estado cliente);

    public List<Estado> findByid(int cod);

    public boolean eliminar(int code);

    public boolean actualizar(Estado orden);

    public List<Estado> findAll();

}
