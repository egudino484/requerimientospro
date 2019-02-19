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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private String telefonoContacto;
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
        ciudad=new Ciudad();
        orden=new Orden();
        estado=new Estado();
        cliente=new Cliente();
        usuario=new Usuario();
    }
    
    public List<Requerimiento> list(){

        try {
            return controller.findAll();
        } catch (Exception ex) {
            Logger.getLogger(RequerimientoView.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }

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
    
    public void actualizar() {
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
    public void eliminar() {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public Date getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(Date fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Requerimiento getObjeto() {
        return objeto;
    }

    public void setObjeto(Requerimiento objeto) {
        this.objeto = objeto;
    }

}
