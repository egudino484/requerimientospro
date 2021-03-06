/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.modelo.DAO;

import com.requerimientos.requerimientospro.entidades.Cliente;
import com.requerimientos.requerimientospro.entidades.Orden;
import com.requerimientos.requerimientospro.entidades.Usuario;
import java.util.List;

/**
 *
 * @author esanchez
 */
public interface IUsuarioDAO {

    public boolean insertar(Usuario cliente);

    public List<Usuario> findByid(int cod);


    public boolean eliminar(Long code);

    public boolean actualizar(Usuario orden);

    public List<Usuario> findAll();

}
