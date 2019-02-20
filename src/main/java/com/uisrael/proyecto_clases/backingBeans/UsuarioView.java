/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.backingBeans;

import com.requerimientos.requerimientospro.entidades.Cliente;
import com.requerimientos.requerimientospro.entidades.Orden;
import com.requerimientos.requerimientospro.entidades.Usuario;
import com.uisrael.proyecto_clases.controlador.controladorImpl.ClienteControlerImpl;
import com.uisrael.proyecto_clases.controlador.controladorImpl.OrdenControlerImpl;
import com.uisrael.proyecto_clases.controlador.controladorImpl.UsuarioControlerImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author esanchez
 */
@ManagedBean
@ViewScoped
public class UsuarioView implements Serializable {

   

    private UsuarioControlerImpl controlador;
    private Usuario objeto;
    private Usuario objetoSeleccionado;

    public UsuarioView() {

    }

    @PostConstruct
    public void init() {
        objeto = new Usuario();
        objetoSeleccionado = new Usuario();
        controlador = new UsuarioControlerImpl();
    }

    public void insertar() {
        objeto.setId(-1l);

       

        try {
            controlador.insert(objeto);
            System.out.println("sus datos fueron ingresados");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void actualizar() {

        try {
            controlador.update(objetoSeleccionado);
            System.out.println("sus datos fueron actualizados");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void eliminar(Long code) {

        try {
            controlador.delete(code);
            System.out.println("sus datos fueron eliminados");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public List<Usuario> listar() {

       

        try {

            return controlador.findAll();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return new ArrayList<>();
        }

    }

    public void seleccionar(Long code) {
        try {
            System.out.println("id seleccionado:" + code);
            objetoSeleccionado = controlador.findByid(code.intValue()).get(0);
            System.err.println("termino de convertir: " + objetoSeleccionado);
        } catch (Exception ex) {
            Logger.getLogger(UsuarioView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario getObjeto() {
        return objeto;
    }

    public void setObjeto(Usuario objeto) {
        this.objeto = objeto;
    }

    public Usuario getObjetoSeleccionado() {
        return objetoSeleccionado;
    }

    public void setObjetoSeleccionado(Usuario objetoSeleccionado) {
        this.objetoSeleccionado = objetoSeleccionado;
    }

   

}
