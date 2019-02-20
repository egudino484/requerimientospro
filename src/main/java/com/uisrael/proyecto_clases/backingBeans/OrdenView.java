/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.backingBeans;

import com.requerimientos.requerimientospro.entidades.Cliente;
import com.requerimientos.requerimientospro.entidades.Orden;
import com.uisrael.proyecto_clases.controlador.controladorImpl.ClienteControlerImpl;
import com.uisrael.proyecto_clases.controlador.controladorImpl.OrdenControlerImpl;
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
public class OrdenView implements Serializable {

    private String txtidOrden;
    private String txtDescripcion;

    private OrdenControlerImpl controlador;
    private Orden objeto;
    private Orden objetoSeleccionado;

    public OrdenView() {

    }

    @PostConstruct
    public void init() {
        objeto = new Orden();
        objetoSeleccionado = new Orden();

        controlador = new OrdenControlerImpl();
    }

    public void insertar() {
        objeto.setId(-1l);

        objeto.setDescripcion(txtDescripcion);

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

    public List<Orden> listar() {
        objeto.setId(-1l);

        objeto.setDescripcion(txtDescripcion);

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
            Logger.getLogger(OrdenView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getTxtidOrden() {
        return txtidOrden;
    }

    public void setTxtidOrden(String txtidOrden) {
        this.txtidOrden = txtidOrden;
    }

    public String getTxtDescripcion() {
        return txtDescripcion;
    }

    public void setTxtDescripcion(String txtDescripcion) {
        this.txtDescripcion = txtDescripcion;
    }

    public OrdenControlerImpl getClientecontroler() {
        return controlador;
    }

    public void setClientecontroler(OrdenControlerImpl clientecontroler) {
        this.controlador = clientecontroler;
    }

    public Orden getCliente() {
        return objeto;
    }

    public void setCliente(Orden cliente) {
        this.objeto = cliente;
    }

    public Orden getObjeto() {
        return objeto;
    }

    public void setObjeto(Orden objeto) {
        this.objeto = objeto;
    }

    public Orden getObjetoSeleccionado() {
        return objetoSeleccionado;
    }

    public void setObjetoSeleccionado(Orden objetoSeleccionado) {
        this.objetoSeleccionado = objetoSeleccionado;
    }

}
