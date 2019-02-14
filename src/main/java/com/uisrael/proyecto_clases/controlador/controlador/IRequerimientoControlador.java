/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.controlador.controlador;

import com.requerimientos.requerimientospro.entidades.Cliente;
import com.requerimientos.requerimientospro.entidades.Orden;
import com.requerimientos.requerimientospro.entidades.Requerimiento;
import java.util.List;

/**
 *
 * @author fernanda
 */
public interface IRequerimientoControlador {

    public void insert(Requerimiento objeto) throws Exception;

    public List<Orden> findByid(int cod) throws Exception;

    public boolean delete() throws Exception;

    public boolean update(Requerimiento objeto) throws Exception;

}
