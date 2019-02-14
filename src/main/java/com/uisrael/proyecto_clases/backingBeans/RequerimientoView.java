/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.backingBeans;

import com.requerimientos.requerimientospro.entidades.Ciudad;
import com.requerimientos.requerimientospro.entidades.Cliente;
import com.requerimientos.requerimientospro.entidades.Estado;
import com.requerimientos.requerimientospro.entidades.Orden;
import com.requerimientos.requerimientospro.entidades.Requerimiento;
import com.requerimientos.requerimientospro.entidades.Usuario;
import com.uisrael.proyecto_clases.controlador.controladorImpl.ClienteControlerImpl;
import com.uisrael.proyecto_clases.controlador.controladorImpl.OrdenControlerImpl;
import com.uisrael.proyecto_clases.controlador.controladorImpl.RequerimientoControlerImpl;
import java.io.Serializable;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Column;
import javax.persistence.ManyToOne;

/**
 *
 * @author fernanda
 */
@ManagedBean
@ViewScoped
public class RequerimientoView implements Serializable {

   
    private Long id;

    private Date fechaAsignacion;
    private Date fechaVisita;
    private String observaciones;
    private Date telefonoContacto;
//relaciones 

    private Cliente cliente;
    private Usuario usuario;
    private Estado estado;
    private Orden orden;

    private Ciudad ciudad;

    private RequerimientoControlerImpl controller;
    private Requerimiento objeto;

    public RequerimientoView() {

    }

    @PostConstruct
    public void init() {
        objeto = new Requerimiento();
        controller = new RequerimientoControlerImpl();
    }

    public void insertar() {
        objeto.setId(-1l);
        objeto.setFechaAsignacion(new Date());
        objeto.setFechaVisita(new Date());
        objeto.setObservaciones(observaciones);
        objeto.setTelefonoContacto(telefonoContacto);
        objeto.setCliente(cliente);
        objeto.setUsuario(usuario);
        objeto.setEstado(estado);
        objeto.setOrden(orden);
        objeto.setCiudad(ciudad);

        try {
            controller.insert(objeto);
            System.out.println("Sus datos fueron ingresados");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
