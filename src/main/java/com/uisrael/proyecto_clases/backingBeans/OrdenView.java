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
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author fernanda
 */
@ManagedBean
@ViewScoped
public class OrdenView implements Serializable {

    private String txtidOrden;
    private String txtDescripcion;

    private OrdenControlerImpl clientecontroler;
    private Orden cliente;

    public OrdenView() {

    }

    @PostConstruct
    public void init() {
        cliente = new Orden();
        clientecontroler = new OrdenControlerImpl();
    }

    public void insertarCiente() {
        cliente.setId(-1l);

        cliente.setDescripcion(txtDescripcion);

        try {
            clientecontroler.insert(cliente);
            System.out.println("sus datos fueron ingresados");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
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
        return clientecontroler;
    }

    public void setClientecontroler(OrdenControlerImpl clientecontroler) {
        this.clientecontroler = clientecontroler;
    }

    public Orden getCliente() {
        return cliente;
    }

    public void setCliente(Orden cliente) {
        this.cliente = cliente;
    }

}
