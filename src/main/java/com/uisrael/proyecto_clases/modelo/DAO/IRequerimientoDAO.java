/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.modelo.DAO;

import com.requerimientos.requerimientospro.entidades.Cliente;
import com.requerimientos.requerimientospro.entidades.Requerimiento;
import java.util.List;

/**
 *
 * @author fernanda
 */
public interface IRequerimientoDAO {

    public boolean insert(Requerimiento objeto);

    public List<Requerimiento> findId(int cod);
    public boolean delete();

    public boolean update(Requerimiento objeto);

}